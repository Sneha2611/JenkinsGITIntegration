package com.flipkart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.FKCartPage;
import com.flipkart.qa.pages.FKHomePage;
import com.flipkart.qa.pages.FKWatchPage;

public class FKWatchPageTest extends TestBase{
	
	FKWatchPage fkwatchpage;
	FKHomePage fkhomepage;
	FKCartPage fkcartpage;
	
	public FKWatchPageTest() {
		// TODO Auto-generated constructor stub add to git repo
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
		
		fkhomepage =new FKHomePage();
		fkwatchpage = new FKWatchPage();
		fkwatchpage=  fkhomepage.validatefashionlink();
	}
	
	
	@Test(priority = 1)
	
	public void validateWatchPageTitleTest()
	{
		String title= fkwatchpage.validateWatchPageTitle();
		Assert.assertEquals(title, "dhgdhgdgh hjhjhv");
	}
	
	
	@Test(priority=2)
	
	public void validateaddtocartLinkTest() throws InterruptedException
	{
		fkcartpage = fkwatchpage.validateaddtocartLink();
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
}
