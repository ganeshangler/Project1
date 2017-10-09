package pageObjects;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.Constants;
import utility.RepositoryParser;

public class HomePage {

	public static RepositoryParser parser=new RepositoryParser();
	private static WebElement element = null;

	public static WebElement Icon_aboutEvent (WebDriver driver) throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Icon_About"));
		return element;
	}

	public static WebElement Link_aboutEvent (WebDriver driver) throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Link_AboutEvent"));
		return element;
	}

	public static WebElement Link_Category(WebDriver driver) throws IOException
	{

		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Link_Category"));

		return element;

	}
	public static WebElement Icon_Masters(WebDriver driver) throws IOException
	{

		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Icon_Masters"));
		return element;

	}

	public static WebElement Link_Logout(WebDriver driver) throws IOException
	{

		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Link_Logout"));

		return element;

	}
	public static WebElement Icon_Logout(WebDriver driver) throws IOException
	{

		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Icon_Logout"));
		return element;

	}
	public static WebElement Link_Schedule(WebDriver driver) throws IOException
	{

		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Link_Schedule"));

		return element;

	}
	public static WebElement Icon_Schedule(WebDriver driver) throws IOException
	{

		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Icon_Schedule"));
		return element;

	}
	
	
	
	public static WebElement Link_News(WebDriver driver) throws IOException
	{

		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Link_News"));

		return element;

	}
	public static WebElement Icon_news(WebDriver driver) throws IOException
	{

		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Icon_news"));
		return element;

	}
	public static WebElement Link_Sponsor(WebDriver driver) throws IOException
	{

		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_Link"));

		return element;

	}
	public static WebElement Icon_Sponsor(WebDriver driver) throws IOException
	{

		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Icon_sponsor"));
		return element;

	}
	public static WebElement Link_Speaker(WebDriver driver) throws IOException
	{

		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Speaker_Link"));
		return element;

	}
	public static WebElement Icon_Speaker(WebDriver driver) throws IOException
	{

		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Icon_Speaker"));
		return element;

	}
	public static WebElement Link_Organizer(WebDriver driver) throws IOException
	{

		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Organizer_Link"));
		return element;

	}
	public static WebElement Icon_Organizer(WebDriver driver) throws IOException
	{

		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Icon_Organizer"));
		return element;

	}
}
