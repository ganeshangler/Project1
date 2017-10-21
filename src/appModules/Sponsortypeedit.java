package appModules;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import config.Constants;
import pageObjects.Sponsortype;


public class Sponsortypeedit {
	public static 	WebElement Sponsortable;
	public static List<WebElement> rowcount,columncount;
	public static Alert alert;
	public static int r,c,i;
	// To find the table in the page
	// Find table by ID
    
	
	public static void editSponsortype(WebDriver driver,String sponsorType, String editedvalue)throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		
		//Sponsortable= driver.findElement(By.id("sponsor_type"));
		Sponsortable=Sponsortype.sponsorTypeTable(driver);
		
		//locate row with xpath 
		//rowcount=Sponsortable.findElements(By.xpath("//*[@id='sponsor_type']/tbody/tr"));
		
		rowcount=Sponsortable.findElements(By.xpath("//*[@id='sponsor_type']/tbody/tr"));
		
		r = rowcount.size();
		
		System.out.println("Rowcount"+r);
		
		//locate number of column
		columncount=Sponsortable.findElements(By.tagName("th"));
		
	    c= columncount.size();
		
		System.out.println("Columncount"+c);
		
		// get the value of the each column.
		
		// Saving list webelement as a single webelement to itreate all the column.
		
				
		for (i=1;i<=r;i++)	{
			//for(int j=1;j<=c;)
			//{
				WebElement Cellvalue= driver.findElement(By.xpath(".//*[@id='sponsor_type']/tbody/tr["+i+"]/td[2]"));
				
//				
			String cell = Cellvalue.getText();
//				
				String cell1= sponsorType;
				
				//System.out.println("Cellvalue : "+Cellvalue.getText());
				if (cell1.equals(cell))
				{
					System.out.println("Cellvalue : ");
					System.out.println("Cellvalue IF : "+Cellvalue.getText());
					WebElement cellEdit= driver.findElement(By.xpath(".//*[@id='sponsor_type']/tbody/tr["+i+"]/td[4]/button[@data-original-title='Edit']"));

					cellEdit.click();
					Thread.sleep(5000);
					Sponsortype.SponsortypeInput(driver).clear();
					
					System.out.println("Data has been cleared");
											
					Sponsortype.SponsortypeInput(driver).sendKeys(editedvalue);
					
					Thread.sleep(1500);
					
					Sponsortype.SaveSponsortype(driver).click();
					
					Thread.sleep(1500);
					
					System.out.println("Data has been saved and edited successfully");
					
					alert=driver.switchTo().alert();
					
					alert.accept();
					
				    Thread.sleep(1500);
					
					break;
				}
				else
				{
					System.out.println("Cellvalue ELSE : "+Cellvalue.getText());
				}
		}

	
	}
	
	public static void deleteSponsortype(WebDriver driver)throws Exception
	{
        driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		
		//Sponsortable= driver.findElement(By.id("sponsor_type"));
        
        Sponsortable=Sponsortype.sponsorTypeTable(driver);
		
		rowcount=Sponsortable.findElements(By.xpath("//*[@id='sponsor_type']/tbody/tr"));
		
	     r = rowcount.size();
		
		System.out.println("Rowcount"+r);
		
		columncount=Sponsortable.findElements(By.tagName("th"));
		
	    c= columncount.size();
		
		System.out.println("Columncount"+c);
			
		for (i=1;i<=r;i++)	
		{
			
		       WebElement Cellvalue= driver.findElement(By.xpath(".//*[@id='sponsor_type']/tbody/tr["+i+"]/td[2]"));
				
		    	String cell = Cellvalue.getText();
			
				String cell1= "SAMPLE";
				
				//System.out.println("Cellvalue : "+Cellvalue.getText());
				if (cell1.equals(cell)) {
					System.out.println("Cellvalue : ");
					
					System.out.println("Cellvalue IF : "+Cellvalue.getText());
					
					WebElement cellEdit= driver.findElement(By.xpath(".//*[@id='sponsor_type']/tbody/tr["+i+"]/td[4]/button[@data-original-title='Delete']"));
					
					cellEdit.click();	
					
					Thread.sleep(1500);
					
					System.out.println("Delete selected");
					
					alert=driver.switchTo().alert();
					Thread.sleep(1500);
					
					alert.dismiss();
					
					Thread.sleep(1500);
					
					System.out.println("Delete has been  cancelled");  
					
					cellEdit= driver.findElement(By.xpath(".//*[@id='sponsor_type']/tbody/tr["+i+"]/td[4]/button[@data-original-title='Delete']"));
					
					cellEdit.click();
					
					Thread.sleep(1500);
					
					alert=driver.switchTo().alert();
					
					Thread.sleep(1500);
					
                    alert.accept();
                    
                    Thread.sleep(1500);
					
					System.out.println("Delete has been done successfully");  
					
					break;
				}
				else
				{
					System.out.println("Cellvalue ELSE : "+Cellvalue.getText());
				}
		}
	}
	public static void inactiveSponsortype(WebDriver driver)throws Exception
	{
         driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		
		Sponsortable= driver.findElement(By.id("sponsor_type"));
		
		rowcount=Sponsortable.findElements(By.xpath("//*[@id='sponsor_type']/tbody/tr"));
		
	     r = rowcount.size();
		
		System.out.println("Rowcount"+r);
		
		columncount=Sponsortable.findElements(By.tagName("th"));
		
	    c= columncount.size();
		
		System.out.println("Columncount"+c);
			
		for (i=1;i<=r;i++)	
		{
			
		       WebElement Cellvalue= driver.findElement(By.xpath(".//*[@id='sponsor_type']/tbody/tr["+i+"]/td[2]"));
				
		    	String cell = Cellvalue.getText();
			
				String cell1= "SAMPLE1";
				
				//System.out.println("Cellvalue : "+Cellvalue.getText());
				if (cell1.equals(cell)) {
					
					System.out.println("Cellvalue : ");
					
					System.out.println("Cellvalue IF : "+Cellvalue.getText());
					
					 //WebElement cellEdit= driver.findElement(By.xpath(".//*[@id='sponsor_type']/tbody/tr["+i+"]/td[4]/button[@class='btn btn-warning btn-xs btn_tooltip']"));
					
			
					WebElement cellEdit=driver.findElement(By.xpath("//tr["+i+"]/td[4]/span/button[contains(@id,changeStatus)]"));
					
					System.out.println("Active icon found");
										
					cellEdit.click();	
																
					System.out.println("In -activated selected");
					
					Thread.sleep(1500);
					
					break;
				}
				else
				{
					System.out.println("Cellvalue ELSE : "+Cellvalue.getText());
				}
		}
	}
	 public static void sortSponsortype(WebDriver driver)throws Exception
	 {
		 driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		 
		 // Accessing SortSponsortype button
		 Sponsortype.sponsorTypesort(driver).click();
		 System.out.println("Sortwindow has been opened");
		 Thread.sleep(1000);
		
		 /*
		 // Save option in sort window
		 Sponsortype.saveSponsortypesort(driver).click();
		 Thread.sleep(1000);
		 alert=driver.switchTo().alert();
		 Thread.sleep(1000);
		 alert.accept();
		 System.out.println("Save has been done successfully");*/
		 
		 //Close option in the sort window
		// Sponsortype.sponsorTypesort(driver).click();
		 //Thread.sleep(1000);
		// Sponsortype.cancelSponsortypesort(driver).click();
		 //System.out.println("Sort has been closed successfully");
		// Thread.sleep(1500);
		 
		//Sponsortype.sponsorTypesort(driver).click();
		// System.out.println("Sortwindow has been opened");
		// Thread.sleep(1000);
		 
		 // Finding Ordered list frame in sort window
		 WebElement sponsortypelist=driver.findElement(By.xpath("//OL[@class='sortable ui-sortable']"));
		 System.out.println("Orderedlist has been found");
		 Thread.sleep(1000);
		 
		 // Finding list of li elements
		 List<WebElement> listitems=sponsortypelist.findElements(By.tagName("li"));
		 System.out.println("List items under OL has been found");
		 
		 
		 // Counting the number of list items.
		 int sortcount;
		 sortcount=listitems.size();
		 System.out.println("Count of items="+sortcount);
		 
		 Thread.sleep(5000);
		 
		 //Sorting elements
		 //Finding the source and destination.
		 
		 
		 WebElement source=driver.findElement(By.xpath("(//LI[@class='sort_list'])[1]"));
		 
		 WebElement destination=driver.findElement(By.xpath("(//LI[@class='sort_list'])[7]"));
		 
		 //Used when keyboard/mouse uses extended functionality like drag and drop
		 //Actions -Group of actions
		// Actions sort= new Actions(driver);
		// sort.dragAndDrop(source, destination).release(destination).build().perform();
		// sort.moveToElement(source).clickAndHold().dragAndDrop(source, destination).
		// release(destination).perform();
		 
		
		 
		/*
		 //Action-Single action
		 //Action dragAnddrop=*/
				/* sort.clickAndHold(source).build().perform();
				 sort.moveToElement(destination).build().perform();
				 sort.release(destination).build().perform();*/
				 
				// sort.clickAndHold(source).
				 
		// sort.release(destination).build();
		 //sort.perform();

		 
		 /*------------------------------------------------*/
		// Actions sort= new Actions(driver);
		//Action dragdrop=sort.clickAndHold(source).moveToElement(destination).release(destination).build();
		//dragdrop.perform();
		 /*------------------------------------------------*/
		 Actions sort= new Actions(driver);
		/*System.out.println("tried to click");
//		 sort.dragAndDrop(source, destination);
		sort.clickAndHold(source).perform();
		Thread.sleep(2000);
		sort.moveToElement(destination).perform();
		sort.release(destination).perform();
		Thread.sleep(2000);
		sort.build().perform();
		 System.out.println("clicked");*/
		 sort.clickAndHold(source).moveToElement(destination).perform();
		 
		 Thread.sleep(5000);
//		 sort.moveToElement(destination).perform();
//		 
//		 sort.release(destination).build().perform();
		 
		
		 
		 		 
		 System.out.println("Sort has been done successfully");
		 Thread.sleep(1500);
	     Sponsortype.saveSponsortypesort(driver).click();
		 Thread.sleep(1000);
		 alert=driver.switchTo().alert();
		 Thread.sleep(1000);
		 alert.accept();
		 System.out.println("Save has been done successfully");
		 
		 
		 
	 }
		
	}
	

