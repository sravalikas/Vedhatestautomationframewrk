package com.vedha.basedriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.vedha.commonutils.CommonUtils;
import com.vedha.constants.*;


public class BaseClass {

	public static WebDriver driver;
	public static Logger logger;
	public static Properties property;
	
	
	public BaseClass() {
		logger = Logger.getLogger(this.getClass());
		
		try {
			property = new Properties();
			FileInputStream file = new FileInputStream(Constants.TestData_Path);
			
			property.load(file);
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (Exception e1) {
		}
	}
	
	public static WebDriver instance() {
		
		return driver;
		
	}
	
	@BeforeTest
	public void setuploggers() {
		CommonUtils.SetLog4j();
	}
}
