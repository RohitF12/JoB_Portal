package Candidate_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import POM_Candidate.Candidate_LoginPage;
import POM_Candidate.Candidate_Profile;
import POM_Candidate.Dashboard_Page;
import POM_Candidate.JobListing_Direct_JobApply;
import POM_Candidate.JobListing_Page;
import base.BaseTest;
import utils.ExcelUtilityReg;

//TC_ID_07_23 to TC_ID_07_25

public class TC_ID_07_JobListing_Direct_JobApply extends BaseTest 
{
	@Test
	public void TC_ID_07_23() throws InterruptedException, IOException
	{
		openCandidatebrowser();
		logincandidate(); 
 	    Candidate_Profile p= new Candidate_Profile(candidatedriver);
		p.openelipsisimenu();
		p.opendashboard();
		JobListing_Page l = new JobListing_Page(candidatedriver);
		l.openjoblisting();
		
		JobListing_Direct_JobApply j= new JobListing_Direct_JobApply(candidatedriver);
		//Verify job details by clicking on apply button
		Dashboard_Page d= new Dashboard_Page(candidatedriver);
		j.clickapply();
		j.viewrequirments();
		Thread.sleep(3000);
		j.viewsalary();
		Thread.sleep(3000);
		j.viewbenefit();
		Thread.sleep(3000);
        j.viewskill();
	}
	@Test
	public void TC_ID_07_24() throws InterruptedException
	{
		//Verify Apply button 
		JobListing_Direct_JobApply j= new JobListing_Direct_JobApply(candidatedriver);
		j.applyjob();
		Thread.sleep(4000);
	}
	@Test
	public void TC_ID_07_25()
	{
		//Verify the text 'Applied' display
		JobListing_Direct_JobApply j= new JobListing_Direct_JobApply(candidatedriver);
		j.is_applied_text_display();
	}

}
