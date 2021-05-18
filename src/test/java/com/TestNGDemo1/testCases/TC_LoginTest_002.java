package com.TestNGDemo1.testCases;

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.TestNGDemo1.base.BaseClass;
import com.TestNGDemo1.pageObjects.LoginPage;
import com.aventstack.extentreports.Status;

import com.TestNGDemo1.reports.ExtFactory;





public class TC_LoginTest_002 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
			
		logger.info("Application URL is launched");
    	ExtFactory.getInstance().getExtent().log(Status.INFO, "Application launched");
		
	
		if(driver.getCurrentUrl().equals("https://services.smartbear.com/samples/TestComplete14/smartstore/"))
		{
			captureScreenPassed(driver,"loginTest");
			Assert.assertTrue(true);
			logger.info("URL matched");
			ExtFactory.getInstance().getExtent().log(Status.INFO, "URL matched");
			

		}
		else
		{
			captureScreenFailed(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("URL mismatched");
			
			ExtFactory.getInstance().getExtent().log(Status.INFO, "URL mismatched");
			
		}
		
		LoginPage lp = new LoginPage(driver);
		lp.loginLink();
		logger.info("Clicked on Login link");
		
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Clicked on Login link");
		Thread.sleep(5000);
		lp.setUserName(username);
		logger.info("Username entered");
		
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Username entered");
		Thread.sleep(5000);
		lp.setPassword(passward);
		logger.info("Passward entered");
		
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Username entered");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		lp.clickSubmit();
		logger.info("clicked on login button");
		
		ExtFactory.getInstance().getExtent().log(Status.INFO, "clicked on login button");
		
		//validate the page title after login Application
		if(driver.getTitle().equals("Shop"))
		{
			captureScreenPassed(driver,"loginTest");
			Assert.assertTrue(true);
			logger.info("Title verified");
			
			ExtFactory.getInstance().getExtent().log(Status.INFO, "Title verified");
			logger.info("Login test passed");
			
			ExtFactory.getInstance().getExtent().log(Status.INFO, "Login test passed");
			
		}
		else
		{
			captureScreenFailed(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
			
			ExtFactory.getInstance().getExtent().log(Status.INFO, "Login test failed");
			
			
		}
		
		
		lp.clickLoggedUserText(loggedUser);
		logger.info("verified Logged user successfully ");
		
		ExtFactory.getInstance().getExtent().log(Status.INFO, "verified Logged user successfully");
		
		
		
		Thread.sleep(5000);
		lp.clickLoggedUser();
		logger.info("Clicked on Logged user name");
		
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Clicked on Logged user name");
		Thread.sleep(5000);
		lp.clickLogout();
		logger.info("Clicked on Logout Option");
		
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Clicked on Logout Option");
		logger.info("Application Loggedout Successfully");
	
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Application Loggedout Successfully");
		
		
		
		
		
	}

}
