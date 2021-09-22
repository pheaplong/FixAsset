package custom.erp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import custom.erp.exception.BussinessExceptionHandler;


@Entity
@Table(name = "JOURNAL_ENTRY")
public class JournalEntry {
	@Id
	@Column(name="JE_ID") 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@SequenceGenerator(name ="HRMS.ISEQ$$_162309", sequenceName = "HRMS.ISEQ$$_162309" ,allocationSize = 1)
	private int jeId; 

	@Column(name="POST_DATE") 
	private String postDate; 

	@Column(name="VALUE_DATE") 
	private String valueDate; 

	@Column(name="TOTAL_DR") 
	private Double totalDr; 

	@Column(name="TOTAL_CR") 
	private Double totalCr; 

	@Column(name="JE_DESC") 
	private String jeDesc; 

	@Column(name="STATUS") 
	private String status; 

	@Column(name="INST_USR") 
	private String instUsr; 

	@Column(name="INST_DT") 
	private Date instDt; 

	@Column(name="UPDT_USR") 
	private String updtUsr; 

	@Column(name="UPDT_DT") 
	private Date updtDt; 

	@Column(name="APPROVE_USR") 
	private String approveUsr; 

	@Column(name="APPROVE_DT") 
	private Date approveDt;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST,mappedBy = "journalEntry")
//	@Transient
	private List<GeneralLedger> generalLedgers;

	public int getJeId() {
		return jeId;
	}

	public void setJeId(int jeId) {
		this.jeId = jeId;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public String getValueDate() {
		return valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public Double getTotalDr() {
		return totalDr;
	}

	public void setTotalDr(Double totalDr) {
		this.totalDr = totalDr;
	}

	public Double getTotalCr() {
		return totalCr;
	}

	public void setTotalCr(Double totalCr) {
		this.totalCr = totalCr;
	}

	public String getJeDesc() {
		return jeDesc;
	}

	public void setJeDesc(String jeDesc) {
		this.jeDesc = jeDesc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInstUsr() {
		return instUsr;
	}

	public void setInstUsr(String instUsr) {
		this.instUsr = instUsr;
	}

	public Date getInstDt() {
		return instDt;
	}

	public void setInstDt(Date instDt) {
		this.instDt = instDt;
	}

	public String getUpdtUsr() {
		return updtUsr;
	}

	public void setUpdtUsr(String updtUsr) {
		this.updtUsr = updtUsr;
	}

	public Date getUpdtDt() {
		return updtDt;
	}

	public void setUpdtDt(Date updtDt) {
		this.updtDt = updtDt;
	}

	public String getApproveUsr() {
		return approveUsr;
	}

	public void setApproveUsr(String approveUsr) {
		this.approveUsr = approveUsr;
	}

	public Date getApproveDt() {
		return approveDt;
	}

	public void setApproveDt(Date approveDt) {
		this.approveDt = approveDt;
	}

	public List<GeneralLedger> getGeneralLedgers() {
		return generalLedgers;
	}

	public void setGeneralLedgers(List<GeneralLedger> generalLedgers) {
		this.generalLedgers = generalLedgers;
	}

	public JournalEntry() {
	}

	public JournalEntry(int jeId, String postDate, String valueDate, Double totalDr, Double totalCr, String jeDesc,
			String status, String instUsr, Date instDt, String updtUsr, Date updtDt, String approveUsr,
			Date approveDt) {
		this.jeId = jeId;
		this.postDate = postDate;
		this.valueDate = valueDate;
		this.totalDr = totalDr;
		this.totalCr = totalCr;
		this.jeDesc = jeDesc;
		this.status = status;
		this.instUsr = instUsr;
		this.instDt = instDt;
		this.updtUsr = updtUsr;
		this.updtDt = updtDt;
		this.approveUsr = approveUsr;
		this.approveDt = approveDt;
	}

	public void addGeneralLedger(GeneralLedger gen1) {
		if(generalLedgers==null)
			generalLedgers=new ArrayList<GeneralLedger>();
		generalLedgers.add(gen1);
		gen1.setJournalEntry(this);
		
	} 
	
	public void isValid() {
		Double crAmt;
		Double drAmt;
		crAmt = this.generalLedgers.stream().filter(x->x.getDrCr()=="C").mapToDouble(x->x.getAmtCr()).sum();
		drAmt = this.generalLedgers.stream().filter(x->x.getDrCr()=="D").mapToDouble(x->x.getAmtDr()).sum();
		if(crAmt != drAmt)
			throw new BussinessExceptionHandler("Debit and Credit must be equal");

	}
	
	
	

}
