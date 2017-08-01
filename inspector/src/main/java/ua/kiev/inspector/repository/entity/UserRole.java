package ua.kiev.inspector.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author firsachi 01.08.2017
 */

@Entity
@Table(name = "user_role")
public class UserRole implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8186821295879696850L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "user_role_id")
	private int userRoleId;
	
	@Column(name = "role_name")
	private String roleName;

	public int getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
