package Admin_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import POM_Admin.CurrentApplication_ChangeStatus;
import POM_Admin.Current_Application_Page;
import POM_Admin.Login_Page;
import POM_Candidate.Candidate_Profile;
import POM_Candidate.Your_Applications_Page;
import base.BaseTest;
import utils.ExcelUtilityReg;

public class TC_ID_19_CurrentApplication_ChangeStatus extends BaseTest
{
	@Test
	public void TC_ID_19_09() throws IOException, InterruptedException
	{
		openAdminbrowser();
		loginHR();
	   Current_Application_Page ca = new Current_Application_Page (admindriver);   	     
	   ca.opencurrentapplications();
	   Thread.sleep(4000);
	   CurrentApplication_ChangeStatus c = new CurrentApplication_ChangeStatus(admindriver);
	   c.open_application();
	   methods.switchingtabs(admindriver);
	   Thread.sleep(3000);
	   c.changeStatus(); 
	   Thread.sleep(5000);
	}
	@Test
	public void TC_ID_19_10() throws IOException, InterruptedException
	{
		//To check the status of job Application in candidate Portal
		openCandidatebrowser(); 
		logincandidate();
		 Candidate_Profile p= new Candidate_Profile(candidatedriver);
			p.openelipsisimenu();
			p.opendashboard();
			
		Your_Applications_Page  a = new Your_Applications_Page (candidatedriver);
		    Thread.sleep(3000);
			a.openapplications(); 
			Thread.sleep(3000);
			a.viewdetails();
			methods.switchingtabs(candidatedriver);
			
	   CurrentApplication_ChangeStatus c = new CurrentApplication_ChangeStatus(candidatedriver);	
	   Thread.sleep(3000);
	   c.verify_status_changed();
			
	}
}
