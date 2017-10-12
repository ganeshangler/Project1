package appModules;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import pageObjects.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.Utilis;
import utility.Utilis.TEST_RESULT;
import config.Constants;

public class DelagatesAction {
	public static void addcategorymaster(WebDriver driver) throws IOException, InterruptedException
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
		DelegatesPage.Textbox_Username(driver).sendKeys("Testuser@gmail.com");
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

}
}