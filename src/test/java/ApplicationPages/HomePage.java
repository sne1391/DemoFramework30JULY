package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver dri)
	{
		this.driver = dri;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()=' Log In']")
	@CacheLookup
	WebElement login;
	
	@FindBy(how=How.XPATH,using="//span[@class='hidden-xs'][text()='Home']")
	@CacheLookup
	WebElement home;
	
	@FindBy(how=How.XPATH,using="//span[text()='My Account']")
	@CacheLookup
	WebElement myAcc;
	
	@FindBy(how=How.XPATH,using="//span[text()='My Cart']")
	@CacheLookup
	WebElement myCart;
	
	@FindBy(how=How.XPATH,using="//span[text()='Wishlist']")
	@CacheLookup
	WebElement wishList;
	
	public void clickHome()
	{
		login.click();
	}
	
	public void clickMyAccount()
	{
		myAcc.click();
	}
	
	public void clickMyCart()
	{
		myCart.click();
	}
	
	public void clickWishList()
	{
		wishList.click();
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public String getTitle()
	{
		String title = driver.getTitle();
		return title;
	}
}
