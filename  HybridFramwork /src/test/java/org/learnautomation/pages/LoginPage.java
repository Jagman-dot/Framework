package org.learnautomation.pages;

import org.learnautomation.testcases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BaseClass {
	
WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver; 
		
	}


	@FindBy(name = "identifier") WebElement uname;
	
	@FindBy(how = How.XPATH, using = "//span[@class='RveJvd snByac']") WebElement next; 
	
	@FindBy(how = How.NAME, using = "password") WebElement pass;
	
	@FindBy(xpath = "//div[@id='passwordNext']//span[@class='CwaK9']") WebElement nextPass;
	
	
	

	public void LoginApplication(String userName, String password) {
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		uname.sendKeys(userName);
		next.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		pass.click();
		pass.sendKeys(password);
		nextPass.click();
		
		
	}
	
	
	
}



