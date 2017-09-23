package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {


	public static WebDriver driver;
	public FileInputStream stream;
	public static Properties prop=new Properties();
	public static WebElement element = null;

public static void loadProperty() throws IOException
{
	FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\utility\\ObjectRepo.properties");
	prop.load(objfile);
}
	public static WebElement TxtBox_username(WebDriver driver) throws IOException
	{
		loadProperty();
		 element = driver.findElement(By.id(prop.getProperty("TxtBox_Username")));
		return element;

	}

	public static WebElement TxtBox_password(WebDriver driver) throws IOException{
		loadProperty();
		 element = driver.findElement(By.id(prop.getProperty("TxtBox_Password")));
		return element;

	}


	public static WebElement Btn_Login(WebDriver driver) throws IOException {
		loadProperty();
		element = driver.findElement(By.name(prop.getProperty("Btn_Login"))); 
		return element;

	}


}

