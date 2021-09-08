package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class FKLoginPage extends TestBase {
	
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	WebElement email;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement loginbtn;
	
	public FKLoginPage() {
		// TODO Auto-generated constructor stub
	 PageFactory.initElements(driver, this);
	}
	
	public FKHomePage validateLogin()
	{
		email.sendKeys("9967076903");
		password.sendKeys("Sneha1234");
		loginbtn.click();
		return new FKHomePage();
	}
	
	

}
