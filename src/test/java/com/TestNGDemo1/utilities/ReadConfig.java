package com.TestNGDemo1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}

	public String getUsername() {

		String username=pro.getProperty("username");
		return username;
	}

	public String getPassword() {
		String passward=pro.getProperty("password");
		return passward;
	}
	
	public String getfname() {
		String fname=pro.getProperty("fname");
		return fname;
	}
	
	public String getlname() {
		String lname=pro.getProperty("lname");
		return lname;
	}
	
	public String getEmail() {
		String email=pro.getProperty("email");
		return email;
	}
	
	public String getRegUser() {
		String reguser=pro.getProperty("reguser");
		return reguser;
	}
	
	public String getregpassward() {
		String regpassward=pro.getProperty("regpassward");
		return regpassward;
	}
	
	
	public String getregconpassward() {
		String regconpassward=pro.getProperty("regconpassward");
		return regconpassward;
	}
	
	public String getProduct() {
		String producttext=pro.getProperty("producttext");
		return producttext;
	}
	
	
	public String getLoggedUser() {
		String loggedUser=pro.getProperty("loggedUser");
		return loggedUser;
	}
	
	
	
	public String getFirstNameInBillingAddress() {
		String firstnameinbillingaddress = pro.getProperty("firstnameinbillingaddress");
		return firstnameinbillingaddress;
		}
		public String getLastNameInBillingAddress() {
		String lastnameinbillingaddress=pro.getProperty("lastnameinbillingaddress");
		return lastnameinbillingaddress;
		}
		public String getAddress1InBillingAddress1() {
		String address1inbillingaddress=pro.getProperty("address1inbillingaddress");
		return address1inbillingaddress;
		}
		public String getCityInBillingAddress() {
		String cityinbillingaddress=pro.getProperty("cityinbillingaddress");
		return cityinbillingaddress;
		}
		public String getZipCodeInBillingAddress() {
		String zipcode=pro.getProperty("zipcode");
		return zipcode;
		}
		public String getEmailInBillingAddress() {
		String email=pro.getProperty("email");
		return email;
		}
		public String getphoneno() {
		String phoneno=pro.getProperty("phoneno");
		return phoneno;
		}
		public String getAddress1InBillingAddress() {
		String adress1InBillingAddress=pro.getProperty("adress1InBillingAddress");
		return adress1InBillingAddress;
		}
		
		public String getcountryname() {
			String countryname=pro.getProperty("countryname");
			return countryname;
			}

	
	
	
	


}
