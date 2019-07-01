package org.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver; 
		
	}


	@FindBy(name = "identifier") WebElement uname;
	
	@FindBy(how = How.XPATH, using = "//span[@class='RveJvd snByac']") WebElement next; 
	
	@FindBy(how = How.NAME, using = "password") WebElement pass;
	
	@FindBy(xpath = "//div[@id='passwordNext']//span[@class='CwaK9']") WebElement nextPass;
	
	
	
	
	
	public void LoginApplication(String userName, String password) throws Exception {
		
		uname.sendKeys(userName);
		next.click();
		
		Thread.sleep(3000);
		
		pass.click();
		pass.sendKeys(password);
		nextPass.click();
		
		Thread.sleep(3000);
		
		
	}
	
	
	
}



