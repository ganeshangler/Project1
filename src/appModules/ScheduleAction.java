package appModules;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.CategoryPage;
import config.Constants;
import executionEngine.FirefoxTest;
import pageObjects.*;
import utility.Utilis;
import utility.Utilis.TEST_RESULT;
public class ScheduleAction  {
	public static TEST_RESULT addschdule(WebDriver driver,String VenueValue,String TitleValue,String DescriptionValue) throws IOException, InterruptedException
	{

		SchedulePage.Button_Add(driver).click();
		utility.Utilis.capture(driver, "SchedulePage1");
		utility.Utilis.ScrollDown(driver);
		utility.Utilis.ScrollDown(driver);
		utility.Utilis.capture(driver, "SchedulePage2");
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
		SchedulePage.Textbox_ScheduleVenue(driver).sendKeys(VenueValue);
		Thread.sleep(2000);
		SchedulePage.Textbox_ScheduleFromdate(driver).click();
		SchedulePage.Textbox_ScheduleTodate(driver).click();
		SchedulePage.Textbox_ScheduleTodateValue(driver).click();
		utility.Utilis.capture(driver, "AddSchedulePage3");
		Thread.sleep(1000);
		utility.Utilis.ScrollDown(driver);
		SchedulePage.Textbox_ScheduleTitle(driver).sendKeys(TitleValue);
		SchedulePage.Textbox_ScheduleDescription(driver).sendKeys(DescriptionValue);
		SchedulePage.Radio_Schedule_Speaker(driver).click();
		SchedulePage.Selectbox_ScheduleSpeakerValue(driver).click();
		utility.Utilis.ScrollDown(driver);
		SchedulePage.Radio_ScheduleAudio(driver).click();
		utility.Utilis.capture(driver, "AddSchedulePage4");
		SchedulePage.Button_ScheduleSave(driver).click();
		driver.switchTo().alert().accept();
		new WebDriverWait(driver, 40)
        .ignoring(NoAlertPresentException.class)
        .until(ExpectedConditions.alertIsPresent());
		Alert al = driver.switchTo().alert();
		al.accept();
		utility.Utilis.capture(driver, "AddSchedulePage5");
		String actual=SchedulePage.GridValue_Title(driver).getText();
		if(actual.equalsIgnoreCase(TitleValue))
		{
			System.out.println("Test has passed");
			return TEST_RESULT.RESULT_SUCCESS;
		}
		else 
		{
			System.out.println("Test has failed");
			return TEST_RESULT.RESULT_FAILURE;
		}

	}

	public static TEST_RESULT editAndActivateSchedule(WebDriver driver,String EditVenueValue,String EditTitleValue,String EditDescriptionValue) throws IOException, InterruptedException {
		//Clearing values
		SchedulePage.Icon_ScheduleEit(driver).click();
		utility.Utilis.ScrollDown(driver);
		utility.Utilis.ScrollDown(driver);
		WebElement Cance_Button=SchedulePage.Button_ScheduleCancel(driver);
		utility.Utilis.ExecuteorClick(driver, Cance_Button);
		utility.Utilis.capture(driver, "EditSchedulePage1");
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		SchedulePage.Icon_ScheduleEit(driver).click();
		WebElement dropdown =SchedulePage.Selectbox_ScheduleCategory(driver);
		Actions build = new Actions(driver);
		build.moveToElement(dropdown).build().perform();
		WebElement m2m= driver.findElement(By.id("session_id"));
		utility.Utilis.ExecuteorClick(driver, dropdown);
		m2m.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		SchedulePage.Textbox_ScheduleVenue(driver).clear();
		SchedulePage.Textbox_ScheduleVenue(driver).sendKeys(EditVenueValue);
		SchedulePage.Textbox_ScheduleFromdate(driver).click();
		SchedulePage.Textbox_ScheduleTodate(driver).click();
		SchedulePage.Textbox_ScheduleTodateValue(driver).click();
		utility.Utilis.capture(driver, "EditSchedulePage3");
		utility.Utilis.ScrollDown(driver);
		SchedulePage.Textbox_ScheduleTitle(driver).clear();
		SchedulePage.Textbox_ScheduleTitle(driver).sendKeys(EditTitleValue);
		SchedulePage.Textbox_ScheduleDescription(driver).clear();
		SchedulePage.Textbox_ScheduleDescription(driver).sendKeys(EditDescriptionValue);
		SchedulePage.Radio_Schedule_Speaker(driver).click();
		SchedulePage.Selectbox_ScheduleSpeakerValue(driver).click();
		utility.Utilis.ScrollDown(driver);
		SchedulePage.Radio_ScheduleAudio(driver).click();
		utility.Utilis.capture(driver, "EditSchedulePage4");
		SchedulePage.Button_ScheduleSave(driver).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);	
		String actual=SchedulePage.GridValue_Title(driver).getText();
		System.out.println("actual value:"+actual);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		SchedulePage.Icon_Activate(driver).click();
		utility.Utilis.capture(driver, "EditSchedulePage4");
		System.out.println("edittitlevalue:"+EditTitleValue);
		if(actual.equalsIgnoreCase(EditTitleValue))
		{
			System.out.println("Test has passed");
			return TEST_RESULT.RESULT_SUCCESS;
		}
		else 
		{
			System.out.println("Test has failed");
			return TEST_RESULT.RESULT_FAILURE;
		}	

	}

	public static TEST_RESULT searchAndDeleteSchedule(WebDriver driver, String EditTitleValue) throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		SchedulePage.Textbox_SearchValue(driver).sendKeys(EditTitleValue);
		utility.Utilis.capture(driver, "SearchSchedulePage1");
		String value=SchedulePage.GridValue_Title(driver).getText();
		System.out.println("TitleGridvalue"+value);
		WebElement ViewIcon=SchedulePage.Icon_ViewSchedule(driver);
		utility.Utilis.ExecuteorClick(driver, ViewIcon);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		WebElement Button_viewOK=SchedulePage.Button_ViewOK(driver);
		utility.Utilis.ExecuteorClick(driver, Button_viewOK);
		if(value.equalsIgnoreCase(EditTitleValue))
		{
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			WebElement DeleteIcon=SchedulePage.Icon_DeleteSchedule(driver);
			utility.Utilis.ExecuteorClick(driver, DeleteIcon);
			driver.switchTo().alert().accept();
			utility.Utilis.capture(driver, "DeleteSchedulePage2");
			System.out.println("Testpassed");
			return TEST_RESULT.RESULT_SUCCESS;
		}
		else
		{
			CategoryPage.DeleteIcon_Category(driver).click();
			System.out.println("clicked delete");
			return TEST_RESULT.RESULT_FAILURE;
		}
	}
}


