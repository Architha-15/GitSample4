package com.architha.selenium.maven.Thirdjenkinsmavenapp;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GmailLogin  {
	@Test
	public void gmailLogin() {
		DriverUtility.openBrowser("chrome");
		DriverUtility.getDriver().get("https://www.facebook.com");
		//DriverUtility.getDriver().findElement(By.id("identifierId1")).sendKeys("architha");
	}

}

