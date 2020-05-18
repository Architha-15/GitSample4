package com.architha.selenium.maven.Thirdjenkinsmavenapp;


	

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class DriverUtility {
	
	private static WebDriver driver;
	
		
	
	@Parameters("browserName")
	@BeforeSuite
	public static void openBrowser(@Optional("chrome")String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\abhhinai\\Downloads\\FourthApplication\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\abhhinai\\Downloads\\FourthApplication\\Drivers\\geckodriver.exe");
			driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\abhhinai\\Downloads\\FourthApplication\\Drivers\\IEDriverServer.exe");
			driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		}
	}
	    @AfterSuite
		public void closeBrowser() {
			driver.quit();
		}
	    
	    public static WebDriver getDriver()
	    {
			return driver;
	    	
	    }
	
		
}		
		
	




