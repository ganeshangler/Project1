


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import config.Constants;

public class FirefoxTest 
{
	protected static WebDriver driver;

	@AfterClass
	@BeforeClass	
	@Parameters({"username","password"})
	public static void execute_Logout(String username,String password)throws Exception
	{
		WebElement LogoutIcon=HomePage.Icon_Logout(driver);
		LogoutIcon.click();
		Thread.sleep(3000);
		HomePage.Link_Logout(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);


	}

	@BeforeClass
	@Parameters({"username","password"})
	public void  Login(String username,String password) throws Exception {
		
		LoginPage.TxtBox_username(driver).sendKeys(username);
		LoginPage.TxtBox_password(driver).sendKeys(password);
		LoginPage.Btn_Login(driver).click(); 
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}


	@BeforeSuite
	@Parameters({"username","password"})
	public void OpenBrowse(String username,String password) throws Exception
	{
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("dom.max_chrome_script_run_time", 0);
		profile.setPreference("dom.max_script_run_time",  0); 
		driver= new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Constants.baseUrl);
	}
	
}
*/


package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import config.Constants;

public class FirefoxTest 
{
      protected static  WebDriver driver;


      @AfterClass
      public static void execute_Logout()throws Exception
      {
            Thread.sleep(5000);
            WebElement LogoutIcon=HomePage.Icon_Logout(driver);
            LogoutIcon.click();
            Thread.sleep(3000);
            HomePage.Link_Logout(driver).click();
            driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);

      }
      @BeforeClass      
      @Parameters({"username","password"})
      public void ExecuteLogin(String username,String password) throws Exception
      {
      
            LoginPage.TxtBox_username(driver).sendKeys(username);
            LoginPage.TxtBox_password(driver).sendKeys(password);
            LoginPage.Btn_Login(driver).click(); 
            driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
            driver.manage().window().maximize();
      }
      @BeforeSuite
      @Parameters({"username","password"})
      public void OpenBrowse(String username,String password) throws Exception
      {
            System.setProperty(Constants.GECKO_DRIVER,Constants.GECKO_DRIVER_EXEPATH);
//          System.out.println(Constants.CHROME_DRIVER_EXEPATH);
            driver= new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(Constants.baseUrl);
      }
}
=======
package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import config.Constants;

public class FirefoxTest 
{
	protected static  WebDriver driver;


	@AfterClass
	public static void execute_Logout()throws Exception
	{
		Thread.sleep(5000);
		WebElement LogoutIcon=HomePage.Icon_Logout(driver);
		LogoutIcon.click();
		Thread.sleep(3000);
		HomePage.Link_Logout(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);

	}
	@BeforeClass	
	@Parameters({"username","password"})
	public void ExecuteLogin(String username,String password) throws Exception
	{
	
		LoginPage.TxtBox_username(driver).sendKeys(username);
		LoginPage.TxtBox_password(driver).sendKeys(password);
		LoginPage.Btn_Login(driver).click(); 
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeSuite
	@Parameters({"username","password"})
	public void OpenBrowse(String username,String password) throws Exception
	{
		System.setProperty(Constants.GECKO_DRIVER,Constants.GECKO_DRIVER_EXEPATH);
//		System.out.println(Constants.CHROME_DRIVER_EXEPATH);
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.baseUrl);
	}
}
/*package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import config.Constants;

public class FirefoxTest 
{
	protected static WebDriver driver;
	
	 @BeforeClass
	 public void  OpenBrowse () {
//		 System.setProperty(Constants.GECKO_DRIVER,Constants.GECKO_DRIVER_EXEPATH);
		  driver = new FirefoxDriver();
//			driver= new FirefoxDriver();
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    driver.get(Constants.baseUrl);

		}
	 
//	 @AfterClass
//	 public void afterClass() throws Exception
//	 {
//		 driver.close();
//	 }
}
*/

