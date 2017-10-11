package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import config.Constants;

public class ChromeTest 
{
	protected  WebDriver driver;
	

//@AfterClass
	public static void execute_Logout(WebDriver driver)throws Exception
	{
		WebElement LogoutIcon=HomePage.Icon_Logout(driver);
		LogoutIcon.click();
		Thread.sleep(3000);
		HomePage.Link_Logout(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);

	}
//@BeforeClass
@Parameters({"username","password"})
	 public void OpenBrowse(String username,String password) throws Exception
	 {
		System.setProperty(Constants.CHROME_DRIVER,Constants.CHROME_DRIVER_EXEPATH);
		System.out.println(Constants.CHROME_DRIVER_EXEPATH);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.baseUrl);
		LoginPage.TxtBox_username(driver).sendKeys(username);
		LoginPage.TxtBox_password(driver).sendKeys(password);
		LoginPage.Btn_Login(driver).click(); 
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	 }
	 
	 @AfterTest
	 public void afterClass() throws Exception
	 {
		 //driver.close();
	 }
}
