package com.demotricentis.testCases;
import com.demotricentis.Utilities.*;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.demotricentis.Utilities.ReadConfig;


public class Baseclass 
{
public WebDriver driver;
public Logger log;

ReadConfig config= new ReadConfig();

	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikvitoba\\eclipse-workspace\\chromedriver.exe");
        driver=new ChromeDriver();
        
        //driver.get(config.getUrl());
        
      //  log = Logger.getLogger("Baseclass");
      //  PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void tear()
	{
		driver.quit();
	}
}
