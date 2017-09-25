package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.RepositoryParser;
import config.Constants;

public class Category {
	public static WebDriver driver;

	public static RepositoryParser parser=new RepositoryParser();
	private static WebElement element = null;
	public static WebElement AddCategory (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Add_Category"));
		return element;

	}

	public static WebElement Button_save(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Category_ButtonSave"));
		return element;


	}
	public static WebElement Button_cancel(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Catregory_ButtonCancel"));
		return element;

	}


}
