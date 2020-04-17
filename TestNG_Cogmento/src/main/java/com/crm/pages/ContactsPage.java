package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	WebDriver ldriver;
	
	public ContactsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="//div[@id='main-nav']//a[3]")
	@CacheLookup
	WebElement contactsLink;
	
	@FindBy(xpath ="//button[contains(text(),'New')]")
	@CacheLookup
	WebElement NewContacts;
	
	@FindBy(xpath ="//input[@name='first_name']")
	@CacheLookup
	WebElement FirstName;
	
	@FindBy(xpath ="//input[@name='last_name']")
	@CacheLookup
	WebElement LastName;
	
	@FindBy(xpath ="//div[@name='company']//input[@class='search']")
	@CacheLookup
	WebElement CompanyName;
	
	@FindBy(xpath ="//input[@placeholder='Email address']")
	@CacheLookup
	WebElement ContactEmail;
	
	@FindBy(xpath ="//div[@name='category']")
	@CacheLookup
	WebElement ContactCategory;
	
	@FindBy(xpath ="//div[@class='visible menu transition']//div[2]")
	@CacheLookup
	WebElement ContactCategoryoption;
	
	
	@FindBy(xpath ="//div[@name='status']")
	@CacheLookup
	WebElement ContactStatus;
	
	@FindBy(xpath ="//div[@name='status']//div[3]")
	@CacheLookup
	WebElement ContactStatusoption;
	
	@FindBy(xpath ="//textarea[@name='description']")
	@CacheLookup
	WebElement ContactDescription;
	
	@FindBy(xpath ="//div[@name='timezone']//input[@class='search']")
	@CacheLookup
	WebElement TimeZone;
	
	@FindBy(xpath ="//div[@name='timezone']//div[234]")
	@CacheLookup
	WebElement TimeZoneoption;
	
	@FindBy(xpath ="//input[@placeholder='Street Address']")
	@CacheLookup
	WebElement ContactAddress;
	
	@FindBy(xpath ="//input[@placeholder='City']")
	@CacheLookup
	WebElement ContactCity;
	
	@FindBy(xpath ="//div[@name='country']//i[@class='dropdown icon']")
	@CacheLookup
	WebElement ContactCountry;
	
	@FindBy(xpath ="//body//div[@class='field']//div[@class='field']//div[100]")
	@CacheLookup
	WebElement ContactCountryoption;
	
	@FindBy(xpath ="//div[@name='hint']//i[@class='dropdown icon']")
	@CacheLookup
	WebElement ContactPhone;
	
	@FindBy(xpath ="//div[@class='four fields']//div[100]")
	@CacheLookup
	WebElement ContactPhoneoption;
	
	@FindBy(xpath ="//input[@placeholder='Number']")
	@CacheLookup
	WebElement Contactnumber;
	
	@FindBy(xpath ="//div[13]//div[2]//div[1]//div[1]")
	@CacheLookup
	WebElement ContactDoNotCall;
	
	@FindBy(xpath ="//input[@placeholder='Day']")
	@CacheLookup
	WebElement ContactBirthDay;
	
	@FindBy(xpath ="//div[@name='month']//i[@class='dropdown icon']")
	@CacheLookup
	WebElement ContactBirthMonth;
	
	@FindBy(xpath ="//div[@class='three fields custom-address-container']//div[8]")
	@CacheLookup
	WebElement ContactBirthMonthoption;
	
	@FindBy(xpath ="//input[@placeholder='Year']")
	@CacheLookup
	WebElement ContactBirthYear;
	
	@FindBy(xpath ="//input[@name='image']")
	@CacheLookup
	WebElement ContactImage;
	
	@FindBy(xpath ="//button[@class='ui linkedin button']")
	@CacheLookup
	WebElement SaveContact;
	
	public WebElement contactsLink() {
		return contactsLink;
	}
	
	public WebElement NewContacts() {
		return NewContacts;
	}
	
	public WebElement FirstName() {
		return FirstName;
	}
	
	public WebElement LastName() {
		return LastName;
	}
	
	public WebElement CompanyName() {
		return CompanyName;
	}
	
	public WebElement ContactEmail() {
		return ContactEmail;
	}
	
	public WebElement ContactCategory() {
		return ContactCategory;
	}
	
	public WebElement ContactCategoryoption() {
		return ContactCategoryoption;
	}
	
	public WebElement ContactStatus() {
		return ContactStatus;
	}
	
	public WebElement ContactStatusoption() {
		return ContactStatusoption;
	}
	
	public WebElement ContactDescription() {
		return ContactDescription;
	}
	
	public WebElement TimeZone() {
		return TimeZone;
	}
	
	public WebElement TimeZoneoption() {
		return TimeZoneoption;
	}
	
	public WebElement ContactAddress() {
		return ContactAddress;
	}
	
	public WebElement ContactCity() {
		return ContactCity;
	}
	
	public WebElement ContactCountry() {
		return ContactCountry;
	}
	
	public WebElement ContactCountryoption() {
		return ContactCountryoption;
	}
	
	public WebElement ContactPhone() {
		return ContactPhone;
	}
	
	public WebElement ContactPhoneoption() {
		return ContactPhoneoption;
	}
	
	public WebElement Contactnumber() {
		return Contactnumber;
	}
	
	public WebElement ContactDoNotCall() {
		return ContactDoNotCall;
	}
	
	public WebElement ContactBirthDay() {
		return ContactBirthDay;
	}
	
	public WebElement ContactBirthMonth() {
		return ContactBirthMonth;
	}
	public WebElement ContactBirthMonthoption() {
		return ContactBirthMonthoption;
	}
	
	public WebElement ContactBirthYear() {
		return ContactBirthYear;
	}
	
	public WebElement ContactImage() {
		return ContactImage;
	}
	
	public WebElement SaveContact() {
		return SaveContact;
	}
	
}
