package Candidate_TestScripts;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import POM_Candidate.Candidate_LoginPage;
import POM_Candidate.JobListing_Page;
import POM_Candidate.Landing_Page;
import base.BaseTest;
import config.Config;
import utils.ExcelUtilityReg;

//TC_ID_07_10 to TC_ID_07_17

public class TC_ID_07_Landing_Page extends BaseTest
{
	@Test
	public void TC_ID_07_10() throws InterruptedException, IOException
	{
		//Login
		 Candidate_LoginPage  loginpage = new Candidate_LoginPage(candidatedriver);
		 
		 String FilePath = Config.getProperty("filePath");
		 	
		 String SheetName = Config.getProperty("sheetName_14");	
   	 
   	 ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
		   	 
  	     int rowCount = excel.getRowCount();
  	     for(int i=1; i<= rowCount; i++)
  	     {
   		    String Candidate_Email = excel.getCellData(i, 1);
  		    String Password = excel.getCellData(i, 3);
  		    loginpage.enteremail(Candidate_Email);
  		    loginpage.enterpassword(Password);
  		    loginpage.Clicklogin();
  		    break;
  	     }
		//Verify all the filters and recent jobs display on landing page
  	      Landing_Page l = new Landing_Page(candidatedriver);
  	      Assert.assertTrue(l.is_display_searchbox(), "Search filter should be display");
  	      Assert.assertTrue(l.is_display_salatyrange(), "Salary range filter should be display");
  	      Assert.assertTrue(l.is_display_expefilter(), "Experience filter should be display");
  	      l.display_no_of_jobs();
	}
	@Test
	public void TC_ID_07_11() throws InterruptedException, IOException 
	{
		//Verify listing display based on filters applied
		Landing_Page l = new Landing_Page(candidatedriver);
		
		 String FilePath = Config.getProperty("filePath");
		 	
		 String SheetName = Config.getProperty("sheetName_19");	
  	 
  	 ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);

 	    int rowCount = excel.getRowCount();
 	    for(int i =1;i<=rowCount; i++)
 	    {
 	    	String keyword = excel.getCellData(i, 0);
 	    	String experience = excel.getCellData(i, 1);
 	    	l.applyfilter(keyword, experience);
 	    	break;
 	    }
 	   
        l.applyjobtypefilter();
		
		methods.draganddrop(l.getSalaryrangeslider(), candidatedriver);
		
	    l.applyloctypefilter();
	}
	@Test
	public void TC_ID_07_12() 
	{
		//To check user able to open job details page
		Landing_Page l = new Landing_Page(candidatedriver);
	    l.openjob();
	}
	@Test
	public void TC_ID_07_13() throws InterruptedException
	{
		//Check job details display
		Landing_Page l = new Landing_Page(candidatedriver);
		methods.switchingtabs(candidatedriver);
		System.out.println("---------Below are job details--------");
		Assert.assertTrue(l.is_jobdetails_display(), "Job details should be display");
		l.displayjobdetails();
	}
	@Test
	public void TC_ID_07_14()
	{
		//Check apply button is clickable
		Landing_Page l = new Landing_Page(candidatedriver);
		Assert.assertTrue(l.is_applybutton_display(), "Apply button should be display");
        l.applytojob();
	}
	@Test
	public void TC_ID_07_15() throws InterruptedException
	{
		//Check the view profile link
		Landing_Page l = new Landing_Page(candidatedriver);
		Assert.assertTrue(l.is_viewprofilelink_display(), "View profile link should be display");
		l.viewprofile_before_applying_to_job();
		Thread.sleep(3000);
		methods.moreopenTabAndmoreCloseTheTab(candidatedriver);
	}
	@Test
	public void TC_ID_07_16() throws InterruptedException
	{
		//Check the edit profile link
		Landing_Page l = new Landing_Page(candidatedriver);
		Assert.assertTrue(l.is_editprofilelink_display(), "View profile link should be display");
		l.editprofile_before_applying_to_job();
		Thread.sleep(4000);
		methods.moreopenTabAndmoreCloseTheTab(candidatedriver);
		
	}
	@Test
	public void TC_ID_07_17() throws InterruptedException
	{
		//Check the submit button
		Landing_Page l = new Landing_Page(candidatedriver);
		Thread.sleep(3000);
		l.submitjob();
		Thread.sleep(3000);
		Assert.assertTrue(l.is_applied_text_display(), "Applied text should be display");
	}

}
