package custom.erp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COA")
public class ChartOfAccount {
	@Column(name="ACCT_CODE") 
	@Id
	private String acctCode; 

	@Column(name="ACCT_NAME") 
	private String acctName; 

	@Column(name="ACCT_NAME_ENG") 
	private String acctNameEng; 

	@Column(name="PARENT_CODE") 
	private String parentCode; 

	@Column(name="SORT_ORDER") 
	private String sortOrder; 

	@Column(name="ACCT_CODE_FORMART") 
	private String acctCodeFormart; 

	@Column(name="DR_CR") 
	private String drCr; 

	@Column(name="IS_SUB") 
	private String isSub; 

	@Column(name="INPUT_YN") 
	private String inputYn; 

	@Column(name="ACCT_ETC1") 
	private String acctEtc1; 

	@Column(name="ACCT_ETC2") 
	private String acctEtc2; 

	@Column(name="ACCT_ETC3") 
	private String acctEtc3; 

	@Column(name="ACCT_ETC4") 
	private String acctEtc4; 

	@Column(name="ACCT_ETC5") 
	private String acctEtc5; 

	@Column(name="ACCT_ETC6") 
	private String acctEtc6; 

	@Column(name="ACCT_ETC7") 
	private String acctEtc7; 

	@Column(name="ACCT_ETC8") 
	private String acctEtc8; 

	@Column(name="ACCT_ETC9") 
	private String acctEtc9; 

	@Column(name="ACCT_ETC10") 
	private String acctEtc10; 

	@Column(name="ACCT_ETC11") 
	private String acctEtc11; 

	@Column(name="INS_USR") 
	private String insUsr; 

	@Column(name="INS_DT") 
	private Date insDt; 

	@Column(name="UPDT_USR") 
	private String updtUsr; 

	@Column(name="UPDT_DT") 
	private Date updtDt;

	public ChartOfAccount() {
		super();
	}

	public String getAcctCode() {
		return acctCode;
	}

	public void setAcctCode(String acctCode) {
		this.acctCode = acctCode;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getAcctNameEng() {
		return acctNameEng;
	}

	public void setAcctNameEng(String acctNameEng) {
		this.acctNameEng = acctNameEng;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getAcctCodeFormart() {
		return acctCodeFormart;
	}

	public void setAcctCodeFormart(String acctCodeFormart) {
		this.acctCodeFormart = acctCodeFormart;
	}

	public String getDrCr() {
		return drCr;
	}

	public void setDrCr(String drCr) {
		this.drCr = drCr;
	}

	public String getIsSub() {
		return isSub;
	}

	public void setIsSub(String isSub) {
		this.isSub = isSub;
	}

	public String getInputYn() {
		return inputYn;
	}

	public void setInputYn(String inputYn) {
		this.inputYn = inputYn;
	}

	public String getAcctEtc1() {
		return acctEtc1;
	}

	public void setAcctEtc1(String acctEtc1) {
		this.acctEtc1 = acctEtc1;
	}

	public String getAcctEtc2() {
		return acctEtc2;
	}

	public void setAcctEtc2(String acctEtc2) {
		this.acctEtc2 = acctEtc2;
	}

	public String getAcctEtc3() {
		return acctEtc3;
	}

	public void setAcctEtc3(String acctEtc3) {
		this.acctEtc3 = acctEtc3;
	}

	public String getAcctEtc4() {
		return acctEtc4;
	}

	public void setAcctEtc4(String acctEtc4) {
		this.acctEtc4 = acctEtc4;
	}

	public String getAcctEtc5() {
		return acctEtc5;
	}

	public void setAcctEtc5(String acctEtc5) {
		this.acctEtc5 = acctEtc5;
	}

	public String getAcctEtc6() {
		return acctEtc6;
	}

	public void setAcctEtc6(String acctEtc6) {
		this.acctEtc6 = acctEtc6;
	}

	public String getAcctEtc7() {
		return acctEtc7;
	}

	public void setAcctEtc7(String acctEtc7) {
		this.acctEtc7 = acctEtc7;
	}

	public String getAcctEtc8() {
		return acctEtc8;
	}

	public void setAcctEtc8(String acctEtc8) {
		this.acctEtc8 = acctEtc8;
	}

	public String getAcctEtc9() {
		return acctEtc9;
	}

	public void setAcctEtc9(String acctEtc9) {
		this.acctEtc9 = acctEtc9;
	}

	public String getAcctEtc10() {
		return acctEtc10;
	}

	public void setAcctEtc10(String acctEtc10) {
		this.acctEtc10 = acctEtc10;
	}

	public String getAcctEtc11() {
		return acctEtc11;
	}

	public void setAcctEtc11(String acctEtc11) {
		this.acctEtc11 = acctEtc11;
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

	
}
