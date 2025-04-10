package Admin_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import POM_Admin.Delete_Restore_Candidate;
import POM_Admin.Trash_Page;
import base.BaseTest;

public class TC_ID_20_Trash extends BaseTest
{
	@Test
	public void  TC_ID_20_01() throws IOException
	{
		//Delete any job from job listing
		openAdminbrowser();
		loginHR();
		Trash_Page t = new Trash_Page(admindriver);
		t.openJobList();
		t.Delete_Job();
		t.Confirm_Delete();
    }
	@Test
	public void  TC_ID_20_02() throws IOException
	{
		//Verify open trash page check the page name displayed 
		Trash_Page t = new Trash_Page(admindriver);
		methods.scrollbar(admindriver, t.Open_trash());
		
	}
	@Test
	public void  TC_ID_20_03() throws IOException
	{
		//Verify deleted jobs display in delete job tab
		Trash_Page t = new Trash_Page(admindriver);
		t.verify_deletedJob();
	}
	@Test
	public void  TC_ID_20_04()
	{
		//Try to restore the deleted job 
		Trash_Page t = new Trash_Page(admindriver);
		t.Restore();
	}
	@Test
	public void  TC_ID_20_05() throws IOException
	{
		//To check the deleted job available in job listing page or not
		Trash_Page t = new Trash_Page(admindriver);
		t.openJobList();
		t.verify_restoredJob();
	}
	@Test
	public void  TC_ID_20_06()
	{
		//Delete any company from company listing
		Trash_Page t = new Trash_Page(admindriver);
		t.openCompanyList();
		t.Delete_Company();
		t.Confirm_Delete();
	}
	@Test
	public void  TC_ID_20_07() throws IOException
	{
		//Verify deleted Companies display in deleted Companies tab
		Trash_Page t = new Trash_Page(admindriver);
		methods.scrollbar(admindriver, t.Open_trash());
		t.verify_deletedComapny();
	}
	@Test
	public void  TC_ID_20_08()
	{
		//Try to restore the deleted Companies
		Trash_Page t = new Trash_Page(admindriver);
		t.Restore();
	}
	@Test
	public void  TC_ID_20_09() throws IOException
	{
		//To check the restred Company available in Company list
		Trash_Page t = new Trash_Page(admindriver);
		t.openCompanyList();
		t.verify_restoreComapny();
	}
}
