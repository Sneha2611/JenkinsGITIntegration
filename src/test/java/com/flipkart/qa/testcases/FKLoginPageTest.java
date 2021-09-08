package com.flipkart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.FKHomePage;
import com.flipkart.qa.pages.FKLandingPage;
import com.flipkart.qa.pages.FKLoginPage;

public class FKLoginPageTest extends TestBase
{

	FKLoginPage fkloginpage;
	FKHomePage fkhomepage;
	FKLandingPage fklandingpage;
	
	
	public FKLoginPageTest() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@BeforeMethod
	
	public void setUp()
	{
		initialization();
		fklandingpage = new FKLandingPage();
		fkloginpage = new FKLoginPage();
		fkloginpage = fklandingpage.validateLoginLinkClick();
		
	}
	
	
	@Test
	public void validateLoginTest()
	{
		fkhomepage = fkloginpage.validateLogin();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
