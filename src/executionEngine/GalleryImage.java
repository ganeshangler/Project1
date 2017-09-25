package executionEngine;

import org.junit.Test;

import appModules.GalleryImgAction;
import appModules.HomePageAction;
import appModules.LoginAction;

public class GalleryImage  extends ChromeTest {
	
	@Test
	public void uploadImage() throws Exception{
		
		
		LoginAction.execute_Login(driver);
		HomePageAction.navigate_aboutEvent(driver);
		GalleryImgAction.AddImages(driver);
		
	}

}
