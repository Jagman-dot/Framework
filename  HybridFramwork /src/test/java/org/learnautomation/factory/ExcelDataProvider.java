package org.learnautomation.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	
	XSSFWorkbook wb;
	
	
	// Default constructor with fixed path for excel sheet 
	public ExcelDataProvider() {
		
		try {
			wb = new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/ProjectData.xlsx")));
		} catch (FileNotFoundException e) {
			
			e.getMessage();
			
		} catch (IOException e) {
	
			e.getMessage();
		}
		
	}
	
	
	// constructor overloaded to pass path of excel during runtime
	public ExcelDataProvider(String pathOfExcel) {
			
		try {
			wb = new XSSFWorkbook(new FileInputStream(new File(pathOfExcel)));
		} catch (FileNotFoundException e) {
			
			e.getMessage();
			
		} catch (IOException e) {
	
			e.getMessage();
		}
		
	}
	
	
	//returns the cell value of type string
	public String getStringData(String sheetName, int row, int column)
	{
		System.out.println("inside getStringData method");
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();	
	}
	
	//returns the cell value of type string
	public String getStringData(int sheetIndex, int row, int column)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	//returns the cell value of type int
	public int getIntData(String sheetName, int row, int column)
	{
		return (int) wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
 
	}
	
	
	
	
	
	
}

