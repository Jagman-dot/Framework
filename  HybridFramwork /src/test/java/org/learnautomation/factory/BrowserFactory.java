package org.learnautomation.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	
	
	public static WebDriver startUpApplication(String appUrl, String driverName) {
	
		WebDriver driver = null;
 
		if(driverName.equalsIgnoreCase("chrome"))
		{
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(options);
			
		} else if (driverName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
	
		} else {
			
			System.out.println("Sorry only chrome and firefox is supported");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(appUrl);
		
		return driver;
	}
	
	
}
