package com.vedha.NaukariReusables;

import org.openqa.selenium.interactions.Actions;

import com.vedha.basedriver.*;
import com.vedha.objectrepository.*;
import com.vedha.objectrepository.NaukariLogOutPage;
import com.vedha.objectrepository.NaukariRegPage;
import com.vedha.corecomponents.SeleniumUtils;
import com.vedha.corecomponents.IDriverfactory.LocatorType;

public class NaukariUtils extends BaseClass {
    
	public void NaukariLogin(SeleniumUtils seleniumUtils) {
		seleniumUtils.click(NaukariLoginPage.getLogin(), LocatorType.id);
		seleniumUtils.EnterText(NaukariLoginPage.getUsername(), LocatorType.xpath, property.getProperty("mail"));
		seleniumUtils.EnterText(NaukariLoginPage.getPassword(), LocatorType.xpath, property.getProperty("pwd"));
		seleniumUtils.click(NaukariLoginPage.getSubmit(), LocatorType.xpath);
	}
	
	public void NaukariLogoutFunc(SeleniumUtils seleniumUtils) throws InterruptedException
    {
        //As logout link is hidden on the page, so using actions
        Actions action = new Actions(instance());
        seleniumUtils.Sleep();
        action.moveToElement(seleniumUtils.FindElement(NaukariLogOutPage.getMyNaukari(), LocatorType.xpath)).build().perform();
        seleniumUtils.click(NaukariLogOutPage.getLogout(), LocatorType.xpath);
        
    }
	
	public void RegFunc(SeleniumUtils seleniumUtils) {
		CloseChildWindows(seleniumUtils);
		Popup(seleniumUtils);
		seleniumUtils.click(NaukariRegPage.getRegButton(), LocatorType.xpath);
		seleniumUtils.click(NaukariRegPage.getUserType(), LocatorType.name);
		seleniumUtils.EnterText(NaukariRegPage.getFirstName(), LocatorType.id, property.getProperty("name") );
		seleniumUtils.EnterText(NaukariRegPage.getMailId(), LocatorType.id, property.getProperty("email"));
		seleniumUtils.EnterText(NaukariRegPage.getPassword(), LocatorType.name, property.getProperty("pswd"));
		seleniumUtils.EnterText(NaukariRegPage.getNumber(), LocatorType.name, property.getProperty("num"));
		seleniumUtils.click(NaukariRegPage.getExpYr(), LocatorType.name);
		seleniumUtils.click(NaukariRegPage.getExYear(), LocatorType.xpath);
		seleniumUtils.click(NaukariRegPage.getExpMn(), LocatorType.name);
		seleniumUtils.click(NaukariRegPage.getExMonth(), LocatorType.xpath);
	    seleniumUtils.EnterText(NaukariRegPage.getUploadCV(), LocatorType.name, "E:\\sravalika\\res.pdf");
	    seleniumUtils.click(NaukariRegPage.getRegNow(), LocatorType.xpath);
	}
	
	public void EmpTab(SeleniumUtils seleniumUtils) {
		seleniumUtils.EnterText(NaukariRegPage.getDesignation(), LocatorType.id,property.getProperty("desig"));
		seleniumUtils.EnterText(NaukariRegPage.getCompany(),LocatorType.id, property.getProperty("company"));
		seleniumUtils.click(NaukariRegPage.getLacs(), LocatorType.xpath);
		seleniumUtils.click(NaukariRegPage.getThous(), LocatorType.xpath);
		seleniumUtils.click(NaukariRegPage.getYear(), LocatorType.xpath);
		seleniumUtils.click(NaukariRegPage.getMonth(), LocatorType.xpath);
		seleniumUtils.click(NaukariRegPage.getCity(), LocatorType.xpath);
		
	}

	
	public void CloseChildWindows(SeleniumUtils seleniumUtils)
    {
         
        String parentWindowHandle = instance().getWindowHandle();
        System.out.println("Parent Window :" + parentWindowHandle);

        int child = instance().getWindowHandles().size();
        System.out.println("Child window count" + child);
        
        for(String element : instance().getWindowHandles())
        {
            if (!element.equals(parentWindowHandle))
            {
                //Console.WriteLine(element);
                System.out.println(instance().switchTo().window(element).getTitle());
                instance().switchTo().window(element).close();
            }

        }
        instance().switchTo().window(parentWindowHandle);
    }
   

	 public void Popup(SeleniumUtils seleniumUtils)
	    {
	        seleniumUtils.click("block", LocatorType.id);
	        
	    }


}
