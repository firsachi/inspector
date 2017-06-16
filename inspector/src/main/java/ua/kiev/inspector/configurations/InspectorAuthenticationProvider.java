package ua.kiev.inspector.configurations;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;

import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

@Component("inspectorAuthenticationProvider")
public class InspectorAuthenticationProvider implements AuthenticationProvider {
	
	@Autowired
	private UserDetailsService userService;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.reset();
			md.update(password.getBytes());
			byte  codePass[] = md.digest(); 
			password = DatatypeConverter.printHexBinary(codePass).toLowerCase();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
        System.out.println(password);
        UserDetails user = userService.loadUserByUsername(username);
        if (user == null) {
            throw new BadCredentialsException("Username not found.");
        }
        if (!password.equals(user.getPassword())) {
            throw new BadCredentialsException("Wrong password.");
        }
        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
        return new UsernamePasswordAuthenticationToken(user, password, authorities);
	}
	
	@Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(
          UsernamePasswordAuthenticationToken.class);
    }
}
