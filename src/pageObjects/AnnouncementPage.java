package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.RepositoryParser;
import config.Constants;

public class AnnouncementPage {
	public static RepositoryParser parser=new RepositoryParser();
	private static WebElement element = null;

	public static WebElement chk_Annon_Annountitle(WebDriver driver) throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
    	element = driver.findElement(parser.getLocator("Annon_Annountitle"));
    	return element;
	}
	public static WebElement btn_Annon_btnsendannon(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		 element = driver.findElement(parser.getLocator("Annon_btnsendannon"));
		return element;
	}
	public static WebElement chk_Annon_Messagetitle(WebDriver driver) throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
    	element = driver.findElement(parser.getLocator("Annon_Messagetitle"));
    	return element;
	}
	public static WebElement txt_Annon_Messagetxtbox(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		 element = driver.findElement(parser.getLocator("Annon_Messagetxtbox"));
		return element;
	}
	public static WebElement btn_Annon_cancel(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		 element = driver.findElement(parser.getLocator("Annon_btn_cancel"));
		return element;
	}
	public static WebElement btn_Annon_save(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Annon_btn_save"));
		return element;
	}
	public static WebElement Annon_Messageviewbox(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Annon_Messageviewbox"));
		return element;
	}
	public static WebElement Annon_btn_view(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Annon_btn_view"));
		return element;
	}
	public static WebElement Annon_Search(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Annon_Search"));
		return element;
	}
	public static WebElement Annon_view_message_box(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Annon_view_message_box"));
		return element;
	}
	public static WebElement Annon_view_Close_btn(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Annon_view_Close_btn"));
		return element;
	}
	public static WebElement Annon_delete_btn(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Annon_delete_btn"));
		return element;
	}
	public static WebElement Annon_deleted_content(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Annon_deleted_content"));
		return element;
	}
}
