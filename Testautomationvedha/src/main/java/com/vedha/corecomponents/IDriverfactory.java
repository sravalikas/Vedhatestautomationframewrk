package com.vedha.corecomponents;

import org.openqa.selenium.WebDriver;



public interface IDriverfactory {
	
	WebDriver CreateWebDriver(BrowserType browser);

	public enum LocatorType{
		id,
		name,
		classname,
		tagname,
		xpath,
		cssselector,
		linktext,
		partiallinktext
	}
	public enum BrowserType {
		chrome,
		edge,
		firefox
	}
	public enum ListItemInputType{
		value,
		text,
		index
	}
	public enum WindowType{
		window,
		tab
	}

}
