package appModules;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.*;
import pageObjects.*;
import utility.Constants;
import pageObjects.HomePage;

public class HomePageAction {
	public static WebDriver driver;
	public static void navigate_aboutEvent(WebDriver driver)throws Exception
	{
		Utilis.capture(driver,"homepage");
		HomePage.Icon_aboutEvent(driver).click();
		Thread.sleep(4000);
		HomePage.Link_aboutEvent(driver).click();
		Utilis.capture(driver,"AbouteventPage");
		
	}
}

