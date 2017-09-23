package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import config.Constants;
import utility.RepositoryParser;

public class LoginPage {
	
	public static RepositoryParser parser=new RepositoryParser();
	private static WebElement element = null;

	public static WebElement TxtBox_username (WebDriver driver) throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
    	element = driver.findElement(parser.getLocator("TxtBox_Username"));
    	return element;
	}

	public static WebElement TxtBox_password (WebDriver driver) throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
    	element = driver.findElement(parser.getLocator("TxtBox_Password"));
    	return element;
	}

	public static WebElement Btn_Login (WebDriver driver) throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
    	element = driver.findElement(parser.getLocator("Btn_Login"));
    	return element;
	}
}

