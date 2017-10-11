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
	public static void navigate_NewsMgmt(WebDriver driver)throws Exception
	{
		Utilis.capture(driver,"homepage");
		HomePage.Icon_news(driver).click();
		Thread.sleep(4000);
		HomePage.Link_News(driver).click();
		Utilis.capture(driver,"News");
		
	}
	public static void navigate_SponsorMgmt(WebDriver driver)throws Exception
	{
		Utilis.capture(driver,"homepage");
		HomePage.Icon_Sponsor(driver).click();
		Thread.sleep(4000);
		HomePage.Link_Sponsor(driver).click();
		Utilis.capture(driver,"Sponsor");
		
	}
	public static void navigate_SpeakerMgmt(WebDriver driver)throws Exception
	{
		Utilis.capture(driver,"homepage");
		HomePage.Icon_Speaker(driver).click();
		Thread.sleep(4000);
		HomePage.Link_Speaker(driver).click();
		Utilis.capture(driver,"Speaker");
		
	}
	public static void navigate_OrganizerMgmt(WebDriver driver)throws Exception
	{
		Utilis.capture(driver,"homepage");
		HomePage.Icon_Organizer(driver).click();
		Thread.sleep(4000);
		HomePage.Link_Organizer(driver).click();
		Utilis.capture(driver,"Speaker");
		
	}
	public static void navigate_Delegates(WebDriver driver)throws Exception
	{
		Utilis.capture(driver,"homepage");
		HomePage.Icon_Delegates(driver).click();
		Thread.sleep(4000);
		HomePage.Link_Delegates(driver).click();
		Utilis.capture(driver,"Speaker");
		
	}

}

