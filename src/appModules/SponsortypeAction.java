package appModules;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import config.Constants;
import pageObjects.Sponsortype;
import utility.Utilis.TEST_RESULT;

public class SponsortypeAction 
{
	public static void sponsortypeaccess(WebDriver driver,String sponsortype) throws Exception
	{
		 Alert alert;
//		 TEST_RESULT testResult;
		 driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		 		
		// Finds the master menu from the side bar
		Sponsortype.FindMasters(driver).click();
		System.out.println("Master menu has been selected");
	    
		Thread.sleep(1000);
		//Find and click the sponsor type menu from the side bar
		Sponsortype.FindSponsortype(driver).click();
		System.out.println("Sponsortype menu has been selected");
		
		Thread.sleep(1500);

		// Click on Add and add a sponsor type
		
		/*Sponsortype.AddSponsortype(driver).click();
		System.out.println("Add button has been clicked");
		
		Thread.sleep(1500);
	
		Sponsortype.SponsortypeInput(driver).sendKeys("Testdata");
		System.out.println("Data has been added");
		
		Thread.sleep(1500);
		
		Sponsortype.CancelSponsortype(driver).click();
		System.out.println("Data entered has been cancelled");
		
		Thread.sleep(1500);
		
		Sponsortype.AddSponsortype(driver).click();
		System.out.println("Add button has been clicked");
		
		Thread.sleep(1500);
	
		Sponsortype.SponsortypeInput(driver).sendKeys(sponsortype);
		System.out.println("Data has been added");
		
		Thread.sleep(1500);
		
		Sponsortype.SaveSponsortype(driver).click();
		System.out.println("Sponsor type has been added");
		
		Thread.sleep(1500);
		
		//Switches from our window to alert popup displayed
		alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1500);
		//return testResult;*/
		
		 
	}

}
