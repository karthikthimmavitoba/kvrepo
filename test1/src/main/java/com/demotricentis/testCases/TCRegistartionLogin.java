package com.demotricentis.testCases;

import org.testng.annotations.Test;

import com.demotricentis.pageObject.RegistrationPage;

public class TCRegistartionLogin extends Baseclass

{
@Test
public void loginRegistartion() throws InterruptedException
{
	driver.get("http://demowebshop.tricentis.com");
	//log.info("Entered Demowebshop");
	RegistrationPage r1=new RegistrationPage(driver);
	r1.fn_clickRegisterlink();
	//log.info("Registartion Link Clicked");
	r1.fn_setUsername();
	r1.fn_setPassword("Test@1234");
	r1.fn_registrationsuccess();
	
	
}
}
