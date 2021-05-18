package com.TestNGDemo1.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestNGDemo1.base.BaseClass;
import com.TestNGDemo1.pageObjects.LoginPage;
import com.TestNGDemo1.pageObjects.RegistrationPage;
import com.aventstack.extentreports.Status;

import com.TestNGDemo1.reports.ExtFactory;

public class TC_RegistrationTest_001 extends BaseClass{
	
	@Test
	public void registrationTest() throws InterruptedException, IOException
	{
		
		
		logger.info("Application launched");
		
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Application launched");
		
		if(driver.getCurrentUrl().equals("https://services.smartbear.com/samples/TestComplete14/smartstore/"))
		{
			captureScreenPassed(driver,"registrationTest");
			Assert.assertTrue(true);
			
			logger.info("URL matched");
		
			ExtFactory.getInstance().getExtent().log(Status.INFO, "URL matched");
		}
		else
		{
			captureScreenFailed(driver,"registrationTest");
			Assert.assertTrue(false);
			logger.info("URL mismatched");
			
			ExtFactory.getInstance().getExtent().log(Status.INFO, "URL mismatched");
			
		}
		
		RegistrationPage rp = new RegistrationPage(driver);
		
		rp.loginLink();
		logger.info("Click on Login link");
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Click on Login link");
	
		rp.registerButton();
		logger.info("Click on Register button");
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Click on Register button");
		
		rp.custgender("male");
		logger.info("Select Male option");
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Select Male option");
		
		rp.setFirstname(fname);
		logger.info("Enter First name");
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Enter First name");
		
		rp.setLastname(lname);
		logger.info("Enter Last name");
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Enter Last name");

		String email=randomestring()+"@gmail.com";
		rp.custemailid(email);
		logger.info("Enter  Email");
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Enter  Email");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		String reguser = randomestring();
		rp.setUsernameR(reguser);
		logger.info("Enter Username");
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Enter Username");
		
		rp.setPassward(regpassward);
		logger.info("Enter Password");
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Enter Password");
		
		rp.setConPassward(regconpassward);
		logger.info("Enter Confirmed Password");
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Enter Confirmed Password");
		
		rp.regiButton();
		logger.info("Click on Register Button");
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Click on Register Button");
		
		//Title validation Shop. Search result for "ball"
		if(driver.getTitle().equals("Shop. Register1"))
		{
			captureScreenPassed(driver,"registrationTest");
			Assert.assertTrue(true);
			logger.info("User Created Successfully");
			ExtFactory.getInstance().getExtent().log(Status.PASS, "User Created Successfully");
		}
		else
		{
			captureScreenFailed(driver,"registrationTest");
			Assert.assertTrue(false);
			logger.info("Page Title mismatched");
			ExtFactory.getInstance().getExtent().log(Status.FAIL, "Page Title mismatched");
		}
		
		//Confirmation message validation after submitting the registration details
		boolean res = driver.getPageSource().contains("Your registration completed");
		if (res == true)
		{
			captureScreenPassed(driver,"registrationTest");
			Assert.assertTrue(true);
			logger.info("Validation message displayed successfully");
			ExtFactory.getInstance().getExtent().log(Status.PASS, "Validation message displayed successfully");
		}
		else
		{
			logger.info("Validation message not displayed");
			ExtFactory.getInstance().getExtent().log(Status.FAIL, "Validation message not displayed");
			captureScreenFailed(driver,"registrationTest");
			Assert.assertTrue(false);
		}
		
		
	}


}
