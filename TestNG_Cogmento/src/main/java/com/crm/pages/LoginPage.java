package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath= "//input[@placeholder='E-mail address']")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath= "//input[@placeholder='Password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath= "//div[@class='ui fluid large blue submit button']")
	@CacheLookup
	WebElement Loginbtn;
	
	@FindBy(xpath= "//span[@class='user-display']")
	@CacheLookup
	WebElement Displayusername;
	
	
	public WebElement username() {
		return username;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement Loginbtn() {
		return Loginbtn;
	}
	
	public WebElement Displayusername() {
		return Displayusername;
	}
}
