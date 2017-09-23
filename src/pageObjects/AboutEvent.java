package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutEvent {
	public static WebDriver driver;
	public FileInputStream stream;
	public static Properties prop=new Properties();
	public static WebElement element = null;
 public static void loadProperty1() throws IOException
	  {
	  	FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\utility\\ObjectRepo.properties");
	  	prop.load(objfile);
	  }
	public static WebElement editIcon (WebDriver driver) throws IOException
	{
		loadProperty1();
		 element = driver.findElement(By.xpath(prop.getProperty("IconEdit_AboutEvent")));
		return element;

	}
	public static WebElement CancelButton(WebDriver driver) throws IOException
	{
	
		loadProperty1();
		 element = driver.findElement(By.xpath(prop.getProperty("Event_Button_cancel")));
		return element;

	}
	public static WebElement SaveButton(WebDriver driver) throws IOException
	{
	
		loadProperty1();
		 element = driver.findElement(By.id(prop.getProperty("Event_ButtonSave")));
		return element;

	}
	public static WebElement Description(WebDriver driver) throws IOException
	{
	
		loadProperty1();
		 element = driver.findElement(By.xpath(prop.getProperty("Event_Description")));
		return element;

	}
	public static WebElement FacebookURL(WebDriver driver) throws IOException
	{
	
		loadProperty1();
		 element = driver.findElement(By.id(prop.getProperty("Event_FacebookURL")));
		return element;

	}
	public static WebElement TwitterURL(WebDriver driver) throws IOException
	{
	
		loadProperty1();
		 element = driver.findElement(By.id(prop.getProperty("Event_TwitterURL")));
		return element;

	}
	public static WebElement YoutubeURL(WebDriver driver) throws IOException
	{
	
		loadProperty1();
		 element = driver.findElement(By.id(prop.getProperty("Event_YoutubeURL")));
		return element;

	}
	public static WebElement WebsiteURL(WebDriver driver) throws IOException
	{
	
		loadProperty1();
		 element = driver.findElement(By.id(prop.getProperty("Event_WebsiteURL")));
		return element;

	}
	public static WebElement GridValue(WebDriver driver) throws IOException
	{
	
		loadProperty1();
		 element = driver.findElement(By.xpath(prop.getProperty("Event_GridValue")));
		return element;

	}
}
