package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.*;
import pageObjects.*;
import config.Constants;


public class LoginAction   {

	public static void execute_Login(WebDriver driver, String Username, String Password)throws Exception
	{
		//Utilis.capture(driver,"Login");
		LoginPage.TxtBox_username(driver).sendKeys(Username);
		LoginPage.TxtBox_password(driver).sendKeys(Password);
		LoginPage.Btn_Login(driver).click(); 
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

}
