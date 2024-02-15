package com.vedha.commonutils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.PropertyConfigurator;

import com.vedha.constants.*;

public class CommonUtils {

	public static String getCurrentDate() {
		
		SimpleDateFormat dateFromate = new SimpleDateFormat("_ddMMyyyy_HHmmss");
		
		Date date = new Date();
		return dateFromate.format(date);
	}
	
	public static void setlog4j() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("_ddMMyyyy_HHmmss");
		Date date = new Date();
		String currentDate = dateFormat.format(date);
		System.setProperty("current_date", currentDate);
		PropertyConfigurator.configure(Constants.LoggersPath);
	}
}
