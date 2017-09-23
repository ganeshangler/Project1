package executionEngine;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import config.Constants;

public class FirefoxTest 
{
	protected static WebDriver driver;
	
	 @BeforeClass
	 public void  OpenBrowse () {
			
			driver= new FirefoxDriver();
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    driver.get(Constants.baseUrl);

		}
	 
	 @AfterClass
	 public void afterClass() throws Exception
	 {
		 driver.close();
	 }
}
