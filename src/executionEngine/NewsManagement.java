package executionEngine;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.NewsPage;
import pageObjects.SchedulePage;
import utility.ExcelUtils;
import appModules.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import config.Constants;

public class NewsManagement extends ChromeTest {
	String Titlevalue,DescriptionValue,EditTitleValue,EditDescriptionValue;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest

	public void startReport()
	{
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/MyownReport.html");
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
	public void addnews(String username,String password) throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_Newssheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Newssheet_name);
		for(int i1=1;i1<rowNum;i1++)
		{
			Titlevalue=ExcelUtils.getCellData(i1, 0);
			DescriptionValue=ExcelUtils.getCellData(i1, 1);
	
		}
		LoginAction.execute_Login( driver,username, password);
		HomePageAction.navigate_NewsMgmt(driver);
		NewsManagementAction.addnews(driver,Titlevalue,DescriptionValue);
		test=extent.createTest("addnews","This  will perform  add schedule ");
		Assert.assertTrue(true);
		LoginAction.execute_Logout(driver);

	}
	@Test(priority=2)
	@Parameters({"username","password"})
	public void editandectivatenews(String username,String password) throws Exception {
	   ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_Newssheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Newssheet_name);
		for(int i=1;i<rowNum;i++)
		{
			for(int i1=1;i1<rowNum;i1++)
			{
				EditDescriptionValue=ExcelUtils.getCellData(i1, 3);
				EditTitleValue=ExcelUtils.getCellData(i1, 2);

			}
		}
		LoginAction.execute_Login( driver,username, password);
		HomePageAction.navigate_NewsMgmt(driver);
		NewsManagementAction.editandectivatenews(driver,EditTitleValue,EditDescriptionValue);
		test=extent.createTest("editandectivatenews","This  will perform  edit and activate schedule");
		Assert.assertTrue(true);
		LoginAction.execute_Logout(driver);

	}

	@Test(priority=3)
	@Parameters({"username","password"})
	public void searchAndDeletenews(String username,String password) throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_Newssheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Newssheet_name);
		for(int i1=1;i1<rowNum;i1++)
		{
			EditTitleValue=ExcelUtils.getCellData(i1, 2);

		}

		LoginAction.execute_Login( driver,username, password);
		HomePageAction.navigate_NewsMgmt(driver);
		NewsManagementAction.searchAndDeletenews(driver,EditTitleValue);
		test=extent.createTest("searchAndDeletenews","This  will perform search and delete schedule test");
		Assert.assertTrue(true);
		LoginAction.execute_Logout(driver);

	}
	@AfterMethod
	public void getResult(ITestResult result) 
	{

		if (result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+ "TEst has PAssed",ExtentColor.GREEN));

		}
		else if (result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+ "TEst has failed",ExtentColor.RED));
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
		driver.close();
	}


}


