package ua.kiev.inspector.model;

import java.sql.Timestamp;

public class TaskModel {

	private int idNumber;
	private String street;
	private int district;
	private int typeObject;
	private String build;
	private String location;
	private String lat;
	private String lng;
	private String photoURL;
	private String summary;
	private String usrNotes;
	private String admNotes;
	private Timestamp created;
	
	public TaskModel() {
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public int getDistrict() {
		return district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public int getTypeObject() {
		return typeObject;
	}

	public void setTypeObject(int typeObject) {
		this.typeObject = typeObject;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBuild() {
		return build;
	}

	public void setBuild(String build) {
		this.build = build;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getUsrNotes() {
		return usrNotes;
	}

	public void setUsrNotes(String usrNotes) {
		this.usrNotes = usrNotes;
	}

	public String getAdmNotes() {
		return admNotes;
	}

	public void setAdmNotes(String admNotes) {
		this.admNotes = admNotes;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

}

