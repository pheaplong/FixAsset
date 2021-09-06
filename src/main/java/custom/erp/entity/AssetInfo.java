package custom.erp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import custom.erp.constant.AssetConstant;
import custom.erp.exception.BussinessExceptionHandler;

@Entity
@Table(name = "HR_ASSET")
public class AssetInfo {
	@Id
	@Column(name="ASS_ID") 
	private int assId; 

	@Column(name="INVOICE_ID") 
	private int invoiceId; 

	@Column(name="ASS_OLD_CODE") 
	private String assOldCode; 

	@Column(name="BARCODE_NO") 
	private String barcodeNo; 

	@Column(name="NAME_ENG") 
	private String nameEng; 

	@Column(name="NAME_KHR") 
	private String nameKhr; 

	@Column(name="SERIAL_NO") 
	private String serialNo; 

	@Column(name="MODEL_NAME") 
	private String modelName; 

	@Column(name="DESCRIPTTION") 
	private String descripttion; 

	@Column(name="ENGINE_NO") 
	private String engineNo; 

	@Column(name="CHASSI_NO") 
	private String chassiNo; 

	@Column(name="CONDITION_ID") 
	private String conditionId; 

	@Column(name="ASS_TYPE_ID") 
	private String assTypeId; 

	@Column(name="ASS_CATEGORY_ID") 
	private String assCategoryId; 

	@Column(name="CCY") 
	private String ccy; 

	@Column(name="NET_COST") 
	private Double netCost; 

	@Column(name="TAX") 
	private Double tax; 

	@Column(name="COST_TOTAL") 
	private Double costTotal; 

	@Column(name="COST_NBV") 
	private Double costNbv; 

	@Column(name="IS_WARRANTY") 
	private String isWarranty; 

	@Column(name="WRT_ST_DATE") 
	private String wrtStDate; 

	@Column(name="WRT_TO_DATE") 
	private String wrtToDate; 

	@Column(name="REQUEST") 
	private String request; 

	@Column(name="DEPR_DURATION") 
	private String deprDuration; 

	@Column(name="DEPR_METHOD_ID") 
	private String deprMethodId; 

	@Column(name="DEPR_ST_DATE") 
	private String deprStDate; 

	@Column(name="DEPR_TO_DATE") 
	private String deprToDate; 

	@Column(name="DEPR_PERCENT") 
	private String deprPercent; 

	@Column(name="DEPR_VALUE") 
	private String deprValue; 

	@Column(name="ASS_CODE1") 
	private String assCode1; 

	@Column(name="ASS_CODE2") 
	private String assCode2; 

	@Column(name="ASS_CODE3") 
	private String assCode3; 

	@Column(name="ASS_CODE4") 
	private String assCode4; 

	@Column(name="IP_ADDRESS") 
	private String ipAddress; 

	@Column(name="BR_ID") 
	private String brId; 

	@Column(name="OWNER_ID") 
	private String ownerId; 

	@Column(name="ASS_STATUS") 
	private String assStatus; 

	@Column(name="INS_USR") 
	private String insUsr; 

	@Column(name="INS_DT") 
	private Date insDt; 

	@Column(name="UPDT_USR") 
	private String updtUsr; 

	@Column(name="UPDT_DT") 
	private Date updtDt; 

	@Column(name="APPROVE_USR") 
	private String approveUsr; 

	@Column(name="APPROVE_DT") 
	private String approveDt;

	public AssetInfo() {
	}

	public int getAssId() {
		return assId;
	}

	public void setAssId(int assId) {
		this.assId = assId;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getAssOldCode() {
		return assOldCode;
	}

	public void setAssOldCode(String assOldCode) {
		this.assOldCode = assOldCode;
	}

	public String getBarcodeNo() {
		return barcodeNo;
	}

	public void setBarcodeNo(String barcodeNo) {
		this.barcodeNo = barcodeNo;
	}

	public String getNameEng() {
		return nameEng;
	}

	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}

	public String getNameKhr() {
		return nameKhr;
	}

	public void setNameKhr(String nameKhr) {
		this.nameKhr = nameKhr;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getDescripttion() {
		return descripttion;
	}

	public void setDescripttion(String descripttion) {
		this.descripttion = descripttion;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getChassiNo() {
		return chassiNo;
	}

	public void setChassiNo(String chassiNo) {
		this.chassiNo = chassiNo;
	}

	public String getConditionId() {
		return conditionId;
	}

	public void setConditionId(String conditionId) {
		this.conditionId = conditionId;
	}

	public String getAssTypeId() {
		return assTypeId;
	}

	public void setAssTypeId(String assTypeId) {
		this.assTypeId = assTypeId;
	}

	public String getAssCategoryId() {
		return assCategoryId;
	}

	public void setAssCategoryId(String assCategoryId) {
		this.assCategoryId = assCategoryId;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public Double getNetCost() {
		return netCost;
	}

	public void setNetCost(Double netCost) {
		this.netCost = netCost;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getCostTotal() {
		return costTotal;
	}

	public void setCostTotal(Double costTotal) {
		this.costTotal = costTotal;
	}

	public Double getCostNbv() {
		return costNbv;
	}

	public void setCostNbv(Double costNbv) {
		this.costNbv = costNbv;
	}

	public String getIsWarranty() {
		return isWarranty;
	}

	public void setIsWarranty(String isWarranty) {
		this.isWarranty = isWarranty;
	}

	public String getWrtStDate() {
		return wrtStDate;
	}

	public void setWrtStDate(String wrtStDate) {
		this.wrtStDate = wrtStDate;
	}

	public String getWrtToDate() {
		return wrtToDate;
	}

	public void setWrtToDate(String wrtToDate) {
		this.wrtToDate = wrtToDate;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getDeprDuration() {
		return deprDuration;
	}

	public void setDeprDuration(String deprDuration) {
		this.deprDuration = deprDuration;
	}

	public String getDeprMethodId() {
		return deprMethodId;
	}

	public void setDeprMethodId(String deprMethodId) {
		this.deprMethodId = deprMethodId;
	}

	public String getDeprStDate() {
		return deprStDate;
	}

	public void setDeprStDate(String deprStDate) {
		this.deprStDate = deprStDate;
	}

	public String getDeprToDate() {
		return deprToDate;
	}

	public void setDeprToDate(String deprToDate) {
		this.deprToDate = deprToDate;
	}

	public String getDeprPercent() {
		return deprPercent;
	}

	public void setDeprPercent(String deprPercent) {
		this.deprPercent = deprPercent;
	}

	public String getDeprValue() {
		return deprValue;
	}

	public void setDeprValue(String deprValue) {
		this.deprValue = deprValue;
	}

	public String getAssCode1() {
		return assCode1;
	}

	public void setAssCode1(String assCode1) {
		this.assCode1 = assCode1;
	}

	public String getAssCode2() {
		return assCode2;
	}

	public void setAssCode2(String assCode2) {
		this.assCode2 = assCode2;
	}

	public String getAssCode3() {
		return assCode3;
	}

	public void setAssCode3(String assCode3) {
		this.assCode3 = assCode3;
	}

	public String getAssCode4() {
		return assCode4;
	}

	public void setAssCode4(String assCode4) {
		this.assCode4 = assCode4;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getBrId() {
		return brId;
	}

	public void setBrId(String brId) {
		this.brId = brId;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getAssStatus() {
		return assStatus;
	}

	public void setAssStatus(String assStatus) {
		this.assStatus = assStatus;
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

	public void isInRequestState() throws Exception {
		if(!assStatus.equals(AssetConstant.ASSET_STATUS_REQUEST))
			throw new BussinessExceptionHandler("Asset is Not in Request State");
	}
	public void isNotInRequestState() throws Exception {
		if(assStatus.equals(AssetConstant.ASSET_STATUS_REQUEST))
			throw new BussinessExceptionHandler("Asset is in Request State");
	}

	@Override
	public String toString() {
		return "AssetInfo [assId=" + assId + ", invoiceId=" + invoiceId + ", assOldCode=" + assOldCode + ", barcodeNo="
				+ barcodeNo + ", nameEng=" + nameEng + ", nameKhr=" + nameKhr + ", serialNo=" + serialNo
				+ ", modelName=" + modelName + ", descripttion=" + descripttion + ", engineNo=" + engineNo
				+ ", chassiNo=" + chassiNo + ", conditionId=" + conditionId + ", assTypeId=" + assTypeId
				+ ", assCategoryId=" + assCategoryId + ", ccy=" + ccy + ", netCost=" + netCost + ", tax=" + tax
				+ ", costTotal=" + costTotal + ", costNbv=" + costNbv + ", isWarranty=" + isWarranty + ", wrtStDate="
				+ wrtStDate + ", wrtToDate=" + wrtToDate + ", request=" + request + ", deprDuration=" + deprDuration
				+ ", deprMethodId=" + deprMethodId + ", deprStDate=" + deprStDate + ", deprToDate=" + deprToDate
				+ ", deprPercent=" + deprPercent + ", deprValue=" + deprValue + ", assCode1=" + assCode1 + ", assCode2="
				+ assCode2 + ", assCode3=" + assCode3 + ", assCode4=" + assCode4 + ", ipAddress=" + ipAddress
				+ ", brId=" + brId + ", ownerId=" + ownerId + ", assStatus=" + assStatus + ", insUsr=" + insUsr
				+ ", insDt=" + insDt + ", updtUsr=" + updtUsr + ", updtDt=" + updtDt + ", approveUsr=" + approveUsr
				+ ", approveDt=" + approveDt + "]";
	}
	
	
}
