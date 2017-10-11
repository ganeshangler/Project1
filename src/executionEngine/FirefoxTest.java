package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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
	public static void execute_Logout()throws Exception
	{
		WebElement LogoutIcon=HomePage.Icon_Logout(driver);
		LogoutIcon.click();
		Thread.sleep(3000);
		HomePage.Link_Logout(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);


	}

	@BeforeClass
	@Parameters({"username","password"})
	public void  OpenBrowse (String username,String password) throws Exception {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("dom.max_chrome_script_run_time", 0);
		profile.setPreference("dom.max_script_run_time",  0); 
		driver= new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Constants.baseUrl);
		LoginPage.TxtBox_username(driver).sendKeys(username);
		LoginPage.TxtBox_password(driver).sendKeys(password);
		LoginPage.Btn_Login(driver).click(); 
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	
}
