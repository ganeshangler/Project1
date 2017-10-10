	package executionEngine;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.ExcelUtils;
import appModules.HomePageAction;
import appModules.LoginAction;
import appModules.NewsManagementAction;
import appModules.SponsorManagementAction;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import config.Constants;

public class SponsorManagement extends FirefoxTest {

	String Sponsorname,SponsorType,TwitterURL,LinkedInURL,WebsiteURL,DescriptionValue,EditSponsorname,EditSponsorType,EditTwitterURL,EditLinkedInURL,EditWebsiteURL,EditDescriptionValue;

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
	public void addsponsor(String username,String password) throws Exception {
	ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_Sponsorsheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Sponsorsheet_name);
		for(int i1=1;i1<rowNum;i1++)
		{
			Sponsorname=ExcelUtils.getCellData(i1, 0);
			SponsorType=ExcelUtils.getCellData(i1, 1);
			TwitterURL=ExcelUtils.getCellData(i1, 2);
			LinkedInURL=ExcelUtils.getCellData(i1, 3);
			WebsiteURL=ExcelUtils.getCellData(i1, 4);
			DescriptionValue=ExcelUtils.getCellData(i1, 5);

		}
		LoginAction.execute_Login( driver,username,password);
		HomePageAction.navigate_SponsorMgmt(driver);
		System.out.println("login sucess");
		SponsorManagementAction.addsponsor(driver,Sponsorname,SponsorType,TwitterURL,LinkedInURL,WebsiteURL,DescriptionValue);
		test=extent.createTest("addsponsor","This  will perform  add schedule ");
		Assert.assertTrue(true);
		LoginAction.execute_Logout(driver);

	}
	@Test(priority=2)
	@Parameters({"username","password"})
	public void editandectivatesponsor(String username,String password) throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_Sponsorsheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Sponsorsheet_name);
		for(int i=1;i<rowNum;i++)
		{
			for(int i1=1;i1<rowNum;i1++)
			{
				EditSponsorname=ExcelUtils.getCellData(i1, 6);
				EditSponsorType=ExcelUtils.getCellData(i1, 7);
				EditTwitterURL=ExcelUtils.getCellData(i1, 8);
				EditLinkedInURL=ExcelUtils.getCellData(i1, 9);
				EditWebsiteURL=ExcelUtils.getCellData(i1, 10);
				EditDescriptionValue=ExcelUtils.getCellData(i1,11);

			}
		}
		LoginAction.execute_Login( driver,username, password);
		HomePageAction.navigate_SponsorMgmt(driver);
		SponsorManagementAction.editandectivatesponsor(driver,EditSponsorname,EditSponsorType,EditTwitterURL,EditLinkedInURL,EditWebsiteURL,EditDescriptionValue);
		test=extent.createTest("editandectivatesponsor","This  will perform  edit and activate schedule");
		Assert.assertTrue(true);
		LoginAction.execute_Logout(driver);

	}


	@Test(priority=3)
	@Parameters({"username","password"})
	public void searchAndDeletesponsor(String username,String password) throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_Sponsorsheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Sponsorsheet_name);
		for(int i1=1;i1<rowNum;i1++)
		{
			EditSponsorname=ExcelUtils.getCellData(i1, 6);

		}

		LoginAction.execute_Login( driver,username, password);
		HomePageAction.navigate_SponsorMgmt(driver);
		SponsorManagementAction.Searchanddeelete(driver,EditSponsorname);

		test=extent.createTest("searchAndDeletesponsor","This  will perform search and delete schedule test");
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


