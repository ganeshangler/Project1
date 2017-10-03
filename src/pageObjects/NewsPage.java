package pageObjects;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.RepositoryParser;
import config.Constants;
public class NewsPage {


		public static RepositoryParser parser=new RepositoryParser();
		private static WebElement element = null;
		public static WebElement Button_SendNews (WebDriver driver) throws IOException
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			element = driver.findElement(parser.getLocator("News_SendNews"));
			return element;

		}
		public static WebElement Button_Save (WebDriver driver) throws IOException
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			element = driver.findElement(parser.getLocator("News_save"));
			return element;

		}
		public static WebElement Button_Cancel (WebDriver driver) throws IOException
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			element = driver.findElement(parser.getLocator("News_cancel"));
			return element;

		}
		public static WebElement Textbox_NewsTitle (WebDriver driver) throws IOException
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			element = driver.findElement(parser.getLocator("News_title"));
			return element;

		}
		public static WebElement Textbox_NewsDateTime (WebDriver driver) throws IOException
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			element = driver.findElement(parser.getLocator("News_DateTime"));
			return element;

		}
		public static WebElement Textbox_NewsDescription (WebDriver driver) throws IOException
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			element = driver.findElement(parser.getLocator("News_Description"));
			return element;

		}
		public static WebElement Browse_NewsImgae (WebDriver driver) throws IOException
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			element = driver.findElement(parser.getLocator("News_ImageURL"));
			return element;

		}
		
		public static WebElement GrdText_Titlevalue (WebDriver driver) throws IOException
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			element = driver.findElement(parser.getLocator("News_GridTitle"));
			return element;

		}
		
		public static WebElement Icon_Editnews(WebDriver driver) throws IOException
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			element = driver.findElement(parser.getLocator("News_EditIcon"));
			return element;

		}
		
		public static WebElement Button_ImageRemove(WebDriver driver) throws IOException
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			element = driver.findElement(parser.getLocator("News_ImageRemove"));
			return element;

		}
		public static WebElement Textbox_Titlesearch(WebDriver driver) throws IOException
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			element = driver.findElement(parser.getLocator("News_search"));
			return element;

		}
		public static WebElement Icon_ViewNews(WebDriver driver) throws IOException
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			element = driver.findElement(parser.getLocator("News_IconView"));
			return element;

		}
		public static WebElement Button_ViewOK(WebDriver driver) throws IOException
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			element = driver.findElement(parser.getLocator("News_Viewok"));
			return element;

		}
		
		public static WebElement Icon_DeleteNews(WebDriver driver) throws IOException
		{
			parser.RepositoryParser(Constants.path_ObjectRepo);
			element = driver.findElement(parser.getLocator("News_DeleteIcon"));
			return element;

		}
}
