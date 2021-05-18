package com.TestNGDemo1.testCases;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestNGDemo1.base.BaseClass;
import com.TestNGDemo1.pageObjects.PlaceAnOrderPage;
import com.TestNGDemo1.reports.ExtFactory;
import com.aventstack.extentreports.Status;



public class TC_PlaceAnOrderTest_007 extends BaseClass
{
@Test
public void placeAnOrderTest() throws InterruptedException, IOException
{
//driver.get(baseURL);
ExtFactory.getInstance().getExtent().log(Status.INFO, "Application launched");	
logger.info("Application launched");
PlaceAnOrderPage po = new PlaceAnOrderPage(driver);
po.loginLink();
//Thread.sleep(5000);
po.setUserName(username);
logger.info("Enter UserName ");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Enter UserName");
//Thread.sleep(5000);
po.setPassword(passward);
logger.info("Enter Password");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Enter Password");
//Thread.sleep(5000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,350)", "");
po.clickSubmit();
Thread.sleep(3000);
logger.info("Submit");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Submit");
//Title Verification
if(driver.getTitle().equals("Shop"))
{
Assert.assertTrue(true);
logger.info("Home Page Title verified");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Home Page Title verified");
}
else
{
captureScreenFailed(driver,"PlanAnOrderTest");
Assert.assertTrue(false);
logger.info("Home Page not loaded");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Home Page not loaded");
}
//Place An Order
po.bookslnk();
logger.info("Cick on Books link");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Cick on Books link");
po.clickBestSellerlnk();
logger.info("Click on Bestseller link");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Click on Bestseller link");
po.clickProductNovel();
logger.info("Click on Product Novel");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Click on Product Novel");
Thread.sleep(5000);
//captureScreen(driver,"placeAnOrderTest");
po.addProductToCart();
logger.info("Add Product Novel to Cart");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Add Product Novel to Cart");
Thread.sleep(5000);
po.verifyNovelProductinCart();
Thread.sleep(5000);
logger.info("Verify product in cart");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Verify product in cart");
po.clickOnCheckout();
Thread.sleep(5000);
logger.info("Click on Checkout");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Click on Checkout");

//Title Verification after checkout
if(driver.getTitle().equals("Shop. Checkout"))
{
Assert.assertTrue(true);
logger.info("Title verified");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Title verified");
}
else
{
captureScreenFailed(driver,"PlanAnOrderTest");
Assert.assertTrue(false);
logger.info("Page not loaded");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Page not loaded");
}

po.enterFirstNameInBillingAddress(billingAddressFirstName);
logger.info("Enter First Name");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Enter First Name");
Thread.sleep(3000);

po.enterLastNameInBillingAddress(billingAddressLastName);
logger.info("Enter last Name");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Enter last Name");
Thread.sleep(3000);

JavascriptExecutor js1 = (JavascriptExecutor) driver;
js1.executeScript("window.scrollBy(0,250)", "");

//po.enterAddress1InBillingAddress(billingAddress1);
po.enterAddress1InBillingAddress(billingAddress1);
logger.info("Enter Address1");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Enter Address1");

Thread.sleep(3000);
po.enterCityInBillingAddress(billingAddressCity);
logger.info("Enter City");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Enter City");
Thread.sleep(3000);
po.enterZipCodeInBillingAddress(billingAddressZipCode);
logger.info("Enter Zip COde");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Enter Zip COde");
Thread.sleep(3000);
//po.enterEmailInBillingAddress(billingAddressEmail);
//logger.info("Enter Email");
Thread.sleep(3000);
po.enterPhonenoInBillingAddress(billingPhoneno);
logger.info("Enter Phone no.");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Enter Phone no.");
po.clickcountdd();
logger.info("click on country dd");
ExtFactory.getInstance().getExtent().log(Status.INFO, "click on country dd");
po.entercountryNameInBillingAdress(counrtyname);
logger.info("enter country");
ExtFactory.getInstance().getExtent().log(Status.INFO, "enter country");

po.clickNextbtn();
logger.info("click Next button");
ExtFactory.getInstance().getExtent().log(Status.INFO, "click Next button");

po.clickBillToThisAddressbtn();
logger.info("click on bill to this address");
ExtFactory.getInstance().getExtent().log(Status.INFO, "click on bill to this address");

po.clickShipToThisAddressbtn();
logger.info("click on ship to this address");
ExtFactory.getInstance().getExtent().log(Status.INFO, "click on ship to this address");
JavascriptExecutor js4 = (JavascriptExecutor) driver;
js4.executeScript("window.scrollBy(0,250)", "");

po.clickNextbtnS();
logger.info("click Next button in Select shipping method screen");
ExtFactory.getInstance().getExtent().log(Status.INFO, "click Next button in Select shipping method screen");
JavascriptExecutor js2 = (JavascriptExecutor) driver;
js2.executeScript("window.scrollBy(0,250)", "");

po.clickNextbtnSS();
logger.info("click Next button in Select payment method screen");
ExtFactory.getInstance().getExtent().log(Status.INFO, "click Next button in Select payment method screen");
JavascriptExecutor js3 = (JavascriptExecutor) driver;
js3.executeScript("window.scrollBy(0,250)", "");

po.accertTermsAndConditions();
logger.info("Accept Terms and Conditions");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Accept Terms and Conditions");
JavascriptExecutor js6 = (JavascriptExecutor) driver;
js6.executeScript("window.scrollBy(0,550)", "");

po.clickConfirmbtn();
logger.info("Click on Confirm");
ExtFactory.getInstance().getExtent().log(Status.INFO, "Click on Confirm");


//Confirmation message validation after submitting the registration details
		boolean res=driver.getPageSource().contains("Your order has been received");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Validation message displayed successfully");
			ExtFactory.getInstance().getExtent().log(Status.INFO, "Validation message displayed successfully");
			//test.log(Status.PASS,"Validation message displayed successfully");
		}
		else
		{
			
			captureScreenFailed(driver,"placeAnOrderTest");
			Assert.assertTrue(false);
			logger.info("Validation message not displayed");
			ExtFactory.getInstance().getExtent().log(Status.INFO, "Validation message not displayed");
			//test.log(Status.FAIL,"Validation message not displayed");
		}
		
	po.clickOrddetBtn();
	logger.info("click Order details button");
	ExtFactory.getInstance().getExtent().log(Status.INFO, "click Order details button");
	
	//Confirmation message validation after submitting the registration details
			boolean res1=driver.getPageSource().contains("Order Details");
			if(res1==true)
			{
				Assert.assertTrue(true);
				logger.info("Validation message displayed successfully");
				ExtFactory.getInstance().getExtent().log(Status.INFO, "Validation message displayed successfully");
				//test.log(Status.PASS,"Validation message displayed successfully");
			}
			else
			{
				
				captureScreenFailed(driver,"placeAnOrderTest");
				Assert.assertTrue(false);
				logger.info("Validation message not displayed");
				ExtFactory.getInstance().getExtent().log(Status.INFO, "Validation message not displayed");
				//test.log(Status.FAIL,"Validation message not displayed");
			}
		

}
}