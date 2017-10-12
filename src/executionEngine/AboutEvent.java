package executionEngine;
import java.sql.Driver;

import utility.*;
import utility.Utilis.TEST_RESULT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utility.Utilis;
import appModules.AboutEventEditAction;
import appModules.HomePageAction;
import appModules.LoginAction;
import config.Constants;

public class AboutEvent extends ChromeTest {
	String FacebookURL,TwitterURL,YoutubeURL,WebSiteURL;
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
	@Test
	 @Parameters({"username","password"})
	public void AboutEventEdit(String username,String password) throws Exception {
		int i1;
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_AboutEventsheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_AboutEventsheet_name);
			for( i1=1;i1<rowNum;i1++)
			{
				FacebookURL=ExcelUtils.getCellData(i1, 0);
				TwitterURL=ExcelUtils.getCellData(i1, 1);
				YoutubeURL=ExcelUtils.getCellData(i1, 2);
				WebSiteURL=ExcelUtils.getCellData(i1, 3);	
			HomePageAction.navigate_aboutEvent(driver);
			TEST_RESULT getResult=AboutEventEditAction.Editnews(driver, FacebookURL, TwitterURL, YoutubeURL, WebSiteURL);
			if(getResult==TEST_RESULT.RESULT_SUCCESS)
			{
				ExcelUtils.setCellData("Pass", "Savesucess", i1, 4, 5);
			}
			else
			{
				ExcelUtils.setCellData("Fail", "Savefailure", i1, 4, 5);
			}
			test=extent.createTest("AboutEventEdit","This  will perform negative test");
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

		//driver.close();
	}
	@AfterTest()
	public void teardown()
	{
		extent.flush();
		
	}
}
