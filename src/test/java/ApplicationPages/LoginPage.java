package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver dri)
	{
		this.driver = dri;
	}
	
	@FindBy(how=How.ID,using=".//*[@id='account_sign_in_form_email_id']")
	@CacheLookup
	WebElement userName;
	
	@FindBy(how=How.NAME,using="passwd")
	@CacheLookup
	WebElement passwd;
	
	public void enterUsername(String usrName)
	{
		userName.sendKeys(usrName);
	}
	
	public void enterPasswd(String pwd){
		passwd.sendKeys(pwd);
	}
	
}
