package Candidate_TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Candidate.Candidate_LoginPage;
import POM_Candidate.Candidate_Profile;
import POM_Candidate.Dashboard_Page;
import POM_Candidate.JobListing_Page;
import POM_Candidate.Your_Applications_Page;
import base.BaseTest;
import utils.ExcelUtilityReg;

//TC_ID_07_18 to TC_ID_07_22 & 26

public class TC_ID_07_Dashboard_Page extends BaseTest
{
		@Test
		public void TC_ID_07_18() throws InterruptedException, IOException
		{
			openCandidatebrowser();
			logincandidate(); 
            //open dashboard
	  	    Candidate_Profile p= new Candidate_Profile(candidatedriver);
			p.openelipsisimenu();
			p.opendashboard();
	  	    //Verify page title and candidate name and todays date display on dashboard
	  	    Dashboard_Page d= new Dashboard_Page(candidatedriver);
	  	    Assert.assertTrue( d.is_todaysdateandname_display(), "Todays date and candidate name should be dislay");
	  	    d.display_name_todaysDate();
	  	    Assert.assertTrue( d.is_title_display(), "Title should be dislay");
            d.display_title();
		}
		@Test
		public void TC_ID_07_19() throws InterruptedException
		{
			//Verify latest job display in the latest job section
			 Dashboard_Page d= new Dashboard_Page(candidatedriver);
			 d.verify_latestjobs_display_correctly();
		}
		@Test
		public void TC_ID_07_20() throws InterruptedException
		{
			Candidate_Profile p= new Candidate_Profile(candidatedriver);
			p.opendashboard();
			//Verify job details by clicking on apply button
			Dashboard_Page d= new Dashboard_Page(candidatedriver);
			d.clickapply();
			d.viewrequirments();
			Thread.sleep(3000);
			d.viewsalary();
			Thread.sleep(3000);
			d.viewbenefit();
			Thread.sleep(3000);
            d.viewskill();
		}
		@Test
		public void TC_ID_07_21() throws InterruptedException
		{
			//Verify Apply button 
			Dashboard_Page d= new Dashboard_Page(candidatedriver);
			d.applyjob();
			Thread.sleep(5000);
		}
		@Test
		public void TC_ID_07_22() throws InterruptedException
		{
			//Verify job gets disappear after job applied 
			Dashboard_Page d= new Dashboard_Page(candidatedriver);
			d.verify_latestjobs_display_correctly();
		}
		@Test
		public void TC_ID_07_26() throws InterruptedException
		{
			//Verify navigation from dashboard to the listing page and your application page
			Candidate_Profile p= new Candidate_Profile(candidatedriver);
	    	p.opendashboard();
			Dashboard_Page d= new Dashboard_Page(candidatedriver);
			d.navigateTo_joblisting();
			JobListing_Page j = new JobListing_Page(candidatedriver);
			Assert.assertTrue(j.is_page_name_display(), "Job listing page should be display");
			j.print_pagename();
			
			p.opendashboard();
			d.navigateTo_YourAppliactions();
			Your_Applications_Page  a = new Your_Applications_Page (candidatedriver);
			Assert.assertTrue(a.is_page_name_display(), "Your applications page should be display");
		    a.print_pagename();
		}
}
