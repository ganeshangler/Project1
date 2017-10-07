package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.RepositoryParser;
import config.Constants;

public class Speaker {
	public static RepositoryParser parser=new RepositoryParser();
	private static WebElement element = null;
	public static WebElement Button_AddSpeaker (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_Add"));
		return element;

	}

	public static WebElement Textbox_FirstName (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_Firstname"));
		return element;

	}
	public static WebElement Textbox_LastName (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_Lastname"));
		return element;

	}
	public static WebElement TextBox_Desgination (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_desgination"));
		return element;

	}
	public static WebElement Textbox_Firm (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_Firm"));
		return element;

	}


	public static WebElement Textbox_TwitterURL (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_TwitterURL"));
		return element;

	}
	public static WebElement Textbox_LinkedinURL (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_LinkedinURL"));
		return element;

	}
	public static WebElement Textbox_WebsiteURL (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_WebsiteURL"));
		return element;

	}
	public static WebElement Textbox_FacebookURL (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_FacebookURL"));
		return element;

	}
	public static WebElement Textbox_Role (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_Role"));
		return element;

	}
	public static WebElement Textbox_Industry (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_Industry"));
		return element;

	}
	public static WebElement Textbox_Mobile (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_Mobile"));
		return element;

	}
	public static WebElement Textbox_Email (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_Email"));
		return element;

	}

	public static WebElement Textbox_Description (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_Description"));
		return element;

	}
	public static WebElement Browsebutton_Image (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_BrowseImgae"));
		return element;

	}
	public static WebElement Button_Cancel (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_Cancel"));
		return element;

	}
	public static WebElement Button_Save (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_save"));
		return element;

	}

	public static WebElement GridText_Speaker (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_GridText"));
		return element;

	}
	
	public static WebElement Icon_EditSpeaker (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_EditIcon"));
		return element;

	}
	public static WebElement Icon_RemoveSpeakerImage (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_RemoveImageIcon"));
		return element;

	}
}
