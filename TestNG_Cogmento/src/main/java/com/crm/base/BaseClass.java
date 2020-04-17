package com.crm.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.crm.config.ReadConfig;

public class BaseClass {

	ReadConfig config = new ReadConfig();
	String url = config.url();
	public static WebDriver driver;
	
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
	
	public static synchronized WebDriver getdriver()
	{
		return tldriver.get();
	}
	@Parameters("Browser")
	@BeforeClass
	public WebDriver openbrowser(String br) {
		if(br.equals("chrome")) 
		{
		System.setProperty("webdriver.chrome.driver", "S:\\miniproject\\inetbankingV1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		}
		if(br.equals("firefox")) 
		{
		System.setProperty("webdriver.gecko.driver", "S:\\miniproject\\inetbankingV1\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		}
		if(br.equals("ie")) 
		{
		System.setProperty("webdriver.ie.driver", "S:\\miniproject\\inetbankingV1\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		}
		return getdriver();
		
	}
	
	public String getscreenshot() throws IOException {
		TakesScreenshot tk =(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/screenshot/"+ System.currentTimeMillis()+".png";
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
		return path;
	}
	
	public String randomstring() {
		String randomstring = RandomStringUtils.randomAlphabetic(9);
		return(randomstring);
	}
	
	public String randomnumber() {
	String randomnumber = RandomStringUtils.randomNumeric(9);
	return(randomnumber);	
}
	
	 /** @AfterClass public void TearDown() 
	  {
		  driver.quit(); 
		  } **/
	 
	
}