package company.tests;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import base.BaseTest_Admin;
import config.Config;
import pom.Admin_Add_Company;
import utils.ExcelUtilityReg;
import utils.TestListener_Admin;

@Listeners(TestListener_Admin.class)


public class TC_ID_13_Add_Company extends BaseTest_Admin {
	
	// Declare at the class level
	 
	Admin_Add_Company Add_Company;
	
	 @Test
		//To check that page name is displayed 
		public void TC_ID_13_01() throws InterruptedException {
		 
		Launch(); // Initializes the WebDriver and opens the application
		    
		Thread.sleep(7000);
		
		 Admin_Add_Company  Add_Company = new Admin_Add_Company(driver);
		    	    		    	    
	    // Read username and password from properties file
	     String username_1 = Config.getProperty("username_Admin");
	     String password_1 = Config.getProperty("password_Admin");

	    // Perform login using POM
        Add_Company.enterUsername(username_1);
        Add_Company.enterPassword(password_1);
        Add_Company.clickLogin();
	    	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
//		 To check the page name displayed 
	     
	    Add_Company.Scroll_down2_Add_Company();
	    
	    Add_Company.Click_on_Add_Company_page();
	    
	    Thread.sleep(3000);
	      
	    Assert.assertTrue(Add_Company.Check_Page_Name_displayed(), "Page name is not displayed properly");
	 
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
   	    // Get the expected Page Name
	    String expectedPageName = "Add New Company";
	     
	     // Get the current PAge Name from the current page
	    
	     String actualPageName = Add_Company.Check_Page_Name();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     // Verify the Page Name
	    Assert.assertEquals(actualPageName, expectedPageName, "The Page Name does not match!");
	     
	     }

    //	 To check that toggle closed and open the left panel
	 @Test
		public void TC_ID_13_02() throws InterruptedException {
		 
		 Admin_Add_Company  Add_Company = new Admin_Add_Company(driver);
		 
		 Add_Company.Click_on_hamburger_menu();
	 }
//	 To check Logo and cover photo menu working fine.
	 @Test
		public void TC_ID_13_03() throws InterruptedException {
		 
		 Admin_Add_Company  Add_Company = new Admin_Add_Company(driver);
		 
		 Add_Company.Check_Logo();
		 
		 Add_Company.Check_Cover_Photo();
		 
	 }
	 
//	 To check that all the fields/dropdown available 
	 @Test
		public void TC_ID_13_04() throws InterruptedException {
		 
		 Admin_Add_Company  Add_Company = new Admin_Add_Company(driver);
		 
		 Add_Company.Check_Company_name();
		 
		 Add_Company.Check_CIN_Number();
		 
	//	 Add_Company.Check_radio_button_verified();
		 
	//	 Add_Company.Check_radio_button_Unverified();
		 
		 Add_Company.Check_City();
		 
		 Add_Company.Check_State();
		 
		 Add_Company.Check_Country();
		 
		 Add_Company.Check_Website();
		 
		 Add_Company.Check_Emial();
		 
		 Add_Company.Check_PhoneNumber();
		 
		 Add_Company.Check_Foundation_Date();
		 
		 Add_Company.Check_Industry();
		 
		 Add_Company.Check_SocialMedia();
		 
		 Add_Company.Check_Description();
		 
		 Add_Company.Check_Add_button();
		 
		 driver.navigate().refresh();
		 	 
	 }
	 
   //Add company with name of "TechNova Solutions"
	 @Test
	 public void TC_ID_13_05() throws InterruptedException, IOException {
	    	
	    Admin_Add_Company  Add_Company = new Admin_Add_Company(driver);

	    	//select 1st job Automation Engineers
	    	
	        String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_6");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        for (int i = 1; i <= 1; i++) { // Assuming row 0 is the header
	            String Upload_Logo = excel.getCellData(i, 0);
	            String  Upload_Cover = excel.getCellData(i, 1);
	            String Company_Name_EData= excel.getCellData(i, 2);
	            String CIN_Number_EData = excel.getCellData(i, 3);
	            String City_EData = excel.getCellData(i, 4);
	            String State_EData= excel.getCellData(i, 5);
	            String Country_EData= excel.getCellData(i, 6);
	            String Website_EData= excel.getCellData(i, 7);
	            String Email_EData= excel.getCellData(i, 8);
	            String Phone_Number_EData = excel.getCellData(i, 9);
	           // String Foundation_Date_EData = excel.getCellData(i, 10);
	            String Industry_EData = excel.getCellData(i, 11);         
	            String Social_Media_EData= excel.getCellData(i, 12);
	            String Description_EData= excel.getCellData(i, 13);
	           
	       

	            // Fill the registration form
	            Add_Company.Add_company_Data(Upload_Logo,
	            	    Upload_Cover,
	        	        Company_Name_EData,
	        	        CIN_Number_EData,
	        	        City_EData,
	        	        State_EData,
	        	        Country_EData,
	        	        Website_EData,
	        	        Email_EData,
	        	        Phone_Number_EData,
	        	//        Foundation_Date_EData,   		                 
	        	        Industry_EData,
	        	        Social_Media_EData,
	        	        Description_EData);
	            
	   	     String Date_1 = Config.getProperty("Foundation_Date_Company_1");
	   	     
	           Add_Company.Foundation_Date_1(Date_1);
	            
	            Add_Company.Click_on_Add_button();
	            
	            Thread.sleep(5000);
	            
	            break;
		 
	        }
		 
	 }
	 
   //Add company with name of "DataSwift Services"
	 @Test
		public void TC_ID_13_06() throws InterruptedException, IOException {
		
		 Admin_Add_Company  Add_Company = new Admin_Add_Company(driver);
		 
		 Add_Company.Scroll_down2_Add_Company();
		 
		 Add_Company.Click_on_Add_Company_page();
		    
		    Thread.sleep(3000);
	    	
	        String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_6");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        for (int i = 2; i <= 2; i++) { // Assuming row 0 is the header
	            String Upload_Logo = excel.getCellData(i, 0);
	            String  Upload_Cover = excel.getCellData(i, 1);
	            String Company_Name_EData= excel.getCellData(i, 2);
	            String CIN_Number_EData = excel.getCellData(i, 3);
	            String City_EData = excel.getCellData(i, 4);
	            String State_EData= excel.getCellData(i, 5);
	            String Country_EData= excel.getCellData(i, 6);
	            String Website_EData= excel.getCellData(i, 7);
	            String Email_EData= excel.getCellData(i, 8);
	            String Phone_Number_EData = excel.getCellData(i, 9);
	           // String Foundation_Date_EData = excel.getCellData(i, 10);
	            String Industry_EData = excel.getCellData(i, 11);         
	            String Social_Media_EData= excel.getCellData(i, 12);
	            String Description_EData= excel.getCellData(i, 13);
	           
	       

	            // Fill the registration form
	            Add_Company.Add_company_Data(Upload_Logo,
	            	    Upload_Cover,
	        	        Company_Name_EData,
	        	        CIN_Number_EData,
	        	        City_EData,
	        	        State_EData,
	        	        Country_EData,
	        	        Website_EData,
	        	        Email_EData,
	        	        Phone_Number_EData,
	        	//        Foundation_Date_EData,   		                 
	        	        Industry_EData,
	        	        Social_Media_EData,
	        	        Description_EData);
	            
	   	     String Date_2 = Config.getProperty("Foundation_Date_Company_2");
	   	     
	           Add_Company.Foundation_Date_1(Date_2);
	            
	            Add_Company.Click_on_Add_button();
	            
	            Thread.sleep(5000);
	            
	            driver.navigate().refresh();
	            	            
	            break;
		        }
			 
		 }
		 
   // Add company with name of "InfoTrack Systems"
	 @Test
		public void TC_ID_13_07() throws InterruptedException, IOException {
		 
		 Admin_Add_Company  Add_Company = new Admin_Add_Company(driver);
		 
		 Add_Company.Scroll_down2_Add_Company();
		 
		 Add_Company.Click_on_Add_Company_page();
		    
		    Thread.sleep(3000);
	    	
	        String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_6");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        for (int i = 3; i <= 3; i++) { // Assuming row 0 is the header
	            String Upload_Logo = excel.getCellData(i, 0);
	            String  Upload_Cover = excel.getCellData(i, 1);
	            String Company_Name_EData= excel.getCellData(i, 2);
	            String CIN_Number_EData = excel.getCellData(i, 3);
	            String City_EData = excel.getCellData(i, 4);
	            String State_EData= excel.getCellData(i, 5);
	            String Country_EData= excel.getCellData(i, 6);
	            String Website_EData= excel.getCellData(i, 7);
	            String Email_EData= excel.getCellData(i, 8);
	            String Phone_Number_EData = excel.getCellData(i, 9);
	           // String Foundation_Date_EData = excel.getCellData(i, 10);
	            String Industry_EData = excel.getCellData(i, 11);         
	            String Social_Media_EData= excel.getCellData(i, 12);
	            String Description_EData= excel.getCellData(i, 13);
	           
	       

	            // Fill the registration form
	            Add_Company.Add_company_Data(Upload_Logo,
	            	    Upload_Cover,
	        	        Company_Name_EData,
	        	        CIN_Number_EData,
	        	        City_EData,
	        	        State_EData,
	        	        Country_EData,
	        	        Website_EData,
	        	        Email_EData,
	        	        Phone_Number_EData,
	        	//        Foundation_Date_EData,   		                 
	        	        Industry_EData,
	        	        Social_Media_EData,
	        	        Description_EData);
	            
	   	     String Date_3 = Config.getProperty("Foundation_Date_Company_3");
	   	     
	           Add_Company.Foundation_Date_1(Date_3);
	            
	            Add_Company.Click_on_Add_button();
	            
	            Thread.sleep(5000);
	            
	            break;
	        }
		 
	 }
   //Add company with name of "ByteFlow Technologies"
	 @Test
		public void TC_ID_13_08() throws InterruptedException, IOException {
		 
		 Admin_Add_Company  Add_Company = new Admin_Add_Company(driver);
		 
		 Add_Company.Scroll_down2_Add_Company();
		 
		 Add_Company.Click_on_Add_Company_page();
		    
		    Thread.sleep(3000);
	    	
	        String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_6");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        for (int i = 4; i <= 4; i++) { // Assuming row 0 is the header
	            String Upload_Logo = excel.getCellData(i, 0);
	            String  Upload_Cover = excel.getCellData(i, 1);
	            String Company_Name_EData= excel.getCellData(i, 2);
	            String CIN_Number_EData = excel.getCellData(i, 3);
	            String City_EData = excel.getCellData(i, 4);
	            String State_EData= excel.getCellData(i, 5);
	            String Country_EData= excel.getCellData(i, 6);
	            String Website_EData= excel.getCellData(i, 7);
	            String Email_EData= excel.getCellData(i, 8);
	            String Phone_Number_EData = excel.getCellData(i, 9);
	           // String Foundation_Date_EData = excel.getCellData(i, 10);
	            String Industry_EData = excel.getCellData(i, 11);         
	            String Social_Media_EData= excel.getCellData(i, 12);
	            String Description_EData= excel.getCellData(i, 13);
	           
	       

	            // Fill the registration form
	            Add_Company.Add_company_Data(Upload_Logo,
	            	    Upload_Cover,
	        	        Company_Name_EData,
	        	        CIN_Number_EData,
	        	        City_EData,
	        	        State_EData,
	        	        Country_EData,
	        	        Website_EData,
	        	        Email_EData,
	        	        Phone_Number_EData,
	        	//        Foundation_Date_EData,   		                 
	        	        Industry_EData,
	        	        Social_Media_EData,
	        	        Description_EData);
	            
	   	     String Date_4 = Config.getProperty("Foundation_Date_Company_4");
	   	     
	           Add_Company.Foundation_Date_1(Date_4);
	            
	            Add_Company.Click_on_Add_button();
	            
	            Thread.sleep(5000);
	            
	            break;

	        }
	 }
   //Add company with name of "NeoDigit Enterprises"    
	 @Test
		public void TC_ID_13_09() throws InterruptedException, IOException {
		
		 Admin_Add_Company  Add_Company = new Admin_Add_Company(driver);

         Add_Company.Scroll_down2_Add_Company();
		 
		 Add_Company.Click_on_Add_Company_page();
		    
		    Thread.sleep(3000);
	    	
	        String FilePath = Config.getProperty("filePath");
	    	
	    	String SheetName = Config.getProperty("sheetName_6");
	    	
	      // Initialize Excel utility
	        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	        for (int i = 5; i <= 5; i++) { // Assuming row 0 is the header
	            String Upload_Logo = excel.getCellData(i, 0);
	            String  Upload_Cover = excel.getCellData(i, 1);
	            String Company_Name_EData= excel.getCellData(i, 2);
	            String CIN_Number_EData = excel.getCellData(i, 3);
	            String City_EData = excel.getCellData(i, 4);
	            String State_EData= excel.getCellData(i, 5);
	            String Country_EData= excel.getCellData(i, 6);
	            String Website_EData= excel.getCellData(i, 7);
	            String Email_EData= excel.getCellData(i, 8);
	            String Phone_Number_EData = excel.getCellData(i, 9);
	           // String Foundation_Date_EData = excel.getCellData(i, 10);
	            String Industry_EData = excel.getCellData(i, 11);         
	            String Social_Media_EData= excel.getCellData(i, 12);
	            String Description_EData= excel.getCellData(i, 13);
	           
	       

	            // Fill the registration form
	            Add_Company.Add_company_Data(Upload_Logo,
	            	    Upload_Cover,
	        	        Company_Name_EData,
	        	        CIN_Number_EData,
	        	        City_EData,
	        	        State_EData,
	        	        Country_EData,
	        	        Website_EData,
	        	        Email_EData,
	        	        Phone_Number_EData,
	        	//        Foundation_Date_EData,   		                 
	        	        Industry_EData,
	        	        Social_Media_EData,
	        	        Description_EData);
	            
	   	     String Date_5 = Config.getProperty("Foundation_Date_Company_5");
	   	     
	           Add_Company.Foundation_Date_1(Date_5);
	            
	            Add_Company.Click_on_Add_button();
	            
	            Thread.sleep(5000);
	            
	            break;
		 
	 }
	 
	 }

}