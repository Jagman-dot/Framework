package org.learnautomation.unitTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.learnautomation.factory.ConfigDataProvider;
import org.learnautomation.factory.ExcelDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDataProviderFactory {
	
	// the purpose of this class is to create unit test for our excel data provider class
	// to ensure that its working
	
	// this method will test to excel sheet is readable
	
	
	@Test
	public void testExcelLib() {
		
		// since its another class, we can create an object of that class
		
		ExcelDataProvider excel = new ExcelDataProvider();
		
		String data = excel.getStringData("TestSheet", 0, 0);
		
		AssertJUnit.assertEquals(data, "TestingExcel");
		
		System.out.println(data);
		
	}
	
//	@Test
//	public void testConfig() {
//		
//		
//		ConfigDataProvider con = new ConfigDataProvider();
//		
//		String data = con.getValue("test"); 
//		
//		AssertJUnit.assertEquals(data, "testingConfig");
//		
//		
//		
//		
//	}
	
	
	
	
	
	

}
