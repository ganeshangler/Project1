package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.*;
import pageObjects.*;
import config.Constants;


public class LoginAction   {

	public static void execute_Login(WebDriver driver, String username,String password)throws Exception
	{
		Utilis.capture(driver,"Login");
		LoginPage.TxtBox_username(driver).sendKeys(username);
		LoginPage.TxtBox_password(driver).sendKeys(password);
		LoginPage.Btn_Login(driver).click(); 
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static void execute_Logout(WebDriver driver)throws Exception
	{
		HomePage.Icon_Logout(driver).click();
		Thread.sleep(2000);
		HomePage.Link_Logout(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);

	}
}
