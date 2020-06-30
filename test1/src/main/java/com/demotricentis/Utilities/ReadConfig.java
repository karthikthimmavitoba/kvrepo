package com.demotricentis.Utilities;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
 

public class ReadConfig 
{
	
		 
	 Properties properties;
	 String propertyFilePath= "C:\\Users\\karthikvitoba\\eclipse-workspace\\test1\\Readconfig.properties";
	 BufferedReader reader;
	 String url;
	 
	 public ReadConfig(){
	
	 try {
	 reader = new BufferedReader(new FileReader(propertyFilePath));
	 properties = new Properties();
	 try 
	 {
	 properties.load(reader);
	 reader.close();
	 } 
	 catch (IOException e) 
	 
	 {
	 e.printStackTrace();
	 }
	 } 
	
	 catch (FileNotFoundException e) 
	 {
	 e.printStackTrace();
	 
	 throw new RuntimeException("Readconfig properties not found at " + propertyFilePath);
	 } 
	 }
	 
	 public String getUrl()
	 {
		 
		 if(properties.getProperty("baseurl")!=null)
		 {
			 url=properties.getProperty("baseurl");
		 }
		 
		return url;
		 
	 }
}
