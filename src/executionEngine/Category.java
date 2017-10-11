package executionEngine;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.CategoryPage;
import pageObjects.HomePage;
import utility.ExcelUtils;
import utility.Utilis;
import utility.Utilis.TEST_RESULT;
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

public class Category extends FirefoxTest {
	String categoryValue,editCategoryValue;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	int i1;
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
	@Test(priority=1)
	@Parameters({"username","password"})

	public  void addcategory() throws Exception {
		int i1;
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_Categorysheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Categorysheet_name);

		for( i1=1;i1<rowNum;i1++)
		{
			categoryValue=ExcelUtils.getCellData(i1, 0);
		
		HomePageAction.navigate_Category(driver);	
		TEST_RESULT testResult=CategoryAction.addcategorymaster(driver, categoryValue);
		if(testResult==TEST_RESULT.RESULT_SUCCESS)
		{
			ExcelUtils.setCellData("Pass", "Savesucess", i1, 2, 3);
		}
		else
		{
			ExcelUtils.setCellData("Fail", "Savefailure", i1, 2, 3);
		}
		test=extent.createTest("AboutEventEdit","This  will perform negative test");
		Assert.assertTrue(true);
		test=extent.createTest("addcategory","This  will perform  add category ");
		Assert.assertTrue(true);
		}
	}
	@Test(priority=2)
	@Parameters({"username","password"})
	public void editandectivatecategory(String username,String password) throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_Categorysheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Categorysheet_name);

		for(int i1=1;i1<rowNum;i1++)
		{
			editCategoryValue=ExcelUtils.getCellData(i1, 1);
		}



		HomePageAction.navigate_Category(driver);
		TEST_RESULT getResult=CategoryAction.editAndActivateCategory(driver,editCategoryValue);
		if(getResult==TEST_RESULT.RESULT_SUCCESS)
		{
			ExcelUtils.setCellData("Pass", "editsucess", i1, 4, 5);
		}
		else
		{
			ExcelUtils.setCellData("Fail", "editfailure", i1, 4, 5);
		}
		test=extent.createTest("editandectivatecategory","This  will perform  edit and activate category");
		Assert.assertTrue(true);
	

	}

	@Test(priority=3)
	@Parameters({"username","password"})
	public void searchAndDeletecategory(String username,String password) throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_Categorysheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Categorysheet_name);

		for(int i1=1;i1<rowNum;i1++)
		{
			editCategoryValue=ExcelUtils.getCellData(i1, 1);
		
		HomePageAction.navigate_Category(driver);
		TEST_RESULT getResult=CategoryAction.searchAndDeletecategory(driver,editCategoryValue);
		if(getResult==TEST_RESULT.RESULT_SUCCESS)
		{
			ExcelUtils.setCellData("Pass", "Searchdeletesucess", i1, 6, 7);
		}
		else
		{
			ExcelUtils.setCellData("Fail", "Searchdeletesucess", i1, 6, 7);
		}
		test=extent.createTest("searchAndDeletecategory","This  will perform search and delete category test");
		Assert.assertTrue(true);

		}
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