package pageObjects;
import java.io.IOException;

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
	public static WebElement Annon_Icon (WebDriver driver) throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
    	element = driver.findElement(parser.getLocator("Annon_Icon"));
    	return element;
	}
	
	public static WebElement Annon_Announbutton (WebDriver driver) throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
    	element = driver.findElement(parser.getLocator("Annon_Announbutton"));
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


}
