package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class FKLandingPage extends TestBase
{

	@FindBy(xpath = "//a[text()='Login']")
	WebElement loginlink;
	
	@FindBy(linkText = "Mobiles")
	WebElement mobilelink;
	
	@FindBy(xpath = "//div[@class='_2WErco row']/child::div[1]//child::a[contains(text(),'Careers')]")
	WebElement careerslink;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	WebElement close;
	
	public FKLandingPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLandingPagetitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateLoginLinkPresent()
	{
		return loginlink.isDisplayed();
	}
	
	public boolean validateMobileLinkPresent()
	{
		return mobilelink.isDisplayed();
	}
	
	public boolean validateCareersLinkPresent()
	{
		close.click();
		return careerslink.isDisplayed();
	}
	
	public FKLoginPage validateLoginLinkClick()
	{
		close.click();
		loginlink.click();
		return new FKLoginPage();
		
	}
}
