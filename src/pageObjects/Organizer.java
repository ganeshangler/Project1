package pageObjects;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.RepositoryParser;
import config.Constants;

public class Organizer {
	public static RepositoryParser parser=new RepositoryParser();
	private static WebElement element = null;
	public static WebElement Button_Add (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_Add"));
		return element;

	}
	public static WebElement Textbox_Organizer (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_Name"));
		return element;

	}
	public static WebElement Button_LogoImage (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_Logo"));
		return element;

	}
	public static WebElement Textbox_Description (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_Description"));
		return element;

	}
	public static WebElement Textbox_FbURL (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_FbURL"));
		return element;

	}
	public static WebElement Textbox_TwitterURL (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_TwitterURL"));
		return element;

	}
	public static WebElement Textbox_WebsiteURL (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_WebsiteURL"));
		return element;

	}
	public static WebElement Button_Save (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_Save"));
		return element;

	}
	public static WebElement Button_Cancel (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_Cancel"));
		return element;

	}
	public static WebElement Button_RemoveImage (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_RemoveImage"));
		return element;

	}
	public static WebElement Textbox_SearchText (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_SearchTextbox"));
		return element;

	}
	public static WebElement GridText_OrganizerName (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_GridText"));
		return element;

	}
	public static WebElement Icon_ViewOrganizer (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_ViewIcon"));
		return element;

	}
	public static WebElement Icon_ActivateOrganizer (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_ActivateIcon"));
		return element;

	}
	public static WebElement Icon_EditOrganizer (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_EditIcon"));
		return element;

	}
	public static WebElement Icon_DeleteOrganizer (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_DeleteIcon"));
		return element;

	}
	
	public static WebElement Button_ViewOK (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_ViewOK"));
		return element;

	}
}
