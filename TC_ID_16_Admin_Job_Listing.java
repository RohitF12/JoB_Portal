package company.tests;

import java.io.IOException;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest_Admin;
import config.Config;
import pom.Admin_Job_Listing;
import pom.Admin_Post_A_Job;
import utils.ExcelUtilityReg;

public class TC_ID_16_Admin_Job_Listing extends BaseTest_Admin {
	
	 @Test
		//To check that toggle closed and open the left panel
		public void TC_ID_16_01() throws InterruptedException {
		
		Launch(); // Initializes the WebDriver and opens the application
		    
		Thread.sleep(7000);
			
		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
			    	    		    	    
		    // Read username and password from properties file
		String username_1 = Config.getProperty("username_Admin");
		String password_1 = Config.getProperty("password_Admin");

		    // Perform login using POM
		     Job_Listing.enterUsername(username_1);
		     Job_Listing.enterPassword(password_1);
		     Job_Listing.clickLogin();
		    	
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		     Thread.sleep(3000);
	
      //Click on Job Listing  page and check page name displayed 
	 
	 // Job_Listing_16 Job_Listing = new Job_Listing_16(driver);
	     
	 Job_Listing.Click_on_Job_Listing_Page();
	     
	 Assert.assertTrue(Job_Listing.Check_Page_Name_displayed(), "Page name is not displayed properly");
	     	     
	  // Get the expected Page Name
	     String expectedPageName = "Job Listings";
	     
	     // Get the current PAge Name from the current page
	    
	     String actualPageName = Job_Listing.Check_Page_Name();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     // Verify the Page Name
	     Assert.assertEquals(actualPageName, expectedPageName, "The Page Name does not match!");
	 } 


	 @Test
 
	//To check the search bar is working or not
	public void TC_ID_16_02() throws InterruptedException, IOException {	   
 	
	Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
 	
 	Job_Listing.Check_Search_Bar();
 	
 	String FilePath = Config.getProperty("filePath");
 	
 	String SheetName = Config.getProperty("sheetName_9");
 	
   // Initialize Excel utility
     ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
     
     for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
     	
         String Search_Job_1 = excel.getCellData(i, 0);
         
         Job_Listing.Enter_Job_1_in_Search_Bar(Search_Job_1);
         
         Thread.sleep(2000);
         
         Job_Listing.Clear_Search_Bar();
         
     }
      
   for (int i = 1; i <= 1; i++) { // Assuming row 0 is the header
     	
         String Search_Job_2 = excel.getCellData(i, 1);
         
         Job_Listing.Enter_Job_1_in_Search_Bar(Search_Job_2);
         
         Thread.sleep(2000);
         
         Job_Listing.Clear_Search_Bar();
         
     }
   
   for (int i = 1; i <= 1; i++) { // Assuming row 0 is the header
   	
       String Search_Job_2 = excel.getCellData(i, 2);
       
       Job_Listing.Enter_Job_1_in_Search_Bar(Search_Job_2);
       
       Thread.sleep(2000);
       
       Job_Listing.Clear_Search_Bar();
       
   }
   
   for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
     	
       String Search_Job_3 = excel.getCellData(i, 3);
       
       Job_Listing.Enter_Job_1_in_Search_Bar(Search_Job_3);
       
       Thread.sleep(2000);
       
       Job_Listing.Clear_Search_Bar();
       
   }
   
   for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
   	
       String Search_Job_4 = excel.getCellData(i, 4);
       
       Job_Listing.Enter_Job_1_in_Search_Bar(Search_Job_4);
       
       Thread.sleep(2000);
       
       Job_Listing.Clear_Search_Bar();
       
   }
         
 }
           
//To check the column name displayed.
 @Test
	public void TC_ID_16_03() throws InterruptedException, IOException {
 
		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);

	    // Get the expected column_1 Name
	     String expectedColumnName_1 = "Title";
	     
	    // Get the current column Name from the current page
	    
	     String actualColumnName_1 = Job_Listing.Check_column_1_Name();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     // Verify the column Name
	     Assert.assertEquals(actualColumnName_1, expectedColumnName_1, "The column Name does not match!");
	     
	 	    // Get the expected column_2 Name
		     String expectedColumnName_2 = "Posted On";
		     
		    // Get the current column Name from the current page
		    
		     String actualColumnName_2 = Job_Listing.Check_column_2_Name();
		     
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     
		     // Verify the column Name
		     Assert.assertEquals(actualColumnName_2, expectedColumnName_2, "The column Name does not match!");
		     
		     // Get the expected column_3 Name
		     String expectedColumnName_3 = "Type";
		     
		    // Get the current column Name from the current page
		    
		     String actualColumnName_3 = Job_Listing.Check_column_3_Name();
		     
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     
		     // Verify the column Name
		     Assert.assertEquals(actualColumnName_3, expectedColumnName_3, "The column Name does not match!");
		     
		     // Get the expected column_4 Name
		     String expectedColumnName_4 = "Experience";
		     
		    // Get the current column Name from the current page
		    
		     String actualColumnName_4 = Job_Listing.Check_column_4_Name();
		     
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     
		     // Verify the column Name
		     Assert.assertEquals(actualColumnName_4, expectedColumnName_4, "The column Name does not match!");
		     
		     // Get the expected column_5 Name
		     String expectedColumnName_5 = "City";
		     
		    // Get the current column Name from the current page
		    
		     String actualColumnName_5 = Job_Listing.Check_column_5_Name();
		     
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     
		     // Verify the column Name
		     Assert.assertEquals(actualColumnName_5, expectedColumnName_5, "The column Name does not match!");
		     
		     // Get the expected column_6 Name
		     String expectedColumnName_6 = "Edit";
		     
		    // Get the current column Name from the current page
		    
		     String actualColumnName_6 = Job_Listing.Check_column_6_Name();
		     
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     
		     // Verify the column Name
		     Assert.assertEquals(actualColumnName_6, expectedColumnName_6, "The column Name does not match!");
		     
		     // Get the expected column_7 Name
		     String expectedColumnName_7 = "Delete";
		     
		    // Get the current column Name from the current page
		    
		     String actualColumnName_7 = Job_Listing.Check_column_7_Name();
		     
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     
		     // Verify the column Name
		     Assert.assertEquals(actualColumnName_7, expectedColumnName_7, "The column Name does not match!");
		     
     
     }

 
 //To open the job_1 and check that information displayed in the page after selecting job 
 @Test
	public void TC_ID_16_04() throws InterruptedException, IOException {
 
		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
 	
 	//select 1st job Automation Engineers
 	
     String FilePath = Config.getProperty("filePath");
 	
 	String SheetName = Config.getProperty("sheetName_9");
 	   // Initialize Excel utility
     ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
     
     for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
     	
         String Search_Job_1 = excel.getCellData(i, 0);
         
         Job_Listing.Enter_Job_1_in_Search_Bar(Search_Job_1);
         
         Job_Listing.Click_Job_1();         
         
        Job_Listing.Clear_Search_Bar();
         
/*            Job_Listing.Check_Job_Name();
     
          Job_Listing.Check_company_name();
               
           Job_Listing.Check_Type();
               
            Job_Listing.Check_Year();
                               
            Job_Listing.Check_location_Type();
               
             Job_Listing.Check_Posted_By();
               
             Job_Listing.Check_Apply_By();
               
              Job_Listing.Check_Salary_range();
               
              Job_Listing.Check_Skill();
               
              Job_Listing.Check_benifit();
               
              Job_Listing.Check_description();
   */           
        
     }}
 
 //To open the job_2 and check that information displayed in the page after selecting job
 @Test
	public void TC_ID_16_05() throws InterruptedException, IOException {
 
		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
 	
 	//select 1st job Automation Engineers
 	
     String FilePath = Config.getProperty("filePath");
 	
 	String SheetName = Config.getProperty("sheetName_9");
 	
   // Initialize Excel utility
     ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
     
     for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
     	
         String Search_Job_2 = excel.getCellData(i, 1);
         
         Job_Listing.Enter_Job_2_in_Search_Bar(Search_Job_2);
         
         Job_Listing.Click_Job_2();         
         
         Job_Listing.Clear_Search_Bar();
         
         
/*            Job_Listing.Check_Job_Name();
     
          Job_Listing.Check_company_name();
               
           Job_Listing.Check_Type();
               
            Job_Listing.Check_Year();
                               
            Job_Listing.Check_location_Type();
               
             Job_Listing.Check_Posted_By();
               
             Job_Listing.Check_Apply_By();
               
              Job_Listing.Check_Salary_range();
               
              Job_Listing.Check_Skill();
               
              Job_Listing.Check_benifit();
               
              Job_Listing.Check_description();
   */  
 	
 	   	
     }
 	   	
 }
//To open the job_3 and check that information displayed in the page after selecting job
 
 @Test
	public void TC_ID_16_06() throws InterruptedException, IOException {
 
		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
 	
 	//select 1st job Automation Engineers
 	
     String FilePath = Config.getProperty("filePath");
 	
 	String SheetName = Config.getProperty("sheetName_9");
 	
   // Initialize Excel utility
     ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
     
     for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
     	
         String Search_Job_3 = excel.getCellData(i, 2);
         
         Job_Listing.Enter_Job_3_in_Search_Bar(Search_Job_3);
         
         Job_Listing.Click_Job_3();         
         
         Job_Listing.Clear_Search_Bar();
 	
         
/*            Job_Listing.Check_Job_Name();
     
          Job_Listing.Check_company_name();
               
           Job_Listing.Check_Type();
               
            Job_Listing.Check_Year();
                               
            Job_Listing.Check_location_Type();
               
             Job_Listing.Check_Posted_By();
               
             Job_Listing.Check_Apply_By();
               
              Job_Listing.Check_Salary_range();
               
              Job_Listing.Check_Skill();
               
              Job_Listing.Check_benifit();
               
              Job_Listing.Check_description();
   */  
 	            
       }
 	  	
 }
//To open the job_4 and check that information displayed in the page after selecting job

 @Test
	public void TC_ID_16_07() throws InterruptedException, IOException {
 
		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
 	
  	//select 1st job Automation Engineers
  	
      String FilePath = Config.getProperty("filePath");
  	
  	String SheetName = Config.getProperty("sheetName_9");
  	
    // Initialize Excel utility
      ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
      
      for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
      	
          String Search_Job_4 = excel.getCellData(i, 3);
          
          Job_Listing.Enter_Job_4_in_Search_Bar(Search_Job_4);
          
          Job_Listing.Click_Job_4();         
          
          Job_Listing.Clear_Search_Bar();
 	
          
          /*            Job_Listing.Check_Job_Name();
               
                    Job_Listing.Check_company_name();
                         
                     Job_Listing.Check_Type();
                         
                      Job_Listing.Check_Year();
                                         
                      Job_Listing.Check_location_Type();
                         
                       Job_Listing.Check_Posted_By();
                         
                       Job_Listing.Check_Apply_By();
                         
                        Job_Listing.Check_Salary_range();
                         
                        Job_Listing.Check_Skill();
                         
                        Job_Listing.Check_benifit();
                         
                        Job_Listing.Check_description();
             */  	  	
 	
      }  	
 	
 }
 
//To open the job_5 and check that information displayed in the page after selecting job
 
 @Test
	public void TC_ID_16_08() throws InterruptedException, IOException {
 
	
		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
 	
  	//select 1st job Automation Engineers
  	
      String FilePath = Config.getProperty("filePath");
  	
  	String SheetName = Config.getProperty("sheetName_9");
  	
    // Initialize Excel utility
      ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
      
      for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
      	
          String Search_Job_5 = excel.getCellData(i, 4);
          
          Job_Listing.Enter_Job_5_in_Search_Bar(Search_Job_5);
          
          Job_Listing.Click_Job_5();         
          
     Job_Listing.Clear_Search_Bar();
 	        
/*       Job_Listing.Check_Job_Name();
 
      Job_Listing.Check_company_name();
           
       Job_Listing.Check_Type();
           
        Job_Listing.Check_Year();
                           
        Job_Listing.Check_location_Type();
           
         Job_Listing.Check_Posted_By();
           
         Job_Listing.Check_Apply_By();
           
          Job_Listing.Check_Salary_range();
           
          Job_Listing.Check_Skill();
           
          Job_Listing.Check_benifit();
           
          Job_Listing.Check_description();
*/      	
      }
      
      
 } 

//To check that Edit button of Automation Tester job working fine and info displayed
 @Test
	public void TC_ID_16_09() throws InterruptedException, IOException {
 
	Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
 	
 	//select 1st job Automation Engineers
 	
     String FilePath = Config.getProperty("filePath");
 	
 	String SheetName = Config.getProperty("sheetName_9");
 	
   // Initialize Excel utility
     ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
     
     for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
     	
         String Search_Job_1 = excel.getCellData(i, 0);
         
         Job_Listing.Enter_Job_1_in_Search_Bar(Search_Job_1);
         
         Job_Listing.Check_Edit_button();
         
         Thread.sleep(5000); 
         
         Job_Listing.Click_Edit_button();
 	
         Job_Listing.Displayed_Job_Name();
         
         Job_Listing.Displayed_Company_Name();
      
         Job_Listing.Displayed_Start_Date();
         
         Job_Listing.Displayed_End_Date();
         
         Job_Listing.Displayed_Min_Exp();
         
         Job_Listing.Displayed_Max_Exp();
         
         Job_Listing.Displayed_Employment_Type();
         
         Job_Listing.Displayed_Highest_Education();
         
         Job_Listing.Displayed_Required_degree();
         
         Job_Listing.Displayed_Skill();
         
         Job_Listing.Displayed_Min_Pay();
         
         Job_Listing.Displayed_Max_Pay();
         
         Job_Listing.Displayed_Location_Type();
         
         Job_Listing.Displayed_Country();
         
         Job_Listing.Displayed_State();
         
         Job_Listing.Displayed_City();
         
         Job_Listing.Displayed_benifit();
         
         Job_Listing.Displayed_Keyword();
         
         Job_Listing.Displayed_description();
 	
         Job_Listing.Click_Close();
         
         Thread.sleep(4000);
 	
 	
     }	
 	
 }
 
 //Try to update the employment Type
 @Test
	public void TC_ID_16_10() throws InterruptedException, IOException {
 	
	Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
 	
	//select 1st job Automation Engineers
       
    Job_Listing.Click_Edit_button();
       
    String FilePath = Config.getProperty("filePath");
   	
   	String SheetName = Config.getProperty("sheetName_9");
       
     // Initialize Excel utility
       ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
       
      // Iterate through rows in Excel
     //  int rowCount = excel.getRowCount();
       for (int i = 4; i <= 4; i++) { // Assuming row 0 is the headel
	
    //   String Data_Chnage_1 = excel.getCellData(i, 2);

    //   Job_Listing.Update_Employment_Type(Data_Chnage_1); 	
              
//       String End_Date = Config.getProperty("End_Date_Update_1");
//       
//       Job_Listing.Update_End_Date_1(End_Date);
                 
       String Data_Chnage_2 = excel.getCellData(i, 2);

       Job_Listing.Update_Employment_Type(Data_Chnage_2);
                          	
      Job_Listing.Click_Update_Job_button();
      
      Thread.sleep(5000);
                 
      //Job_Listing.Click_Job_1();

       driver.navigate().refresh();
          	   	
     }    	
 }

 //Try to update the City and state For any Job - Data Analyst, (Karnataka, Banglore)
 @Test
	public void TC_ID_16_11() throws InterruptedException, IOException {
 
		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
 	
	   //select 1st job  Data Analyst
        
     String FilePath = Config.getProperty("filePath");
    	
    	String SheetName = Config.getProperty("sheetName_9");
        
      // Initialize Excel utility
        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
        
       // Iterate through rows in Excel
      //  int rowCount = excel.getRowCount();
        for (int i = 1; i <= 1; i++) { // Assuming row 0 is the head l
     	 
     	   String Search_Job_2 = excel.getCellData(i, 1);
            
            Job_Listing.Enter_Job_2_in_Search_Bar(Search_Job_2);
            
            Thread.sleep(3000); 
            
            Job_Listing.Click_Edit_button();
            
            break;
            
        }

        for (int i = 5; i <= 5; i++) { // Assuming row 0 is the headel

            String Data_Chnage_1 = excel.getCellData(i, 1);

            Job_Listing.Update_State(Data_Chnage_1);	           	   
                  
        String Data_Chnage_2 = excel.getCellData(i, 2);

        Job_Listing.Update_City(Data_Chnage_2);
                  	
        Job_Listing.Click_Update_Job_button();
        
        Job_Listing.Click_Job_2();
                   
     //   Job_Listing.Clear_Search_Bar();
        
        driver.navigate().refresh();

        break;
 	
      }    	
 } 
 
 //Try to update the Highest Degree and required Degree for any Job Team Lead (Bachelors Degree and B.Com)

 @Test
	public void TC_ID_16_12() throws InterruptedException, IOException {
 
		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
     	
 	   //select 1st job Team Lead 
         
      String FilePath = Config.getProperty("filePath");
     	
      String SheetName = Config.getProperty("sheetName_9");
         
       // Initialize Excel utility
         ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
         
         for (int i = 1; i <= 1; i++) { // Assuming row 0 is the headel
      	 
      	   String Search_Job_3 = excel.getCellData(i, 2);
             
             Job_Listing.Enter_Job_3_in_Search_Bar(Search_Job_3);
             
             Thread.sleep(5000); 
             
             Job_Listing.Click_Edit_button();
             
             break; 
         }

         for (int i = 6; i <= 6; i++) { // Assuming row 0 is the headel

             String Data_Chnage_1 = excel.getCellData(i, 1);

             Job_Listing.Update_Highest_Education(Data_Chnage_1);	           	   
                   
         String Data_Chnage_2 = excel.getCellData(i, 2);

         Job_Listing.Update_Required_Degree(Data_Chnage_2);
                   	
         Job_Listing.Click_Update_Job_button();
         
         Job_Listing.Click_Job_3();
                     
      //   Job_Listing.Clear_Search_bar_1();
         
         driver.navigate().refresh();     
         
         break;
 } 
 }
 
 
//To check the row per page drop down and  check the Next-Previouse page button working working fine.
 @Test
	public void TC_ID_16_13() throws InterruptedException, IOException {
 
		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
 	   	
 	Job_Listing.Check_Row_Per_Page();

 	
 } 
 
 //To check the Employment Type filter working Fine or not

 @Test
	public void TC_ID_16_14() throws InterruptedException, IOException {
 
		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
 	        
     String FilePath = Config.getProperty("filePath");
    	
     String SheetName = Config.getProperty("sheetName_9");
        
      // Initialize Excel utility
        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);

        for (int i = 10; i <= 10; i++) { // Assuming row 0 is the headel

        String Filter_Data_1 = excel.getCellData(i, 0);

        Job_Listing.Filter_By_Employment_Type_1(Filter_Data_1);	     
                             
        String Filter_Data_2 = excel.getCellData(i, 1);

        Job_Listing.Filter_By_Employment_Type_2(Filter_Data_2);
        
        break;
                  	
        }
 } 
 
 //To check experience level filter working fine 

 @Test
	public void TC_ID_16_15() throws InterruptedException, IOException {
 
		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
     
     String FilePath = Config.getProperty("filePath");
    	
     String SheetName = Config.getProperty("sheetName_9");
        
      // Initialize Excel utility
        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);

        for (int i = 11; i <= 11; i++) { // Assuming row 0 is the headel

        String Filter_Data_1 = excel.getCellData(i, 0);

        Job_Listing.Filter_By_Year_of_Experience_2(Filter_Data_1);	           	   
                  
        String Filter_Data_2 = excel.getCellData(i, 1);

        Job_Listing.Filter_By_Year_of_Experience_5(Filter_Data_2);
        
        break;
                  	
        } 
 	
 } 
 
 //To check the search By location Filter working Fine

 @Test
	public void TC_ID_16_16() throws IOException, InterruptedException {
 
		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
     
     String FilePath = Config.getProperty("filePath");
    	
     String SheetName = Config.getProperty("sheetName_9");
        
      // Initialize Excel utility
        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);

        for (int i = 12; i <= 12; i++) { // Assuming row 0 is the headel

        String Filter_Data_1 = excel.getCellData(i, 0);

        Job_Listing.Filter_By_Location(Filter_Data_1);	
 	
 	break;
      } 
 }
        //To check all the filter Together and check all working correctly or not

        @Test
       	public void TC_ID_16_17() throws IOException, InterruptedException {
     	   
     	   driver.navigate().refresh();
        
   		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
            
         String FilePath = Config.getProperty("filePath");
           	
         String SheetName = Config.getProperty("sheetName_9");
               
         // Initialize Excel utility
         ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);

               for (int i = 10; i <= 10; i++) { // Assuming row 0 is the headel

               String Filter_Data_1 = excel.getCellData(i, 0);

               Job_Listing.Filter_By_Employment_Type_1(Filter_Data_1);
        	
      break;
               }
               
               for (int i = 11; i <= 11; i++) { // Assuming row 0 is the headel

                   String Filter_Data_1 = excel.getCellData(i, 0);

                   Job_Listing.Filter_By_Year_of_Experience_2(Filter_Data_1);	
            	break;
          
                   }
               
               for (int i = 12; i <= 12; i++) { // Assuming row 0 is the headel

                   String Filter_Data_1 = excel.getCellData(i, 0);

                   Job_Listing.Filter_By_Location(Filter_Data_1);
                   
                   
            	break;
          

                   }
               
              	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

              	driver.navigate().refresh();
        } 


 
 //Click on delete icon and check the job is removed from the list or not

 @Test
	public void TC_ID_16_18() throws IOException, InterruptedException {
 
		Admin_Job_Listing  Job_Listing = new Admin_Job_Listing(driver);
   	
   	//select 1st job Automation Engineers
   	
       String FilePath = Config.getProperty("filePath");
   	
   	String SheetName = Config.getProperty("sheetName_9");
   	
     // Initialize Excel utility
       ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
       
       for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
       	
        String Search_Job_1 = excel.getCellData(i, 0);
           
        Job_Listing.Enter_Job_1_in_Search_Bar(Search_Job_1);
           
        Thread.sleep(5000);  
           
         Job_Listing.Delete_Job();
           
         Job_Listing.click_Trash();
           
           break;
           
           
 }
      
  }
  
  

}
