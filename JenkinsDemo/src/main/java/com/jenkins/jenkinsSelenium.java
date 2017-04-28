package com.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class jenkinsSelenium {
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite(){
		
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		
		
	}
	@Test
	public void VerifyTitle(){
		assertTrue(driver.getTitle().contains("facebook"));
	}
	private void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}
	
	

}
