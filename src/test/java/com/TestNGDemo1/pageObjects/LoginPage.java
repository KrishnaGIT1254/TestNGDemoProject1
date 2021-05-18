package com.TestNGDemo1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
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
	
	
	@FindBy(xpath="//*[@id=\"menubar-my-account\"]/div/a/span")
	@CacheLookup
	WebElement UserNameOpt;
	
	@FindBy(xpath="//*[@id=\"menubar-my-account\"]/div/a/span")
	@CacheLookup
	WebElement UserNameOpt1;
	
	@FindBy(xpath="//*[@id=\"menubar-my-account\"]/div/div/a[4]/span")
	@CacheLookup
	WebElement logoutOpt;
	
	
	//Action Methods of those Elements
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
	
	
	public void clickLoggedUser()
	{
		UserNameOpt.click();
	}
	
	public void clickLoggedUserText(String loggedUser)
	{
		UserNameOpt1.getText();
	}
	
	public void clickLogout()
	{
		logoutOpt.click();
	}
	
	
	
}