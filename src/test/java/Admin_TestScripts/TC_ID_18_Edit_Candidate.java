package Admin_TestScripts;


import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import POM_Admin.Add_Candidate_Page;
import POM_Admin.Candidate_Listing;
import POM_Admin.Edit_Candidate;
import POM_Admin.Login_Page;
import base.BaseTest;
import utils.ExcelUtilityReg;

public class TC_ID_18_Edit_Candidate extends BaseTest
{
	@Test
	public void TC_ID_18_06() throws IOException, InterruptedException
	{
		openAdminbrowser();
		loginHR();
		//To check that edit icon is working fine 
		Candidate_Listing c = new Candidate_Listing(admindriver);
		c.opencandidatelist();
		Edit_Candidate e = new Edit_Candidate(admindriver);
		e.openeditpage();
		//e.verify_details_on_Edit_Page();
	}
	@Test
	public void TC_ID_18_07() throws IOException, AWTException, InterruptedException
	{
		//Check user able to update the information 
		Edit_Candidate e = new Edit_Candidate(admindriver);
		String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
		String sheetName="Add_Candidate";
		ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
			   	 
			int rowCount = excel.getRowCount();
			for(int i=2; i<= rowCount; i++)
			{
				 String Candidate_Name = excel.getCellData(i, 0);
	    		 String Candidate_Email = excel.getCellData(i, 1);
	    		 String resumepath = excel.getCellData(i,2);
	        	 String photopath = excel.getCellData(i, 3);
	             String dob =  excel.getCellData(i, 4);
	        	 String profile = excel.getCellData(i, 5);
	        	 String Phone_no = excel.getCellData(i, 6);
	        	 String add = excel.getCellData(i, 7);
	        	 String City = excel.getCellData(i, 10);
	        	 String degreetype = excel.getCellData(i, 11);
	        	 String degreename = excel.getCellData(i, 12);
	        	 String passingyear = excel.getCellData(i, 13);
	        	 String currentcompanyname = excel.getCellData(i, 14);
	        	 String ctcamonut = excel.getCellData(i, 15);
	        	 String noticeperioddays = excel.getCellData(i, 16);
	        	 String expyear = excel.getCellData(i, 17);
	        	 String newskill = excel.getCellData(i, 18);
	        	 String skill = excel.getCellData(i, 19);
	        	 String lang= excel.getCellData(i, 20);
	        	 String Bio = excel.getCellData(i, 21);
	        	 e.Update_candidate_details(Candidate_Name, Candidate_Email, resumepath, photopath, dob, Phone_no, profile, add, City, 
	        			 degreetype, degreename, passingyear, currentcompanyname, ctcamonut, noticeperioddays, expyear, newskill, skill, 
	        			 lang, Bio);
	        	 Thread.sleep(3000);
	        	 e.update_button();
	        	 break;
			}
	}
     @Test
     public void TC_ID_18_08() throws InterruptedException, IOException
     {
    	 //Verify update details is correct
    	 Thread.sleep(5000);
    	 Add_Candidate_Page a = new Add_Candidate_Page(admindriver);
    	 a.Open_candidateDetails();
 		 methods.switchingtabs(admindriver);
 		 Thread.sleep(3000);
 		 Edit_Candidate e = new Edit_Candidate(admindriver);
 		 e.verify_Updated_candidateDetails_are_correct();
     }
}

