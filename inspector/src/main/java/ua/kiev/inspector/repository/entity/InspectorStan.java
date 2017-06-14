package ua.kiev.inspector.repository.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inspector_stan database table.
 * 
 */
@Entity
@Table(name="inspector_stan")
@NamedQuery(name="InspectorStan.findAll", query="SELECT i FROM InspectorStan i")
public class InspectorStan implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stan_id")
	private int stanId;
	
	@Column(name="name")
	private String name;

	public InspectorStan() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStanId() {
		return this.stanId;
	}

	public void setStanId(int stanId) {
		this.stanId = stanId;
	}

}