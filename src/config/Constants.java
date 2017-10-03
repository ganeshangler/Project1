package config;

public class Constants 
{
    public static final String baseUrl="http://192.168.0.13/showtime_club/admin_live";
    public static final String CHROME_DRIVER_EXEPATH =System.getProperty("user.dir")+ "\\src\\utility\\chromedriver.exe";
	public static final String CHROME_DRIVER ="webdriver.chrome.driver";
	public static final int implicitWaitSec = 60;
	public static String getPath_TestData=System.getProperty("user.dir")+"\\src\\testData\\";
	public static final String Path_TestData = getPath_TestData.replace("\\", "\\\\");
	public static String getPath_ObjectRepo=System.getProperty("user.dir")+"\\ObjectRepo.properties";
	public static final String path_ObjectRepo=getPath_ObjectRepo.replace("\\", "\\\\");
    public static final String File_TestData = "TestData.xls";
	public static final String File_AboutEventsheet_name="AboutEvent";
	public static final String File_Categorysheet_name="Category";
	public static final String File_Schedulesheet_name="Schedule";
	public static final String File_Newssheet_name="News";
}

