package com.TestNGDemo1.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestNGDemo1.base.BaseClass;
import com.TestNGDemo1.pageObjects.ProductSearchPage;
import com.TestNGDemo1.reports.ExtFactory;
import com.aventstack.extentreports.Status;

public class TC_ProductSearchTest_004 extends BaseClass{
	
	@Test
	public void productSearchTest() throws InterruptedException, IOException
	{
		
		//driver.get(baseURL);
				logger.info("Application URL is launched");
				ExtFactory.getInstance().getExtent().log(Status.INFO, "Application launched");
				//log(Status.INFO,"String Message to Log for Each Step in Test Case");
				
				ProductSearchPage ps = new ProductSearchPage(driver);
				
				ps.loginLink();
				logger.info("click on login link");
				ExtFactory.getInstance().getExtent().log(Status.INFO, "click on login link");
				Thread.sleep(5000);
				ps.setUserName(username);
				logger.info("Username entered");
				ExtFactory.getInstance().getExtent().log(Status.INFO, "Username entered");
				Thread.sleep(5000);
				ps.setPassword(passward);
				logger.info("Passward entered");
				ExtFactory.getInstance().getExtent().log(Status.INFO, "Passward entered");
				Thread.sleep(5000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,350)", "");
				ps.clickSubmit();
				logger.info("Clicked login button");
				ExtFactory.getInstance().getExtent().log(Status.INFO, "Clicked login button");
				
				if(driver.getTitle().equals("Shop1"))
				{
					Assert.assertTrue(true);
					logger.info("Login passed");
					ExtFactory.getInstance().getExtent().log(Status.INFO, "Login passed");
					logger.info("Title verified");
					ExtFactory.getInstance().getExtent().log(Status.INFO, "Title verified");
				}
				else
				{
					captureScreenFailed(driver,"productSearchTest");
					Assert.assertTrue(false);
					logger.info("Login  failed");
					ExtFactory.getInstance().getExtent().log(Status.INFO, "Login  failed");
					
				}
				
				ps.enterProduct(producttext);
				logger.info("Entered product Text");
				ExtFactory.getInstance().getExtent().log(Status.INFO, "Entered product Text");
				
				ps.clickSearchButton();
				logger.info("clicked on search icon");
				ExtFactory.getInstance().getExtent().log(Status.INFO, "clicked on search icon");
				
				//Title Validation after Search the product
				
				if(driver.getTitle().equals("Shop. Search result for \"ball\""))
				{
					Assert.assertTrue(true);
					logger.info("Title verified successfully");
					ExtFactory.getInstance().getExtent().log(Status.INFO, "Title verified successfully");
					//logger.info("Registration test passed");
				}
				else
				{
					captureScreenFailed(driver,"productSearchTest");
					Assert.assertTrue(false);
					logger.info("Page Title mismatched");
					ExtFactory.getInstance().getExtent().log(Status.INFO, "Page Title mismatched");
					
					
				}
				
				
				


}
}