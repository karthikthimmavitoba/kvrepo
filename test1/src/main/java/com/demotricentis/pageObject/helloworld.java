package com.demotricentis.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class helloworld {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthikvitoba\\eclipse-workspace\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       
		String url = "http://demowebshop.tricentis.com/"; 
        driver.get(url);
        String pagetitle=driver.getTitle();
        Thread.sleep(3);
        System.out.println("The page title name:"+pagetitle+" and pagelength:"+pagetitle.length());
        String url1=driver.getCurrentUrl();
        Thread.sleep(3);
        if(url1.equalsIgnoreCase(url))
        {
        	System.out.println("The url is matched properly");
        }
        else 
        {
        	System.out.println("The url is not matching");
        }
        String pagesource=driver.getPageSource();
        System.out.println(pagesource);
        
        driver.quit();
        driver.close();
	}

}
