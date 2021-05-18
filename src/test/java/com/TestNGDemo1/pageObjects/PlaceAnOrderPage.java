package com.TestNGDemo1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

 public class PlaceAnOrderPage {
WebDriver ldriver;
public PlaceAnOrderPage (WebDriver rdriver)
{
ldriver=rdriver;
PageFactory.initElements(rdriver, this);
}
//Page Elements
@FindBy(xpath="//*[@id=\"menubar-my-account\"]/div/a/span")
@CacheLookup
WebElement clickLoginlink;
@FindBy(id="UsernameOrEmail")
@CacheLookup
WebElement txtUserName;
@FindBy(id="Password")
@CacheLookup
WebElement txtPassword;
@FindBy(xpath="//*[@id=\"content-center\"]/div/div[2]/div[1]/div/form/div[4]/button")
@CacheLookup
WebElement btnLogin;
@FindBy(xpath="//span[contains(text(),'Books')]")
@CacheLookup
WebElement clickBookslnk;
@FindBy(xpath="(//span[contains(text(),'Bestseller')])[3]")
@CacheLookup
WebElement clickBestSellerlnk;
@FindBy(xpath="//img[@alt='Picture of The novel']")
@CacheLookup
WebElement clickProdcutNovel;
@FindBy(xpath="//span[contains(text(),'Add to cart')]")
@CacheLookup
WebElement addProductToCart;
@FindBy(xpath="//strong[contains(text(),'The novel')]")
@CacheLookup
WebElement verifyNovelProductinCart;
@FindBy(xpath="//span[contains(text(),'Checkout')]")
@CacheLookup
WebElement clickOnCheckout;
@FindBy(xpath="//button[contains(text(),'Confirm')]")
@CacheLookup
WebElement clickOnConfirmbtn;

@FindBy(id = "NewAddress_FirstName")
@CacheLookup
WebElement enterFirstNameInBillingAddress;

@FindBy(id = "NewAddress_LastName")
@CacheLookup
WebElement enterLastNameInBillingAddress;

@FindBy(id = "NewAddress_Address1")
@CacheLookup
WebElement enterAddress1InBillingAddress;
 
@FindBy(id = "NewAddress_City")
@CacheLookup
WebElement enterCityInBillingAddress;
@FindBy(id = "NewAddress_ZipPostalCode")
@CacheLookup
WebElement enterZipCode1InBillingAddress;
@FindBy(id = "NewAddress_CountryId")
@CacheLookup
WebElement clickCountryIdInBillingAddress;

//@FindBy(xpath = "//span[contains(text(),'Germany')]")
/*@FindBy(xpath = "/html/body/span/span/span[1]/input")
@CacheLookup
WebElement selectCountry;*/

@FindBy(id = "select2-NewAddress_CountryId-container")
@CacheLookup
WebElement clickCountryDD;

@FindBy(xpath = "/html/body/span/span/span[1]/input")
@CacheLookup
WebElement countryname;

@FindBy(id = "NewAddress_Email")
@CacheLookup
WebElement enterEmailInBillingAddress;
@FindBy(id = "NewAddress_PhoneNumber")
@CacheLookup
WebElement enterPhoneNumberInBillingAddress;
@FindBy(xpath = "//span[contains(text(),'Next')]")
@CacheLookup
WebElement clickNextbtn;

@FindBy(xpath = "//*[@id=\"content-center\"]/div/div[2]/form/div/button/span")
@CacheLookup
WebElement clickNextbtnS;

@FindBy(xpath = "//*[@id=\"content-center\"]/div/div[2]/form/div/button/span")
@CacheLookup
WebElement clickNextbtnSS;



@FindBy(xpath = "//span[contains(text(),'Bill to this address')]")
@CacheLookup
WebElement clickBillToThisAddressbtn;

@FindBy(xpath = "//span[contains(text(),'Ship to this address')]")
@CacheLookup
WebElement clickShipToThisAddressbtn;

@FindBy(id = "termsofservice")
@CacheLookup
WebElement accertTermsAndConditions;

@FindBy(xpath = "//*[@id=\"content-center\"]/div/div[2]/div[2]/div[2]/button/span")
@CacheLookup
WebElement clickConfirmbtn;

@FindBy(xpath = "//*[@id=\"content-center\"]/div/div[2]/div/p/a[1]/span")
@CacheLookup
WebElement clickorddetailsbtn;



@FindBy(xpath = "//h1[contains(text(),'Your order has been received')]")
@CacheLookup
WebElement verifyOrderIsPlacedSuccessfully;

//Action Methods
public void verifyOrderIsPlacedSuccessfully()
{
verifyOrderIsPlacedSuccessfully.isDisplayed();
}
public void clickNextbtn()
{
clickNextbtn.click();
}

public void clickNextbtnS()
{
	clickNextbtnS.click();
}

public void clickNextbtnSS()
{
	clickNextbtnSS.click();
}

public void clickOrddetBtn()
{
	clickorddetailsbtn.click();
}

public void clickBillToThisAddressbtn()
{
clickBillToThisAddressbtn.click();
}
public void clickShipToThisAddressbtn()
{
	clickShipToThisAddressbtn.click();
}
public void accertTermsAndConditions()
{
accertTermsAndConditions.click();
}
public void clickConfirmbtn()
{
clickConfirmbtn.click();
}
public void loginLink()
{
clickLoginlink.click();
}
public void setUserName(String uname)
{
txtUserName.sendKeys(uname);
}
public void setPassword(String pwd)
{
txtPassword.sendKeys(pwd);
}

public void clickSubmit()
{
btnLogin.click();
}
public void bookslnk()
{
clickBookslnk.click();
}
public void clickBestSellerlnk()
{
clickBestSellerlnk.click();
}
public void clickProductNovel()
{
clickProdcutNovel.click();
}
public void addProductToCart()
{
addProductToCart.click();
}
public void verifyNovelProductinCart()
{
verifyNovelProductinCart.isDisplayed();
}
public void clickOnCheckout()
{
clickOnCheckout.click();
}

public void enterFirstNameInBillingAddress(String billingAddressFirstName)
{
enterFirstNameInBillingAddress.sendKeys(billingAddressFirstName);

}

public void enterLastNameInBillingAddress(String billingAddressLastName)
{
enterLastNameInBillingAddress.sendKeys(billingAddressLastName);
}

public void enterAddress1InBillingAddress(String billingAddress1)
{
enterAddress1InBillingAddress.sendKeys(billingAddress1);
}

public void enterCityInBillingAddress(String billingAddressCity)
{
enterCityInBillingAddress.sendKeys(billingAddressCity);
}

public void enterZipCodeInBillingAddress(String billingAddressZipCode)
{
enterZipCode1InBillingAddress.sendKeys(billingAddressZipCode);
}

public void enterEmailInBillingAddress(String billingAddressEmail)
{
enterEmailInBillingAddress.sendKeys(billingAddressEmail);
}

public void enterPhonenoInBillingAddress(String billingPhoneno)
{
enterPhoneNumberInBillingAddress.sendKeys(billingPhoneno);
}

public void clickCountryId1InBillingAddress()
{
clickCountryIdInBillingAddress.click();
}




public void clickcountdd()
{
	clickCountryDD.click();
}

public void entercountryNameInBillingAdress(String counrtyname)
{
	countryname.sendKeys(counrtyname);
}


 }
