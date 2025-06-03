package Admin_TestScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import POM_Admin.Candidate_Listing;
import base.BaseTest;
import utils.TestListener;

@Listeners(TestListener.class)

public class TC_ID_18_Admin_Candidate_Listing extends BaseTest
{ 
	@Test
	public void TC_ID_18_01() throws IOException, InterruptedException
	{
		openAdminbrowser();
		loginHR();
		//Click on Candidate list page and check page name displayed 
	   Candidate_Listing c = new Candidate_Listing(admindriver);
	   c.opencandidatelist();
	   c.verify_pagename();
	}
	@Test
	public void TC_ID_18_02()
	{
		//To check the column name displayed.
		Candidate_Listing c = new Candidate_Listing(admindriver);
		c.verify_columnName_display();
		c.print_columnName();
	}
	@Test
	public void TC_ID_18_03() throws IOException, InterruptedException
	{
		//To check the search bar is working
		 Candidate_Listing c = new Candidate_Listing(admindriver);
		 c.searchbyname(data.getdata("candidatename"));
		 
	}
	@Test
	public void TC_ID_18_04() throws InterruptedException
	{
		//To check the filter by skills working fine.
		 Candidate_Listing c = new Candidate_Listing(admindriver);
		 Thread.sleep(4000);
		 c.applyskillfilter();
	}
	@Test
	public void TC_ID_18_05() throws IOException
	{
		//To check the Year of Experience  Filter
		Candidate_Listing c = new Candidate_Listing(admindriver);
		c.enterminexp(data.getdata("minimumexp"));
		c.entermaxexp(data.getdata("maximumexp"));
	}
}
