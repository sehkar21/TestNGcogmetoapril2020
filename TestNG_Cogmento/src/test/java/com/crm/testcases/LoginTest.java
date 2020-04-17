package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.base.BaseClass;
import com.crm.config.ReadConfig;
import com.crm.pages.LoginPage;

public class LoginTest extends BaseClass {


	
	@Test(priority=1)
	public void login() throws InterruptedException {
		LoginPage login =  new LoginPage(driver);
		ReadConfig config = new ReadConfig();
		login.username().sendKeys(config.username());
		login.password().sendKeys(config.password());
		login.Loginbtn().click();
		Thread.sleep(5000);
		
	}
	
	@Test(priority=2)
	public void verifyusername() {
		LoginPage login = new LoginPage(driver);
		String username = login.Displayusername().getText();
		System.out.println(username);
		Assert.assertEquals(username, "Sehkar Selvam");
	}
	
}
