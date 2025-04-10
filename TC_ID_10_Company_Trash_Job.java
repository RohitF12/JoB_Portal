package company.tests;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import config.Config;
import pom.Admin_Job_Listing;
import pom.Company_Trash_Job;
import pom.Post_A_Job;
import utils.ExcelUtilityReg;

public class TC_ID_10_Company_Trash_Job extends BaseTest{

	 @Test
  // To check the page name displayed 
	public void TC_ID_10_01() throws InterruptedException {
	
    setup(); // Initializes the WebDriver and opens the application
   
   // Read username and password from properties file
    String username = Config.getProperty("username");
    String password = Config.getProperty("password");

    // Perform login using POM
    Post_A_Job login2Portal = new Post_A_Job(driver);
    login2Portal.enterUsername(username);
    login2Portal.enterPassword(password);
    login2Portal.clickLogin();
   	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    Thread.sleep(3000);
    
    Company_Trash_Job Trash = new Company_Trash_Job(driver);
    
    Trash.Click_on_Trash();   
    
 // Get the expected Page Name
    String expectedPageName = "Deleted Items";
    
    // Get the current PAge Name from the current page
   
    String actualPageName = Trash.Check_Page_Name_displayed();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    // Verify the Page Name
    Assert.assertEquals(actualPageName, expectedPageName, "The Page Name does not match!");
    
    }
	
    //To check the coulumn name 
	 @Test
	public void TC_ID_10_02() throws InterruptedException {
		 
		    Company_Trash_Job Trash = new Company_Trash_Job(driver);

		    // Get the expected column_1 Name
		     String expectedColumnName_1 = "Posted On";
		     
		    // Get the current column Name from the current page
		    
		     String actualColumnName_1 = Trash.Check_column_1_Name();
		     
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     
		     // Verify the column Name
		     Assert.assertEquals(actualColumnName_1, expectedColumnName_1, "The column Name does not match!");
		     
		 	    // Get the expected column_2 Name
			     String expectedColumnName_2 = "Title";
			     
			    // Get the current column Name from the current page
			    
			     String actualColumnName_2 = Trash.Check_column_2_Name();
			     
			     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			     
			     // Verify the column Name
			     Assert.assertEquals(actualColumnName_2, expectedColumnName_2, "The column Name does not match!");
			     
			     // Get the expected column_3 Name
			     String expectedColumnName_3 = "Company";
			     
			    // Get the current column Name from the current page
			    
			     String actualColumnName_3 = Trash.Check_column_3_Name();
			     
			     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			     
			     // Verify the column Name
			     Assert.assertEquals(actualColumnName_3, expectedColumnName_3, "The column Name does not match!");
			     
			     // Get the expected column_4 Name
			     String expectedColumnName_4 = "Type";
			     
			    // Get the current column Name from the current page
			    
			     String actualColumnName_4 = Trash.Check_column_4_Name();
			     
			     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			     
			     // Verify the column Name
			     Assert.assertEquals(actualColumnName_4, expectedColumnName_4, "The column Name does not match!");
			     
			     // Get the expected column_5 Name
			     String expectedColumnName_5 = "Restore";
			     
			    // Get the current column Name from the current page
			    
			     String actualColumnName_5 = Trash.Check_column_5_Name();
			     
			     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			     
			     // Verify the column Name
			     Assert.assertEquals(actualColumnName_5, expectedColumnName_5, "The column Name does not match!");
			     			   
	     
	     }
	 
	 
	 
	 
//	 Move Job Listing Page and click delete icon and check trash 
	 @Test
	public void TC_ID_10_03() throws InterruptedException, IOException {
		 
		    Company_Trash_Job Trash = new Company_Trash_Job(driver);


	        String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_4");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Job_1 = excel.getCellData(i, 0);
	            
	            Trash.Enter_Job_1_in_Search_Bar(Search_Job_1);
	            
	            break;
	            
	        }
	            
	            Trash.delete_job();
	            
	            Thread.sleep(3000);
	            
	            driver.navigate().refresh();
	            
	            Thread.sleep(3000);
	            
	            Trash.Click_on_Trash();
	           	            
	            Trash.Get_deleted_job_Text();
	            
	         
		 
	 }
	 
//	 Try to restore the deleted job 	 
	 @Test
	public void TC_ID_10_04() throws InterruptedException {
		 
		    Company_Trash_Job Trash = new Company_Trash_Job(driver);

		    Trash.Restore_Job();
		    
	 }
	 
//	 To check the deleted job available in job listing page or not
	 
	 @Test
	public void TC_ID_10_05() throws InterruptedException, IOException {
		 
		    Company_Trash_Job Trash = new Company_Trash_Job(driver);
		    
	        String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_4");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Job_1 = excel.getCellData(i, 0);
	            
	            Trash.Enter_Job_1_in_Search_Bar(Search_Job_1);  

	            String expectedJobName = "Automation Engineer";
	            
	            // Get the current PAge Name from the current page
	           
	            String actualJobName = Trash.Get_job_Text();
	            
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            
	            // Verify the Page Name
	            Assert.assertEquals(actualJobName, expectedJobName, "The Page Name does not match!");
	            
	            break;
	        }
	 
	 }

//	 To check the row per  dropdown and Previouse and next button
	 @Test
	public void TC_ID_10_06() throws InterruptedException, IOException {
		 
		    Company_Trash_Job Trash = new Company_Trash_Job(driver);
		    
		    Trash.Click_on_Trash();
		    
		    Trash.Check_Row_Per_Page();


}}