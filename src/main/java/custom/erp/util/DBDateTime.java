package custom.erp.util;

import java.util.Date;

import org.hibernate.annotations.Formula;

public class DBDateTime {
	@Formula("select sysdate from dual")
	public static final Date sysdate=new Date();
}
