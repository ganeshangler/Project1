package executionEngine;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Category;
import utility.ExcelUtils;
import utility.Utilis;
import appModules.CategoryAction;
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

import config.Constants;

public class CategoryTest extends FirefoxTest {
	String categoryValue,editCategoryValue;
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
		htmlReporter.config().setDocumentTitle("REport");
		htmlReporter.config().setReportName("mY REPORT");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);

	} 
	@Test(enabled=false)
	public void addcategory() throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_Categorysheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Categorysheet_name);
		for(int i=1;i<rowNum;i++)
		{
			for(int i1=1;i1<rowNum;i1++)
			{
				categoryValue=ExcelUtils.getCellData(i1, 0);
			}
		}

		LoginAction.execute_Login(driver);
		HomePageAction.navigate_Category(driver);
		CategoryAction.addcategory(driver,categoryValue);
		test=extent.createTest("addcategory","This  will perform  add category test");
		Assert.assertTrue(true);

	}
	@Test
	public void editandectivatecategory() throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_Categorysheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Categorysheet_name);
		for(int i=1;i<rowNum;i++)
		{
			for(int i1=1;i1<rowNum;i1++)
			{
				editCategoryValue=ExcelUtils.getCellData(i1, 1);
			}
		}

		LoginAction.execute_Login(driver);
		HomePageAction.navigate_Category(driver);
		CategoryAction.editAndActivateCategory(driver,editCategoryValue);
		test=extent.createTest("editandectivatecategory","This  will perform  add category test");
		Assert.assertTrue(true);

	}

	@Test
	public void searchAndDeletecategory() throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_Categorysheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Categorysheet_name);
		for(int i=1;i<rowNum;i++)
		{
			for(int i1=1;i1<rowNum;i1++)
			{
				editCategoryValue=ExcelUtils.getCellData(i1, 1);
			}
		}

		LoginAction.execute_Login(driver);
		HomePageAction.navigate_Category(driver);
		CategoryAction.searchAndDeletecategory(driver,editCategoryValue);
		test=extent.createTest("editandectivatecategory","This  will perform  add category test");
		Assert.assertTrue(true);

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

		driver.close();
	}
	@AfterTest()
	public void teardown()
	{
		extent.flush();
	}

}
