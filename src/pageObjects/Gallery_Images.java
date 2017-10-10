package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.RepositoryParser;
import config.Constants;

public class Gallery_Images {
	
	public static RepositoryParser parser=new RepositoryParser();
	private static WebElement element = null;

	public static WebElement GalleryBtn (WebDriver driver) throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
    	element = driver.findElement(parser.getLocator("sidebarGallery"));
    	return element;
	}
	public static WebElement GalleryImages (WebDriver driver) throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
    	element = driver.findElement(parser.getLocator("galleryImages"));
    	return element;
	}public static WebElement UploadBtn (WebDriver driver) throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
    	element = driver.findElement(parser.getLocator("uploadBtn"));
    	return element;
	}

}
