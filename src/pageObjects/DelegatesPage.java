package pageObjects;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.RepositoryParser;
import config.Constants;

public class DelegatesPage {
	public static RepositoryParser parser=new RepositoryParser();
	private static WebElement element = null;

	public static WebElement Button_AddDelegates (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Add"));
		return element;

	}
	public static WebElement Textbox_Username (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Username"));
		return element;

	}
	public static WebElement Textbox_Password (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_password"));
		return element;

	}
	public static WebElement Textbox_Title (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Title"));
		return element;

	}

	public static WebElement Textbox_Firstname (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Firstname"));
		return element;

	}
	public static WebElement Textbox_Lastname (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Lastname"));
		return element;

	}
	public static WebElement Textbox_Designation (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Designation"));
		return element;

	}
	public static WebElement Textbox_Firm (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Firm"));
		return element;

	}


	public static WebElement Textbox_TwitterURL (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_TwitterURL"));
		return element;

	}
	public static WebElement Textbox_LinkedinURL (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_LinkedinURL"));
		return element;

	}
	public static WebElement Textbox_WebsiteURL(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_WebsiteURL"));
		return element;

	}
	public static WebElement Textbox_FacebookURL (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_FacebookURL"));
		return element;

	}
	public static WebElement Textbox_Role(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Role"));
		return element;

	}


	public static WebElement Textbox_Industry(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Industry"));
		return element;

	}
	public static WebElement Textbox_Email (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Email"));
		return element;

	}
	public static WebElement Textbox_Mobile(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Mobile"));
		return element;

	}
	public static WebElement Textbox_Description (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Description"));
		return element;

	}

	public static WebElement Button_Image (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Image"));
		return element;

	}
	public static WebElement Button_Save (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Save"));
		return element;

	}
	public static WebElement Button_Cancel (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Cancel"));
		return element;

	}

	public static WebElement Button_RemoveImage (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_RemoveImage"));
		return element;

	}
	public static WebElement Textbox_Search (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_Search"));
		return element;

	}
	public static WebElement Icon_View (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_ViewIcon"));
		return element;

	}
	public static WebElement Icon_Activate (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_ActivateIcon"));
		return element;

	}
	public static WebElement Icon_Edit (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_EditIcon"));
		return element;

	}
	
	
	public static WebElement Label_Name (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Delegates_LabelName"));
		return element;

	}

}
