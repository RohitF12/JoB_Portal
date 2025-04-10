package Candidate_TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Candidate.Candidate_LoginPage;
import POM_Candidate.Candidate_Profile;
import POM_Candidate.JobListing_Page;
import base.BaseTest;
import utils.ExcelUtilityReg;

//TC_ID_07_01 to TC_ID_07_09

public class TC_ID_07_Candidate_Job_Apply extends BaseTest
{
	@Test 
	public void TC_ID_07_01() throws IOException
	{
		openCandidatebrowser();
		logincandidate(); 
   	    //To check that elipsis menu opened
  		Candidate_Profile p= new Candidate_Profile(candidatedriver);
  		p.openelipsisimenu();
        p.opendashboard();
		//Click on Job Listing  page and check page name displayed 
		JobListing_Page j = new JobListing_Page(candidatedriver);
		j.openjoblisting();
		j.is_page_name_display();
		j.print_pagename();
		//Assert.assertEquals(driver.getTitle(), "Title should be Job Listing");
    }
	@Test 
	public void TC_ID_07_02()
	{
		//To check the column name displayed.		
		JobListing_Page j = new JobListing_Page(candidatedriver);
		j.displaycolumnheading();
		
	}
	@Test 
	public void TC_ID_07_03() throws IOException, InterruptedException
	{
		 //Check listing display by applying filters
		 JobListing_Page j = new JobListing_Page(candidatedriver);
	     String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
	     String sheetName="Candidate_Job_Listing_Filter";
	     ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
	 
	      int rowCount = excel.getRowCount();
	      for(int i=1; i<= rowCount; i++)
	      {
	    	  j.clickemployeetype();
	    	  String Employment_Type = excel.getCellData(i, 0);
	    	  String Experience_Level = excel.getCellData(i, 1);
	    	  String Location = excel.getCellData(i, 2);
	    	  String Searchby_JobTitleCompanyName = excel.getCellData(i, 3);
	    	  j.applyFilters(Employment_Type, Location, Experience_Level, Searchby_JobTitleCompanyName);
	    	  break;
	      }
	}
	@Test
	public void TC_ID_07_04()
	{
		//To check the job is open once click on it
		 JobListing_Page j = new JobListing_Page(candidatedriver);
         j.openajob();
	}
	@Test
	public void TC_ID_07_05() throws InterruptedException
	{
		//To check that information displayed in the page
		JobListing_Page j = new JobListing_Page(candidatedriver);
		methods.switchingtabs(candidatedriver);
		System.out.println("---------Below are job details--------");
		Assert.assertTrue(j.is_jobdetails_display(), "Job details should be display");
		j.displayjobdetails();
	}
	@Test
	public void TC_ID_07_06()
	{
		//To check the functionality of Apply button 
		JobListing_Page j = new JobListing_Page(candidatedriver);
		Assert.assertTrue(j.is_applybutton_display(), "Apply button should be display");
		j.applytojob();
	}
	@Test
	public void TC_ID_07_07() throws InterruptedException
	{
		//Check the view profile link
		JobListing_Page j = new JobListing_Page(candidatedriver);
		Assert.assertTrue(j.is_viewprofilelink_display(), "View profile link should be display");
		j.viewprofile_before_applying_to_job();
		Thread.sleep(3000);
		methods.moreopenTabAndmoreCloseTheTab(candidatedriver);
	}
	@Test
	public void TC_ID_07_08() throws InterruptedException
	{
		//Check the edit profile link
		JobListing_Page j = new JobListing_Page(candidatedriver);
		Assert.assertTrue(j.is_editprofilelink_display(), "View profile link should be display");
		j.editprofile_before_applying_to_job();
		Thread.sleep(4000);
		methods.moreopenTabAndmoreCloseTheTab(candidatedriver);
		
	}
	@Test
	public void TC_ID_07_09() throws InterruptedException
	{
		//Check the submit button
		JobListing_Page j = new JobListing_Page(candidatedriver);
		Thread.sleep(3000);
		j.submitjob();
		Thread.sleep(3000);
		Assert.assertTrue(j.is_applied_text_display(), "Applied text should be display");
	}
}
