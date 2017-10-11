package executionEngine;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.ExcelUtils;
import utility.Utilis.TEST_RESULT;
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

public class DelegatesTest extends FirefoxTest {


		String Firstname,Lastname,Designation,Firm,TwitterURL,LinkedinURL,WebsiteURL,FacebookURL,Role,Industry,Phoneno,Email,Descrption;
		String EditFirstname,EditLastname,EditDesignation,EditFirm,EditTwitterURL,EditLinkedinURL,EditWebsiteURL,EditFacebookURL,EditRole,EditIndustry,EditPhoneno,EditEmail,EditDescrption;
		ExtentHtmlReporter htmlReporter;
		ExtentReports extent;
		ExtentTest test;
		@BeforeTest

		public void startReport()
		{
			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/SpeakerManagement.html");
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
		public void adddelegates(String username,String password) throws Exception {
			/*ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_Speakersheet_name);
			int rowNum=ExcelUtils.getRowCount(Constants.File_Speakersheet_name);
			for(int i1=1;i1<rowNum;i1++)
			{
				Firstname = ExcelUtils.getCellData(i1, 0);
				Lastname=ExcelUtils.getCellData(i1, 1);
				Designation=ExcelUtils.getCellData(i1, 2);
				Firm=ExcelUtils.getCellData(i1, 3);
				TwitterURL=ExcelUtils.getCellData(i1, 4);
				LinkedinURL=ExcelUtils.getCellData(i1, 5);
				WebsiteURL=ExcelUtils.getCellData(i1, 6);
				FacebookURL=ExcelUtils.getCellData(i1, 7);
				Role=ExcelUtils.getCellData(i1, 8);
				Industry=ExcelUtils.getCellData(i1, 9);
				Phoneno=ExcelUtils.getCellData(i1, 10);
				Email=ExcelUtils.getCellData(i1, 11);
				Descrption=ExcelUtils.getCellData(i1, 12);
*/
			HomePageAction.navigate_Delegates(driver);			
		DelagatesAction.addcategorymaster(driver);
	/*		if(testResult==TEST_RESULT.RESULT_SUCCESS)
			{
				ExcelUtils.setCellData("Pass", "Savesucess", i1, 13, 14);
			}
			else
			{
				ExcelUtils.setCellData("Fail", "Savefailure", i1, 13, 14);
			}
			test=extent.createTest("addspeaker","This will perform add speaker");
			Assert.assertTrue(true);
		*/
			}
		//}
		@Test(priority=2)
		@Parameters({"username","password"})
		public void editandectivatespeaker(String username,String password) throws Exception {
			ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_EditSpeakersheet_name);
			int rowNum=ExcelUtils.getRowCount(Constants.File_EditSpeakersheet_name);
			for(int i1=1;i1<rowNum;i1++)
			{
				EditFirstname = ExcelUtils.getCellData(i1, 0);
				EditLastname=ExcelUtils.getCellData(i1, 1);
				EditDesignation=ExcelUtils.getCellData(i1, 2);
				EditFirm=ExcelUtils.getCellData(i1, 3);
				EditTwitterURL=ExcelUtils.getCellData(i1, 4);
				EditLinkedinURL=ExcelUtils.getCellData(i1, 5);
				EditWebsiteURL=ExcelUtils.getCellData(i1, 6);
				EditFacebookURL=ExcelUtils.getCellData(i1, 7);
				EditRole=ExcelUtils.getCellData(i1, 8);
				EditIndustry=ExcelUtils.getCellData(i1, 9);
				EditPhoneno=ExcelUtils.getCellData(i1, 10);
				EditEmail=ExcelUtils.getCellData(i1, 11);
				EditDescrption=ExcelUtils.getCellData(i1, 12);
			HomePageAction.navigate_SpeakerMgmt(driver);
			TEST_RESULT testResult=SpeakerManagemenAction.editandectivatespeaker(driver,EditFirstname,EditLastname,EditDesignation,EditFirm,EditTwitterURL,EditLinkedinURL,EditWebsiteURL,EditFacebookURL,EditRole,EditIndustry,EditPhoneno,EditEmail,EditDescrption);
			if(testResult==TEST_RESULT.RESULT_SUCCESS)
			{
				ExcelUtils.setCellData("Pass", "editandectivatesucess", i1, 13, 14);
			}
			else
			{
				ExcelUtils.setCellData("Fail", "editandectivatefailure", i1, 13, 14);
			}
			Assert.assertTrue(true);
			test=extent.createTest("editandectivatespeaker","This  will perform  edit and activate schedule");
			Assert.assertTrue(true);

		}
		}

		@Test(priority=3)
		@Parameters({"username","password"})
		public void searchAndDeletespeaker(String username,String password) throws Exception {
			ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData,Constants.File_EditSpeakersheet_name);
			int rowNum=ExcelUtils.getRowCount(Constants.File_EditSpeakersheet_name);
			for(int i1=1;i1<rowNum;i1++)
			{
				EditFirstname=ExcelUtils.getCellData(i1, 0);
				EditLastname=ExcelUtils.getCellData(i1, 1);
			HomePageAction.navigate_SpeakerMgmt(driver);
			TEST_RESULT testResult=SpeakerManagemenAction.Searchanddeelete(driver,EditFirstname,EditLastname);
			if(testResult==TEST_RESULT.RESULT_SUCCESS)
			{
				ExcelUtils.setCellData("Pass", "searchAndDelete", i1, 15, 16);
			}
			else
			{
				ExcelUtils.setCellData("Fail", "searchAndDelete", i1, 15, 16);
			}
			test=extent.createTest("searchAndDeletespeaker","This  will perform search and delete schedule test");
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
			driver.close();
		}



}
