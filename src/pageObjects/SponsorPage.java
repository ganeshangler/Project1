package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.RepositoryParser;
import config.Constants;

public class SponsorPage {
	public static RepositoryParser parser=new RepositoryParser();
	private static WebElement element = null;
	public static WebElement Button_AddSponsor (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_Add"));
		return element;

	}
	public static WebElement Button_SelectImage (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_Image"));
		return element;

	}
	public static WebElement Textbox_SponsorName (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_Name"));
		return element;

	}
	public static WebElement Selectbox_SponsorType (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_Type"));
		return element;

	}
	public static WebElement Textbox_Twitter (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_Twitter"));
		return element;

	}
	public static WebElement Textbox_Linkedin (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_Linkedin"));
		return element;

	}
	public static WebElement Textbox_WebsiteURL (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_WebsiteURL"));
		return element;

	}
	public static WebElement Textbox_description (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_description"));
		return element;

	}
	public static WebElement ChooseFile_Pdf (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_pdf"));
		return element;

	}
	public static WebElement ChooseFile_Ppt (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_ppt"));
		return element;

	}
	public static WebElement ChooseFile_Doc (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_doc"));
		return element;

	}
	public static WebElement Button_Save (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_save"));
		return element;

	}
	public static WebElement Button_Cancel (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_cancel"));
		return element;

	}
	
	
	public static WebElement GridText_SponsorName (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_GridSponsorname"));
		return element;

	}
	public static WebElement Icon_EditSponsor (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_EditIcon"));
		return element;

	}
	public static WebElement Icon_RemoveSponsorImage (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_RemoveImageIcon"));
		return element;

	}

	
	public static WebElement Icon_ActivateSponsor (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_ActivateIcon"));
		return element;

	}

	public static WebElement Textbox_Searchname (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_searchText"));
		return element;

	}

	public static WebElement Icon_ViewSponsor (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_ViewIcon"));
		return element;

	}

	public static WebElement Button_ViewOK (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_ViewOKButton"));
		return element;

	}
	public static WebElement Icon_DeleteSponsor (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Sponsor_Deletecon"));
		return element;

	}


}
