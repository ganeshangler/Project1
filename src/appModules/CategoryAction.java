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
	
public static void addcategory(WebDriver driver) throws IOException, InterruptedException
{
	driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
	Category.AddCategory(driver).click();
	WebElement ele=Category.Button_cancel(driver);
	Utilis.ExecuteorClick(ele);
	Category.AddCategory(driver).click();
	WebElement element=Category.AddCategory(driver);
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.stalenessOf(element));
	element.sendKeys("Testcategory");
	Category.Button_save(driver).click();
}
}

