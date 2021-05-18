package com.TestNGDemo1.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TestNGDemo1.base.BaseClass;
import com.TestNGDemo1.pageObjects.LoginPage;
import com.TestNGDemo1.pageObjects.RegistrationPage;
import com.TestNGDemo1.utilities.XLUtils;

public class TC_RegistrationTestDDT_006 extends BaseClass {
	
	
	@Test(dataProvider="RegistrationData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.loginLink();
		lp.setUserName(user);
		logger.info("user name provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		lp.clickSubmit();
		logger.info("clicked on login button");
		
		Thread.sleep(3000);
		
	/*	if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			//logger.warn("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			//logger.info("Login passed");
			//lp.clickLogout();
			//lp.clickLoggedUser();
			//lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
			
		}*/
		
		lp.clickLoggedUser();
		//logger.info("Loggedin Successfully");
		//logger.info("clicked on loggeduser link");
		lp.clickLogout();
		//logger.info("clicked on logout option");
		//logger.info("Loggedout Successfully");
}
	
	
		
	
	
	@DataProvider(name="RegistrationData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/TestNGDemo1/testData/RegistrationData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}
}

	
	