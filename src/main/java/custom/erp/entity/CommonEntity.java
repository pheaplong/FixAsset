package custom.erp.entity;

import java.util.Date;

import javax.persistence.Column;

public abstract class CommonEntity {


	@Column(name="INS_USR") 
	public String insUsr; 

	@Column(name = "INS_DT",insertable = false,updatable = false)
	public Date insDt;

	@Column(name="UPDT_USR") 
	public String updtUsr; 

	@Column(name = "UPDT_DT",    columnDefinition = "SYSDATE")
	public Date updtDt; 
}
