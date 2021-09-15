package custom.erp.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class GlobalLibrary {

	public static String getDateFormat(Date date) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date);
	}
	
	public static Date getDateNow() {
		return new Date();
	}
	
	public static String getDateNowFormatted() {
		return getDateFormat(getDateNow());
	}
}
