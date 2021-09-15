package custom.erp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import custom.erp.constant.AssetConstant;
import custom.erp.exception.BussinessExceptionHandler;

@Entity
@Table(name = "HR_ASSET_TRN")
public class AssetTransaction {
	@Id
	@Column(name="TRN_ID") 
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "HRMS.ISEQ$$_149632")
	@SequenceGenerator(name ="HRMS.ISEQ$$_149632", sequenceName = "HRMS.ISEQ$$_149632" ,allocationSize = 1)
	private int trnId; 

	@Column(name="ASS_ID") 
	private int assId; 

	@Column(name="TRN_TYPE") 
	private String trnType; 

	@Column(name="PREV_BR_ID") 
	private String prevBrId; 

	@Column(name="BR_ID") 
	private String brId; 

	@Column(name="PREV_OWNER_ID") 
	private String prevOwnerId; 

	@Column(name="OWNER_ID") 
	private String ownerId; 

	@Column(name="BASE_DATE") 
	private String baseDate; 

	@Column(name="TRN_DATE",insertable = false,updatable = false) 
	private String trnDate; 

	@Column(name="TRN_STATUS") 
	private String trnStatus; 
	@Column(name="APPROVE_USR") 
	private String approveUsr; 

	@Column(name="APPROVE_DT") 
	private String approveDt;
	

	@Column(name="INS_USR") 
	public String insUsr; 

	@Column(name = "INS_DT",insertable = false,updatable = false)
	public Date insDt;

	@Column(name="UPDT_USR") 
	public String updtUsr; 

	@LastModifiedDate
	@Column(name = "UPDT_DT",insertable = false)
	public Date updtDt; 
	

	public AssetTransaction() {
	}

	public AssetTransaction(int trnId, int assId, String trnType, String prevBrId, String brId, String prevOwnerId,
			String ownerId, String baseDate, String trnDate, String trnStatus, String insUsr, Date insDt,
			String updtUsr, Date updtDt, String approveUsr, String approveDt) {
		this.trnId = trnId;
		this.assId = assId;
		this.trnType = trnType;
		this.prevBrId = prevBrId;
		this.brId = brId;
		this.prevOwnerId = prevOwnerId;
		this.ownerId = ownerId;
		this.baseDate = baseDate;
		this.trnDate = trnDate;
		this.trnStatus = trnStatus;
		this.insUsr = insUsr;
		this.insDt = insDt;
		this.updtUsr = updtUsr;
		this.updtDt = updtDt;
		this.approveUsr = approveUsr;
		this.approveDt = approveDt;
	}

	public int getTrnId() {
		return trnId;
	}

	public void setTrnId(int trnId) {
		this.trnId = trnId;
	}

	public int getAssId() {
		return assId;
	}

	public void setAssId(int assId) {
		this.assId = assId;
	}

	public String getTrnType() {
		return trnType;
	}

	public void setTrnType(String trnType) {
		this.trnType = trnType;
	}

	public String getPrevBrId() {
		return prevBrId;
	}

	public void setPrevBrId(String prevBrId) {
		this.prevBrId = prevBrId;
	}

	public String getBrId() {
		return brId;
	}

	public void setBrId(String brId) {
		this.brId = brId;
	}

	public String getPrevOwnerId() {
		return prevOwnerId;
	}

	public void setPrevOwnerId(String prevOwnerId) {
		this.prevOwnerId = prevOwnerId;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getBaseDate() {
		return baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}

	public String getTrnDate() {
		return trnDate;
	}

	public void setTrnDate(String trnDate) {
		this.trnDate = trnDate;
	}

	public String getTrnStatus() {
		return trnStatus;
	}

	public void setTrnStatus(String trnStatus) {
		this.trnStatus = trnStatus;
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

	public String getApproveUsr() {
		return approveUsr;
	}

	public void setApproveUsr(String approveUsr) {
		this.approveUsr = approveUsr;
	}

	public String getApproveDt() {
		return approveDt;
	}

	public void setApproveDt(String approveDt) {
		this.approveDt = approveDt;
	}

	public void isValid() {
		// TODO Auto-generated method stub
		
	} 
	
	public void isInRequestState() {
		if(!trnStatus.equals(AssetConstant.ASSET_TRN_STATUS_REQUEST))
			throw new BussinessExceptionHandler("Transaction is not in request state");
	}

	
}
