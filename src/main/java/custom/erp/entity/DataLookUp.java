package custom.erp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DATA_LOOKUP")
public class DataLookUp {
	@Id
	@Column(name="LOOKUP_ID") 
	private String lookupId; 

	@Column(name="LOOKUP_GROUP") 
	private String lookupGroup; 

	@Column(name="LOOKUP_GROUP_NAME") 
	private String lookupGroupName; 

	@Column(name="CODE_NAME") 
	private String codeName; 

	@Column(name="CODE_NAME_ENG") 
	private String codeNameEng; 

	@Column(name="SORT_ORDER") 
	private int sortOrder; 

	@Column(name="LOOKUP1_VALUE") 
	private String lookup1Value; 

	@Column(name="LOOKUP1_NAME") 
	private String lookup1Name; 

	@Column(name="LOOKUP2_VALUE") 
	private String lookup2Value; 

	@Column(name="LOOKUP2_NAME") 
	private String lookup2Name; 

	@Column(name="LOOKUP3_VALUE") 
	private Double lookup3Value; 

	@Column(name="LOOKUP3_NAME") 
	private String lookup3Name; 

	@Column(name="LOOKUP4_VALUE") 
	private String lookup4Value; 

	@Column(name="LOOKUP4_NAME") 
	private String lookup4Name; 

	@Column(name="LOOKUP5_VALUE") 
	private String lookup5Value; 

	@Column(name="LOOKUP5_NAME") 
	private String lookup5Name; 

	@Column(name="LOOKUP6_VALUE") 
	private String lookup6Value; 

	@Column(name="LOOKUP6_NAME") 
	private String lookup6Name; 

	@Column(name="LOOKUP7_VALUE") 
	private String lookup7Value; 

	@Column(name="LOOKUP7_NAME") 
	private String lookup7Name; 

	@Column(name="LOOKUP8_VALUE") 
	private String lookup8Value; 

	@Column(name="LOOKUP8_NAME") 
	private String lookup8Name; 

	@Column(name="LOOKUP9_VALUE") 
	private String lookup9Value; 

	@Column(name="LOOKUP9_NAME") 
	private String lookup9Name; 

	@Column(name="LOOKUP10_VALUE") 
	private String lookup10Value; 

	@Column(name="LOOKUP10_NAME") 
	private String lookup10Name; 

	@Column(name="LOOKUP11_VALUE") 
	private String lookup11Value; 

	@Column(name="LOOKUP11_NAME") 
	private String lookup11Name; 

	@Column(name="LOOKUP12_VALUE") 
	private String lookup12Value; 

	@Column(name="LOOKUP12_NAME") 
	private String lookup12Name; 

	@Column(name="LOOKUP13_VALUE") 
	private String lookup13Value; 

	@Column(name="LOOKUP13_NAME") 
	private String lookup13Name; 

	@Column(name="LOOKUP14_VALUE") 
	private String lookup14Value; 

	@Column(name="LOOKUP14_NAME") 
	private String lookup14Name; 

	@Column(name="LOOKUP15_VALUE") 
	private String lookup15Value; 

	@Column(name="LOOKUP15_NAME") 
	private String lookup15Name; 

	@Column(name="LOOKUP16_VALUE") 
	private String lookup16Value; 

	@Column(name="LOOKUP16_NAME") 
	private String lookup16Name; 

	@Column(name="LOOKUP17_VALUE") 
	private String lookup17Value; 

	@Column(name="LOOKUP17_NAME") 
	private String lookup17Name; 

	@Column(name="LOOKUP18_VALUE") 
	private String lookup18Value; 

	@Column(name="LOOKUP18_NAME") 
	private String lookup18Name; 

	@Column(name="LOOKUP19_VALUE") 
	private String lookup19Value; 

	@Column(name="LOOKUP19_NAME") 
	private String lookup19Name; 

	@Column(name="LOOKUP20_VALUE") 
	private String lookup20Value; 

	@Column(name="LOOKUP20_NAME") 
	private String lookup20Name; 

	@Column(name="USE_YN") 
	private String useYn; 

	@Column(name="INS_EMPID") 
	private String insEmpid; 

	@Column(name="INS_DT") 
	private Date insDt; 

	@Column(name="UDT_EMPID") 
	private String udtEmpid; 

	@Column(name="UDT_DT") 
	private Date udtDt;

	public DataLookUp() {
	}

	public String getLookupId() {
		return lookupId;
	}

	public void setLookupId(String lookupId) {
		this.lookupId = lookupId;
	}

	public String getLookupGroup() {
		return lookupGroup;
	}

	public void setLookupGroup(String lookupGroup) {
		this.lookupGroup = lookupGroup;
	}

	public String getLookupGroupName() {
		return lookupGroupName;
	}

	public void setLookupGroupName(String lookupGroupName) {
		this.lookupGroupName = lookupGroupName;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getCodeNameEng() {
		return codeNameEng;
	}

	public void setCodeNameEng(String codeNameEng) {
		this.codeNameEng = codeNameEng;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getLookup1Value() {
		return lookup1Value;
	}

	public void setLookup1Value(String lookup1Value) {
		this.lookup1Value = lookup1Value;
	}

	public String getLookup1Name() {
		return lookup1Name;
	}

	public void setLookup1Name(String lookup1Name) {
		this.lookup1Name = lookup1Name;
	}

	public String getLookup2Value() {
		return lookup2Value;
	}

	public void setLookup2Value(String lookup2Value) {
		this.lookup2Value = lookup2Value;
	}

	public String getLookup2Name() {
		return lookup2Name;
	}

	public void setLookup2Name(String lookup2Name) {
		this.lookup2Name = lookup2Name;
	}

	public Double getLookup3Value() {
		return lookup3Value;
	}

	public void setLookup3Value(Double lookup3Value) {
		this.lookup3Value = lookup3Value;
	}

	public String getLookup3Name() {
		return lookup3Name;
	}

	public void setLookup3Name(String lookup3Name) {
		this.lookup3Name = lookup3Name;
	}

	public String getLookup4Value() {
		return lookup4Value;
	}

	public void setLookup4Value(String lookup4Value) {
		this.lookup4Value = lookup4Value;
	}

	public String getLookup4Name() {
		return lookup4Name;
	}

	public void setLookup4Name(String lookup4Name) {
		this.lookup4Name = lookup4Name;
	}

	public String getLookup5Value() {
		return lookup5Value;
	}

	public void setLookup5Value(String lookup5Value) {
		this.lookup5Value = lookup5Value;
	}

	public String getLookup5Name() {
		return lookup5Name;
	}

	public void setLookup5Name(String lookup5Name) {
		this.lookup5Name = lookup5Name;
	}

	public String getLookup6Value() {
		return lookup6Value;
	}

	public void setLookup6Value(String lookup6Value) {
		this.lookup6Value = lookup6Value;
	}

	public String getLookup6Name() {
		return lookup6Name;
	}

	public void setLookup6Name(String lookup6Name) {
		this.lookup6Name = lookup6Name;
	}

	public String getLookup7Value() {
		return lookup7Value;
	}

	public void setLookup7Value(String lookup7Value) {
		this.lookup7Value = lookup7Value;
	}

	public String getLookup7Name() {
		return lookup7Name;
	}

	public void setLookup7Name(String lookup7Name) {
		this.lookup7Name = lookup7Name;
	}

	public String getLookup8Value() {
		return lookup8Value;
	}

	public void setLookup8Value(String lookup8Value) {
		this.lookup8Value = lookup8Value;
	}

	public String getLookup8Name() {
		return lookup8Name;
	}

	public void setLookup8Name(String lookup8Name) {
		this.lookup8Name = lookup8Name;
	}

	public String getLookup9Value() {
		return lookup9Value;
	}

	public void setLookup9Value(String lookup9Value) {
		this.lookup9Value = lookup9Value;
	}

	public String getLookup9Name() {
		return lookup9Name;
	}

	public void setLookup9Name(String lookup9Name) {
		this.lookup9Name = lookup9Name;
	}

	public String getLookup10Value() {
		return lookup10Value;
	}

	public void setLookup10Value(String lookup10Value) {
		this.lookup10Value = lookup10Value;
	}

	public String getLookup10Name() {
		return lookup10Name;
	}

	public void setLookup10Name(String lookup10Name) {
		this.lookup10Name = lookup10Name;
	}

	public String getLookup11Value() {
		return lookup11Value;
	}

	public void setLookup11Value(String lookup11Value) {
		this.lookup11Value = lookup11Value;
	}

	public String getLookup11Name() {
		return lookup11Name;
	}

	public void setLookup11Name(String lookup11Name) {
		this.lookup11Name = lookup11Name;
	}

	public String getLookup12Value() {
		return lookup12Value;
	}

	public void setLookup12Value(String lookup12Value) {
		this.lookup12Value = lookup12Value;
	}

	public String getLookup12Name() {
		return lookup12Name;
	}

	public void setLookup12Name(String lookup12Name) {
		this.lookup12Name = lookup12Name;
	}

	public String getLookup13Value() {
		return lookup13Value;
	}

	public void setLookup13Value(String lookup13Value) {
		this.lookup13Value = lookup13Value;
	}

	public String getLookup13Name() {
		return lookup13Name;
	}

	public void setLookup13Name(String lookup13Name) {
		this.lookup13Name = lookup13Name;
	}

	public String getLookup14Value() {
		return lookup14Value;
	}

	public void setLookup14Value(String lookup14Value) {
		this.lookup14Value = lookup14Value;
	}

	public String getLookup14Name() {
		return lookup14Name;
	}

	public void setLookup14Name(String lookup14Name) {
		this.lookup14Name = lookup14Name;
	}

	public String getLookup15Value() {
		return lookup15Value;
	}

	public void setLookup15Value(String lookup15Value) {
		this.lookup15Value = lookup15Value;
	}

	public String getLookup15Name() {
		return lookup15Name;
	}

	public void setLookup15Name(String lookup15Name) {
		this.lookup15Name = lookup15Name;
	}

	public String getLookup16Value() {
		return lookup16Value;
	}

	public void setLookup16Value(String lookup16Value) {
		this.lookup16Value = lookup16Value;
	}

	public String getLookup16Name() {
		return lookup16Name;
	}

	public void setLookup16Name(String lookup16Name) {
		this.lookup16Name = lookup16Name;
	}

	public String getLookup17Value() {
		return lookup17Value;
	}

	public void setLookup17Value(String lookup17Value) {
		this.lookup17Value = lookup17Value;
	}

	public String getLookup17Name() {
		return lookup17Name;
	}

	public void setLookup17Name(String lookup17Name) {
		this.lookup17Name = lookup17Name;
	}

	public String getLookup18Value() {
		return lookup18Value;
	}

	public void setLookup18Value(String lookup18Value) {
		this.lookup18Value = lookup18Value;
	}

	public String getLookup18Name() {
		return lookup18Name;
	}

	public void setLookup18Name(String lookup18Name) {
		this.lookup18Name = lookup18Name;
	}

	public String getLookup19Value() {
		return lookup19Value;
	}

	public void setLookup19Value(String lookup19Value) {
		this.lookup19Value = lookup19Value;
	}

	public String getLookup19Name() {
		return lookup19Name;
	}

	public void setLookup19Name(String lookup19Name) {
		this.lookup19Name = lookup19Name;
	}

	public String getLookup20Value() {
		return lookup20Value;
	}

	public void setLookup20Value(String lookup20Value) {
		this.lookup20Value = lookup20Value;
	}

	public String getLookup20Name() {
		return lookup20Name;
	}

	public void setLookup20Name(String lookup20Name) {
		this.lookup20Name = lookup20Name;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getInsEmpid() {
		return insEmpid;
	}

	public void setInsEmpid(String insEmpid) {
		this.insEmpid = insEmpid;
	}

	public Date getInsDt() {
		return insDt;
	}

	public void setInsDt(Date insDt) {
		this.insDt = insDt;
	}

	public String getUdtEmpid() {
		return udtEmpid;
	}

	public void setUdtEmpid(String udtEmpid) {
		this.udtEmpid = udtEmpid;
	}

	public Date getUdtDt() {
		return udtDt;
	}

	public void setUdtDt(Date udtDt) {
		this.udtDt = udtDt;
	} 

}
