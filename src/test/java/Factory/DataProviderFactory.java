package Factory;

import org.openqa.selenium.WebDriver;

import DataProvider.ConfigDataProvider;
import DataProvider.ExcelDataProvider;

//this file is used to get objects of configDataprovider and exceldataprovider only.
public class DataProviderFactory {

	
	public static ConfigDataProvider getConfig()
	{
		ConfigDataProvider config = new ConfigDataProvider();
		return config;
	}
	
	public static ExcelDataProvider getExcel()
	{
		ExcelDataProvider ex = new ExcelDataProvider();
		return ex;
	}
}
