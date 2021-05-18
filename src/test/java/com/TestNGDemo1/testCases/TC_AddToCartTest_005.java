package com.TestNGDemo1.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.TestNGDemo1.base.BaseClass;
import com.TestNGDemo1.pageObjects.AddToCartPage;
import com.TestNGDemo1.reports.ExtFactory;
import com.aventstack.extentreports.Status;

public class TC_AddToCartTest_005 extends BaseClass{
	
	@Test
	public void addToCartTest() throws InterruptedException, IOException
	{
		
		//driver.get(baseURL);
		logger.info("Application URL is launched");
		ExtFactory.getInstance().getExtent().log(Status.INFO, "Application URL is launched");
		
		AddToCartPage rp = new AddToCartPage(driver);



}

}
