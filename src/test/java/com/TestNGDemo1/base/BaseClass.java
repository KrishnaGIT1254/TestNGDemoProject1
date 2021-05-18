package com.TestNGDemo1.base;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import com.TestNGDemo1.utilities.ReadConfig;




public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	
	public String baseURL =readconfig.getApplicationURL();
	public String username =readconfig.getUsername();	
	public String passward =readconfig.getPassword();
	
	
	public String  fname=readconfig.getfname();
	public String lname =readconfig.getlname();
	
	//public String email =readconfig.getEmail();

	public String reguser =readconfig.getRegUser();
	public String regpassward =readconfig.getregpassward();
	public String regconpassward =readconfig.getregconpassward();
	public String producttext =readconfig.getProduct();
	public String loggedUser =readconfig.getLoggedUser();
	
	
	public String billingAddressFirstName=readconfig.getFirstNameInBillingAddress();
	public String billingAddressLastName=readconfig.getLastNameInBillingAddress();
	
	public String billingAddress1=readconfig.getAddress1InBillingAddress1();
	
	public String billingAddressCity=readconfig.getCityInBillingAddress();
	public String billingAddressZipCode=readconfig.getZipCodeInBillingAddress();
	public String billingAddressEmail=readconfig.getEmailInBillingAddress();
	public String billingPhoneno=readconfig.getphoneno();
	public String counrtyname=readconfig.getcountryname();
	
	
	public Logger logger;
	
	
	public WebDriver driver;
	 
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)
	{
		
		logger = Logger.getLogger("TestNGDemoProject1");
		PropertyConfigurator.configure("Log4j.properties");
		
			
	if(br.equals("chrome"))	
	{
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
	    driver = new ChromeDriver(); 
	    
	   
	    
	}else if(br.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
	    driver = new FirefoxDriver(); 
	    
	}else if(br.equals("ie"))
	{
		System.setProperty("webdriver.ie.driver", readconfig.getIEPath());
	    driver = new InternetExplorerDriver(); 
	    
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	driver.get(baseURL);
	}
	
    @AfterClass
	public void tearDown() {
		driver.quit();
	}
		
	
	

	public void captureScreenFailed(WebDriver driver, String tname) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/ScreenshotsFailed/" + tname + dateName+ ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
		
	}
	
	public void captureScreenPassed(WebDriver driver, String tname) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/ScreenshotsPassed/"+ tname + dateName + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");	
		
	}
	
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	
	
	
			

}
