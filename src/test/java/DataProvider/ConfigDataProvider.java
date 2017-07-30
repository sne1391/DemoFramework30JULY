package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider()
	{
		try{
			
			File f = new File("./Configuration/Config.properties");
			FileInputStream fis = new FileInputStream(f);
			
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Cannot load properties file!!");
			System.out.println(e.getMessage());
		}
	}
	
	public String chromePath()
	{
		String path = pro.getProperty("Chrome");
		
		return path;
	}
	
	public String firefoxPath()
	{
		String path = pro.getProperty("Firefox");
		
		return path;
	}
	
	public String URLpath()
	{
		String url = pro.getProperty("URL");
		
		return url;
	}
}
