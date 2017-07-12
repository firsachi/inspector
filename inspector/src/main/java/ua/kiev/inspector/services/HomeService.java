package ua.kiev.inspector.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ua.kiev.inspector.model.HomeModel;

@Service
public class HomeService {

	public List<HomeModel> getAll(int userId) {
		List<HomeModel> result = new ArrayList<>();
		return result;
	}
	
}