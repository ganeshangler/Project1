<<<<<<< HEAD
package utility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import config.Constants;
public class Utilis {
	protected static WebDriver driver;
	
	 @BeforeClass
	 public void  OpenBrowse () {
			
			driver= new FirefoxDriver();
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    driver.get(Constants.baseUrl);

		}
	public static void  ScrollDown() {		
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,450)", "");
    	return;
	}
	public static String capture(WebDriver driver,String screenShotName) throws IOException
    {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir") +"\\Screenshots\\"+screenShotName+".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);                         
        return dest;
    }
	public static WebDriver ExecuteorClick (WebDriver driver,WebElement ele) throws IOException
    {
          JavascriptExecutor executor = (JavascriptExecutor)driver;
          executor.executeScript("arguments[0].click();", ele);
          return  driver;
    }
	public static enum TEST_RESULT 
	{
		RESULT_SUCCESS
		{
			@Override
			public String toString()
			{
				return "Success";
			}
		},	
		RESULT_FAILURE
		{
			@Override
			public String toString()
			{
				return "Failure";
			}
		},
		RESULT_ERROR
		{
			@Override
			public String toString()
			{
				return "Error";
			}
		}, 
	}

}
=======
package utility;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import config.Constants;
public class Utilis {
	public static WebDriver driver;

	public  static enum TEST_RESULT 
	{
		RESULT_SUCCESS
		{
			@Override
			public String toString()
			{
				return "Success";
			}
		},	
		RESULT_FAILURE
		{
			@Override
			public String toString()
			{
				return "Failure";
			}
		},
		RESULT_ERROR
		{
			@Override
			public String toString()
			{
				return "Error";
			}
		}, 
	}
	 public static WebDriver  ScrollDown(WebDriver driver) {

			JavascriptExecutor jsx = (JavascriptExecutor)driver;
			jsx.executeScript("window.scrollBy(0,450)", "");
			return  driver;
		}
	public static String capture(WebDriver driver, String screenShotName) throws IOException, InterruptedException
    {
        Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir") +"\\Screenshots\\"+screenShotName+".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);                         
        return dest;
    }
	public static WebDriver ExecuteorClick (WebDriver driver,WebElement ele) throws IOException
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		return  driver;
	}
	 public static WebDriver  ScrolUp(WebDriver driver) {

			JavascriptExecutor jsx = (JavascriptExecutor)driver;
			jsx.executeScript("window.scrollBy(450,0)", "");
			return  driver;
		}
}


>>>>>>> Indu_Showtime
