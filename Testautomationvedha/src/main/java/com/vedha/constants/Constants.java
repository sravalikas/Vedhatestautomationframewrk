package com.vedha.constants;

import com.vedha.commonutils.*;

public class Constants {

	
	public static final String TESTDATA_STRING = System.getProperty("user_id")
	+ "/src/main/resources/TestData.properties";
	
	public static final String LoggersPath = "./src/main/resources/log4j.properties";
	
	public static final String TestReportsPath = System.getProperty("user.dir") + "/VedhaTestReports"
			+ CommonUtils.getCurrentDate() + ".html";
	
public static final String Loggers = System.getProperty("user.dir") + "./src/main/resources/log4j.properties";
	
	public static final int LONG_WAIT = 10000;
	
	
	public static String Naukari_Url = "https://www.naukri.com/";
}
