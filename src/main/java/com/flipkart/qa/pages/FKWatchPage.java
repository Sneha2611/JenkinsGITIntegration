package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class FKWatchPage extends TestBase {
	
	@FindBy(xpath = "//div[@class='_13oc-S _1t9ceu']/child::div[2]")
	WebElement watch;
	
	@FindBy(xpath = "//div[@class='_1p3MFP']/child::ul/child::li/child::button")
	WebElement addtocart;
	
	public FKWatchPage() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	public String validateWatchPageTitle()
	{
		return driver.getTitle();
	}

	public FKCartPage validateaddtocartLink() throws InterruptedException
	{
		watch.click();
		Thread.sleep(1000);
		addtocart.click();
		return new FKCartPage();
		
	}
	
}
