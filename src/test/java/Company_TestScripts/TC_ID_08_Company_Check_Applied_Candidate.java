package Company_TestScripts;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import POM_Company.Company_Check_Applied_Candidate_08;
import POM_Company.Job_Listing_04;
import base.BaseTest;
import utils.ExcelUtilityReg;
import utils.TestListener;

@Listeners(TestListener.class)

public class TC_ID_08_Company_Check_Applied_Candidate extends BaseTest
{
	@Test
	//To check that toggle closed and open the left panel
	public void TC_ID_08_01() throws InterruptedException, IOException 
	
	 {
		 openCompanybrowser() ;
		 
		 loginCompany();
		 
      //Click on Job Applied Candidate page and check page name displayed 
	 
	     Company_Check_Applied_Candidate_08 Applied_Candidates=  new Company_Check_Applied_Candidate_08(companydriver);
	     
	     Applied_Candidates.Click_on_Applied_Candidate_Page();
	     
	     Assert.assertTrue(Applied_Candidates.Check_Page_Name_displayed(), "Page name is not displayed properly");
	     	     
	  // Get the expected Page Name
	     String expectedPageName = "Applied Candidates";
	     
	     // Get the current PAge Name from the current page
	    
	     String actualPageName = Applied_Candidates.Check_Page_Name();
	     
	     companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     // Verify the Page Name
	     Assert.assertEquals(actualPageName, expectedPageName, "The Page Name does not match!");
	 }  
	 
	    @Test
		//To check the search bar is enable/displayed and Working Fine
		public void TC_ID_08_02() throws InterruptedException, IOException {	   
	    	
	    	Job_Listing_04 jobListingsPage=  new Job_Listing_04(companydriver);
	    	
	    	jobListingsPage.Check_Search_Bar();
	    	
	  	  String filePath = data.getdata("filePath");   
		  String SheetName = data.getdata("sheetName_4");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(filePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) 
	        { // Assuming row 0 is the header
	        	
	            String Search_Job_1 = excel.getCellData(i, 0);
	            
	            jobListingsPage.Enter_Job_1_in_Search_Bar(Search_Job_1);
	            
	            Thread.sleep(2000);
	            
	            jobListingsPage.Clear_Search_Bar();
	            
                String Search_Job_2 = excel.getCellData(i, 1);
	            
	            jobListingsPage.Enter_Job_2_in_Search_Bar(Search_Job_2);
	            
	            Thread.sleep(2000);
	            
	            jobListingsPage.Clear_Search_Bar();
	            
	            String Search_Job_3 = excel.getCellData(i, 2);
		            
		        jobListingsPage.Enter_Job_3_in_Search_Bar(Search_Job_3);
		            
		        Thread.sleep(2000);
		            
		        jobListingsPage.Clear_Search_Bar();
		        
		        String Search_Job_4 = excel.getCellData(i, 3);
	            
		        jobListingsPage.Enter_Job_4_in_Search_Bar(Search_Job_4);
		            
		        Thread.sleep(2000);
		            
		        jobListingsPage.Clear_Search_Bar();
		        
                String Search_Job_5 = excel.getCellData(i, 4);
	            
		        jobListingsPage.Enter_Job_5_in_Search_Bar(Search_Job_5);
		            
		        Thread.sleep(2000);
		            
		        jobListingsPage.Clear_Search_Bar();
		        companydriver.navigate().refresh();
		        break;
	        }
	      /* 
               for (int i = 5; i <=5; i++) 
               { // Assuming row 0 is the header
	        	
	            String Search_Candidate_1 = excel.getCellData(i, 4);
	            
	            jobListingsPage.Enter_Job_1_in_Search_Bar(Search_Candidate_1);
	            
	            Thread.sleep(2000);
	            
	            jobListingsPage.Clear_Search_Bar();
	            
	            companydriver.navigate().refresh();
	           }*/
	 }
	        @Test		    
			//To check the column name displayed
			public void TC_ID_08_03() throws InterruptedException, IOException {	
	        	
	        Company_Check_Applied_Candidate_08 Applied_Candidate = new Company_Check_Applied_Candidate_08(companydriver);

	      	    // Get the expected column_1 Name
	    	     String expectedColumnName_1 = "Applied On";
	    	     
	    	    // Get the current column Name from the current page
	    	    
	    	     String actualColumnName_1 = Applied_Candidate.Check_column_1_Name();
	    	     
	    	     companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	     
	    	     // Verify the column Name
	    	     Assert.assertEquals(actualColumnName_1, expectedColumnName_1, "The column Name does not match!");
	    	     
	    	 	    // Get the expected column_2 Name
	    		     String expectedColumnName_2 = "Candidate";
	    		     
	    		    // Get the current column Name from the current page
	    		    
	    		     String actualColumnName_2 = Applied_Candidate.Check_column_2_Name();
	    		     
	    		     companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    		     
	    		     // Verify the column Name
	    		     Assert.assertEquals(actualColumnName_2, expectedColumnName_2, "The column Name does not match!");
	    		     
	    		     // Get the expected column_3 Name
	    		     String expectedColumnName_3 = "Job Title";
	    		     
	    		    // Get the current column Name from the current page
	    		    
	    		     String actualColumnName_3 = Applied_Candidate.Check_column_3_Name();
	    		     
	    		     companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    		     
	    		     // Verify the column Name
	    		     Assert.assertEquals(actualColumnName_3, expectedColumnName_3, "The column Name does not match!");
	    		     
	    		     // Get the expected column_4 Name
	    		     String expectedColumnName_4 = "Current CTC";
	    		     
	    		    // Get the current column Name from the current page
	    		    
	    		     String actualColumnName_4 = Applied_Candidate.Check_column_4_Name();
	    		     
	    		     companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    		     
	    		     // Verify the column Name
	    		     Assert.assertEquals(actualColumnName_4, expectedColumnName_4, "The column Name does not match!");
	    		     
	    		     // Get the expected column_5 Name
	    		     String expectedColumnName_5 = "Notice Period";
	    		     
	    		    // Get the current column Name from the current page
	    		    
	    		     String actualColumnName_5 = Applied_Candidate.Check_column_5_Name();
	    		     
	    		     companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    		     
	    		     // Verify the column Name
	    		     Assert.assertEquals(actualColumnName_5, expectedColumnName_5, "The column Name does not match!");
	    		     
	    		     // Get the expected column_6 Name
	    		     String expectedColumnName_6 = "Status";
	    		     
	    		    // Get the current column Name from the current page
	    		    
	    		     String actualColumnName_6 = Applied_Candidate.Check_column_6_Name();
	    		     
	    		     companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    		     
	    		     // Verify the column Name
	    		     Assert.assertEquals(actualColumnName_6, expectedColumnName_6, "The column Name does not match!");
          }         

	     @Test		    
		//Click on Job _1 and check the candidate details 
		public void TC_ID_08_04() throws InterruptedException, IOException 
	       {	
		        Company_Check_Applied_Candidate_08 Applied_Candidate = new Company_Check_Applied_Candidate_08(companydriver);
	    	 
		      //  Applied_Candidate.Click_Job_1();
		        
		      //  Applied_Candidate.Get_Text_Candidate_Page();
		       
		        Applied_Candidate.Click_Job_Automation_Tester();
		        
		        Applied_Candidate.Get_Text_Candidate_Page();
		        			     
		        companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		       
		   }  
	     	     	  	
	       @Test
	        //To check that Candidate Resume button and view Job Details Link 
			public void TC_ID_08_05() throws InterruptedException, IOException 
	        {	
	        	
	       Company_Check_Applied_Candidate_08 Applied_Candidate = new Company_Check_Applied_Candidate_08(companydriver);	
	             
	      Applied_Candidate.Check_Resume();
	     
	      Thread.sleep(3000);       	       	       
	       Applied_Candidate.Check_Job_Link();
	      
	       
         }

      @Test
	    //To check that Job Status changes successfully(Pending- ShortListed)			
		public void TC_ID_08_06() throws InterruptedException, IOException {	
	        	
	 	  Company_Check_Applied_Candidate_08 Applied_Candidate = new Company_Check_Applied_Candidate_08(companydriver);	
	 	 Thread.sleep(4000); 
	 	  Applied_Candidate.Status_ShortListed();
	 	       	     
			// Get the expected Page Name
			String expectedStatus = "Short-Listed";
			     
		    // Get the current PAge Name from the current page
			    
			String actualStatus = Applied_Candidate.Text_Status_ShortListed();
			// Verify the Page Name
			Assert.assertEquals(actualStatus, expectedStatus, "Status Name does not match!");
			  Set<String> windowHandles = companydriver.getWindowHandles();
	    	  Iterator<String> iterator = windowHandles.iterator();

	    	  // Get the main tab and child tab
	    	  String parentWindow = iterator.next();
	    	  String childWindow = iterator.next();
	    	  
	    	  // Switch to the resume tab (child tab)
	    	  companydriver.switchTo().window(childWindow);

	    	  companydriver.close();
	    	  
	    	  companydriver.switchTo().window(parentWindow);
         }
     
	   @Test		    
		//To check the status Change from Pending to Accepted 
		public void TC_ID_08_07() throws InterruptedException, IOException {
	        	
	  	 	Company_Check_Applied_Candidate_08 Applied_Candidate = new Company_Check_Applied_Candidate_08(companydriver);	
	  	    Thread.sleep(5000); 
	  	 	Applied_Candidate.Select_Data_Analyst_Job();
	  	 	
	  	    Applied_Candidate.Get_Text_Candidate_Page();
		                   
		  //Applied_Candidate.Check_Resume();	
        		       		     
		  //Applied_Candidate.Check_Job_Link();		       
	  	     Thread.sleep(5000); 
		     Applied_Candidate.Status_Accepted();
		     
		     Applied_Candidate.Text_Status_Accepted();
		     
		   	  Set<String> windowHandles = companydriver.getWindowHandles();
	    	  Iterator<String> iterator = windowHandles.iterator();

	    	  // Get the main tab and child tab
	    	  String parentWindow = iterator.next();
	    	  String childWindow = iterator.next();
	    	  
	    	  // Switch to the resume tab (child tab)
	    	  companydriver.switchTo().window(childWindow);

	    	  companydriver.close();
	    	  
	    	  companydriver.switchTo().window(parentWindow);
		     
	         }
	        
	        @Test
		    
	    	//To check the status Change from Pending to Rejected  
	    	public void TC_ID_08_08() throws InterruptedException, IOException {	
	        	
	        	Company_Check_Applied_Candidate_08 Applied_Candidate = new Company_Check_Applied_Candidate_08(companydriver);	
	        	Thread.sleep(5000); 
		  	 	Applied_Candidate.Select_Team_Lead_Job();
		  	 	
		  	     Applied_Candidate.Get_Text_Candidate_Page();
			     
		  	   companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        
			 //    Applied_Candidate.Check_Resume();	
	        				       
			//     Applied_Candidate.Check_Job_Link();
		  	 Thread.sleep(5000);       	
			     Applied_Candidate.Status_Rejected();
			     
			     Applied_Candidate.Text_Status_Rejected();
			     
			   	  Set<String> windowHandles = companydriver.getWindowHandles();
		    	  Iterator<String> iterator = windowHandles.iterator();

		    	  // Get the main tab and child tab
		    	  String parentWindow = iterator.next();
		    	  String childWindow = iterator.next();
		    	  
		    	  // Switch to the resume tab (child tab)
		    	  companydriver.switchTo().window(childWindow);

		    	  companydriver.close();
		    	  
		    	  companydriver.switchTo().window(parentWindow);
       }
	        @Test		    
	       	//Login with the candidate and check the all job Status displayed correctly or not  
	       	public void TC_ID_08_09() throws InterruptedException, IOException {
	           	
	           openCandidatebrowser();	
	       	  logincandidate();	  
	            Company_Check_Applied_Candidate_08 Applied_Candidate = new Company_Check_Applied_Candidate_08(candidatedriver);	
	    	      Thread.sleep(3000);
	    	      Applied_Candidate.Check_Job_Status();
	         } 
     
       @Test		    
 	   //To Check the Filter By Status Working Fine  
 	    public void TC_ID_08_10() throws InterruptedException, IOException {
    	 openCompanybrowser();
    	 loginCompany();
       	Company_Check_Applied_Candidate_08 Applied_Candidate = new Company_Check_Applied_Candidate_08(companydriver);	
 	
       	Applied_Candidate.Click_on_Applied_Candidate_Page();
        Thread.sleep(3000); 
       	Applied_Candidate.Filter_By_Status();
        Thread.sleep(3000);
       	companydriver.navigate().refresh();
       	
             }
       @Test		    
 	    public void TC_ID_08_11() throws InterruptedException, IOException {
    	   //To check the filter by Active Candidate Working Fine 
       	Company_Check_Applied_Candidate_08 Applied_Candidate = new Company_Check_Applied_Candidate_08(companydriver);	
       	Thread.sleep(3000);
       	Applied_Candidate.Filter_By_Active_Inactive();
       	
       	companydriver.navigate().refresh();
   }
       
       @Test		    
  	   //To Check That Both The Filter Working Fine Together 
  	    public void TC_ID_08_12() throws InterruptedException, IOException {
             	 
        Company_Check_Applied_Candidate_08 Applied_Candidate = new Company_Check_Applied_Candidate_08(companydriver);	
        Thread.sleep(3000);
        Applied_Candidate.Both_Filter_Together();
        	
        companydriver.navigate().refresh();
    }
       
       @Test		    
  	   //To check the row per page   
  	    public void TC_ID_08_13() throws InterruptedException, IOException {
             	 
        Company_Check_Applied_Candidate_08 Applied_Candidate = new Company_Check_Applied_Candidate_08(companydriver);	
        Thread.sleep(3000);
        Applied_Candidate.Check_Row_Per_Page();
     }
       
      
}
        