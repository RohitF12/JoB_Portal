package Candidate_TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Candidate.Candidate_LoginPage;
import POM_Candidate.Candidate_Profile;
import POM_Candidate.Your_Applications_Page;
import base.BaseTest;
import utils.ExcelUtilityReg;

//TC_ID_09_01 to TC_ID_09_10

public class TC_ID_09_Candidate_YourApplication extends BaseTest
{
	@Test
	public void TC_ID_09_01() throws IOException
	{
		openCandidatebrowser();
		logincandidate(); 
   	    Candidate_Profile p= new Candidate_Profile(candidatedriver);
		p.openelipsisimenu();
		p.opendashboard();
		
		//To check the page name displayed
		Your_Applications_Page  a = new Your_Applications_Page (candidatedriver);
		a.openapplications();
		Assert.assertTrue(a.is_page_name_display(), "Page name should be display");
		a.print_pagename();
	}
	@Test
	public void TC_ID_09_02()
	{
		//To check the filters displayed
		Your_Applications_Page  a = new Your_Applications_Page (candidatedriver);
		Assert.assertTrue(a.is_searchbox_display(), "Searchbox filter should be display");
		Assert.assertTrue(a.is_statusfilter_display(), "Status filter should be display");
    }
	
	@Test
	public void TC_ID_09_03()
	{
		//To check the filteroption display
		Your_Applications_Page  a = new Your_Applications_Page (candidatedriver);
		a.display_statusfilteroptions();
	}
	@Test
	public void TC_ID_09_04() throws IOException
	{
		//Check to search the available job in search bar 
		Your_Applications_Page  a = new Your_Applications_Page (candidatedriver);
		a.searchjob(data.getdata("jobtitle"));
	}
	@Test
	public void TC_ID_09_05() throws InterruptedException
	{
		//Verify pending application display if pending filter applied
		Your_Applications_Page  a = new Your_Applications_Page (candidatedriver);
		a.display_Pending_Applications();
	}
	@Test
	public void TC_ID_09_06() throws InterruptedException
	{
		//Verify shorlisted application display if shorlisted filter applied
		Your_Applications_Page  a = new Your_Applications_Page (candidatedriver);
	
		a.display_Shortlisted_Applications();
		
	}
	@Test
	public void TC_ID_09_07() throws InterruptedException, IOException
	{
		//Verify accepted application display if accepted filter applied
		Your_Applications_Page  a = new Your_Applications_Page (candidatedriver);
		a.display_Accepted_Applications();
	}
	@Test
	public void TC_ID_09_08() throws InterruptedException, IOException
	{
		//Verify rejected application display if rejected filter applied
		Your_Applications_Page  a = new Your_Applications_Page (candidatedriver);
		a.display_Rejected_Applications();
	}
	@Test
	public void TC_ID_09_09()
	{
		//To check the view details button
		Your_Applications_Page  a = new Your_Applications_Page (candidatedriver);
		a.viewdetails();
	}
	@Test
	public void TC_ID_09_10() throws IOException
	{
		//Verify the job title display on application list page are correct and same as display on view application details page
		Your_Applications_Page  a = new Your_Applications_Page (candidatedriver);
		methods.switchingtabs(candidatedriver);
		a.verify_samejob_display();
	}
}
