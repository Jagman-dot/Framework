 package org.learnautomation.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {

	
	// fucntion to capture the screenshot and return the path as well 
	public static String CaptureScreenshot(WebDriver driver) {
		
		String path = System.getProperty("user.dir")+"/Screenshots/Gmail"+System.currentTimeMillis()+".png";
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File(path));
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		
		return path;	
	}

	
	
	@Test //validate title, with expected passing as a parameeter
	public static void verifyTitleContains(WebDriver driver, String expectedTitle) {
		
		boolean status = new WebDriverWait(driver, 30).until(ExpectedConditions.titleContains(expectedTitle));
		
		Assert.assertTrue(status);
	}
	
	@Test //validate Url, with expected passing as 
	public static void verifyUrlContains(WebDriver driver, String expectedUrl) {
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertTrue(new WebDriverWait(driver, 30).until(ExpectedConditions.urlContains(expectedUrl)));
		
		softAssert.assertAll();
	}
	
	
	
	public static WebElement waitForWebElement(WebDriver driver, String xPath, int time) {
		
		WebDriverWait wait = new WebDriverWait(driver, time);
		
		
		//checks to see if the passed xPath is visiable, enabled and clickable
	return	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
		
		

	}
	
	
	
	
	public void GetCurrentDateaAndTime() 
	{
		
		
	}
	
	
	public void HandleFrameUsingID() 
	{
		
		
		
	}
	
	  
	public void HandleFrameUsingName() 
	{
		
		
		
	}
	
	public void HandleFrameUsingElement() 
	{
		
		
		
	}
	
	public void AcceptAlert() 
	{
		
		
		
	}
	
	public void GetTextFromAlert() 
	{
		
		
		
	}
	
	public void DismissAlert() 
	{
		
		
		
	}
	
	public void SwtichWindows() 
	{
		
		
		
	}
	
	
	
}
