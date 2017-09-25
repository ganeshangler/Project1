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

}
