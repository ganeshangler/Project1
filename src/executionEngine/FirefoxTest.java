package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import config.Constants;

public class FirefoxTest 
{
	protected static WebDriver driver;
	
	 @BeforeTest
	 public void  OpenBrowse () {
			
		 FirefoxProfile profile = new FirefoxProfile();
		 profile.setPreference("dom.max_chrome_script_run_time", 0);
		 profile.setPreference("dom.max_script_run_time",  0); 
			driver= new FirefoxDriver(profile);
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    driver.get(Constants.baseUrl);

		}
	 
	 @AfterClass
	 public void afterClass() throws Exception
	 {
		// driver.close();
	 }
}
