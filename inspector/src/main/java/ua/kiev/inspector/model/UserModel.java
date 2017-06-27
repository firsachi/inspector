package ua.kiev.inspector.model;

import java.util.Collection;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class UserModel implements UserDetails{
	
	private int userId;
	
	@NotEmpty(message = "{error.null}")
	private String firstName;
	
	@NotEmpty(message = "{error.null}")
	private String lastName;
	
	@NotEmpty(message = "{error.null}")
	private String username;
	
	@NotEmpty(message = "{error.null}")
	@Min(value = 8, message = "{error.passwordMinSize}" )
	private String password;
	
	@NotEmpty(message = "{error.null}")
	@Min(value = 8, message = "{error.passwordMinSize}")
	private String newPassword;
	
	private boolean enabled;
	
	public UserModel(){
	}
		
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFullUserName(){
		return firstName + " " + lastName;
	}
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}
	
	
}
