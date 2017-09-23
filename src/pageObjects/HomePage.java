package pageObjects;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import pageObjects.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static WebDriver driver;
	public FileInputStream stream;
	public static Properties prop=new Properties();
	public static WebElement element = null;
 public static void loadProperty1() throws IOException
	  {
	  	FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\utility\\ObjectRepo.properties");
	  	prop.load(objfile);
	  }
	public static WebElement Icon_aboutEvent(WebDriver driver) throws IOException
	{
		loadProperty1();
		 element = driver.findElement(By.xpath(prop.getProperty("Icon_About")));
		return element;

	}
	public static WebElement Link_aboutEvent(WebDriver driver) throws IOException
	{
	
		loadProperty1();
		 element = driver.findElement(By.xpath(prop.getProperty("Link_AboutEvent")));
		return element;

	}
}
