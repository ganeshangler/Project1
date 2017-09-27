package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.RepositoryParser;
import config.Constants;

public class SchedulePage {
	public static RepositoryParser parser=new RepositoryParser();
	private static WebElement element = null;
	public static WebElement Button_Add (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Schedule_Add"));
		return element;

	}
	public static WebElement Selectbox_ScheduleCategory (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Schedule_Category"));
		return element;

	}
	public static WebElement Textbox_ScheduleVenue (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Schedule_Venu"));
		return element;

	}
	public static WebElement Textbox_ScheduleFromdate (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Schedule_Fromdate"));
		return element;

	}
	public static WebElement Textbox_ScheduleTodate (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Schedule_Todate"));
		return element;

	}
	public static WebElement Textbox_ScheduleTodateValue (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Schedule_ToDateValue"));
		return element;

	}
	public static WebElement Textbox_ScheduleTitle(WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Schedule_Title"));
		return element;

	}
	public static WebElement Textbox_ScheduleDescription (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Schedule_description"));
		return element;

	}
	public static WebElement Radio_Schedule_Speaker (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Schedule_Speaker"));
		return element;

	}
	public static WebElement Selectbox_ScheduleSpeakerValue (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Schedule_SpeakerValue"));
		return element;

	}
	public static WebElement Radio_ScheduleAudio (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Scdeule_Audio"));
		return element;

	}
	public static WebElement Browse_ScheduleAudioValue (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Schedule_EnglishAudio"));
		return element;

	}
	public static WebElement Textbox_ScheduleAudioDesc (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Schedule_AudioDesc"));
		return element;

	}
	public static WebElement Button_ScheduleSave (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Schedule_save"));
		return element;

	}
	public static WebElement Button_ScheduleCancel (WebDriver driver) throws IOException
	{
		parser.RepositoryParser(Constants.path_ObjectRepo);
		element = driver.findElement(parser.getLocator("Schedule_cancel"));
		return element;

	}
}
