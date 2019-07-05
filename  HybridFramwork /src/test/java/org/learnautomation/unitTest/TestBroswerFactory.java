package org.learnautomation.unitTest;

import org.learnautomation.factory.BrowserFactory;
import org.learnautomation.factory.DataProviderFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBroswerFactory {

	
	//this unit test will check to see if our BroswerFactory class is working
	
	@Test
	public void testBrowsers() {
		
		
		WebDriver driver = BrowserFactory.startUpApplication(DataProviderFactory.getConfig().getValue("url"), DataProviderFactory.getConfig().getValue("browser"));
		
		
		System.out.println(driver);
		
		//set to true, if the driver is not null or other words it has a vaule
		Assert.assertTrue(!(driver==null));
		
	}
	
	
}
