package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.AnnouncementPage;
import config.Constants;

public class AnnouncementAction {
	public static void Add_Announcement(WebDriver driver,String Message) throws Exception
	{
		
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		if(AnnouncementPage.chk_Annon_Annountitle(driver).isDisplayed() || AnnouncementPage.btn_Annon_btnsendannon(driver).isDisplayed())
		{
			System.out.println("Entered into Announcement Page");
			System.out.println("Checking for Send Announcement button");
			Thread.sleep(4000);
			if(AnnouncementPage.btn_Annon_btnsendannon(driver).isDisplayed())
			{
				System.out.println("Entered into Loop");
				AnnouncementPage.btn_Annon_btnsendannon(driver).click();
				Thread.sleep(4000);
//				AnnouncementPage.txt_Annon_Messagetxtbox(driver).sendKeys(Message);
//				Thread.sleep(4000);
				if(AnnouncementPage.btn_Annon_cancel(driver).isDisplayed())
				{
					System.out.println("Cancel option is available");
					AnnouncementPage.btn_Annon_cancel(driver).click();
					Thread.sleep(4000);
					System.out.println("Cancel option is clicked and page is navigated back");
					AnnouncementPage.btn_Annon_btnsendannon(driver).click();
					Thread.sleep(4000);
					AnnouncementPage.txt_Annon_Messagetxtbox(driver).sendKeys(Message);
					Thread.sleep(4000);
				}
				else
				   	{
				   		System.out.println("Cancel button is not displayed");
				   	}
			if(AnnouncementPage.btn_Annon_save(driver).isDisplayed())
			{
				System.out.println("Send button is displayed");
				AnnouncementPage.btn_Annon_save(driver).click();
//				Thread.sleep(2500);
				driver.switchTo().alert().accept();
				Thread.sleep(10000);
				driver.switchTo().alert().accept();
				Thread.sleep(5000);
				String expected_message=Message;
				String actual_Message=AnnouncementPage.Annon_Messageviewbox(driver).getText();
				System.out.println(actual_Message);
				if((expected_message.equals(actual_Message)))
				{
					System.out.println("Values save sucessfully");
				}else
				{
					System.out.println("Values are not saved succesfully");
				}
				
			}
			else
			{
				System.out.println("Send button is not displayed");	
			}
						
			}else
			{
				System.out.println("Not Entered into Announcement Page");
			}
		}else
		{
			System.out.println("Announcement page is not displayed");
		}
		
	}
	public static void View_Announcement(WebDriver driver,String Message) throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		if(AnnouncementPage.chk_Annon_Annountitle(driver).isDisplayed() || AnnouncementPage.btn_Annon_btnsendannon(driver).isDisplayed())
		{
			System.out.println("Entered into Announcement Page");
			System.out.println("Checking for View button");
			if(AnnouncementPage.Annon_Search(driver).isDisplayed())
			{
            System.out.println("Search box is displayed");
            AnnouncementPage.Annon_Search(driver).sendKeys(Message);
            Thread.sleep(5000);
				AnnouncementPage.Annon_btn_view(driver).click();
				Thread.sleep(5000);
//				String xpath_message=Message;
////				String Actual_View_Text=driver.findElement(By.xpath("//TD[@class='hidden-phone'][text()='"+xpath_message+"']")).getText();
//				String Actual_View_Text=AnnouncementPage.Annon_view_message_box(driver).getText();
//				System.out.println(Actual_View_Text);	
//				String Expected_View_Text=Message;
//			    if(Expected_View_Text.equals(Actual_View_Text))
//			    {
//			    	System.out.println("Values are viewed succesfully");
//			    }else
//			    {
//			    	System.out.println("Values are not viewed successfully");
//			    }
				if(AnnouncementPage.Annon_view_Close_btn(driver).isDisplayed())
				{
					System.out.println("Close button is displayed and tried to click");
					AnnouncementPage.Annon_view_Close_btn(driver).click();
					Thread.sleep(5000);
					System.out.println("Closed Successfully");
					}
				else
				{
					System.out.println("Close button is not displayed");
				}
			}
			else
			{
				System.out.println("Search box is not displayed");
							}
}else
	{
    System.out.println("Not entered into announcement page");}
	}

public static void Delete_Announcement(WebDriver driver,String Message) throws Exception
{
	driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
	if(AnnouncementPage.chk_Annon_Annountitle(driver).isDisplayed() || AnnouncementPage.btn_Annon_btnsendannon(driver).isDisplayed())
	{
		System.out.println("Entered into Announcement Page");
		System.out.println("Checking for delete button");
		if(AnnouncementPage.Annon_Search(driver).isDisplayed())
		{
        System.out.println("Search box is displayed");
        AnnouncementPage.Annon_Search(driver).sendKeys(Message);
        Thread.sleep(5000);
		System.out.println("Delete button is displayed and tried to click it");
		AnnouncementPage.Annon_delete_btn(driver).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String xpath_message=Message;
//		if(AnnouncementPage.Annon_deleted_content(driver).isDisplayed())
				try {
//			WebElement Deleted_content=driver.findElement(By.xpath("//TD[@class=' '][text()='"+xpath_message+"']"));
			if((driver.findElement(By.xpath("//TD[@class=' '][text()='"+xpath_message+"']")).isDisplayed()))
	        {
				System.out.println("Content is not deleted");
	        }
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	    	System.out.println("Content is  deleted");
	    }
		}else
		{
			System.out.println("Content is not deleted Succesfully");}
		}
		else
		{
			System.out.println("Delete button is not displayed");
		}	
}
}


