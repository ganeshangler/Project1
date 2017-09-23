package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import config.Constants;

public class ChromeTest 
{
	protected  WebDriver driver;
	
	 @BeforeClass
	 public void beforeClass() throws Exception
	 {
		System.setProperty(Constants.CHROME_DRIVER,Constants.CHROME_DRIVER_EXEPATH);
		System.out.println(Constants.CHROME_DRIVER_EXEPATH);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.baseUrl);
	 }
	 
	 @AfterClass
	 public void afterClass() throws Exception
	 {
		 //driver.close();
	 }
}
