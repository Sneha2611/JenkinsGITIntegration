package com.flipkart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//iiiiiiiiiiiiiii

public class TestBase {

	public static WebDriver driver;
	Properties prop;
	
	public TestBase() {
		// TODO Auto-generated constructor stub
		
		
		
		try 
		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\sneha\\eclipse-workspace1\\flipkart_artifact\\src\\main\\java\\com\\flipkart\\qa\\config\\config.properties");
			prop.load(fis);
		} 
		catch (IOException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	
	
	}
	
	
	public void initialization()
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
}



