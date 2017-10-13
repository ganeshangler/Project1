package appModules;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.Constants;
import pageObjects.Speaker;
import pageObjects.SponsorPage;
import utility.Utilis.TEST_RESULT;

public class SpeakerManagemenAction {

	public static TEST_RESULT addsponsor(WebDriver driver,String Firstname,String Lastname, String Designation,String Firm,String TwitterURL,String LinkedinURL,String WebsiteURL,String FacebookURL,String Role,String Industry,String Phoneno,String Email,String Descrption) throws IOException, InterruptedException {
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
		Speaker.Textbox_FirstName(driver).sendKeys(Firstname);
		Speaker.Textbox_LastName(driver).sendKeys(Lastname);
		Speaker.TextBox_Desgination(driver).sendKeys(Designation);
		Speaker.Textbox_Firm(driver).sendKeys(Firm);
		Speaker.Textbox_TwitterURL(driver).sendKeys(TwitterURL);
		Speaker.Textbox_LinkedinURL(driver).sendKeys(LinkedinURL);
		Speaker.Textbox_WebsiteURL(driver).sendKeys(WebsiteURL);
		Speaker.Textbox_FacebookURL(driver).sendKeys(FacebookURL);
		Speaker.Textbox_Role(driver).sendKeys( Role);
		Speaker.Textbox_Industry(driver).sendKeys(Industry);
		Speaker.Textbox_Mobile(driver).sendKeys(Phoneno);
		Speaker.Textbox_Email(driver).sendKeys(Email);
		Speaker.Textbox_Description(driver).sendKeys(Descrption);
		Speaker.Browsebutton_Image(driver).sendKeys(System.getProperty("user.dir")+"\\src\\config\\Sponsorlogo.jpg");
		utility.Utilis.ScrollDown(driver);
		Speaker.Button_Save(driver).click();
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		String Actual=Speaker.GridText_Speaker(driver).getText();
		String Expected=Firstname+" "+Lastname;
		if(Actual.equalsIgnoreCase(Expected))
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
	public static TEST_RESULT editandectivatespeaker(WebDriver driver,String EditFirstname,String EditLastname,String EditDesignation,String EditFirm,String EditTwitterURL,String EditLinkedinURL,String EditWebsiteURL,String EditFacebookURL,String EditRole,String EditIndustry,String EditPhoneno,String EditEmail,String EditDescrption) throws IOException, InterruptedException
	{

		Speaker.Icon_EditSpeaker(driver).click();
		Thread.sleep(1000);
		utility.Utilis.ScrollDown(driver);
		Speaker.Button_Cancel(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		Speaker.Icon_EditSpeaker(driver).click();
		Thread.sleep(1000);
		Speaker.Textbox_FirstName(driver).clear();
		Speaker.Textbox_FirstName(driver).sendKeys(EditFirstname);
		Speaker.Textbox_LastName(driver).clear();
		Speaker.Textbox_LastName(driver).sendKeys(EditLastname);
		Speaker.TextBox_Desgination(driver).clear();
		Speaker.TextBox_Desgination(driver).sendKeys(EditDesignation);
		Speaker.Textbox_Firm(driver).clear();
		Speaker.Textbox_Firm(driver).sendKeys(EditFirm);
		Speaker.Textbox_TwitterURL(driver).clear();
		Speaker.Textbox_TwitterURL(driver).sendKeys(EditTwitterURL);
		Speaker.Textbox_LinkedinURL(driver).clear();
		Speaker.Textbox_LinkedinURL(driver).sendKeys(EditLinkedinURL);
		Speaker.Textbox_WebsiteURL(driver).clear();
		Speaker.Textbox_WebsiteURL(driver).sendKeys(EditWebsiteURL);
		Speaker.Textbox_FacebookURL(driver).clear();
		Speaker.Textbox_FacebookURL(driver).sendKeys(EditLinkedinURL);
		Speaker.Textbox_Role(driver).clear();
		Speaker.Textbox_Role(driver).sendKeys(EditRole);
		Speaker.Textbox_Industry(driver).clear();
		Speaker.Textbox_Industry(driver).sendKeys(EditIndustry);
		Speaker.Textbox_Mobile(driver).clear();
		Speaker.Textbox_Mobile(driver).sendKeys(EditPhoneno);
		Speaker.Textbox_Email(driver).clear();
		Speaker.Textbox_Email(driver).sendKeys(EditEmail);
		Speaker.Textbox_Description(driver).clear();
		Speaker.Textbox_Description(driver).sendKeys(EditDescrption);
		/*Speaker.Icon_RemoveSpeakerImage(driver).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		utility.Utilis.ScrollDown(driver);	
		Speaker.Browsebutton_Image(driver).sendKeys(System.getProperty("user.dir")+"\\src\\config\\Sponsorlogo.jpg");*/
		utility.Utilis.ScrollDown(driver);
	    Speaker.Button_Save(driver).click();
		driver.switchTo().alert().accept();
		String Actual=Speaker.GridText_Speaker(driver).getText();
		String Expected=EditFirstname+" "+EditLastname;
		if(Actual.equalsIgnoreCase(Expected))
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
	public static TEST_RESULT Searchanddeelete(WebDriver driver,String EditFirstname,String EditLastname)throws IOException,InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		System.out.println("Insidesearch");
		String Expected=EditFirstname+" "+EditLastname;
		Speaker.Textbox_SearchSpeaker(driver).sendKeys(Expected);
		utility.Utilis.capture(driver,"Searchspeaker1");
		Speaker.Icon_ViewSpeaker(driver).click();
		utility.Utilis.capture(driver,"Searchspeaker2");
		Speaker.Button_ViewOK(driver).click();
		Thread.sleep(1000);
		String actual=Speaker.GridText_Speaker(driver).getText();
		
		if(actual.equalsIgnoreCase(Expected))
		{
			SponsorPage.Icon_DeleteSponsor(driver).click();
			driver.switchTo().alert().accept();
			utility.Utilis.capture(driver,"Searchspeaker3");
			System.out.println("Testpassed");
			return TEST_RESULT.RESULT_SUCCESS;
		}
		else
		{
			SponsorPage.Icon_DeleteSponsor(driver).click();
			driver.switchTo().alert().accept();
			utility.Utilis.capture(driver,"Searchspeaker3");
			System.out.println("Testfailed");
			return TEST_RESULT.RESULT_FAILURE;
		}
				
	}


}