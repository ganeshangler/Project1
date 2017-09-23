package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import config.Constants;
import utility.RepositoryParser;

public class AboutEvent {
	
	public static RepositoryParser parser=new RepositoryParser();
	private static WebElement element = null;

	public static WebElement editIcon (WebDriver driver) throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
    	element = driver.findElement(parser.getLocator("IconEdit_AboutEvent"));
    	return element;
	}
	public static WebElement CancelButton(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		 element = driver.findElement(parser.getLocator("Event_Button_cancel"));
		return element;
	}
	public static WebElement SaveButton(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		 element = driver.findElement(parser.getLocator("Event_ButtonSave"));
		return element;

	}
	public static WebElement Description(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		 element = driver.findElement(parser.getLocator("Event_Description"));
		return element;

	}
	public static WebElement FacebookURL(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		 element = driver.findElement(parser.getLocator("Event_FacebookURL"));
		return element;

	}
	public static WebElement TwitterURL(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		 element = driver.findElement(parser.getLocator("Event_TwitterURL"));
		return element;

	}
	public static WebElement YoutubeURL(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		 element = driver.findElement(parser.getLocator("Event_YoutubeURL"));
		return element;

	}
	public static WebElement WebsiteURL(WebDriver driver) throws Exception
	{
	
		parser.RepositoryParser(Constants.path_ObjectRepo);
		 element = driver.findElement(parser.getLocator("Event_WebsiteURL"));
		return element;

	}
	public static WebElement GridValue(WebDriver driver) throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		 element = driver.findElement(parser.getLocator("Event_GridValue"));
		return element;

	}
}
