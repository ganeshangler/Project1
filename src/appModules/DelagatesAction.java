package appModules;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import pageObjects.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Utilis;
import utility.Utilis.TEST_RESULT;
import config.Constants;

public class DelagatesAction {
	private static final TimeUnit SECONDS = null;
	public static void adddelegates(WebDriver driver) throws IOException, InterruptedException
	{
	
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		DelegatesPage.Button_AddDelegates(driver).click();
		Thread.sleep(3000);
		utility.Utilis.ScrollDown(driver);
		utility.Utilis.ScrollDown(driver);
		DelegatesPage.Button_Cancel(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		Thread.sleep(1000);
		DelegatesPage.Button_AddDelegates(driver).click();
		Thread.sleep(1000);
		utility.Utilis.ScrollDown(driver);
		utility.Utilis.ScrollDown(driver);
		DelegatesPage.Button_Save(driver).click();
		DelegatesPage.Textbox_Username(driver).sendKeys("Testuser1@gmail.com");
		DelegatesPage.Textbox_Password(driver).sendKeys("Test123#");
		WebElement options= DelegatesPage.Textbox_Title(driver);
		Select s= new Select(options);
		s.selectByVisibleText("Mr.");
		DelegatesPage.Textbox_Firstname(driver).sendKeys("Test");
		DelegatesPage.Textbox_Lastname(driver).sendKeys("User");
		DelegatesPage.Textbox_Designation(driver).sendKeys("Engineer");
		DelegatesPage.Textbox_Firm(driver).sendKeys("KIV");
		DelegatesPage.Textbox_TwitterURL(driver).sendKeys("http://www.twitter.com");
		DelegatesPage.Textbox_LinkedinURL(driver).sendKeys("http://wwww.linkedin.com");
		DelegatesPage.Textbox_WebsiteURL(driver).sendKeys("http://www.google.com");
		DelegatesPage.Textbox_FacebookURL(driver).sendKeys("http://www.facebook.com");
		DelegatesPage.Textbox_Role(driver).sendKeys("Automation");
		DelegatesPage.Textbox_Industry(driver).sendKeys("Testing");
		DelegatesPage.Textbox_Mobile(driver).sendKeys("9854564123445");
		DelegatesPage.Textbox_Email(driver).sendKeys("testuser@gmail.com");
		Utilis.ScrollDown(driver);
		DelegatesPage.Textbox_Description(driver).sendKeys("BT is sampple");
		DelegatesPage.Button_Image(driver).sendKeys(System.getProperty("user.dir")+"\\src\\config\\Sponsorlogo.jpg");
		DelegatesPage.Button_Save(driver).click();
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		WebElement searchTextbox= DelegatesPage.Textbox_Search(driver);
		searchTextbox.sendKeys("KIV");
		searchTextbox.sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		String Actual=DelegatesPage.Label_Name(driver).getText();
		System.out.println("Actualvalue:"+Actual);
		String expected="Mr."+" "+"Test"+" "+"user";
		System.out.println(expected);
		System.out.println("Expected:"+expected);
		if(Actual.equalsIgnoreCase(expected))
		{

			System.out.println("Testpassed");
			//return TEST_RESULT.RESULT_SUCCESS;
		}
		else
		{
			System.out.println("Testfailed");
			//return TEST_RESULT.RESULT_FAILURE;
		}
			
	}
	
	public static void editandactivatedelegates(WebDriver driver) throws IOException, InterruptedException
	{
	
		WebElement searchTextbox= DelegatesPage.Textbox_Search(driver);
		searchTextbox.sendKeys("KIV");
		searchTextbox.sendKeys(Keys.RETURN);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		Thread.sleep(3000);
		DelegatesPage.Icon_Edit(driver).click();
		Thread.sleep(3000);
		/*	utility.Utilis.ScrollDown(driver);
		utility.Utilis.ScrollDown(driver);
		DelegatesPage.Button_Cancel(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.stalenessOf(searchTextbox));
		handleStaleElement(driver);
		searchTextbox.sendKeys("KIV");
		searchTextbox.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		DelegatesPage.Icon_Edit(driver).click();
		Thread.sleep(3000);
		utility.Utilis.ScrollDown(driver);
		utility.Utilis.ScrollDown(driver);
		DelegatesPage.Button_Save(driver).click();*/
		DelegatesPage.Textbox_Username(driver).clear();
		DelegatesPage.Textbox_Username(driver).sendKeys("Testuser1@gmail.com");
		DelegatesPage.Textbox_Password(driver).clear();
		DelegatesPage.Textbox_Password(driver).sendKeys("Test123#");
		WebElement options= DelegatesPage.Textbox_Title(driver);
		Select s= new Select(options);
		s.selectByVisibleText("Datin.");
		DelegatesPage.Textbox_Firstname(driver).clear();
		DelegatesPage.Textbox_Firstname(driver).sendKeys("Test1");
		DelegatesPage.Textbox_Lastname(driver).clear();
		DelegatesPage.Textbox_Lastname(driver).sendKeys("User1");
		DelegatesPage.Textbox_Designation(driver).clear();
		DelegatesPage.Textbox_Designation(driver).sendKeys("Engineer1");
		DelegatesPage.Textbox_Firm(driver).clear();
		DelegatesPage.Textbox_Firm(driver).sendKeys("KIV1");
		DelegatesPage.Textbox_TwitterURL(driver).clear();
		DelegatesPage.Textbox_TwitterURL(driver).sendKeys("http://www.twitter1.com");
		DelegatesPage.Textbox_LinkedinURL(driver).clear();
		DelegatesPage.Textbox_LinkedinURL(driver).sendKeys("http://wwww.linkedin1.com");
		DelegatesPage.Textbox_WebsiteURL(driver).sendKeys("http://www.google1.com");
		DelegatesPage.Textbox_FacebookURL(driver).clear();
		DelegatesPage.Textbox_FacebookURL(driver).sendKeys("http://www.facebook1.com");
		DelegatesPage.Textbox_Role(driver).clear();
		DelegatesPage.Textbox_Role(driver).sendKeys("Automation1");
		DelegatesPage.Textbox_Industry(driver).clear();
		DelegatesPage.Textbox_Industry(driver).sendKeys("Testing1");
		DelegatesPage.Textbox_Mobile(driver).clear();
		DelegatesPage.Textbox_Mobile(driver).sendKeys("9854564123444");
		DelegatesPage.Textbox_Email(driver).clear();
		DelegatesPage.Textbox_Email(driver).sendKeys("testuser1@gmail.com");
		Utilis.ScrollDown(driver);
		DelegatesPage.Textbox_Description(driver).clear();
		DelegatesPage.Textbox_Description(driver).sendKeys("BT is sampple1");
		DelegatesPage.Button_RemoveImage(driver).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		DelegatesPage.Button_Image(driver).sendKeys(System.getProperty("user.dir")+"\\src\\config\\Peace.jpg");	
		Utilis.ScrollDown(driver);
		DelegatesPage.Button_Save(driver).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		Wait<WebDriver> stubbornWait = new FluentWait<WebDriver>(driver)
			    .withTimeout(100, SECONDS)
			    .pollingEvery(5, SECONDS)
			    .ignoring(StaleElementReferenceException.class);
		Boolean b=searchTextbox.isDisplayed();
		if(b)
		{
		searchTextbox.sendKeys("KIV");
		searchTextbox.sendKeys(Keys.RETURN);
		}
		Thread.sleep(4000);
		String Actual=DelegatesPage.Label_Name(driver).getText();
		System.out.println("Actualvalue:"+Actual);
		String expected="Mr."+" "+"Test"+" "+"user";
		System.out.println(expected);
		System.out.println("Expected:"+expected);
		if(Actual.equalsIgnoreCase(expected))
		{

			System.out.println("Testpassed");
			//return TEST_RESULT.RESULT_SUCCESS;
		}
		else
		{
			System.out.println("Testfailed");
			//return TEST_RESULT.RESULT_FAILURE;
		}
			
	}
	public static void handleStaleElement(WebDriver driver) {
		  int count = 0;
		  //It will try 4 times to find same element using name.
		  while (count < 4) {
		   try {
		    //If exception generated that means It Is not able to find element then catch block will handle It.
		    WebElement staledElement = driver.findElement(By.id("delegate-grid_filter"));
		    //If exception not generated that means element found and element text get cleared.
		    staledElement.clear();    
		   } catch (StaleElementReferenceException e) {
		    e.toString();
		    System.out.println("Trying to recover from a stale element :" + e.getMessage());
		    count = count + 1;
		   }
		   count = count + 4;
		  }
		 }

}
