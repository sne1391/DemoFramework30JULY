package TestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.gargoylesoftware.htmlunit.Page;

import ApplicationPages.HomePage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class VerifyHomePage {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = BrowserFactory.openBrowser("chrome");
		driver.manage().window().maximize();
		driver.get(DataProviderFactory.getConfig().URLpath());
	}
	
	@Test
	public void verifyTitle()
	{
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		String titleHome = home.getTitle();
		
		Assert.assertTrue(titleHome.contains("Avactis Demo Store"));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		BrowserFactory.closeBrowser();
	}
}
