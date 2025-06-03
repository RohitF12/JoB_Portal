package Company_TestScripts;

import java.io.IOException;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import POM_Company.Company_Dashboard;
import base.BaseTest;
import utils.TestListener;


@Listeners(TestListener.class)
public class TC_ID_11_Company_Dashboard extends BaseTest{
	
//	To check the page name displayed

	 @Test
	    public void TC_ID_11_01 () throws InterruptedException, IOException {
		  
		//  Profile Notification = new Profile(driver);
	    	
		 openCompanybrowser();
		 loginCompany();
	        Thread.sleep(3000);
	        
	        Company_Dashboard dashboard = new Company_Dashboard(companydriver);
	        
	        dashboard.Click_Home();
	        
	        Assert.assertTrue(dashboard.Check_Page_Name_displayed(), "Page name is not displayed properly");
	        
	        
	     // Get the expected Page Name
	        String expectedPageName = "Dashboard";
	        
	        // Get the current PAge Name from the current page
	       
	        String actualPageName = dashboard.Check_Page_Name();
	        
	      
	        
	        // Verify the Page Name
	        Assert.assertEquals(actualPageName, expectedPageName, "The Page Name does not match!");
	        
	        }
	 
     //To check the Company name and date displayed
	 @Test
	    public void TC_ID_11_02 () throws InterruptedException, IOException {
		 
	        Company_Dashboard dashboard = new Company_Dashboard(companydriver);
	        
	        dashboard.CheckCompanyNameandDate();
	               
	    }
//	To check the Latest Candidate Application section external link arrow should be displayed and working properly
	 @Test
	    public void TC_ID_11_03 () throws InterruptedException, IOException {
		 
	        Company_Dashboard dashboard = new Company_Dashboard(companydriver);
		 
		 dashboard.Click_Latest_Candidate_Applications();
		 
		 dashboard.Click_Home();
	 }
	 
//	To check Accepted Application Arrow working Fine 
	 @Test
	    public void TC_ID_11_04 () throws InterruptedException, IOException {
		 
		 
	        Company_Dashboard dashboard = new Company_Dashboard(companydriver);
		 
		 dashboard.Click_Accepted_Applications();;
		 
		 dashboard.Click_Home();
		 
		 
		 
	 }
//	To check the pending Application external link arrow should be displayed and working properly
	 @Test
	    public void TC_ID_11_05 () throws InterruptedException, IOException {
		 
	        Company_Dashboard dashboard = new Company_Dashboard(companydriver);
		 
		 dashboard.Click_Pending_Applications();
		 
		 dashboard.Click_Home();
	 }
   //	Check the Shortlisted Application arrow link working Fine  
	 @Test
	    public void TC_ID_11_06 () throws InterruptedException, IOException {
		 
	        Company_Dashboard dashboard = new Company_Dashboard(companydriver);
		 
		 dashboard.Click_Shortlisted_Applications();
		 
		 dashboard.Click_Home();
	 }
	 
      //Check the Job_Posted arrow link working Fine 
		 @Test
		    public void TC_ID_11_07 () throws InterruptedException, IOException {
			 
		        Company_Dashboard dashboard = new Company_Dashboard(companydriver);
			 
			 dashboard.Click_Job_Posted();
			 
			 dashboard.Click_Home();
		 }



}
