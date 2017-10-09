package appModules;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.Constants;
import pageObjects.*;
public class OrganizerManagementAction {
	public static void addorganizer(WebDriver driver, String OrgaizernameValue,String DescriptionValue,String FacebookURLValue,String TwitterURLValue,String WebsiteURLValue) throws IOException, InterruptedException
	{
		Organizer.Button_Add(driver).click();
		Thread.sleep(2000);
		utility.Utilis.capture(driver,"Addorganizer1");
		utility.Utilis.ScrollDown(driver);
		Organizer.Button_Cancel(driver).click();
		Organizer.Button_Add(driver).click();
		Thread.sleep(2000);
		Organizer.Textbox_Organizer(driver).click();
		Organizer.Textbox_Organizer(driver).sendKeys(OrgaizernameValue);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		String Logopath= System.getProperty("user.dir")+"\\src\\config\\Sponsorlogo.jpg";
		Organizer.Button_LogoImage(driver).sendKeys(Logopath);
		Organizer.Textbox_Description(driver).sendKeys(DescriptionValue);
		utility.Utilis.capture(driver,"Addorganizer2");
		utility.Utilis.ScrollDown(driver);
		Organizer.Textbox_FbURL(driver).sendKeys(FacebookURLValue);
		Organizer.Textbox_TwitterURL(driver).sendKeys(TwitterURLValue);
		Organizer.Textbox_WebsiteURL(driver).sendKeys("http://www.google.com");
		WebElement save=Organizer.Button_Save(driver);
		utility.Utilis.capture(driver,"Addorganizer3");
		utility.Utilis.ExecuteorClick(driver, save);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		Thread.sleep(3000);
		String actual=Organizer.GridText_OrganizerName(driver).getText();
		utility.Utilis.capture(driver,"Addorganizer4");
		if(actual.equalsIgnoreCase(OrgaizernameValue))
		{
			System.out.println("Testpassed");
		}
		else
		{
			System.out.println("Testfailed");
		}
	}
	public static void editandactivateorganizer(WebDriver driver,String EditOrgaizernameValue,String EditDescriptionValue,String EditFacebookURLValue,String EditTwitterURLValue,String EditWebsiteURLValue) throws IOException, InterruptedException
	{
		Organizer.Icon_EditOrganizer(driver).click();
		Thread.sleep(2000);
		utility.Utilis.capture(driver,"Editorganizer1");
		utility.Utilis.ScrollDown(driver);
		Organizer.Button_Cancel(driver).click();
		Organizer.Icon_EditOrganizer(driver).click();
		WebElement Removebutton=Organizer.Button_RemoveImage(driver);
		utility.Utilis.ExecuteorClick(driver, Removebutton);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();	
		Thread.sleep(3000);
		String Logopath= System.getProperty("user.dir")+"\\src\\config\\Sponsorlogo.jpg";
		Organizer.Button_LogoImage(driver).sendKeys(Logopath);
		Thread.sleep(2000);
		Organizer.Textbox_Organizer(driver).click();
		Organizer.Textbox_Organizer(driver).clear();
		Organizer.Textbox_Organizer(driver).sendKeys(EditOrgaizernameValue);
		Organizer.Textbox_Description(driver).clear();
		Organizer.Textbox_Description(driver).sendKeys(EditDescriptionValue);
		utility.Utilis.ScrollDown(driver);
		Organizer.Textbox_FbURL(driver).clear();
		Organizer.Textbox_FbURL(driver).sendKeys(EditFacebookURLValue);
		Organizer.Textbox_TwitterURL(driver).clear();
		Organizer.Textbox_TwitterURL(driver).sendKeys(EditTwitterURLValue);
		utility.Utilis .ScrollDown(driver);
		Organizer.Textbox_WebsiteURL(driver).clear();
		Organizer.Textbox_WebsiteURL(driver).sendKeys(EditWebsiteURLValue);
		utility.Utilis.capture(driver,"Editorganizer2");
		WebElement save=Organizer.Button_Save(driver);
		utility.Utilis.ExecuteorClick(driver, save);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		Thread.sleep(3000);
		String actual=Organizer.GridText_OrganizerName(driver).getText();
		utility.Utilis.capture(driver,"Editorganizer3");
		if(actual.equalsIgnoreCase(EditOrgaizernameValue))
		{
			System.out.println("Testpassed");
		}
		else
		{
			System.out.println("Testfailed");
		}
		Organizer.Icon_ActivateOrganizer(driver).click();
	}

	public static void searchAndDeleteorganizer(WebDriver driver, String EditOrgaizernameValue) throws IOException, InterruptedException {

		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		Organizer.Textbox_SearchText(driver).sendKeys(EditOrgaizernameValue);
		utility.Utilis.capture(driver, "SearchOrganizerPage1");
		utility.Utilis.capture(driver,"searchorganizer1");
		String value=Organizer.GridText_OrganizerName(driver).getText();
		System.out.println("TitleGridvalue"+value);
		WebElement ViewIcon=Organizer.Icon_ViewOrganizer(driver);
		utility.Utilis.ExecuteorClick(driver, ViewIcon);
		utility.Utilis.capture(driver,"searchorganizer1");
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		WebElement Button_viewOK=Organizer.Button_ViewOK(driver);
		utility.Utilis.ExecuteorClick(driver, Button_viewOK);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		WebElement DeleteIcon=Organizer.Icon_DeleteOrganizer(driver);
		utility.Utilis.ExecuteorClick(driver, DeleteIcon);
		driver.switchTo().alert().accept();
		utility.Utilis.capture(driver, "Deleteorganizer");

	}
}
