package Company_TestScripts;

import java.io.IOException;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import POM_Company.Company_Trash_Job;
import POM_Company.Job_Listing_04;
import POM_Company.Post_A_Job;
import base.BaseTest;
import utils.ExcelUtilityReg;
import utils.TestListener;


@Listeners(TestListener.class)

public class TC_ID_10_Company_Trash_Job extends BaseTest
{
	@Test
  // To check the page name displayed 
	public void TC_ID_10_01() throws InterruptedException, IOException 
	{
		 openCompanybrowser() ;
		 loginCompany();
    Company_Trash_Job Trash = new Company_Trash_Job(companydriver);
    Thread.sleep(3000);
    Trash.Click_on_Trash();   
    
 // Get the expected Page Name
    String expectedPageName = "Deleted Items";
    
    // Get the current PAge Name from the current page
   
    String actualPageName = Trash.Check_Page_Name_displayed();
    
    companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    // Verify the Page Name
    Assert.assertEquals(actualPageName, expectedPageName, "The Page Name does not match!");
    
    }
	
    //To check the coulumn name 
	 @Test
	public void TC_ID_10_02() throws InterruptedException {
		 
		    Company_Trash_Job Trash = new Company_Trash_Job(companydriver);

		    // Get the expected column_1 Name
		     String expectedColumnName_1 = "Posted On";
		     
		    // Get the current column Name from the current page
		    
		     String actualColumnName_1 = Trash.Check_column_1_Name();
		     
		     companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     
		     // Verify the column Name
		     Assert.assertEquals(actualColumnName_1, expectedColumnName_1, "The column Name does not match!");
		     
		 	    // Get the expected column_2 Name
			     String expectedColumnName_2 = "Title";
			     
			    // Get the current column Name from the current page
			    
			     String actualColumnName_2 = Trash.Check_column_2_Name();
			     
			     companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			     
			     // Verify the column Name
			     Assert.assertEquals(actualColumnName_2, expectedColumnName_2, "The column Name does not match!");
			     
			     // Get the expected column_3 Name
			     String expectedColumnName_3 = "Company";
			     
			    // Get the current column Name from the current page
			    
			     String actualColumnName_3 = Trash.Check_column_3_Name();
			     
			     companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			     
			     // Verify the column Name
			     Assert.assertEquals(actualColumnName_3, expectedColumnName_3, "The column Name does not match!");
			     
			     // Get the expected column_4 Name
			     String expectedColumnName_4 = "Type";
			     
			    // Get the current column Name from the current page
			    
			     String actualColumnName_4 = Trash.Check_column_4_Name();
			     
			     companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			     
			     // Verify the column Name
			     Assert.assertEquals(actualColumnName_4, expectedColumnName_4, "The column Name does not match!");
			     
			     // Get the expected column_5 Name
			     String expectedColumnName_5 = "Restore";
			     
			    // Get the current column Name from the current page
			    
			     String actualColumnName_5 = Trash.Check_column_5_Name();
			     
			     companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			     
			     // Verify the column Name
			     Assert.assertEquals(actualColumnName_5, expectedColumnName_5, "The column Name does not match!");
	     }
	 
//	 Move Job Listing Page and click delete icon and check trash 
	 @Test
	public void TC_ID_10_03() throws InterruptedException, IOException {
		 
		   Job_Listing_04 j = new Job_Listing_04(companydriver);
		   
		    Company_Trash_Job Trash = new Company_Trash_Job(companydriver);
		    
            String FilePath = data.getdata("filePath");
	    	
	    	String SheetName = data.getdata("sheetName_4");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Job_2 = excel.getCellData(i, 1);
	            j.Click_on_Job_Listing_Page();
	            Trash.Enter_Job_1_in_Search_Bar(Search_Job_2);
	            
	            break;
	            
	        }
	            Trash.delete_job();
	            
	            Thread.sleep(3000);
	            
	            companydriver.navigate().refresh();
	            
	            Thread.sleep(3000);
	            
	            Trash.Click_on_Trash();
	           	            
	            Trash.Get_deleted_job_Text();
 }
	 
//	 Try to restore the deleted job 	 
	 @Test
	public void TC_ID_10_04() throws InterruptedException {
		 
		    Company_Trash_Job Trash = new Company_Trash_Job(companydriver);

		    Trash.Restore_Job();
		    
	 }
	 
//	 To check the deleted job available in job listing page or not
	 
	 @Test
	public void TC_ID_10_05() throws InterruptedException, IOException {
		   Job_Listing_04 j = new Job_Listing_04(companydriver);
		   j.Click_on_Job_Listing_Page();
		   
		   
		   Company_Trash_Job Trash = new Company_Trash_Job(companydriver);
		    Trash.verify_restore_job();
		   /*  String FilePath = data.getdata("filePath");
	    	
	    	String SheetName = data.getdata("sheetName_4");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Job_2 = excel.getCellData(i, 1);
	            
	            Trash.Enter_Job_1_in_Search_Bar(Search_Job_2);  

	           // String expectedJobName = "Automation Engineer";
	            
	            // Get the current PAge Name from the current page
	           
	            String actualJobName = Trash.Get_job_Text();
	            
	            companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            
	            // Verify the Page Name
	            Assert.assertEquals(actualJobName, expectedJobName, "The Page Name does not match!");
	            
	            break;
	        }*/
   }

//	 To check the row per  dropdown and Previouse and next button
	 @Test
	public void TC_ID_10_06() throws InterruptedException, IOException 
	     {
		    Company_Trash_Job Trash = new Company_Trash_Job(companydriver);
		    
		    Trash.Click_on_Trash();
		    
		    Trash.Check_Row_Per_Page();


          }
	 }