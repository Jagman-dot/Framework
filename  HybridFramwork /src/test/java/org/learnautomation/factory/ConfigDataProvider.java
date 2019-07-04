package org.learnautomation.factory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ConfigDataProvider {


	Properties pro;
	
	public ConfigDataProvider() {
		
		
		try {
			FileInputStream input = new FileInputStream(new File(System.getProperty("user.dir")+"/Config/ProjectConfig.properties"));
			
			pro = new Properties();
			
			pro.load(input);
			
		} catch (Exception e) {
			
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public String getValue(String key) {
		
		
		return pro.getProperty(key);
				
	}
	
	
	
	
	
}
