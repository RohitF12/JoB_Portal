package Candidate_TestScripts;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Candidate.Candidate_LoginPage;
import POM_Candidate.Candidate_Profile;
import POM_Candidate.JobListing_Direct_JobApply;
import POM_Candidate.Update_Profile_while_applying_for_job;
import base.BaseTest;
import config.Config;
import utils.ExcelUtilityReg;

//TC_ID_06_16 to TC_ID_06_28

public class TC_ID_06_Update_Profile_while_applying_for_job extends BaseTest
{
	@Test
	public void TC_ID_06_16() throws IOException, InterruptedException
	{
		openCandidatebrowser();
		logincandidate();
 	     
		//Verify Update profile and apply button display
		Update_Profile_while_applying_for_job u = new Update_Profile_while_applying_for_job(candidatedriver);
		u.viewjob();
		methods.switchingtabs(candidatedriver); 
		Thread.sleep(8000);
	    Assert.assertTrue(u.is_updateProfileandApplybutton_display(), "Update profile and apply button should be display");
	    
	}

	@Test
	public void TC_ID_06_17()
	{
		//Verify profile details page display once click on Update profile and apply button 
		Update_Profile_while_applying_for_job u = new Update_Profile_while_applying_for_job(candidatedriver);
		methods.scrollbar(candidatedriver, u.getUpdateProfileandApplyButton());
	}
	@Test
	public void TC_ID_06_18() throws IOException, AWTException, InterruptedException
	{
		Update_Profile_while_applying_for_job u = new Update_Profile_while_applying_for_job(candidatedriver);
				
   	 String FilePath = Config.getProperty("filePath");
 	
		 String SheetName = Config.getProperty("sheetName_14");	
   	 
   	 ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
 	 
 	     int rowCount = excel.getRowCount();
 	     for(int i=1; i<= rowCount; i++)
 	     {
  		    String dob = excel.getCellData(i, 2);
 		    String AGE = excel.getCellData(i, 4);
 		    String profile = excel.getCellData(i, 3);
 		    String skill = excel.getCellData(i, 17);
 		    String lang = excel.getCellData(i, 18);
 		    String Bio = excel.getCellData(i, 19);
 		    String resumepath = excel.getCellData(i, 0);
 		    String photopath = excel.getCellData(i, 1);
 		    String currentcompanyname = excel.getCellData(i, 11);
 		    String ctcamonut = excel.getCellData(i, 12);
 		    String expyear = excel.getCellData(i, 15);
 		    String noticeperioddays = excel.getCellData(i, 13);
 		    String degreetype = excel.getCellData(i, 14);
 		    String degreename = excel.getCellData(i, 9);
 		    String passingyear = excel.getCellData(i, 10);
 		    String add = excel.getCellData(i, 5);
 		    String City = excel.getCellData(i, 8);
 		    u.enter_details( dob,AGE, profile,skill,lang,Bio,resumepath,photopath,currentcompanyname,ctcamonut, expyear,
 		    		noticeperioddays, degreetype,degreename,passingyear,add,City);
 		   break;
 	     }
 	     
	}
 	   
	@Test
 	public void TC_ID_06_19() throws InterruptedException
 	{
		
		//Click on Reset button
 	    Update_Profile_while_applying_for_job u = new Update_Profile_while_applying_for_job(candidatedriver);
 	        Thread.sleep(4000);
 	        u.is_ResetButton_display();
 	    	methods.scrollbar(candidatedriver, u.click_Resetbutton());
 	}
	@Test
 	public void TC_ID_06_20() throws IOException, InterruptedException
 	{
		//Verify all the entered data is correct
		Update_Profile_while_applying_for_job u = new Update_Profile_while_applying_for_job(candidatedriver);
		u.verify_data_is_correct();
 	}

	@Test
 	public void TC_ID_06_21() throws IOException, AWTException, InterruptedException
 	{
		//Verify user able to update the details
		Update_Profile_while_applying_for_job u = new Update_Profile_while_applying_for_job(candidatedriver);
		methods.scrollbar(candidatedriver, u.click_Resetbutton());
	   	 String FilePath = Config.getProperty("filePath");
	  	
	 		 String SheetName = Config.getProperty("sheetName_14");	
	    	 
	    	 ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	    int rowCount=excel.getRowCount();
	    for(int i=2;i<=rowCount;i++ )
	    {
	    	    String dob = excel.getCellData(i, 2);
	 		    String AGE = excel.getCellData(i, 4);
	 		    String profile = excel.getCellData(i, 3);
	 		    String skill = excel.getCellData(i, 17);
	 		    String lang = excel.getCellData(i, 18);
	 		    String Bio = excel.getCellData(i, 19);
	 		    String resumepath = excel.getCellData(i, 0);
	 		    String photopath = excel.getCellData(i, 1);
	 		    String currentcompanyname = excel.getCellData(i, 11);
	 		    String ctcamonut = excel.getCellData(i, 12);
	 		    String expyear = excel.getCellData(i, 15);
	 		    String noticeperioddays = excel.getCellData(i, 13);
	 		    String degreetype = excel.getCellData(i, 14);
	 		    String degreename = excel.getCellData(i, 9);
	 		    String passingyear = excel.getCellData(i, 10);
	 		    String add = excel.getCellData(i, 5);
	 		    String City = excel.getCellData(i, 8);
	 		    u.update_details(dob, AGE, profile, skill, lang, Bio, resumepath, photopath, currentcompanyname, ctcamonut, expyear, 
	 		    		noticeperioddays, degreetype, degreename, passingyear, add, City);
	 		   break;
	    }
 	}

	@Test
 	public void TC_ID_06_22() throws IOException, InterruptedException
 	{
		//Verify all the updated data is correct
		Update_Profile_while_applying_for_job u = new Update_Profile_while_applying_for_job(candidatedriver);
		methods.scrollbar(candidatedriver, u.click_Resetbutton());
		u.verify_updateddata_is_correct();
 	}
	@Test
	public void TC_ID_06_23()
	{
		//Verify apply button is display
		Update_Profile_while_applying_for_job u = new Update_Profile_while_applying_for_job(candidatedriver);
		Assert.assertTrue(u.is_ApplyButton_display(), "Apply button should be display");
	}
	@Test
	public void TC_ID_06_24()
	{
		//Verify Review job tab is display and clickable
		Update_Profile_while_applying_for_job u = new Update_Profile_while_applying_for_job(candidatedriver);
		Assert.assertTrue(u.is_ReviewJobTab_display(), "Review job tab should be display");
		u.ReviewJob();
	}
	@Test
	public void TC_ID_06_25() throws IOException
	{
		//Verify job display on review job page is same as job select to apply from landing page
		Update_Profile_while_applying_for_job u = new Update_Profile_while_applying_for_job(candidatedriver);
		u.Verify_JobTitle_Same();
	}
	@Test
	public void TC_ID_06_26()
	{
		//Verify apply button is clickable
		Update_Profile_while_applying_for_job u = new Update_Profile_while_applying_for_job(candidatedriver);
        u.Apply();
	}
	@Test
	public void TC_ID_06_27() throws InterruptedException
	{
		//Verify job is applied successfully by checking the text 'Applied'
		Update_Profile_while_applying_for_job u = new Update_Profile_while_applying_for_job(candidatedriver);
		u.viewjob();
		methods.switchingtabs(candidatedriver);
		Assert.assertTrue(u.verify_JobApplied_successfully(), "Applied text should be display");
	}
	@Test
	public void TC_ID_06_28() throws InterruptedException, IOException
	{
		//Verify the details get updated in the profile section
		Candidate_Profile p= new Candidate_Profile(candidatedriver);
    	p.openelipsisimenu();
    	Thread.sleep(2000);
    	p.openprofile();
    	p.clickonedittab();
    	p.verify_details_on_Profile_Page();
	}
	
}
