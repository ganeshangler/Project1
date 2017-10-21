package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.Constants;
import utility.RepositoryParser;

public class Sponsortype {
	public static List<WebElement> sponsortypecolumn;
	public static List<WebElement> sponsortyperow;
	public static WebElement sponsortypetable,Button_sponsortypesort;
	
	// Creating a object for the repository parser
	public static RepositoryParser parser=new RepositoryParser();
	
	//Creating webelement initialized as null
	
	private static WebElement element = null; 
	
	// Define Method to locate the element which returns Webelement as its result
	public static WebElement SponsortypeInput(WebDriver driver)throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		
    	element = driver.findElement(parser.getLocator("Sponsortype_Input"));
    	
    	return element;
	}
	
	public static WebElement FindMasters(WebDriver driver)throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		
    	element = driver.findElement(parser.getLocator("Masters_Menu"));
    	
    	return element;
	}
	
	public static WebElement FindSponsortype(WebDriver driver)throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		
    	element = driver.findElement(parser.getLocator("Sponsortype_Submenu"));
    	
    	return element;
	}
	
	// Method to ADD Sponsor type
	public static WebElement AddSponsortype(WebDriver driver)throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		
    	element = driver.findElement(parser.getLocator("Sponsortype_Button_Add"));
    	
    	return element;
	}
	public static WebElement CancelSponsortype(WebDriver driver)throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		
    	element = driver.findElement(parser.getLocator("Sponsortype_Button_Cancel"));
    	
    	return element;
	}
	public static WebElement SaveSponsortype(WebDriver driver)throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		
    	element = driver.findElement(parser.getLocator("Sponsortype_Button_Save"));
    	
    	return element;
	}
	public static WebElement EditSponsortype(WebDriver driver)throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		
    	element = driver.findElement(parser.getLocator("Sposnsortype_Icon_Edit"));
    	
    	return element;
	}
	public static WebElement DeleteSponsortype(WebDriver driver)throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		
    	element = driver.findElement(parser.getLocator("Sponsortype_Icon_Delete"));
    	
    	return element;
	}
	/* Finding number of columns in the table.
	public static WebElement Columncount(WebDriver driver)throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		
		col =driver.findElements(parser.getLocator("Sponsortype_Column"));
		
		return element;
	}
	
	// Finding number of rows in the table.
		public static WebElement Rowcount(WebDriver driver)throws Exception
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			
			row =driver.findElements(parser.getLocator("Sponsortype_Row"));
			
			return element;
		}*/
	public static WebElement sponsorTypeTable(WebDriver driver)throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		
		sponsortypetable =driver.findElement(parser.getLocator("Sponsortype_Table"));
		
		return element;
	}
	public static WebElement sponsorTypeRow(WebDriver driver)throws Exception
	{
        parser.RepositoryParser(Constants.path_ObjectRepo);
		
		sponsortyperow =driver.findElements(parser.getLocator("Sponsortype_Table"));
		
		return element;
	}
	public static WebElement sponsorTypesort(WebDriver driver)throws Exception
	{
        parser.RepositoryParser(Constants.path_ObjectRepo);
		
		element =driver.findElement(parser.getLocator("Sponsortype_Button_Sort"));
		
		return element;
	}
	public static WebElement saveSponsortypesort(WebDriver driver)throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element= driver.findElement(parser.getLocator("Sponsortype_Button_SortSave"));
		return element;
		
	}
	public static WebElement cancelSponsortypesort(WebDriver driver)throws Exception
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element= driver.findElement(parser.getLocator("Sponsortype_Button_SortCancel"));
		return element;
		
	}
}
