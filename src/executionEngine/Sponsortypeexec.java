package executionEngine;

import org.testng.annotations.Test;

import appModules.LoginAction;
import appModules.SponsortypeAction;
import appModules.Sponsortypedelete;
import appModules.Sponsortypeedit;
import config.Constants;
import utility.ExcelUtils;

//extends inherits the feature of Chrome test class into Sponsortypeexec
public class Sponsortypeexec extends ChromeTest{
	String sponsorTypeadd,sponsorTypeedit,sponsoreditedvalue;
	
	@Test 
	public void Sponsortypeevent()throws Exception
	{
		/*Read input from excel
		ExcelUtils.setExcelFile(path, Sheetname); Path- path of excel file, Sheetname-input sheet name in that excel*/
		
		ExcelUtils.setExcelFile(Constants.Path_TestData+Constants.File_TestData, Constants.File_Sponsortypesheet_name);
		int rowNum=ExcelUtils.getRowCount(Constants.File_Sponsortypesheet_name);
		
		
		for(int i=1;i<rowNum;i++)
		{
			for(int i1=1;i1<rowNum;i1++)
			{
				sponsorTypeadd=ExcelUtils.getCellData(i1, 0);
				sponsorTypeedit=ExcelUtils.getCellData(i1, 2);
				sponsoreditedvalue=ExcelUtils.getCellData(i1, 3);
							
			}

		System.out.println("Login has been done successfully");
		
		SponsortypeAction.sponsortypeaccess(driver,sponsorTypeadd);
		//Sponsortypeedit.editSponsortype(driver,sponsorTypeedit,sponsoreditedvalue);
		
		//Sponsortypeedit.inactiveSponsortype(driver);
	
		//Sponsortypeedit.deleteSponsortype(driver);
		Sponsortypeedit.sortSponsortype(driver);
		}	
	}
	

}
