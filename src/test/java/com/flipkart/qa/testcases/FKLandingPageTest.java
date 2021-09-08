package com.flipkart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.FKLandingPage;
import com.flipkart.qa.pages.FKLoginPage;

public class FKLandingPageTest extends TestBase {

	FKLandingPage fklandingpage;
	FKLoginPage fkloginpage;
	
	public FKLandingPageTest() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	@BeforeMethod
	
	public void setUp()
	{
		initialization();
		fklandingpage = new FKLandingPage();
	}
	
	@Test(priority=1)
	
	public void validateLandingPagetitleTest()
	{
		String title = fklandingpage.validateLandingPagetitle();
		
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	
	@Test(priority=2)
	
	public void validateLoginLinkPresentTest()
	{
		boolean b = fklandingpage.validateLoginLinkPresent();
		
		Assert.assertEquals(b, true);
	}
	
	
	@Test(priority=3)
	public void validateMobileLinkPresentTest()
	{
		boolean b1 = fklandingpage.validateMobileLinkPresent();
		Assert.assertEquals(b1, true);
	}
	
	@Test(priority=4)
	public void validateCareersLinkPresentTest()
	{
		boolean b2 = fklandingpage.validateCareersLinkPresent();
		Assert.assertEquals(b2, true);
	}
	
	@Test
	public void validateLoginLinkClickTest()
	{
		fkloginpage = fklandingpage.validateLoginLinkClick();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
}
