package appModules;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.Constants;
import pageObjects.CategoryPage;
import pageObjects.NewsPage;
import pageObjects.SchedulePage;
import utility.Utilis.TEST_RESULT;

public class NewsManagementAction {
	public static TEST_RESULT addnews(WebDriver driver,String Titlevalue,String DescriptionValue) throws IOException, InterruptedException
	{
		System.out.println("Inside addnews");
		NewsPage.Button_SendNews(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		utility.Utilis.capture(driver, "addnewsPage");
		WebElement Cancelbutton=NewsPage.Button_Cancel(driver);
		utility.Utilis.ExecuteorClick(driver, Cancelbutton);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		NewsPage.Button_SendNews(driver).click();
		//driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		Thread.sleep(10000);
		WebElement Title=NewsPage.Textbox_NewsTitle(driver);
		Title.sendKeys(Titlevalue);
		String s= System.getProperty("user.dir")+"\\src\\config\\Newsimage.jpg";
		System.out.println(s);
		NewsPage.Browse_NewsImgae(driver).sendKeys(s);
		Thread.sleep(10000);
		NewsPage.Textbox_NewsDescription(driver).sendKeys(DescriptionValue);
		NewsPage.Textbox_NewsDateTime(driver).click();
		utility.Utilis.capture(driver, "addnewsPage1");
		utility.Utilis.ScrollDown(driver);
		NewsPage.Button_Save(driver).click();
		driver.switchTo().alert().accept();
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		String titlevalue=NewsPage.GrdText_Titlevalue(driver).getText();
		utility.Utilis.capture(driver, "addnewsPage2");
		if(titlevalue.equalsIgnoreCase(Titlevalue))
		{
			System.out.println("Testpassed");
			return TEST_RESULT.RESULT_SUCCESS;
		}
		else
		{
			System.out.println("Testfailed");
			return TEST_RESULT.RESULT_FAILURE;
		}

	}

	public static TEST_RESULT editandectivatenews(WebDriver driver,String EditTitleValue,String EditDescriptionValue) throws IOException, InterruptedException
	{
		System.out.println("Inside editnews");
		NewsPage.Icon_Editnews(driver).click();
		utility.Utilis.capture(driver, "EditnewsPage");
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		WebElement Cancelbutton=NewsPage.Button_Cancel(driver);
		utility.Utilis.ExecuteorClick(driver, Cancelbutton);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		NewsPage.Icon_Editnews(driver).click();
		Thread.sleep(1000);
		String s= System.getProperty("user.dir")+"\\src\\config\\Peace.jpg";
		NewsPage.Button_ImageRemove(driver).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		NewsPage.Browse_NewsImgae(driver).sendKeys(s);
		Thread.sleep(10000);
		utility.Utilis.ScrollDown(driver);
		NewsPage.Textbox_NewsDescription(driver).clear();
		NewsPage.Textbox_NewsDescription(driver).sendKeys(EditDescriptionValue);
		Thread.sleep(10000);
		WebElement Title=NewsPage.Textbox_NewsTitle(driver);
		Title.clear();
		Title.sendKeys(EditTitleValue);
		utility.Utilis.capture(driver, "EditnewsPage1");
		utility.Utilis.ScrollDown(driver);
		NewsPage.Button_Save(driver).click();
		driver.switchTo().alert().accept();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		String titlevalue=NewsPage.GrdText_Titlevalue(driver).getText();
		utility.Utilis.capture(driver, "EditnewsPage2");
		if(titlevalue.equalsIgnoreCase(EditTitleValue))
		{
			System.out.println("Test passed");
			return TEST_RESULT.RESULT_SUCCESS;
		}
		else
		{
			System.out.println("Test failed");
			return TEST_RESULT.RESULT_FAILURE;
		}

	}


	public static TEST_RESULT searchAndDeletenews(WebDriver driver,String EditTitleValue) throws IOException, InterruptedException {
		System.out.println("Inside delete news");
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		NewsPage.Textbox_Titlesearch(driver).sendKeys(EditTitleValue);
		utility.Utilis.capture(driver, "SearchnewsPage1");
		String value=NewsPage.GrdText_Titlevalue(driver).getText();
		System.out.println("TitleGridvalue"+value);
		WebElement ViewIcon=NewsPage.Icon_ViewNews(driver);
		utility.Utilis.ExecuteorClick(driver, ViewIcon);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		WebElement Button_viewOK=NewsPage.Button_ViewOK(driver);
		utility.Utilis.ExecuteorClick(driver, Button_viewOK);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		WebElement ActivateIcon=NewsPage.Icon_ActivateNews(driver);
		utility.Utilis.ExecuteorClick(driver, ActivateIcon);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		if(value.equalsIgnoreCase(EditTitleValue))
		{
		WebElement DeleteIcon=NewsPage.Icon_DeleteNews(driver);
		utility.Utilis.ExecuteorClick(driver, DeleteIcon);
		driver.switchTo().alert().accept();
		utility.Utilis.capture(driver, "Deletenews");
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
