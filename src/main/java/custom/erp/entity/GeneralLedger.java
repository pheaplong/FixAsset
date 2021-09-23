package custom.erp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="GENERAL_LEDGER")
public class GeneralLedger {
	@Id
	@Column(name="GL_ID") 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int glId; 

//	@Column(name="JE_ID") 
	@Transient
	private int jeId; 
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "je_id",referencedColumnName = "JE_ID")
	private JournalEntry journalEntry;
	
	@Column(name = "ACCT_CD")
	private String acctCd;
	
	public String getAcctCd() {
		return acctCd;
	}

	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
	}

	@Column(name="POST_DATE") 
	private String postDate; 

	@Column(name="VALUE_DATE") 
	private String valueDate; 

	@Column(name="DR_CR") 
	private String drCr; 

	@Column(name="AMT_DR") 
	private Double amtDr; 

	@Column(name="AMT_CR") 
	private Double amtCr; 

	@Column(name="GL_DESC") 
	private String glDesc; 

	@Column(name="INS_USR",updatable = false) 
	private String insUsr; 

	@Column(name = "INS_DT",insertable = false,updatable = false)
	private Date insDt; 

	@Column(name="UPDT_USR") 
	private String updtUsr; 

	@LastModifiedDate
	@Column(name = "UPDT_DT",insertable = false)
	private Date updtDt;

	public int getGlId() {
		return glId;
	}

	public void setGlId(int glId) {
		this.glId = glId;
	}

	public int getJeId() {
		return jeId;
	}

	public void setJeId(int jeId) {
		this.jeId = jeId;
	}

	public String getPostDate() {
		return postDate;
	}

	public JournalEntry getJournalEntry() {
		return journalEntry;
	}

	public void setJournalEntry(JournalEntry journalEntry) {
		this.journalEntry = journalEntry;
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

	public String getDrCr() {
		return drCr;
	}

	public void setDrCr(String drCr) {
		this.drCr = drCr;
	}

	public Double getAmtDr() {
		return amtDr;
	}

	public void setAmtDr(Double amtDr) {
		this.amtDr = amtDr;
	}

	public Double getAmtCr() {
		return amtCr;
	}

	public void setAmtCr(Double amtCr) {
		this.amtCr = amtCr;
	}

	public String getGlDesc() {
		return glDesc;
	}

	public void setGlDesc(String glDesc) {
		this.glDesc = glDesc;
	}

	public String getInsUsr() {
		return insUsr;
	}

	public void setInsUsr(String insUsr) {
		this.insUsr = insUsr;
	}

	public Date getInsDt() {
		return insDt;
	}

	public void setInsDt(Date insDt) {
		this.insDt = insDt;
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

	public GeneralLedger() {
		super();
	}

	public GeneralLedger(int glId, int jeId, String postDate, String valueDate,String acctCd, String drCr, Double amtDr,
			Double amtCr, String glDesc, String insUsr, Date insDt, String updtUsr, Date updtDt) {
		this.glId = glId;
		this.jeId = jeId;
		this.postDate = postDate;
		this.valueDate = valueDate;
		this.acctCd=acctCd;
		this.drCr = drCr;
		this.amtDr = amtDr;
		this.amtCr = amtCr;
		this.glDesc = glDesc;
		this.insUsr = insUsr;
		this.insDt = insDt;
		this.updtUsr = updtUsr;
		this.updtDt = updtDt;
	} 
	
	

}
