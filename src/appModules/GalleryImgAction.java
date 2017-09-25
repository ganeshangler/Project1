package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pageObjects.Gallery_Images;
import config.Constants;

public class GalleryImgAction {
	
		public static void AddImages(WebDriver driver) throws Exception{
			
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		Gallery_Images.GalleryBtn(driver).click();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
		Gallery_Images.GalleryImages(driver).click();
		
		
	}

}
