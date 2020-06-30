package com.demotricentis.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.demotricentis.Utilities.*;


public class RegistrationPage

{

	WebDriver driver;
	By lnkregister = By.xpath(".//a[text()='Register']");
	By radmale = By.id("gender-male");
	By radfemale = By.id("gender-female");
	By txtfirstname = By.name("FirstName");
	By txtlastname = By.name("LastName");
	By txtemail = By.id("Email");
	By txtpassword = By.name("Password");
	By cnfpassword = By.name("ConfirmPassword");
	By btnRegister = By.xpath(".//input[@id='register-button']");
	By valmessage= By.xpath(".//*[contains(text(),'Your registration completed')]");
    
	
	logUtility log= new logUtility();
	
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		
		
	}
	
	public void fn_clickRegisterlink() 
	{
	 driver.findElement(lnkregister).click();
	 log.loginfo("The Registration link is clicked Successfully");
	 
	}
	
	public void fn_setUsername() throws InterruptedException
	{
	 driver.findElement(radmale).click();
	 Thread.sleep(2);
	 log.loginfo("The radio option male is clicked");
	 driver.findElement(txtfirstname).sendKeys("Karthik");
	 Thread.sleep(2);
	 log.loginfo("Firstname is entered");
	 driver.findElement(txtlastname).sendKeys("Vitoba");
	 Thread.sleep(2);
	 log.loginfo("Lastname is entered");
	 driver.findElement(txtemail).sendKeys("karthikthimmavitoba@gmail.com");
	 log.loginfo("Email is Entered");
	 
	}
	
	public void fn_setPassword(String psw) throws InterruptedException
	{
		driver.findElement(txtpassword).sendKeys(psw);
		Thread.sleep(2);
		driver.findElement(cnfpassword).sendKeys(psw);
		log.loginfo("Password is entered");
	}
	
	public void fn_registrationsuccess()
	{
		driver.findElement(btnRegister).click();
		log.loginfo("Register button clicked");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MILLISECONDS);
		try 
		{
		 WebElement e1= driver.findElement(valmessage);
		 if(e1.isDisplayed())
		 {
			System.out.println("Registration successfull");
			log.loginfo("Registration success");
		 }
		}
		
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	}
}
