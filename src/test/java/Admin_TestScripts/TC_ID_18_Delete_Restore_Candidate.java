package Admin_TestScripts;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import POM_Admin.Candidate_Listing;
import POM_Admin.Delete_Restore_Candidate;
import POM_Admin.Login_Page;
import base.BaseTest;
import utils.ExcelUtilityReg;
import utils.TestListener;
@Listeners(TestListener.class)

public class TC_ID_18_Delete_Restore_Candidate extends BaseTest
{
	@Test
	public void TC_ID_18_09() throws InterruptedException, IOException
	{
		openAdminbrowser();
		loginHR();
		//To check that delete icon is working properly
		Candidate_Listing cl = new Candidate_Listing(admindriver);
		cl.opencandidatelist();
		Thread.sleep(3000);
		Delete_Restore_Candidate d = new Delete_Restore_Candidate(admindriver);
		Thread.sleep(3000);
		d.DeleteCandidate();
	}
	@Test
	public void TC_ID_18_10() throws IOException, InterruptedException
	{
		//In Trash check that delete Candidate is available or not
		Delete_Restore_Candidate d = new Delete_Restore_Candidate(admindriver);
		Thread.sleep(3000);
		d.open_Trash();
		Thread.sleep(3000);
		d.verify_candidate_DeletedSuccessfully();
	}
	@Test
	public void TC_ID_18_11() throws InterruptedException 
	{
		//Check user able to restore candidate 
		Delete_Restore_Candidate d = new Delete_Restore_Candidate(admindriver);
		Thread.sleep(3000);
		d.restore_Candidate();
	}
	@Test
	public void TC_ID_18_12() throws InterruptedException, IOException
	{
		//Verify restored candidate display in candidate listing
		Candidate_Listing cl = new Candidate_Listing(admindriver);
		Thread.sleep(3000);
		cl.opencandidatelist();
		Thread.sleep(3000);
		Delete_Restore_Candidate d = new Delete_Restore_Candidate(admindriver);
		d.verify_candidate_restoredSuccessfully();
	}


}
