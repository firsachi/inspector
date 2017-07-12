package ua.kiev.inspector.model;

import java.sql.Timestamp;

public class HomeModel {
	
	private int id;
	private String street;
	private String district;
	private String usrNotes;
	private Timestamp created;
	private String admNotes;
	private boolean state;
	
	public HomeModel() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getUsrNotes() {
		return usrNotes;
	}

	public void setUsrNotes(String usrNotes) {
		this.usrNotes = usrNotes;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public String getAdmNotes() {
		return admNotes;
	}

	public void setAdmNotes(String admNotes) {
		this.admNotes = admNotes;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	

}
