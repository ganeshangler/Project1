package appModules;
import java.util.ArrayList;

import java.util.concurrent.TimeUnit;
import utility.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import config.Constants;
import pageObjects.*;

public class AboutEventEditAction {
	static ArrayList<String> viewed_Actual=new ArrayList<String>();
	public static void Editnews(WebDriver driver,String FacebookURL,String TwitterURL ,String YoutubeURL,String WebSiteURL)throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);

		AboutEvent.editIcon(driver).click();
		//driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		WebElement ele = AboutEvent.CancelButton(driver);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		AboutEvent.editIcon(driver).click();
		AboutEvent.FacebookURL(driver).clear();
		utility.Utilis.ScrollDown();
		AboutEvent.TwitterURL(driver).clear();
		AboutEvent.YoutubeURL(driver).clear();
		utility.Utilis.ScrollDown();
		WebElement element =AboutEvent.WebsiteURL(driver);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
		element.clear();
		AboutEvent.FacebookURL(driver).sendKeys(FacebookURL);
		utility.Utilis.ScrollDown();
		AboutEvent.TwitterURL(driver).sendKeys(TwitterURL);
		AboutEvent.YoutubeURL(driver).sendKeys(YoutubeURL);
		utility.Utilis.ScrollDown();
		AboutEvent.WebsiteURL(driver).sendKeys(WebSiteURL);
		//driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		WebElement ele1=AboutEvent.SaveButton(driver);
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("window.scrollBy(0,250)", "");
		executor1.executeScript("arguments[0].click();", ele1);
		Utilis.capture(driver,"Aboutevent2");
		driver.switchTo().alert().accept();	
		String s=AboutEvent.GridValue(driver).getText();
		String[]  array = s.split("URL : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
			viewed_Actual.add(array[i]);
			System.out.println("Value of array list:"+viewed_Actual.get(i));

		}
		if(((viewed_Actual.get(1).contains(FacebookURL))&&(viewed_Actual.get(2).contains(TwitterURL))&&(viewed_Actual.get(3).contains(YoutubeURL))&&(viewed_Actual.get(4).contains(WebSiteURL))))
		{
			System.out.println("truecondition");
		}
		else
		{
			System.out.println("failcondition");
		}

	}
}


