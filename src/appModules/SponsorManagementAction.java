package appModules;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import config.Constants;
import pageObjects.NewsPage;
import pageObjects.SponsorPage;

public class SponsorManagementAction {
	public static void addsponsor(WebDriver driver,String Sponsorname,String SponsorType,String TwitterURL,String LinkedInURL,String WebsiteURL,String DescriptionValue) throws IOException, InterruptedException
	{	
		System.out.println("Inside addsponsor");
		WebElement Addsponsor =SponsorPage.Button_AddSponsor(driver);
		utility.Utilis.capture(driver,"Addsponsor1");
		utility.Utilis.ExecuteorClick(driver, Addsponsor);
		utility.Utilis.ScrollDown(driver);		
		WebElement Cancelbutton=SponsorPage.Button_Cancel(driver);
		utility.Utilis.ExecuteorClick(driver, Cancelbutton);
		System.out.println("Cancel clicked");
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		WebElement Addsponsornext =SponsorPage.Button_AddSponsor(driver);
		utility.Utilis.ExecuteorClick(driver, Addsponsornext);
		Thread.sleep(10000);
		System.out.println("Add sponsor clickedsecond time");
		WebElement Savebutton=SponsorPage.Button_Save(driver);
		utility.Utilis.ExecuteorClick(driver, Savebutton);
		String Logopath= System.getProperty("user.dir")+"\\src\\config\\Sponsorlogo.jpg";
		SponsorPage.Button_SelectImage(driver).sendKeys(Logopath);
		SponsorPage.Textbox_SponsorName(driver).sendKeys(Sponsorname);
		WebElement SponsortType=SponsorPage.Selectbox_SponsorType(driver);
		Select s= new Select(SponsortType);
		s.selectByVisibleText(SponsorType);
		SponsorPage.Textbox_Twitter(driver).sendKeys(TwitterURL);
		SponsorPage.Textbox_Linkedin(driver).sendKeys(LinkedInURL);
		utility.Utilis.capture(driver,"Addsponsor2");
		utility.Utilis.ScrollDown(driver);
		SponsorPage.Textbox_WebsiteURL(driver).sendKeys(WebsiteURL);
		SponsorPage.Textbox_description(driver).sendKeys(DescriptionValue);
		utility.Utilis.ScrollDown(driver);
		SponsorPage.ChooseFile_Pdf(driver).sendKeys(System.getProperty("user.dir")+"\\src\\config\\Sponsor.pdf");
		SponsorPage.ChooseFile_Ppt(driver).sendKeys(System.getProperty("user.dir")+"\\src\\config\\Sponsorppt.ppt");
		SponsorPage.ChooseFile_Doc(driver).sendKeys(System.getProperty("user.dir")+"\\src\\config\\Sponsordoc.doc");
		utility.Utilis.capture(driver,"Addsponsor3");
		utility.Utilis.ExecuteorClick(driver, Savebutton);
		driver.switchTo().alert().accept();
		String actual=SponsorPage.GridText_SponsorName(driver).getText();
		utility.Utilis.capture(driver,"Addsponsor4");
		if(actual.equalsIgnoreCase(Sponsorname))
		{
			System.out.println("Testpassed");
		}
		else
		{
			System.out.println("Testfailed");
		}
	}
	public static void editandectivatesponsor(WebDriver driver,String EditSponsorname,String EditSponsorType, String EditTwitterURL,String EditLinkedInURL,String EditWebsiteURL,String EditDescriptionValue) throws IOException, InterruptedException
	{	
		SponsorPage.Icon_EditSponsor(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		System.out.println("Inside editsponsor");
		utility.Utilis.capture(driver,"Editsponsor");
		utility.Utilis.ScrollDown(driver);		
		WebElement Cancelbutton=SponsorPage.Button_Cancel(driver);
		utility.Utilis.ExecuteorClick(driver, Cancelbutton);
		System.out.println("Cancel clicked");
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		SponsorPage.Icon_EditSponsor(driver).click();
		Thread.sleep(5000);
		System.out.println("Edit sponsor clickedsecond time");
		SponsorPage.Icon_RemoveSponsorImage(driver).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		utility.Utilis.capture(driver,"Editsponsor1");
		SponsorPage.Button_SelectImage(driver).sendKeys(System.getProperty("user.dir")+"\\src\\config\\KIB.jpg");
		SponsorPage.Textbox_SponsorName(driver).clear();
		SponsorPage.Textbox_SponsorName(driver).sendKeys(EditSponsorname);
		WebElement SponsortType=SponsorPage.Selectbox_SponsorType(driver);
		Select s= new Select(SponsortType);
		s.selectByVisibleText(EditSponsorType);
		SponsorPage.Textbox_Twitter(driver).clear();
		SponsorPage.Textbox_Twitter(driver).sendKeys(EditTwitterURL);
		SponsorPage.Textbox_Linkedin(driver).clear();
		SponsorPage.Textbox_Linkedin(driver).sendKeys(EditLinkedInURL);
		utility.Utilis.ScrollDown(driver);
		SponsorPage.Textbox_WebsiteURL(driver).clear();
		SponsorPage.Textbox_WebsiteURL(driver).sendKeys(EditWebsiteURL);
		SponsorPage.Textbox_description(driver).clear();
		utility.Utilis.capture(driver,"Editsponsor2");
		utility.Utilis.ScrollDown(driver);
		/*SponsorPage.ChooseFile_Pdf(driver).sendKeys(System.getProperty("user.dir")+"\\src\\config\\UpdatedSponsor.pdf");
		SponsorPage.ChooseFile_Ppt(driver).sendKeys(System.getProperty("user.dir")+"\\src\\config\\UpdatedSponsorppt.ppt");
		SponsorPage.ChooseFile_Doc(driver).sendKeys(System.getProperty("user.dir")+"\\src\\config\\UpdatedSponsordoc.doc");*/
		SponsorPage.Textbox_description(driver).sendKeys(EditDescriptionValue);
		Thread.sleep(2000);
		SponsorPage.Button_Save(driver).click();
		driver.switchTo().alert().accept();
		System.out.println("Editedvalues are saved");
		Thread.sleep(2000);
		SponsorPage.Icon_ActivateSponsor(driver).click();
		String actual=SponsorPage.GridText_SponsorName(driver).getText();	
		utility.Utilis.capture(driver,"Editsponsor3");
		if(actual.equalsIgnoreCase(EditSponsorname))
		{
			System.out.println("Testpassed");
		}
		else
		{
			System.out.println("Testfailed");
		}
	}
		public static void Searchanddeelete(WebDriver driver,String EditSponsorname) throws IOException, InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		System.out.println("Insidesearch");
			SponsorPage.Textbox_Searchname(driver).sendKeys(EditSponsorname);
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
