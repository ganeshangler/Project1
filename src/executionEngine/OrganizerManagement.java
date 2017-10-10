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

public class OrganizerManagement extends ChromeTest{



	String OrgaizernameValue,DescriptionValue,FacebookURLValue,TwitterURLValue,WebsiteURLValue,EditOrgaizernameValue,EditDescriptionValue,EditFacebookURLValue,EditTwitterURLValue,EditWebsiteURLValue;
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
	public void addorganizer(String username,String password) throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_OrganizerSheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_OrganizerSheet_name);
		for(int i=1;i<rowNum;i++)
		{
			OrgaizernameValue=ExcelUtils.getCellData(i, 0);
			DescriptionValue=ExcelUtils.getCellData(i, 1);
			FacebookURLValue=ExcelUtils.getCellData(i, 2);
			TwitterURLValue=ExcelUtils.getCellData(i, 3);
			WebsiteURLValue=ExcelUtils.getCellData(i, 4);

		}
		LoginAction.execute_Login( driver,username, password);
		HomePageAction.navigate_OrganizerMgmt(driver);
		OrganizerManagementAction.addorganizer(driver,OrgaizernameValue,DescriptionValue,FacebookURLValue,TwitterURLValue,WebsiteURLValue);
		test=extent.createTest("addorganizer","This  will perform  add organizer ");
		Assert.assertTrue(true);
		LoginAction.execute_Logout(driver);
	}
	@Test(priority=2)
	@Parameters({"username","password"})
	public void editandactivateorganizer(String username,String password) throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_OrganizerSheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_OrganizerSheet_name);
		for(int i=1;i<rowNum;i++)
		{
			for(int i1=1;i1<rowNum;i1++)
			{
			EditOrgaizernameValue=ExcelUtils.getCellData(i1, 5);
			EditDescriptionValue=ExcelUtils.getCellData(i1, 6);
			EditFacebookURLValue=ExcelUtils.getCellData(i1, 7);
			EditTwitterURLValue=ExcelUtils.getCellData(i1, 8);
			EditWebsiteURLValue=ExcelUtils.getCellData(i1, 9);

			}
		}
		LoginAction.execute_Login( driver,username, password);
		HomePageAction.navigate_OrganizerMgmt(driver);
		OrganizerManagementAction.editandactivateorganizer(driver,EditOrgaizernameValue,EditDescriptionValue,EditFacebookURLValue,EditTwitterURLValue,EditWebsiteURLValue);
		test=extent.createTest("editandectivateorganizer","This  will perform  edit and activate organizer");
		Assert.assertTrue(true);
		LoginAction.execute_Logout(driver);

	}

	@Test(priority=3)
	@Parameters({"username","password"})
	public void searchAndDeleteorganizer(String username,String password) throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_Newssheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Newssheet_name);
		for(int i1=1;i1<rowNum;i1++)
		{
			EditOrgaizernameValue=ExcelUtils.getCellData(i1, 5);

		}
		 
		LoginAction.execute_Login( driver,username, password);
		HomePageAction.navigate_OrganizerMgmt(driver);
		OrganizerManagementAction.searchAndDeleteorganizer(driver,EditOrgaizernameValue);
		test=extent.createTest("searchAndDeleteorganizer","This  will perform search and delete organizer test");
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





