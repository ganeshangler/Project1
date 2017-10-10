package executionEngine;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.ExcelUtils;
import config.Constants;
import appModules.AboutEventEditAction;
import appModules.AnnouncementAction;
import appModules.HomePageAction;
import appModules.LoginAction;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Announcement extends FirefoxTest{
	String message;
	
//
//		String FacebookURL,TwitterURL,YoutubeURL,WebSiteURL;
//		ExtentHtmlReporter htmlReporter;
//		ExtentReports extent;
//		ExtentTest test;
//		@BeforeTest
//
//		public void startReport()
//		{
//			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/MyownReport.html");
//			extent = new ExtentReports();
//			extent.attachReporter(htmlReporter);
//			extent.setSystemInfo("OS", "windows");
//			extent.setSystemInfo("Environment", "QA");
//			htmlReporter.config().setDocumentTitle("Report");
//			htmlReporter.config().setReportName("MY REPORT");
//			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//			htmlReporter.config().setTheme(Theme.STANDARD);
//
//		}
		
		@Test
		@Parameters({"username","password"})
		public void SendAnnouncement(String username, String password) throws Exception {

			ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_Announcementsheet_name);
			int rowNum=ExcelUtils.getRowCount(Constants.File_Announcementsheet_name);
			for(int i=1;i<rowNum;i++)
			{
				message=ExcelUtils.getCellData(i, 0);
									}
			System.out.println(message);
				LoginAction.execute_Login(driver,username,password);
				HomePageAction.navigate_announcement(driver);
				AnnouncementAction.Add_Announcement(driver, message);
				
//									test=extent.createTest("SendAnnouncement","This will perform  test");
//				Assert.assertTrue(false);
			
		}
		@Test
		@Parameters({"username","password"})
		public void ViewAnnouncement(String username, String password) throws Exception {

			ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_Announcementsheet_name);
			int rowNum=ExcelUtils.getRowCount(Constants.File_Announcementsheet_name);
			for(int i=1;i<rowNum;i++)
			{
				message=ExcelUtils.getCellData(i, 0);
									}
			System.out.println(message);
				LoginAction.execute_Login(driver,username,password);
				HomePageAction.navigate_announcement(driver);
				AnnouncementAction.View_Announcement(driver, message);
				
//									test=extent.createTest("SendAnnouncement","This will perform  test");
//				Assert.assertTrue(false);
			
		}
		@Test
		@Parameters({"username","password"})
		public void DeleteAnnouncement(String username, String password) throws Exception {

			ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_Announcementsheet_name);
			int rowNum=ExcelUtils.getRowCount(Constants.File_Announcementsheet_name);
			for(int i=1;i<rowNum;i++)
			{
				message=ExcelUtils.getCellData(i, 0);
									}
			System.out.println(message);
				LoginAction.execute_Login(driver,username,password);
				HomePageAction.navigate_announcement(driver);
				AnnouncementAction.Delete_Announcement(driver, message);
//              test=extent.createTest("SendAnnouncement","This will perform  test");
//				Assert.assertTrue(false);
			
		}
	
//		@AfterMethod
//		public void getResult(ITestResult result) 
//		{
//
//			if (result.getStatus()==ITestResult.SUCCESS)
//			{
//				test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+ "TEst has PAssed",ExtentColor.GREEN));
//
//			}
//			else if (result.getStatus()==ITestResult.FAILURE)
//			{
//				test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+ "TEst has failed",ExtentColor.RED));
//				test.fail(result.getThrowable());
//			}
//			else 
//			{
//				test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+ "Test has skipped",ExtentColor.YELLOW));
//				test.skip(result.getThrowable());
//			}
//
//			driver.quit();
//		}
//		@AfterTest()
//		public void teardown()
//		{
//			extent.flush();
//		}
  }

