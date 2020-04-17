package com.crm.testcases;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;


import com.crm.pages.ContactsPage;

public class ContactsTest extends LoginTest {

	@Test(priority=3)
	public void createcontact() throws InterruptedException, AWTException, FindFailed {
		ContactsPage contacts = new ContactsPage(driver);
		contacts.contactsLink().click();
		Thread.sleep(5000);
		contacts.NewContacts().click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		contacts.FirstName().sendKeys("sehkar");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		contacts.LastName().sendKeys("selvam");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		contacts.CompanyName().sendKeys("amazon");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		String email = randomstring()+"@gmail.com";
		contacts.ContactEmail().sendKeys(email);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		contacts.ContactCategory().click();
		contacts.ContactCategoryoption().click();
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		contacts.ContactStatus().click();
		contacts.ContactStatusoption().click();
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		contacts.ContactDescription().sendKeys("creating New Contacts");
		contacts.TimeZone().click();
		contacts.TimeZoneoption().click();
		contacts.ContactAddress().sendKeys("no.18 dubai main road ");
		contacts.ContactCity().sendKeys("delhi");
		contacts.ContactCountry().click();
		Thread.sleep(3000);
		contacts.ContactCountryoption().click();
		Robot r3 = new Robot();
		r3.keyPress(KeyEvent.VK_ENTER);
		r3.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		contacts.ContactPhone().click();
		contacts.ContactPhoneoption().click();
		String number  =  randomnumber();
		contacts.Contactnumber().sendKeys(number);
		contacts.ContactDoNotCall().click();
		contacts.ContactBirthDay().sendKeys("17");
		contacts.ContactBirthMonth().click();
		contacts.ContactBirthMonthoption().click();
		contacts.ContactBirthYear().sendKeys("1993");
		
		contacts.ContactImage().click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Screen s = new Screen();
		Pattern fileinputtext = new Pattern("S:\\sikuli\\pictures\\fileinputtext.PNG");
		Pattern openbutton = new Pattern("S:\\sikuli\\pictures\\openbutton.PNG");
		s.wait(fileinputtext,20);
		s.type(fileinputtext, "S:\\sikuli\\fresh-apple-500x500.jpg");
		s.click(openbutton);
		Thread.sleep(5000);
		contacts.SaveContact().click();
	}

}
