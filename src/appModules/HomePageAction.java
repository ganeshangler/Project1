package appModules;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.*;
import pageObjects.*;
import config.Constants;
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
	
	public static void navigate_Category(WebDriver driver)throws Exception
	{
		Utilis.capture(driver,"homepage");
		HomePage.Icon_Masters(driver).click();
		Thread.sleep(4000);
		HomePage.Link_Category(driver).click();
		Utilis.capture(driver,"CategoryPage");
		
	}
	public static void navigate_Schedule(WebDriver driver)throws Exception
	{
		Utilis.capture(driver,"homepage");
		HomePage.Icon_Schedule(driver).click();
		Thread.sleep(4000);
		HomePage.Link_Schedule(driver).click();
		Utilis.capture(driver,"CategoryPage");
		
	}
}

