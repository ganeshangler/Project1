package appModules;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import pageObjects.CategoryPage;
import config.Constants;
import executionEngine.FirefoxTest;
import pageObjects.*;
import utility.Utilis;
public class ScheduleAction  {
	public static void addschdule(WebDriver driver) throws IOException, InterruptedException
	{

		SchedulePage.Button_Add(driver).click();
		utility.Utilis.ScrollDown(driver);
		utility.Utilis.ScrollDown(driver);
		WebElement Cance_Button=SchedulePage.Button_ScheduleCancel(driver);
		utility.Utilis.ExecuteorClick(driver, Cance_Button);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		SchedulePage.Button_Add(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		WebElement dropdown =SchedulePage.Selectbox_ScheduleCategory(driver);
		Actions build = new Actions(driver);
		build.moveToElement(dropdown).build().perform();//Hovers the mouse over the first element which will trigger the event
		WebElement m2m= driver.findElement(By.id("session_id"));// finds the previouslly hidden element
		m2m.click();
		m2m.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		JavascriptExecutor jsx2 = (JavascriptExecutor)driver;
		jsx2.executeScript("window.scrollBy(450,0)", "");
		SchedulePage.Textbox_ScheduleVenue(driver).sendKeys("Second floor");
		Thread.sleep(2000);
		SchedulePage.Textbox_ScheduleFromdate(driver).click();
		SchedulePage.Textbox_ScheduleTodate(driver).click();
		SchedulePage.Textbox_ScheduleTodateValue(driver).click();
		Thread.sleep(1000);
		utility.Utilis.ScrollDown(driver);
		SchedulePage.Textbox_ScheduleTitle(driver).sendKeys("Conference");
		SchedulePage.Textbox_ScheduleDescription(driver).sendKeys("Description");
		SchedulePage.Radio_Schedule_Speaker(driver).click();
		SchedulePage.Selectbox_ScheduleSpeakerValue(driver).click();
		utility.Utilis.ScrollDown(driver);
		SchedulePage.Radio_ScheduleAudio(driver).click();
		SchedulePage.Button_ScheduleSave(driver).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		String actual=SchedulePage.GridText_Title(driver).getText();
		if(actual.equalsIgnoreCase("Conference"))
		{
			System.out.println("Test has passed");
		}
		else 
		{
			System.out.println("Test has failed");
		}

	}

	public static void editAndActivateSchedule(WebDriver driver) throws IOException, InterruptedException {
		//Clearing values
		SchedulePage.Icon_ScheduleEit(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		SchedulePage.Textbox_ScheduleVenue(driver).clear();
		utility.Utilis.ScrollDown(driver);
		SchedulePage.Textbox_ScheduleTitle(driver).clear();
		SchedulePage.Textbox_ScheduleDescription(driver).clear();
		SchedulePage.Radio_Schedule_Speaker(driver).click();
		SchedulePage.Selectbox_ScheduleSpeakerValue(driver).click();
		utility.Utilis.ScrollDown(driver);
		SchedulePage.Radio_ScheduleAudio(driver).click();
		SchedulePage.Button_ScheduleSave(driver).click();
		WebElement Cance_Button=SchedulePage.Button_ScheduleCancel(driver);
		utility.Utilis.ExecuteorClick(driver, Cance_Button);
		//Editing values
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		SchedulePage.Button_Add(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		WebElement dropdown =SchedulePage.Selectbox_ScheduleCategory(driver);
		Actions build = new Actions(driver);
		build.moveToElement(dropdown).build().perform();//Hovers the mouse over the first element which will trigger the event
		WebElement m2m= driver.findElement(By.id("session_id"));// finds the previouslly hidden element
		m2m.click();
		m2m.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		JavascriptExecutor jsx2 = (JavascriptExecutor)driver;
		jsx2.executeScript("window.scrollBy(450,0)", "");
		SchedulePage.Textbox_ScheduleVenue(driver).sendKeys("Firstfloor");
		SchedulePage.Textbox_ScheduleFromdate(driver).click();
		SchedulePage.Textbox_ScheduleTodate(driver).click();
		SchedulePage.Textbox_ScheduleTodateValue(driver).click();
		utility.Utilis.ScrollDown(driver);
		SchedulePage.Textbox_ScheduleTitle(driver).sendKeys("Technicalsession");
		SchedulePage.Textbox_ScheduleDescription(driver).sendKeys("Updted value");
		SchedulePage.Radio_Schedule_Speaker(driver).click();
		SchedulePage.Selectbox_ScheduleSpeakerValue(driver).click();
		utility.Utilis.ScrollDown(driver);
		SchedulePage.Radio_ScheduleAudio(driver).click();
		SchedulePage.Button_ScheduleSave(driver).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		String actual=SchedulePage.GridText_Title(driver).getText();
		SchedulePage.Icon_Activate(driver).click();
		if(actual.equalsIgnoreCase("Technicalsession"))
		{
			System.out.println("Test has passed");
		}
		else 
		{
			System.out.println("Test has failed");
		}	

	}

	public static void searchAndDeleteSchedule(WebDriver driver) throws IOException {
		SchedulePage.Textbox_SearchValue(driver).sendKeys("Rose Amer Event");
		WebElement ViewIcon=SchedulePage.Icon_ViewSchedule(driver);
		utility.Utilis.ExecuteorClick(driver, ViewIcon);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		SchedulePage.Button_ViewOK(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		WebElement DeleteIcon=SchedulePage.Icon_DeleteSchedule(driver);
		utility.Utilis.ExecuteorClick(driver, DeleteIcon);
		driver.switchTo().alert().accept();

	}
}

