package ua.kiev.inspector.repository.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the inspector_users database table.
 * 
 */
@Entity
@Table(name="inspector_users")
@NamedQuery(name="InspectorUser.findAll", query="SELECT i FROM InspectorUser i")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="users_id")
	private int usersId;

	@Column(name="date")
	private Timestamp date;
	
	@Column(name="enabled")
	private int enabled;
	
	@Column(name="lastname")
	private String lastname;

	@Column(name="mail")
	private String mail;

	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@OneToMany(mappedBy="inspectorUser")
	private List<RinspDoc> listRinspDocs;

	public User() {
	}

	public int getUsersId() {
		return this.usersId;
	}

	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public int getEnabled() {
		return this.enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<RinspDoc> getListRinspDocs() {
		return listRinspDocs;
	}

	public void setListRinspDocs(List<RinspDoc> listRinspDocs) {
		this.listRinspDocs = listRinspDocs;
	}

	@Override
	public String toString() {
		return "InspectorUser [usersId=" + usersId + ", date=" + date + ", enabled=" + enabled + ", lastname="
				+ lastname + ", mail=" + mail + ", name=" + name + ", password=" + password + "]";
	}
	
}