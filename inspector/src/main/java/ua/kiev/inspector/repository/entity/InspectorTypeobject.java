package ua.kiev.inspector.repository.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inspector_typeobject database table.
 * 
 */
@Entity
@Table(name="inspector_typeobject")
@NamedQuery(name="InspectorTypeobject.findAll", query="SELECT i FROM InspectorTypeobject i")
public class InspectorTypeobject implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="typeobject_id")
	private int typeobjectId;
	
	@Column(name="name")
	private String name;

	public InspectorTypeobject() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTypeobjectId() {
		return this.typeobjectId;
	}

	public void setTypeobjectId(int typeobjectId) {
		this.typeobjectId = typeobjectId;
	}

	@Override
	public String toString() {
		return "InspectorTypeobject [typeobjectId=" + typeobjectId + ", name=" + name + "]";
	}

	
}