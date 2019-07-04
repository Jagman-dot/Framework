package org.learnautomation.testcases;

import java.io.IOException;

import org.learnautomation.factory.BrowserFactory;
import org.learnautomation.factory.DataProviderFactory;
import org.learnautomation.utility.Helper;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

	
	
	
	
	
	public WebDriver driver;
	public ExtentReports report; // complete report
	public ExtentTest logger; // Individual test
	String path;

	@BeforeSuite
	public void SetupTestSuite() {

		System.out.println("1");
		path = System.getProperty("user.dir") + "/Reports/Gmail.html";
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(path);
		
		report = new ExtentReports();

		report.attachReporter(htmlReporter);
	}

	@BeforeClass
	public void startUp() {

		driver = BrowserFactory.startUpApplication(DataProviderFactory.getConfig().getValue("url"),
				DataProviderFactory.getConfig().getValue("browser"));

	}

	@AfterClass
	public void tearDown() {

		//BrowserFactory.closeApplication(driver);
		driver.get(path);

	}

	@AfterMethod // this will run after everytest or method
	public void tearDownTest(ITestResult reslut) {
		
		if(reslut.getStatus() == ITestResult.SUCCESS)
		{
			logger.pass("Test Passed");
		} else if (reslut.getStatus() == ITestResult.FAILURE){
			
			try {
				logger.fail("Test Failed" + reslut.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(Helper.CaptureScreenshot(driver)).build());
			} catch (IOException e) {
				
				System.out.println(e.getMessage());
			}
			
		}
		
		report.flush();

	}

}
