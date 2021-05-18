package com.TestNGDemo1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
WebDriver ldriver;
	
	public RegistrationPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Page Elements
	
	@FindBy(xpath="//*[@id=\"menubar-my-account\"]/div/a/span")
	@CacheLookup
	WebElement clickLoginlink;
	
	//for Register button
	@FindBy(xpath="//*[@id=\"content-center\"]/div/div[2]/div[2]/div[2]/div/div/a")
	@CacheLookup
	WebElement clickRegisterButton;
	
	//for select Gender
	@FindBy(id="gender-male")
    @CacheLookup
    WebElement rdGender;
	
	//for Firstname
	@FindBy(id="FirstName")
	@CacheLookup
	WebElement txtfirstname;
	
	//for Lastname
	@FindBy(id="LastName")
	@CacheLookup
	WebElement txtlastname;
	
	//for day option selection
	@FindBy(name="DateOfBirthDay")
	@CacheLookup
	WebElement dayOpt;
	
	//for month option selection
	@FindBy(name="DateOfBirthMonth")
	@CacheLookup
	WebElement monthOpt;
		
	//for year option selection
	@FindBy(name="DateOfBirthYear")
	@CacheLookup
	WebElement yearOpt;
		
	
	
	
	//for email
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtemail;
	
	//for username
	@FindBy(id="Username")
	@CacheLookup
	WebElement txtusernameReg;
	
	//for passward
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtpassward;
	
	//for confirm passward
	@FindBy(id="ConfirmPassword")
	@CacheLookup
	WebElement txtconfirmpasswd;
	
	//for register button
	@FindBy(name="register-button")
	@CacheLookup
	WebElement registerButton;
		
		
	//for click on logged user
	@FindBy(xpath="//*[@id=\"menubar-my-account\"]/div/a/span")
	@CacheLookup
     WebElement UserNameOpt;
		
	//for click on Logout option
	@FindBy(xpath="//*[@id=\"menubar-my-account\"]/div/div/a[4]/span")
	@CacheLookup
	WebElement logoutOpt;	
		
	//for click continue
	@FindBy(xpath="//*[@id=\"content-center\"]/div/div[2]/div/a")
	@CacheLookup
	WebElement continueButton;	
		
	//for search feild
	 @FindBy(id="instasearch")
	 @CacheLookup
	 WebElement searchTextFeild;	
				
				
	 //for search button
	 @FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/div[1]/div[2]/form/button")
	 @CacheLookup
	 WebElement prodSearchButton;		

	//Action Methods of those Elements
		public void loginLink()
		{
			clickLoginlink.click();
		}
		
		public void registerButton()
		{
			clickRegisterButton.click();
		}
		
		public void custgender(String cgender) {
			rdGender.click();
		}
		
		public void setFirstname(String fname)
		{
			txtfirstname.sendKeys(fname);
		}
		
		public void setLastname(String lname)
		{
			txtlastname.sendKeys(lname);
		}
		
		public void custemailid(String email)
		{
			txtemail.sendKeys(email);
		}
		
		public void setUsernameR(String regiUser)
		{
			txtusernameReg.sendKeys(regiUser);
		}
		
		public void setPassward(String regpassward)
		{
			txtpassward.sendKeys(regpassward);
		}
		
		public void setConPassward(String regconpassward)
		{
			txtconfirmpasswd.sendKeys(regconpassward);
		}
		
		public void regiButton()
		{
			registerButton.click();
		}
		
		
		public void clickLoggedUser()
		{
			UserNameOpt.click();
		}
		
		public void clickLogout()
		{
			logoutOpt.click();
		}
		
		public void clickContinue()
		{
			continueButton.click();
		}
		
		public void enterProduct(String productText)
		{
			searchTextFeild.sendKeys(productText);
		}
		
		public void clickSearchButton()
		{
			prodSearchButton.click();
		}
		
		

}
