package org.learnautomation.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {

	
	
	public static WebDriver startUpApplication(String appUrl, String driverName) {
	
		WebDriver driver = null;

		if(driverName.equalsIgnoreCase("chrome"))
		{
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(options);
			
		}
		
		
		
		
		return driver;
	}
	
	
}
