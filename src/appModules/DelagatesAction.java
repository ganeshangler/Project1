package appModules;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import pageObjects.*;
import org.openqa.selenium.WebDriver;

import utility.Utilis.TEST_RESULT;
import config.Constants;

public class DelagatesAction {
	public static void addcategorymaster(WebDriver driver) throws IOException, InterruptedException
	{
	
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		DelegatesPage.Button_AddDelegates(driver).click();
		Thread.sleep(3000);
		utility.Utilis.ScrollDown(driver);
		utility.Utilis.ScrollDown(driver);
		DelegatesPage.Button_Cancel(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		Thread.sleep(1000);
		DelegatesPage.Button_AddDelegates(driver).click();

}
}