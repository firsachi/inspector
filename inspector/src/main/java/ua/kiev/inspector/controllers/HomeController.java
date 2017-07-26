package ua.kiev.inspector.controllers;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Base64;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ImageIcon;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ua.kiev.inspector.model.UserModel;
import ua.kiev.inspector.repository.dao.RinspDocDao;
import ua.kiev.inspector.repository.entity.RinspDoc;

@Controller
public class HomeController {
	
	@Resource(mappedName = "fileStorage/basePath")
	 private String basePath;
	
	@Autowired
	private RinspDocDao rispDaoImpl;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage(Model model){
		UserModel user = (UserModel)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		// taskService.setUserEmail(user.getUserId());
		model.addAttribute("user", user);
		model.addAttribute("tasks", rispDaoImpl.getAllRisoDoc(user.getUserId()));
		return "home";
	}
	
	@GetMapping(value = "/home{taskId}" )
	public String taskIdPage(@PathVariable("taskId") int id, Model model) throws IOException{
		model.addAttribute("title", "task.title");
		UserModel user = (UserModel)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		RinspDoc rinspDoc = rispDaoImpl.getByRispDoc(id, user.getUserId());
		File file = new File(basePath, rinspDoc.getFotop());
		String base64  = "data:image/jpg;base64,";
		if (!file.exists()) {
		      throw new FileNotFoundException("File " + file + " does not exist");
		  };
		try (FileInputStream imageInFile = new FileInputStream(file)){
			byte array[] = new byte[(int) file.length()];
			imageInFile.read(array);
			base64 = base64 + Base64.getEncoder().encodeToString(array);
		}
		model.addAttribute("user", user);
		model.addAttribute("im", base64);
		model.addAttribute("task", rinspDoc);
		return "view-task";
	}
	
}
