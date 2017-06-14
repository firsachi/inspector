package ua.kiev.inspector.repository.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inspector_status database table.
 * 
 */
@Entity
@Table(name="inspector_status")
@NamedQuery(name="InspectorStatus.findAll", query="SELECT i FROM InspectorStatus i")
public class InspectorStatus implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="status_id")
	private int statusId;
	
	@Column(name="name")
	private String name;

	public InspectorStatus() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

}