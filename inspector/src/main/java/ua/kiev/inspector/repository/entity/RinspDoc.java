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

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_END")
	private Date dateEnd;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_STAN")
	private Date dateStan;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_STATE")
	private Date dateState;

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

	@Column(name="REG_ID")
	private int regId;

	@Column(name="STAN_ID")
	private int stanId;

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
	private User inspectorUser;
	
	@Column(name="X")
	private String x;
	
	@Column(name="Y")
	private String y;

	public RinspDoc() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getAnswerCheck() {
		return this.answerCheck;
	}

	public void setAnswerCheck(Date answerCheck) {
		this.answerCheck = answerCheck;
	}

	public int getAnswerSeeinsp() {
		return this.answerSeeinsp;
	}

	public void setAnswerSeeinsp(int answerSeeinsp) {
		this.answerSeeinsp = answerSeeinsp;
	}

	public String getBuild() {
		return this.build;
	}

	public void setBuild(String build) {
		this.build = build;
	}

	public Timestamp getDateDoc() {
		return this.dateDoc;
	}

	public void setDateDoc(Timestamp dateDoc) {
		this.dateDoc = dateDoc;
	}

	public Date getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Date getDateStan() {
		return this.dateStan;
	}

	public void setDateStan(Date dateStan) {
		this.dateStan = dateStan;
	}

	public Date getDateState() {
		return this.dateState;
	}

	public void setDateState(Date dateState) {
		this.dateState = dateState;
	}

	public int getExecId() {
		return this.execId;
	}

	public void setExecId(int execId) {
		this.execId = execId;
	}

	public String getFotop() {
		return this.fotop;
	}

	public void setFotop(String fotop) {
		this.fotop = fotop;
	}

	public String getFotop2() {
		return this.fotop2;
	}

	public void setFotop2(String fotop2) {
		this.fotop2 = fotop2;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLocAdd() {
		return this.locAdd;
	}

	public void setLocAdd(String locAdd) {
		this.locAdd = locAdd;
	}

	public String getNDoc() {
		return this.nDoc;
	}

	public void setNDoc(String nDoc) {
		this.nDoc = nDoc;
	}

	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getPrim() {
		return this.prim;
	}

	public void setPrim(String prim) {
		this.prim = prim;
	}

	public int getRegId() {
		return this.regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public int getStanId() {
		return this.stanId;
	}

	public void setStanId(int stanId) {
		this.stanId = stanId;
	}

	public int getStateId() {
		return this.stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTel() {
		return this.tel;
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

	public User getUsId() {
		return this.inspectorUser;
	}

	public void setUsId(User inspectorUser) {
		this.inspectorUser = inspectorUser;
	}

	public String getX() {
		return this.x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return this.y;
	}

	public void setY(String y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "RinspDoc [id=" + id + ", answer=" + answer + ", answerCheck=" + answerCheck + ", answerSeeinsp="
				+ answerSeeinsp + ", build=" + build + ", dateDoc=" + dateDoc + ", dateEnd=" + dateEnd + ", dateStan="
				+ dateStan + ", dateState=" + dateState + ", execId=" + execId + ", fotop=" + fotop + ", fotop2="
				+ fotop2 + ", ip=" + ip + ", locAdd=" + locAdd + ", nDoc=" + nDoc + ", opis=" + opis + ", prim=" + prim
				+ ", regId=" + regId + ", stanId=" + stanId + ", stateId=" + stateId + ", street=" + street + ", tel="
				+ tel + ", inspectorTypeobject=" + inspectorTypeobject + ", typeOp=" + typeOp + ", inspectorUser="
				+ inspectorUser + ", x=" + x + ", y=" + y + "]";
	}

	
}