package appModules;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import pageObjects.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;







import config.Constants;
import utility.*;

public class CategoryAction {

	public static void addcategory(WebDriver driver,String categoryValue) throws IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		CategoryPage.AddCategory(driver).click();
		System.out.println("clicked add cetgory");
		Utilis.capture(driver,"CategoryAddPage");
		WebElement ele=CategoryPage.Button_cancel(driver);
		Thread.sleep(3000);
		System.out.println("clicked cancel");
		Utilis.ExecuteorClick(driver, ele);
		CategoryPage.AddCategory(driver).click();
		Thread.sleep(3000);
		System.out.println("clicked add cetgory");
		Utilis.capture(driver,"CategoryAdd");
		WebElement savebutton=CategoryPage.Button_save(driver);
		Utilis.ExecuteorClick(driver,savebutton);
		System.out.println("clicked save");
		String message= driver.findElement(By.xpath("//SMALL[@class='help-block'][text()='The Category Name is required and cannot be empty']")).getText();
		if(message.equalsIgnoreCase("The Category Name is required and cannot be empty"))
		{
			System.out.println("Mandatory alert is displayed when input is not entered");
			WebElement element=CategoryPage.Textbox_Category(driver);
			element.sendKeys(categoryValue);
			System.out.println("Typedtext");
			Utilis.ExecuteorClick(driver,savebutton);
		}
		System.out.println("clicked save");
		driver.switchTo().alert().accept();	
		
	}
	public static void editAndActivateCategory(WebDriver driver,String editCategoryValue) throws IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		CategoryPage.EditIcon_Category(driver).click();
		Utilis.capture(driver,"CategoryEditPage");
		System.out.println("clicked edit cetgory");
		WebElement ele=CategoryPage.Button_cancel(driver);
		Utilis.ExecuteorClick(driver, ele);
		System.out.println("clicked cancel");
		CategoryPage.EditIcon_Category(driver).click();
		System.out.println("clicked edit cetgory");
		WebElement savebutton=CategoryPage.Button_save(driver);
		WebElement element=CategoryPage.Textbox_Category(driver);
		element.clear();
		Thread.sleep(2000);
		Utilis.ExecuteorClick(driver,savebutton);
		Utilis.capture(driver,"CategoryEdit1-Mandatory");
		System.out.println("Mandatory alert is displayed when input is not entered");
		element.sendKeys(editCategoryValue);
		System.out.println("Typedtext");
		Thread.sleep(2000);
		Utilis.ExecuteorClick(driver,savebutton);
		System.out.println("clicked edit");
		driver.switchTo().alert().accept();	
		System.out.println("Alert accepted");
		String Gridvalue=CategoryPage.GridValue_Category(driver).getText();
		System.out.println(Gridvalue);
		if(Gridvalue.equalsIgnoreCase(Gridvalue))
		{
			System.out.println("Testpassed");
		}
		else
		{
			System.out.println("Testfailed");
		}
		WebElement Activate=CategoryPage.Activate_Category(driver);
		Utilis.ExecuteorClick(driver,Activate);
		System.out.println("activate is clicked");
		Utilis.capture(driver,"CategoryEdit2");
	}

	public static void searchAndDeletecategory(WebDriver driver,String editCategoryValue) throws IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		CategoryPage.TextboxSearch_Category(driver).sendKeys(editCategoryValue);
		String Gridvalue=CategoryPage.SearchGridValue_Category(driver).getText();
		System.out.println(Gridvalue);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		CategoryPage.DeleteIcon_Category(driver).click();
		System.out.println("clicked delete");
		driver.switchTo().alert().accept();	


	}
}

