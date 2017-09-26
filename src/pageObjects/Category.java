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
		element = driver.findElement(parser.getLocator("Category_ButtonCancel"));
		return element;
		
	}
	public static WebElement Textbox_Category(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Category_Textbox"));
		return element;
		
	}
	public static WebElement EditIcon_Category(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Category_EditIcon"));
		return element;
		
	}
	public static WebElement GridValue_Category(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Category_Gridvalue"));
		return element;
		
	}
	public static WebElement Activate_Category(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Category_Activate"));
		return element;
		
	}
	
	
	public static WebElement TextboxSearch_Category(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Category_Searchbox"));
		return element;
		
	}
	
	public static WebElement DeleteIcon_Category(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Category_DeleteIcon"));
		return element;
		
	}
	
	public static WebElement SearchGridValue_Category(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Category_SearchGridvalue"));
		return element;
		
	}
}
