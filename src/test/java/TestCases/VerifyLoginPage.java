package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplicationPages.HomePage;
import ApplicationPages.LoginPage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class VerifyLoginPage {

	WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		driver = BrowserFactory.openBrowser("chrome");
		driver.manage().window().maximize();
		driver.get(DataProviderFactory.getConfig().URLpath());
	}
	
	@Test
	public void loginPage(String usrName,String pwd)
	{
		HomePage homePage = new HomePage(driver);
		homePage.clickLogin();
		
		LoginPage login = new LoginPage(driver);
		login.loginApp(DataProviderFactory.getExcel().getData(0, 1, 0), DataProviderFactory.getExcel().getData(0, 1, 1));
		
		String dashTitle = login.getDashboardTitle();
		
		Assert.assertTrue(dashTitle.contains("Account Dashboard View"));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
