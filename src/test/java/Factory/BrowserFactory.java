package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver openBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", DataProviderFactory.getConfig().firefoxPath());
			driver = new FirefoxDriver();
		}
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.driver.chrome", DataProviderFactory.getConfig().chromePath());
			driver = new ChromeDriver();
		}
		
		return driver;
	}
	
	public static void closeBrowser(){
		
		driver.quit();
	}
}
