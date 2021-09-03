package custom.erp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HR_INVOICE")
public class Invoice {
	@Id
	@Column(name="INV_ID") 
	private int invId;

	@Column(name="INV_NO") 
	private String invNo;

	@Column(name="ORDER_DATE") 
	private String orderDate;

	@Column(name="RECEIVED_DATE") 
	private String receivedDate;

	@Column(name="SUP_ID") 
	private String supId;

	@Column(name="NET_TOTAL") 
	private double netTotal;

	@Column(name="TAX") 
	private double tax;

	@Column(name="TOTAL") 
	private double total;

	@Column(name="INS_USR") 
	private String insUsr;

	@Column(name="INS_DT") 
	private Date insDt;

	@Column(name="UPDT_USR") 
	private String updtUsr;

	@Column(name="UPDT_DT") 
	private Date updtDt;

	@Column(name="INV_STATUS") 
	private String invStatus;

	public Invoice(int invId, String invNo, String orderDate, String receivedDate, String supId, double netTotal,
			double tax, double total, String insUsr, Date insDt, String updtUsr, Date updtDt, String invStatus) {
		this.invId = invId;
		this.invNo = invNo;
		this.orderDate = orderDate;
		this.receivedDate = receivedDate;
		this.supId = supId;
		this.netTotal = netTotal;
		this.tax = tax;
		this.total = total;
		this.insUsr = insUsr;
		this.insDt = insDt;
		this.updtUsr = updtUsr;
		this.updtDt = updtDt;
		this.invStatus = invStatus;
	}

	public Invoice(String invNo, String orderDate, String receivedDate, String supId, double netTotal, double tax,
			double total, String insUsr, Date insDt, String updtUsr, Date updtDt, String invStatus) {
		this.invNo = invNo;
		this.orderDate = orderDate;
		this.receivedDate = receivedDate;
		this.supId = supId;
		this.netTotal = netTotal;
		this.tax = tax;
		this.total = total;
		this.insUsr = insUsr;
		this.insDt = insDt;
		this.updtUsr = updtUsr;
		this.updtDt = updtDt;
		this.invStatus = invStatus;
	}

	public int getInvId() {
		return invId;
	}

	public void setInvId(int invId) {
		this.invId = invId;
	}

	public String getInvNo() {
		return invNo;
	}

	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(String receivedDate) {
		this.receivedDate = receivedDate;
	}

	public String getSupId() {
		return supId;
	}

	public void setSupId(String supId) {
		this.supId = supId;
	}

	public double getNetTotal() {
		return netTotal;
	}

	public void setNetTotal(double netTotal) {
		this.netTotal = netTotal;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
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

	public String getInvStatus() {
		return invStatus;
	}

	public void setInvStatus(String invStatus) {
		this.invStatus = invStatus;
	}

	public Invoice() {
	}
	
	
}
