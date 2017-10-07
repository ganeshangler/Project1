package appModules;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.Constants;
import pageObjects.Speaker;
import pageObjects.SponsorPage;

public class SpeakerManagemenAction {

	public static void addsponsor(WebDriver driver) throws IOException, InterruptedException {
		Speaker.Button_AddSpeaker(driver).click();
		Thread.sleep(1000);
		utility.Utilis.ScrollDown(driver);
		Speaker.Button_Cancel(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		Speaker.Button_AddSpeaker(driver).click();
		Thread.sleep(1000);
		utility.Utilis.ScrollDown(driver);	
		WebElement Buttonsave=Speaker.Button_Save(driver);
		utility.Utilis.ExecuteorClick(driver, Buttonsave);
		utility.Utilis.ScrolUp(driver);
		Speaker.Textbox_FirstName(driver).sendKeys("Name");
		Speaker.Textbox_LastName(driver).sendKeys("Last");
		Speaker.TextBox_Desgination(driver).sendKeys("design");
		Speaker.Textbox_Firm(driver).sendKeys("firm");
		Speaker.Textbox_TwitterURL(driver).sendKeys("http://www.twitter.com");
		Speaker.Textbox_LinkedinURL(driver).sendKeys("http://www.linkedin.com");
		Speaker.Textbox_WebsiteURL(driver).sendKeys("http://www.facebook.com");
		Speaker.Textbox_FacebookURL(driver).sendKeys("http://www.faceebook.com");
		Speaker.Textbox_Role(driver).sendKeys("Role");
		Speaker.Textbox_Industry(driver).sendKeys("Industry");
		Speaker.Textbox_Mobile(driver).sendKeys("98536214257");
		Speaker.Textbox_Email(driver).sendKeys("test@gmail.com");
		Speaker.Textbox_Description(driver).sendKeys("Description");
		Speaker.Browsebutton_Image(driver).sendKeys(System.getProperty("user.dir")+"\\src\\config\\Sponsorlogo.jpg");
		Speaker.Button_Save(driver).click();
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		String Actual=Speaker.GridText_Speaker(driver).getText();
		String Expected="Name"+" "+"Last";
		if(Actual.equalsIgnoreCase(Expected))
		{
			System.out.println("Testpassed");
		}
		else
		{
			System.out.println("Testfailed");
		}

	}
	public static void editandectivatespeaker(WebDriver driver) throws IOException, InterruptedException {
	
		Speaker.Icon_EditSpeaker(driver).click();
		Thread.sleep(1000);
		utility.Utilis.ScrollDown(driver);
		Speaker.Button_Cancel(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		Speaker.Icon_EditSpeaker(driver).click();
		Thread.sleep(1000);
		Speaker.Textbox_FirstName(driver).clear();
		Speaker.Textbox_FirstName(driver).sendKeys("NameU");
		Speaker.Textbox_LastName(driver).clear();
		Speaker.Textbox_LastName(driver).sendKeys("LastU");
		Speaker.TextBox_Desgination(driver).clear();
		Speaker.TextBox_Desgination(driver).sendKeys("designU");
		Speaker.Textbox_Firm(driver).clear();
		Speaker.Textbox_Firm(driver).sendKeys("firmU");
		Speaker.Textbox_TwitterURL(driver).clear();
		Speaker.Textbox_TwitterURL(driver).sendKeys("http://www.twitter1.com");
		Speaker.Textbox_LinkedinURL(driver).clear();
		Speaker.Textbox_LinkedinURL(driver).sendKeys("http://www.linkedin1.com");
		Speaker.Textbox_WebsiteURL(driver).clear();
		Speaker.Textbox_WebsiteURL(driver).sendKeys("http://www.facebook1.com");
		Speaker.Textbox_FacebookURL(driver).clear();
		Speaker.Textbox_FacebookURL(driver).sendKeys("http://www.faceebook1.com");
		Speaker.Textbox_Role(driver).clear();
		Speaker.Textbox_Role(driver).sendKeys("Roleu");
		Speaker.Textbox_Industry(driver).clear();
		Speaker.Textbox_Industry(driver).sendKeys("Industryu");
		Speaker.Textbox_Mobile(driver).clear();
		Speaker.Textbox_Mobile(driver).sendKeys("98536214209");
		Speaker.Textbox_Email(driver).clear();
		Speaker.Textbox_Email(driver).sendKeys("test@gmail1.com");
		Speaker.Textbox_Description(driver).clear();
		Speaker.Textbox_Description(driver).sendKeys("Description1");
		utility.Utilis.ScrollDown(driver);
		Speaker.Icon_RemoveSpeakerImage(driver).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		utility.Utilis.ScrollDown(driver);	
		Thread.sleep(2000);
		Speaker.Browsebutton_Image(driver).sendKeys(System.getProperty("user.dir")+"\\src\\config\\Sponsorlogo.jpg");
		utility.Utilis.ScrollDown(driver);
		Thread.sleep(3000);
		Speaker.Button_Save(driver).click();
		driver.switchTo().alert().accept();
		String Actual=Speaker.GridText_Speaker(driver).getText();
		String Expected="NameU"+" "+"LastU";
		if(Actual.equalsIgnoreCase(Expected))
		{
			System.out.println("Testpassed");
		}
		else
		{
			System.out.println("Testfailed");
		}

	}
	public static void Searchanddeelete(WebDriver driver) throws IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
	System.out.println("Insidesearch");
		SponsorPage.Textbox_Searchname(driver).sendKeys();
		utility.Utilis.capture(driver,"Searchsponsor1");
		SponsorPage.Icon_ViewSponsor(driver).click();
		utility.Utilis.capture(driver,"Searchsponsor2");
		SponsorPage.Button_ViewOK(driver).click();
		Thread.sleep(1000);
		String actual=SponsorPage.GridText_SponsorName(driver).getText();	
		if(actual.equalsIgnoreCase(EditSponsorname))
		{
			System.out.println("Testpassed");
		}
		else
		{
			System.out.println("Testfailed");
		}
		SponsorPage.Icon_DeleteSponsor(driver).click();
		driver.switchTo().alert().accept();
		utility.Utilis.capture(driver,"Searchsponsor3");		
	}

}
