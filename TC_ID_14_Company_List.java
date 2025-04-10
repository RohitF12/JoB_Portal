package company.tests;

import java.io.IOException;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest_Admin;
import config.Config;
import pom.Admin_Add_Company;
import pom.Admin_Company_List;
import pom.Company_Check_Applied_Candidate_08;
import pom.Job_Listing_04;
import utils.ExcelUtilityReg;

public class TC_ID_14_Company_List extends BaseTest_Admin{
	
	// Declare at the class level
	
	 @Test
		//To check that page name is displayed 
		public void TC_ID_14_01() throws InterruptedException {
		 
		Launch(); // Initializes the WebDriver and opens the application
		    
		Thread.sleep(7000);
		
		Admin_Company_List  Company_List = new Admin_Company_List(driver);
		    	    		    	    
	    // Read username and password from properties file
	     String username_1 = Config.getProperty("username_Admin");
	     String password_1 = Config.getProperty("password_Admin");

	    // Perform login using POM
	     Company_List.enterUsername(username_1);
	     Company_List.enterPassword(password_1);
	     Company_List.clickLogin();
	    	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
       // To check the page name displayed 
	     
	    Company_List.Scroll_down2_Add_Company();
	    
	    Company_List.Click_on_Company_List_page();
	    
	    Thread.sleep(3000);
	      
	    Assert.assertTrue(Company_List.Check_Page_Name_displayed(), "Page name is not displayed properly");
	 
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
   	    // Get the expected Page Name
	    String expectedPageName = "Company List";
	     
	     // Get the current PAge Name from the current page
	    
	     String actualPageName = Company_List.Check_Page_Name();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     // Verify the Page Name
	    Assert.assertEquals(actualPageName, expectedPageName, "The Page Name does not match!");
	     
	     }

	 //	 To check that toggle closed and open the left panel
	 @Test
	 public void TC_ID_14_02() throws InterruptedException {
		 
	 Admin_Company_List  Company_List = new Admin_Company_List(driver);
		 
	 Company_List.Click_on_hamburger_menu();
	 
	 }
	 	 
     //To check the search bar is working or not.
	 @Test
		public void TC_ID_14_03() throws InterruptedException, IOException {
		 
			Admin_Company_List  Company_List = new Admin_Company_List(driver);    	
	    	
	    	String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_7");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Compnay_1 = excel.getCellData(i, 0);
	            
	            Company_List.Enter_Company_1_in_Search_Bar(Search_Compnay_1);
	            
	            Thread.sleep(2000);
	            
	            Company_List.Clear_Search_Bar();
	            
	        }
	         
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Compnay_2 = excel.getCellData(i, 1);
	            
	            Company_List.Enter_Company_2_in_Search_Bar(Search_Compnay_2);
	            
	            Thread.sleep(2000);
	            
	            Company_List.Clear_Search_Bar();
	            
	        }
	      
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Compnay_3 = excel.getCellData(i, 2);
	            
	            Company_List.Enter_Company_3_in_Search_Bar(Search_Compnay_3);
	            
	            Thread.sleep(2000);
	            
	            Company_List.Clear_Search_Bar();
	      }
	      
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Compnay_4 = excel.getCellData(i, 3);
	            
	            Company_List.Enter_Company_4_in_Search_Bar(Search_Compnay_4);
	            
	            Thread.sleep(2000);
	            
	            Company_List.Clear_Search_Bar();
	          
	      }
	      
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Compnay_5 = excel.getCellData(i, 4);
	            
	            Company_List.Enter_Company_5_in_Search_Bar(Search_Compnay_5);
	            
	            Thread.sleep(2000);
	            
	            Company_List.Clear_Search_Bar();          
	      }
	                  
	 }
	 	 
    // To check the column name displayed.
	 @Test
		public void TC_ID_14_04() throws InterruptedException {
		 
			Admin_Company_List  Company_List = new Admin_Company_List(driver);

    	    // Get the expected column_1 Name
  	        
			String expectedColumnName_1 = "Company";
  	     
  	       // Get the current column Name from the current page
  	    
  	     String actualColumnName_1 = Company_List.Check_column_1_Name();
  	     
  	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  	     
  	     // Verify the column Name
  	     Assert.assertEquals(actualColumnName_1, expectedColumnName_1, "The column Name does not match!");
  	     
  	 	 // Get the expected column_2 Name
  		 String expectedColumnName_2 = "State";
  		     
  		    // Get the current column Name from the current page
  		    
  		     String actualColumnName_2 = Company_List.Check_column_2_Name();
  		     
  		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  		     
  		     // Verify the column Name
  		     Assert.assertEquals(actualColumnName_2, expectedColumnName_2, "The column Name does not match!");
  		     
  		     // Get the expected column_3 Name
  		     String expectedColumnName_3 = "Industry";
  		     
  		    // Get the current column Name from the current page
  		    
  		     String actualColumnName_3 = Company_List.Check_column_3_Name();
  		     
  		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  		     
  		     // Verify the column Name
  		     Assert.assertEquals(actualColumnName_3, expectedColumnName_3, "The column Name does not match!");
  		     
  		     // Get the expected column_4 Name
  		     String expectedColumnName_4 = "Email";
  		     
  		    // Get the current column Name from the current page
  		    
  		     String actualColumnName_4 = Company_List.Check_column_4_Name();
  		     
  		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  		     
  		     // Verify the column Name
  		     Assert.assertEquals(actualColumnName_4, expectedColumnName_4, "The column Name does not match!");
  		     
  		     // Get the expected column_5 Name
  		     String expectedColumnName_5 = "View";
  		     
  		    // Get the current column Name from the current page
  		    
  		     String actualColumnName_5 = Company_List.Check_column_5_Name();
  		     
  		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  		     
  		     // Verify the column Name
  		     Assert.assertEquals(actualColumnName_5, expectedColumnName_5, "The column Name does not match!");
  		     
  		     // Get the expected column_6 Name
  		     String expectedColumnName_6 = "Edit";
  		     
  		    // Get the current column Name from the current page
  		    
  		     String actualColumnName_6 = Company_List.Check_column_6_Name();
  		     
  		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  		     
  		     // Verify the column Name
  		     Assert.assertEquals(actualColumnName_6, expectedColumnName_6, "The column Name does not match!");
  		    
  		     // Get the expected column_6 Name
  		     String expectedColumnName_7 = "Delete";
  		     
  		    // Get the current column Name from the current page
  		    
  		     String actualColumnName_7 = Company_List.Check_column_7_Name();
  		     
  		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  		     
  		     // Verify the column Name
  		     Assert.assertEquals(actualColumnName_7, expectedColumnName_7, "The column Name does not match!");
  		     
  		     driver.navigate().refresh();
  		    
  }         	 
	 
    //To check the view button is working fine 
	 @Test
		public void TC_ID_14_05() throws InterruptedException, IOException {
		 
		Admin_Company_List  Company_List = new Admin_Company_List(driver);
		
	 	String FilePath = Config.getProperty("filePath");
    	
    	String SheetName = Config.getProperty("sheetName_7");
    	
      // Initialize Excel utility
        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
        
        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
        	
            String Search_Compnay_1 = excel.getCellData(i, 0);
            
            Company_List.Enter_Company_1_in_Search_Bar(Search_Compnay_1);
            
            Thread.sleep(2000);
             
            Company_List.View_Button();
                      
            Company_List.Clear_Search_Bar(); 
            
            break;
	 }
        
        
     for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
        	
            String Search_Compnay_2 = excel.getCellData(i, 1);
            
            Company_List.Enter_Company_2_in_Search_Bar(Search_Compnay_2);
            
            Thread.sleep(2000);
             
            Company_List.View_Button();
             
            Company_List.Clear_Search_Bar(); 
            
            break;
	 }
      
     for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
     	
         String Search_Compnay_3 = excel.getCellData(i, 2);
         
         Company_List.Enter_Company_3_in_Search_Bar(Search_Compnay_3);
         
         Thread.sleep(2000);
          
         Company_List.View_Button();

         Company_List.Clear_Search_Bar(); 
         
         break;
	 }
       
     for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
      	
         String Search_Compnay_4 = excel.getCellData(i, 3);
         
         Company_List.Enter_Company_4_in_Search_Bar(Search_Compnay_4);
         
         Thread.sleep(2000);
          
         Company_List.View_Button();
            
         Company_List.Clear_Search_Bar(); 
         
         break;
	 }
     
     
     for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
       	
         String Search_Compnay_5 = excel.getCellData(i, 4);
         
         Company_List.Enter_Company_5_in_Search_Bar(Search_Compnay_5);
         
         Thread.sleep(2000);
          
         Company_List.View_Button();
  
         Company_List.Clear_Search_Bar(); 
         
         driver.navigate().refresh();
         
         break;
	 }
     
	 }
	 	 
     //To check the TechNova Solution information displayed on view button
	 @Test
		public void TC_ID_14_06() throws InterruptedException, IOException {
		 
		 Admin_Company_List  Company_List = new Admin_Company_List(driver);
			
		 	String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_7");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Compnay_1 = excel.getCellData(i, 0);
	            
	            Company_List.Enter_Company_1_in_Search_Bar(Search_Compnay_1);
	            
	            Thread.sleep(2000);
	             
	            Company_List.Only_View_Button(); 	
	            
	            Company_List.Check_Page_Details();
	            
	            Company_List.Data_check_Company_Name();
	            
	            Company_List.Data_Foundation_Date();
	            
	            Company_List.Data_About();
	            
	            Company_List.Email_Text();
	            
	            Company_List.Data_Address();
	            
	            Company_List.Data_Website();
	            
	            Company_List.Data_Number();
	            
	            Company_List.Closed_button();
	            
	            Company_List.Clear_Search_Bar(); 
	            
	            break;
	            
	 }
	 }
	 
//	 To check the DataSwift Services displayed on view button
	 @Test
		public void TC_ID_14_07() throws InterruptedException, IOException {
		 
		 Admin_Company_List  Company_List = new Admin_Company_List(driver);
			
		 	String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_7");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Compnay_2 = excel.getCellData(i, 1);
	            
	            Company_List.Enter_Company_2_in_Search_Bar(Search_Compnay_2);
	            
	            Thread.sleep(2000);
	             
	            Company_List.Only_View_Button(); 	
	            
	            Company_List.Check_Page_Details();
	            
	            Company_List.Data_check_Company_Name();
	            
	            Company_List.Data_Foundation_Date();
	            
	            Company_List.Data_About();
	            
	            Company_List.Email_Text();
	            
	            Company_List.Data_Address();
	            
	            Company_List.Data_Website();
	            
	            Company_List.Data_Number();
	            
	            Company_List.Closed_button();
	            
	            Company_List.Clear_Search_Bar(); 
	            
	            break;
		 
	        }
	 }
	 	 
//	 To check the InfoTrack Systems information displayed on view button
	 @Test
		public void TC_ID_14_08() throws InterruptedException, IOException {
		 
		 Admin_Company_List  Company_List = new Admin_Company_List(driver);
			
		 	String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_7");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Compnay_3 = excel.getCellData(i, 2);
	            
	            Company_List.Enter_Company_3_in_Search_Bar(Search_Compnay_3);
	            
	            Thread.sleep(2000);
	             
	            Company_List.Only_View_Button(); 	
	            
	            Company_List.Check_Page_Details();
	            
	            Company_List.Data_check_Company_Name();
	            
	            Company_List.Data_Foundation_Date();
	            
	            Company_List.Data_About();
	            
	            Company_List.Email_Text();
	            
	            Company_List.Data_Address();
	            
	            Company_List.Data_Website();
	            
	            Company_List.Data_Number();
	            
	            Company_List.Closed_button();
	            
	            Company_List.Clear_Search_Bar(); 
	            
	            break;
	        }
	
	 } 
//	 To check the ByteFlow Technologies information displayed on view button
	 @Test
		public void TC_ID_14_09() throws InterruptedException, IOException {
		 
		 Admin_Company_List  Company_List = new Admin_Company_List(driver);
			
		 	String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_7");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Compnay_4 = excel.getCellData(i, 3);
	            
	            Company_List.Enter_Company_4_in_Search_Bar(Search_Compnay_4);
	            
	            Thread.sleep(2000);
	             
	            Company_List.Only_View_Button(); 	
	            
	            Company_List.Check_Page_Details();
	            
	            Company_List.Data_check_Company_Name();
	            
	            Company_List.Data_Foundation_Date();
	            
	            Company_List.Data_About();
	            
	            Company_List.Email_Text();
	            
	            Company_List.Data_Address();
	            
	            Company_List.Data_Website();
	            
	            Company_List.Data_Number();
	            
	            Company_List.Closed_button();
	            
	            Company_List.Clear_Search_Bar(); 
	            
	            break;
		 
	        }
	 }
	 
	 
	 
//	 To check the NeoDigit Enterprises information displayed on view button
	 @Test
		public void TC_ID_14_10() throws InterruptedException, IOException {
		 
		 Admin_Company_List  Company_List = new Admin_Company_List(driver);
			
		 	String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_7");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Compnay_5 = excel.getCellData(i, 4);
	            
	            Company_List.Enter_Company_5_in_Search_Bar(Search_Compnay_5);
	            
	            Thread.sleep(2000);
	             
	            Company_List.Only_View_Button(); 	
	            
	            Company_List.Check_Page_Details();
	            
	            Company_List.Data_check_Company_Name();
	            
	            Company_List.Data_Foundation_Date();
	            
	            Company_List.Data_About();
	            
	            Company_List.Email_Text();
	            
	            Company_List.Data_Address();
	            
	            Company_List.Data_Website();
	            
	            Company_List.Data_Number();
	            
	            Company_List.Closed_button();
	            
	            Company_List.Clear_Search_Bar(); 	
	            
	            break;
	        }
	
	 }
 
     //To check that Edit icon is working fine 
	 @Test
	 public void TC_ID_14_11() throws InterruptedException, IOException {
	
		 
			Admin_Company_List  Company_List = new Admin_Company_List(driver);
			
		 	String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_7");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	            String Search_Compnay_1 = excel.getCellData(i, 0);
	            
	            Company_List.Enter_Company_1_in_Search_Bar(Search_Compnay_1);
	            
	            Thread.sleep(2000);
	             
	            Company_List.Edit_Button_();
	            

		 }
	         		 
	 }
	 	 
    //To check the fields/dropdown available in edit options
	 @Test
		public void TC_ID_14_12() throws InterruptedException {
		 
	    Admin_Company_List  Company_List = new Admin_Company_List(driver);
 
         Company_List.Check_Company_name();
   		 
         Company_List.Check_CIN_Number();
		 
	//	 Add_Company.Check_radio_button_verified();
		 
	//	 Add_Company.Check_radio_button_Unverified();
		 
         Company_List.Check_City();
		 
         Company_List.Check_State();
		 
         Company_List.Check_Country();
		 
         Company_List.Check_Website();
		 
         Company_List.Check_Emial();
		 
         Company_List.Check_PhoneNumber();
		 
         Company_List.Check_Foundation_Date();
		 
         Company_List.Check_Industry();
		 
         Company_List.Check_SocialMedia();
		 
         Company_List.Check_Description();
		 
         Company_List.Check_Update_Button();
		 
         Company_List.Clicked_Closed_Icon();
         
		 driver.navigate().refresh();
		 	
	 }
	 
     //To check the information update properly eg. TechNova Solution - Update Location from Delhi to Chennai, Tamilnadu
	 @Test
		public void TC_ID_14_13() throws InterruptedException, IOException {
		 
	        Admin_Company_List  Company_List = new Admin_Company_List(driver);
			
		 	String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_7");
	    	
	      //Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	        String Search_Compnay_1 = excel.getCellData(i, 0);
	            
	        Company_List.Enter_Company_1_in_Search_Bar(Search_Compnay_1);
	            
	        Thread.sleep(2000);
	             
	        Company_List.Edit_Button_();
	        }
	        
	        for (int i = 4; i <= 4; i++) { // Assuming row 0 is the headel

	        String Data_Change_1 = excel.getCellData(i, 1);

	        Company_List.Update_City(Data_Change_1);	           	   
	                     
	        String Data_Change_2 = excel.getCellData(i, 2);

	        Company_List.Update_State(Data_Change_2);
	                     	
	        Company_List.Click_Update_button();
	        
	        Thread.sleep(5000);
	        
	        driver.navigate().refresh();

	        break;
	    	
	         }    	
             
	        }
	 	 
     //Update the information on DataSwift Services - update phone number and Industry
	 @Test
		public void TC_ID_14_14() throws InterruptedException, IOException {
		 
		 Admin_Company_List  Company_List = new Admin_Company_List(driver);
			
		 	String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_7");
	    	
	      //Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	        String Search_Compnay_2 = excel.getCellData(i, 1);
	            
	        Company_List.Enter_Company_2_in_Search_Bar(Search_Compnay_2);
	            
	        Thread.sleep(2000);
	             
	        Company_List.Edit_Button_();

	        }
	        
	        for (int i = 5; i <= 5; i++) { // Assuming row 0 is the headel

	        String Data_Change_1 = excel.getCellData(i, 1);

	        Company_List.Update_Phone_Number(Data_Change_1);	           	   
	                     
	        String Data_Change_2 = excel.getCellData(i, 2);

	        Company_List.Update_Industry_Number(Data_Change_2);
	                     	
	        Company_List.Click_Update_button();
	        
	        Thread.sleep(5000);
	           	                      	           
	        driver.navigate().refresh();

	        break;
 	 
	        }
	 } 
    //Update the information on InfoTrack Systems - update company from verified to Unverified
	 @Test
		public void TC_ID_14_15() throws InterruptedException, IOException {
		 
		    Admin_Company_List  Company_List = new Admin_Company_List(driver);
			
		 	String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_7");
	    	
	        //Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	        String Search_Compnay_3 = excel.getCellData(i, 2);
	            
	        Company_List.Enter_Company_3_in_Search_Bar(Search_Compnay_3);
	            
	        Thread.sleep(2000);
	             
	        Company_List.Edit_Button_();
	        
	        Thread.sleep(3000);

	        Company_List.Click_radio_button_Unverified();	
	        
	        Company_List.Click_Update_button();
	        
	        Thread.sleep(5000);
  	           
	        driver.navigate().refresh();

	        break;
	        
	        }
	        
//	        for (int i = 6; i <= 6; i++) { // Assuming row 0 is the headel
//
//	        String Data_Chnage_1 = excel.getCellData(i, 1);
//
//	        Company_List.Update_City(Data_Chnage_1);	           	   
//	                     
//	        String Data_Chnage_2 = excel.getCellData(i, 2);
//
//	        Company_List.Update_State(Data_Chnage_2);
//	                     	
//	        Company_List.Click_Update_button();
//	           	                      	           
//	        driver.navigate().refresh();
//
//	        break;
	 
//	        }
	 }
	  
     //To check the delete icon working fine and able to delete company
	 @Test
		public void TC_ID_14_16() throws InterruptedException, IOException {
		 
		   Admin_Company_List  Company_List = new Admin_Company_List(driver);
			
		 	String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_7");
	    	
	      //Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        
	        for (int i = 1; i <=1; i++) { // Assuming row 0 is the header
	        	
	        String Search_Compnay_1 = excel.getCellData(i, 0);
	            
	        Company_List.Enter_Company_1_in_Search_Bar(Search_Compnay_1);
	            
	        Thread.sleep(2000);
	             
	        Company_List.Click_delete_button();
	        
	        }
	 }
	 
	 
     //To check the row per page  working fine	 
	 @Test
		public void TC_ID_14_17() throws InterruptedException {
		 
		   Admin_Company_List  Company_List = new Admin_Company_List(driver);
    	   	
		   Company_List.Check_Row_Per_Page();
		 
	
	 }  
      }
