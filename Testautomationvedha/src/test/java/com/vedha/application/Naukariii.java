package com.vedha.application;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Naukariii {

	WebDriver driver;
	


	@BeforeMethod
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
	}
	
	
	@Test
	public void loginn(){	
		
		try {
			WebElement element = driver.findElement(By.xpath("//a[@id='login_Layer']"));
			element.click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@id='login_Layer']")));
			
			WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
			userName.sendKeys("sravalikasuddala95@gmail.com");
			
			WebDriverWait userwait = new WebDriverWait(driver, Duration.ofSeconds(10));
			userwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")));
			
			WebElement passWord = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
			passWord.sendKeys("Kun@l1991");
			
			WebDriverWait passwait = new WebDriverWait(driver, Duration.ofSeconds(10));
			passwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Enter your password']")));
			
			WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
			submit.click();
			
			WebDriverWait submitwait = new WebDriverWait(driver, Duration.ofSeconds(10));
			submitwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[normalize-space()='Login']")));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
