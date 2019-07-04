package org.learnautomation.testcases;

import org.testng.annotations.Test;
import org.learnautomation.factory.DataProviderFactory;
import org.learnautomation.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;

public class FirstLoginGmail extends BaseClass {

	
	LoginPage login;
	
	@Test
	public void logIn() {
		
		System.out.println("2");
		logger = report.createTest("Gmail Login test");
		
		login = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Application is ruuning");
		
		System.out.println("3");
		
		try {
			login.LoginApplication
			(DataProviderFactory.getExcel().getStringData(0, 0, 0), 
			 DataProviderFactory.getExcel().getStringData(0, 0, 1));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		
		
		
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
