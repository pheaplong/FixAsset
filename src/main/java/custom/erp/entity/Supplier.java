package custom.erp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HR_SUPPLIER")
public class Supplier {
	@Id
	@Column(name="SUP_ID") 
	private int supId; 

	@Column(name="SUP_NAME") 
	private String supName; 

	@Column(name="CONTACT_PERSON") 
	private String contactPerson; 

	@Column(name="CONTACT1") 
	private String contact1; 

	@Column(name="CONTACT2") 
	private String contact2; 

	@Column(name="EMAIL1") 
	private String email1; 

	@Column(name="EMAIL2") 
	private String email2; 

	@Column(name="LOCALTION") 
	private String localtion; 

	@Column(name="SUP_CODE1") 
	private String supCode1; 

	@Column(name="SUP_CODE2") 
	private String supCode2; 

	@Column(name="SUP_CODE3") 
	private String supCode3; 

	@Column(name="SUP_CODE4") 
	private String supCode4; 

	@Column(name="SUP_STATUS") 
	private String supStatus; 

	@Column(name="INS_USR") 
	private String insUsr; 

	@Column(name="INS_DT") 
	private Date insDt; 

	@Column(name="UPDT_USR") 
	private String updtUsr; 

	@Column(name="UPDT_DT") 
	private Date updtDt;

	public Supplier() {
		super();
	}

	public int getSupId() {
		return supId;
	}

	public void setSupId(int supId) {
		this.supId = supId;
	}

	public String getSupName() {
		return supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContact1() {
		return contact1;
	}

	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}

	public String getContact2() {
		return contact2;
	}

	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getLocaltion() {
		return localtion;
	}

	public void setLocaltion(String localtion) {
		this.localtion = localtion;
	}

	public String getSupCode1() {
		return supCode1;
	}

	public void setSupCode1(String supCode1) {
		this.supCode1 = supCode1;
	}

	public String getSupCode2() {
		return supCode2;
	}

	public void setSupCode2(String supCode2) {
		this.supCode2 = supCode2;
	}

	public String getSupCode3() {
		return supCode3;
	}

	public void setSupCode3(String supCode3) {
		this.supCode3 = supCode3;
	}

	public String getSupCode4() {
		return supCode4;
	}

	public void setSupCode4(String supCode4) {
		this.supCode4 = supCode4;
	}

	public String getSupStatus() {
		return supStatus;
	}

	public void setSupStatus(String supStatus) {
		this.supStatus = supStatus;
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
