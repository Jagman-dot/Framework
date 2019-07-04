 package org.learnautomation.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

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
