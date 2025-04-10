package Admin_TestScripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Admin.Add_Candidate_Page;
import POM_Admin.Login_Page;
import base.BaseTest;
import utils.ExcelUtilityReg;

public class TC_ID_17_Add_Candidate extends BaseTest 
{
	@Test
	public void TC_ID_17_01() throws IOException
	{
		 openAdminbrowser();
		 loginHR();
   	     //Verify Add candidate module display
		Add_Candidate_Page a = new Add_Candidate_Page(admindriver);
		Assert.assertTrue(a.is_Add_CandidateModule_display(), "Add candidate module should be display");
	}
	@Test
	public void TC_ID_17_02()
	{
		//Verify Add candidate page display
		Add_Candidate_Page a = new Add_Candidate_Page(admindriver);
		a.openaddcandidatepage();
	}
	@Test
	public void TC_ID_17_03()
	{
		//Check the page name available
		Add_Candidate_Page a = new Add_Candidate_Page(admindriver);
		Assert.assertTrue(a.is_PaneName_display(), "Add candidate title should be display");
	}
	@Test
	public void TC_ID_17_04()
	{
		  //Check the all the fields are available
		    Add_Candidate_Page a = new Add_Candidate_Page(admindriver);
		    Assert.assertTrue(a.is_uploadresumesection_displayed(), "Upload resume section should be display");
	    	
	    	Assert.assertTrue(a.is_uploadphotosection_displayed(), "Upload photo section should be display");
	    
	    	Assert.assertTrue(a.is_namefield_displayed(), "Name field should be display");
	    	Assert.assertTrue(a.is_emailfield_displayed(), "Email field should be display");
	    	Assert.assertTrue(a.is_DOBfield_displayed(), "Date of birth field should be display");
	    	
	    	Assert.assertTrue(a.is_designationfield_displayed(), "Designation field should be display");
	    	Assert.assertTrue(a.is_ContactNumberfield_displayed(), "Contact number field should be display");
	    	Assert.assertTrue(a.is_addressfield_displayed(), "Address field should be display");
	    	Assert.assertTrue(a.is_cityfield_displayed(),  "City field should be display");
	    
	    	Assert.assertTrue(a.is_qualificationfield_displayed(),  "Qualification field should be display");
	    	
	    	Assert.assertTrue(a.is_degreefield_displayed(),  "Degree field should be display");
	    	
	    	Assert.assertTrue(a.is_yearfield_displayed(),  "Year field should be display");
	    	
	    	Assert.assertTrue(a.is_currentcompanyfield_displayed(),  "Current company field should be display");
	    	
	    	Assert.assertTrue(a.is_CTCfield_displayed(),  "CTC field should be display");
	    	
	    	Assert.assertTrue(a.is_noticeperiodfield_displayed(),  "Notice period field should be display");
	    
	    	Assert.assertTrue(a.is_yoefield_displayed(),  "Year of experience field should be display");
	    	Assert.assertTrue(a.is_addskillbuttonfield_displayed(),  "Add skill button should be display");
	    	Assert.assertTrue(a.is_skilldropdownfield_displayed(),  "Skill dropdown field should be display");
	    	
	    	Assert.assertTrue(a.is_languagefield_displayed(),  "Language field should be display");
	    	
	    	Assert.assertTrue(a.is_aboutmefield_displayed(),  "About me field should be display");
	    	
	    	Assert.assertTrue(a.is_submitbtn_displayed(),  "Submit button should be display");
	}
	@Test
	public void TC_ID_17_05() throws IOException, AWTException, InterruptedException
	{
		//Verify user is able to add candidate
		 Add_Candidate_Page a = new Add_Candidate_Page(admindriver);
		 String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
    	 String sheetName="Add_Candidate";
    	 ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
    	 int rowCount = excel.getRowCount();
    	 for(int i=1; i<= rowCount; i++)
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
        	 a.enter_candidate_details(Candidate_Name, Candidate_Email, resumepath, photopath, dob, Phone_no, profile, 
        			 add, City, degreetype, degreename, passingyear, currentcompanyname, ctcamonut, 
        			 noticeperioddays, expyear, newskill, skill, lang, Bio);
        	 break;
    	 }
	}
	@Test
	public void TC_ID_17_06() 
	{
		//Verify submit button is enable and clickable
		Add_Candidate_Page a = new Add_Candidate_Page(admindriver);
		Assert.assertTrue(a.is_submitbutton_enable(), "Submit button should be enable");
		a.clicksubmitbtn();
	}
	@Test
	public void TC_ID_17_07() throws InterruptedException, IOException 
	{
		//Verify added candidate display in listing
		Add_Candidate_Page a = new Add_Candidate_Page(admindriver);
		a.openaddcandidatepage();
		Thread.sleep(3000);
		a.verify_newlyCreatedCandidate_display_in_listing();
	}
	@Test
	public void TC_ID_17_08() throws IOException, InterruptedException
	{
		//Verify the details of candidate  are correct
		Add_Candidate_Page a = new Add_Candidate_Page(admindriver);
		a.openCandidateList();
		Thread.sleep(3000);
		a.Open_candidateDetails();
		methods.switchingtabs(admindriver);
		Thread.sleep(3000);
		a.verify_candidateDetails_are_correct();
	}
}


