package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class FKHomePage extends TestBase{
	
	
	@FindBy(linkText  = "Fashion")
	WebElement fashionlink;
	
	@FindBy(linkText  = "Watches and Accessories")
	WebElement watchlink;
	
	public FKHomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	
	}
	
	public FKWatchPage validatefashionlink() throws InterruptedException
	{
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(fashionlink).build().perform();
		Thread.sleep(2000);
		
		watchlink.click();
		
		return new FKWatchPage();
		
	}
	
}
