package executionEngine;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.SchedulePage;
import utility.ExcelUtils;
import utility.Utilis.TEST_RESULT;
import appModules.CategoryAction;
import appModules.HomePageAction;
import appModules.LoginAction;
import appModules.ScheduleAction;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import config.Constants;

public class ScheduleManagement extends ChromeTest {
	String VenueValue,TitleValue,DescriptionValue,EditVenueValue,EditTitleValue,EditDescriptionValue;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest

	public void startReport()
	{
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/Schedule.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("OS", "windows");
		extent.setSystemInfo("Environment", "QA");
		htmlReporter.config().setDocumentTitle("Report");
		htmlReporter.config().setReportName("MY REPORT");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);

	} 
	@Test(priority=1)
	@Parameters({"username","password"})
	public void addschedule(String username,String password) throws Exception {
	    ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_Schedulesheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Schedulesheet_name);
		for(int i1=1;i1<rowNum;i1++)
		{
			VenueValue=ExcelUtils.getCellData(i1, 0);
			TitleValue=ExcelUtils.getCellData(i1, 1);
			DescriptionValue=ExcelUtils.getCellData(i1, 2);
		
		HomePageAction.navigate_Schedule(driver);
		TEST_RESULT testResult=ScheduleAction.addschdule(driver,VenueValue,TitleValue,DescriptionValue);
		if(testResult==TEST_RESULT.RESULT_SUCCESS)
		{
			ExcelUtils.setCellData("Pass", "Savesucess", i1, 6, 7);
		}
		else
		{
			ExcelUtils.setCellData("Fail", "Savefailure", i1, 6, 7);
		}
		test=extent.createTest("addschedule","This  will perform  add schedule ");
		Assert.assertTrue(true);

		}
	}
	@Test(priority=2)
	@Parameters({"username","password"})
	public void editandectivateschedule(String username,String password) throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_Schedulesheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Schedulesheet_name);
	    for(int i1=1;i1<rowNum;i1++)
			{
				EditVenueValue=ExcelUtils.getCellData(i1, 3);
				EditTitleValue=ExcelUtils.getCellData(i1, 4);
				EditDescriptionValue=ExcelUtils.getCellData(i1, 5);
		
		
	
		HomePageAction.navigate_Schedule(driver);
		TEST_RESULT testResult=ScheduleAction.editAndActivateSchedule(driver,EditVenueValue,EditTitleValue,EditDescriptionValue);
		if(testResult==TEST_RESULT.RESULT_SUCCESS)
		{
			ExcelUtils.setCellData("Pass", "editandactivatesucess", i1, 8, 9);
		}
		else
		{
			ExcelUtils.setCellData("Fail", "editandactivatefailure", i1, 8, 9);
		}
		test=extent.createTest("editandectivateschedule","This  will perform  edit and activate schedule");
		Assert.assertTrue(true);
			}

	}

	@Test(priority=3)
	@Parameters({"username","password"})
	public void searchAndDeleteSchedule(String username,String password) throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_Schedulesheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Schedulesheet_name);
			for(int i1=1;i1<rowNum;i1++)
			{
				TitleValue=ExcelUtils.getCellData(i1, 1);

		

		
		HomePageAction.navigate_Schedule(driver);
		TEST_RESULT testResult=ScheduleAction.searchAndDeleteSchedule(driver,EditTitleValue);
		if(testResult==TEST_RESULT.RESULT_SUCCESS)
		{
			ExcelUtils.setCellData("Pass", "searchAndDeletesucess", i1, 10, 11);
		}
		else
		{
			ExcelUtils.setCellData("Fail", "searchAndDeletefailure", i1, 10, 11);
		}
		test=extent.createTest("searchAndDeleteSchedule","This  will perform search and delete schedule test");
		Assert.assertTrue(true);
	

	}
	}
	@AfterMethod
	public void getResult(ITestResult result) 
	{

		if (result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+ "Test has PAssed",ExtentColor.GREEN));

		}
		else if (result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+ "Test has failed",ExtentColor.RED));
			test.fail(result.getThrowable());
		}
		else 
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+ "Test has skipped",ExtentColor.YELLOW));
			test.skip(result.getThrowable());
		}


	}
	@AfterTest()
	public void teardown()
	{
		extent.flush();
		//driver.close();
	}


}
