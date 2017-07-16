package ua.kiev.inspector.model;

import java.sql.Timestamp;

public class HomeModel {
	
	private int id;
	private String street;
	private String district;
	private String usrNotes;
	private Timestamp createdDate;
	private String admNotes;
	private String state;
	
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

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getAdmNotes() {
		return admNotes;
	}

	public void setAdmNotes(String admNotes) {
		this.admNotes = admNotes;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	

}
