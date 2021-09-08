package com.flipkart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.FKHomePage;
import com.flipkart.qa.pages.FKLoginPage;
import com.flipkart.qa.pages.FKWatchPage;

public class FKHomePageTest extends TestBase {
	
	FKLoginPage fkloginpage;
	FKHomePage fkhomepage;
	FKWatchPage fkwatchpage;
	
	
	public FKHomePageTest() {
		// TODO Auto-generated constructor stub
		super();
	}

	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		fkloginpage = new FKLoginPage();
		fkhomepage = new FKHomePage();
		fkhomepage = fkloginpage.validateLogin();
	}
	
	@Test
	
	
	public void validatefashionlinkTest() throws InterruptedException
	{
		fkwatchpage = fkhomepage.validatefashionlink();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
