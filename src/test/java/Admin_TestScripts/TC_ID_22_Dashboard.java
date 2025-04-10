package Admin_TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Admin.Dashboard;
import POM_Pages.Dashboard_Page;
import POM_Pages.Login_Page;
import base.BaseTest;

public class TC_ID_22_Dashboard extends BaseTest
{
	
	@Test
	public void TC_ID_22_01() throws InterruptedException, IOException
	{
		openAdminbrowser();
		loginHR();
		//Verify dashboard module display
	 Dashboard d = new Dashboard(admindriver);
	 Assert.assertTrue(d.is_dashboardModule_display(), "Dashboard module should be display"); 
	}
	@Test
	public void TC_ID_22_02()
	{
		//Verify dashboard page and page title display
		 Dashboard d = new Dashboard(admindriver);
		 Assert.assertTrue(d.is_PageTitle_display(), "Page title should be display");
	}
	@Test
	public void TC_ID_22_03()
	{
		//Verify elements present on page
		Dashboard d = new Dashboard(admindriver);
		Assert.assertTrue(d.is_jobPosted_display(), "Job post should be display");
		d.print_JobPost();
		Assert.assertTrue(d.is_ApplicationSubmitted_display(), "Application submitted should be display");
		d.print_ApplicationSubmitted();
		Assert.assertTrue(d.is_ApplicationClosed_display(), "Application closed should be display");
        d.print_ApplicationClosed();
        Assert.assertTrue(d.is_ApplicationPending_display(), "Application pending should be display");
        d.print_ApplicationPending();
	}
	@Test
	public void TC_ID_22_04()
	{
		//Verify navigation of job post
		Dashboard d = new Dashboard(admindriver);
		d.openjobs();
	}
	@Test
	public void TC_ID_22_05() throws InterruptedException
	{
		//Verify job count on dashboard and no of jobs display on listing
		Dashboard d = new Dashboard(admindriver);
		d.displaynoofjobpost();
		Thread.sleep(3000);
		d.verify_correctCount_display_for_JobPost();
	}
	@Test
	public void TC_ID_22_06() 
	{
		//Verify navigation of applications submitted
		Dashboard d = new Dashboard(admindriver);
		d.openapplicationsubmitted();
	}
	@Test
	public void TC_ID_22_07() throws InterruptedException 
	{
		System.out.println("------------------------------");
		//Verify applications submitted count on dashboard and no of applications display on current application listing
		Dashboard d = new Dashboard(admindriver);
	    d.noofapplicationssubmitted();
	    d.verify_correctCount_display_for_ApplicationSubmitted();
	}
	@Test
	public void TC_ID_22_08() 
	{
		//Verify navigation of applications closed
		Dashboard d = new Dashboard(admindriver);
		d.closedapplications();
	}
	@Test
	public void TC_ID_22_09() throws InterruptedException
	{
		System.out.println("------------------------------");
		//Verify applications closed count on dashboard and no of applications closed display on current application listing
		Dashboard d = new Dashboard(admindriver);
		d.displaynoofclosedapplications();
		d.verify_correctCount_display_for_ApplicationClosed();
	}
	@Test
	public void TC_ID_22_10() 
	{
		//Verify navigation of applications closed
		Dashboard d = new Dashboard(admindriver);
	    d.pendingapplications();
	    
	}
	@Test
	public void TC_ID_22_11()throws InterruptedException
	{
		System.out.println("------------------------------");
		//Verify applications pending count on dashboard and no of applications pending display on current application listing
		Dashboard d = new Dashboard(admindriver);
		d.displaynoofpendingapplications();
		d.verify_correctCount_display_for_ApplicationPending();
	}

}
