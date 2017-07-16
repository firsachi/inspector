package ua.kiev.inspector.repository.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the rinsp_doc database table.
 * 
 */
@Entity
@Table(name="rinsp_doc")
@NamedQuery(name="RinspDoc.findAll", query="SELECT r FROM RinspDoc r")
public class RinspDoc implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;

	@Lob
	private String answer;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ANSWER_CHECK")
	private Date answerCheck;

	@Column(name="ANSWER_SEEINSP")
	private int answerSeeinsp;
	
	@Column(name="BUILD")
	private String build;

	@Column(name="DATE_DOC")
	private Timestamp dateDoc;

	//@Column(name="EXEC_ID")
	private int execId;

	private String fotop;

	private String fotop2;

	private String ip;

	@Column(name="LOC_ADD")
	private String locAdd;

	//@Column(name="N_DOC")
	private String nDoc;

	@Lob
	private String opis;

	@Lob
	private String prim;
	
	@ManyToOne
	@JoinColumn(name="REG_ID")
	private InspectorRegion district;

	@ManyToOne
	@JoinColumn(name="STAN_ID")
	private InspectorStatus statys;

	@Column(name="STATE_ID")
	private int stateId;
	
	@Column(name="STREET")
	private String street;

	private String tel;
	
	@ManyToOne
	@JoinColumn(name="TYPE_ID")
	private InspectorTypeobject inspectorTypeobject;
	
	private String typeOp;
	
	@ManyToOne
	@JoinColumn(name="US_ID")
	private User inspector;
	
	@Column(name="X")
	private String x;
	
	@Column(name="Y")
	private String y;

	public RinspDoc() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getAnswerCheck() {
		return answerCheck;
	}

	public void setAnswerCheck(Date answerCheck) {
		this.answerCheck = answerCheck;
	}

	public int getAnswerSeeinsp() {
		return answerSeeinsp;
	}

	public void setAnswerSeeinsp(int answerSeeinsp) {
		this.answerSeeinsp = answerSeeinsp;
	}

	public String getBuild() {
		return build;
	}

	public void setBuild(String build) {
		this.build = build;
	}

	public Timestamp getDateDoc() {
		return dateDoc;
	}

	public void setDateDoc(Timestamp dateDoc) {
		this.dateDoc = dateDoc;
	}

	public int getExecId() {
		return execId;
	}

	public void setExecId(int execId) {
		this.execId = execId;
	}

	public String getFotop() {
		return fotop;
	}

	public void setFotop(String fotop) {
		this.fotop = fotop;
	}

	public String getFotop2() {
		return fotop2;
	}

	public void setFotop2(String fotop2) {
		this.fotop2 = fotop2;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLocAdd() {
		return locAdd;
	}

	public void setLocAdd(String locAdd) {
		this.locAdd = locAdd;
	}

	public String getnDoc() {
		return nDoc;
	}

	public void setnDoc(String nDoc) {
		this.nDoc = nDoc;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getPrim() {
		return prim;
	}

	public void setPrim(String prim) {
		this.prim = prim;
	}

	public InspectorRegion getDistrict() {
		return district;
	}

	public void setDistrict(InspectorRegion district) {
		this.district = district;
	}

	public InspectorStatus getStatys() {
		return statys;
	}

	public void setStatys(InspectorStatus statys) {
		this.statys = statys;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public InspectorTypeobject getInspectorTypeobject() {
		return inspectorTypeobject;
	}

	public void setInspectorTypeobject(InspectorTypeobject inspectorTypeobject) {
		this.inspectorTypeobject = inspectorTypeobject;
	}

	public String getTypeOp() {
		return typeOp;
	}

	public void setTypeOp(String typeOp) {
		this.typeOp = typeOp;
	}

	public User getInspector() {
		return inspector;
	}

	public void setInspector(User inspector) {
		this.inspector = inspector;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}
	
	
}