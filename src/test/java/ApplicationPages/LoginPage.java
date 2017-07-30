package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver dri)
	{
		this.driver = dri;
	}
	
	@FindBy(how=How.NAME,using="email")
	@CacheLookup
	WebElement userName;
	
	@FindBy(how=How.NAME,using="passwd")
	@CacheLookup
	WebElement passwd;
	
	@FindBy(how=How.XPATH,using="//h2[text()='Account Dashboard View']")
	@CacheLookup
	WebElement dashboard;
	
	public void loginApp(String usrName, String pwd)
	{
		userName.sendKeys(usrName);
		passwd.sendKeys(pwd);
	}
	
	public String getDashboardTitle()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(dashboard));
		String dashboardTitle = ele.getText();
		return dashboardTitle;
	}
	
}
