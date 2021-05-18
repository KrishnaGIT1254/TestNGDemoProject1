package com.TestNGDemo1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
		
		WebDriver ldriver;
			
			public AddToCartPage(WebDriver rdriver)
			{
				ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
			}

}
