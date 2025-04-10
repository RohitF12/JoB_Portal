package company.tests;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import base.BaseTest;
import pom.Post_A_Job;
import pom.Profile;
import utils.ExcelUtilityReg;
import utils.TestListener;

@Listeners(TestListener.class)
public class TC_ID_03_Post_A_Job extends BaseTest{
	
	 @Test
	//To check that toggle closed and open the left panel
	public void TC_ID_03_01() throws InterruptedException, IOException {
	
    
    
    // Read username and password from properties file
     String username = data.getdata("username");
     String password = data.getdata("password");

     // Perform login using POM
     Post_A_Job login2Portal = new Post_A_Job(driver);
     login2Portal.enterUsername(username);
     login2Portal.enterPassword(password);
     login2Portal.clickLogin();
    	
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

     Thread.sleep(3000);
     
     Post_A_Job Jobs = new Post_A_Job(driver);
     
     Jobs.Click_on_Post_a_Job();
     
     Assert.assertTrue(Jobs.Check_Page_Name_displayed(), "Page name is not displayed properly");
     
     
  // Get the expected Page Name
     String expectedPageName = "Post a Job";
     
     // Get the current PAge Name from the current page
    
     String actualPageName = Jobs.Check_Page_Name();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     // Verify the Page Name
     Assert.assertEquals(actualPageName, expectedPageName, "The Page Name does not match!");
     
     }
     
	 @Test
     //To check the all the fields/ dropdown displayed
	public void TC_ID_03_02() throws InterruptedException {
		 
		 Post_A_Job Fields = new Post_A_Job(driver);
		 
		   // Verify if the Job_Title_field is displayed
         if (Fields.Check_Job_Title_field()) 
         {
         	
             System.out.println("The Job_Title_field is displayed.");

             // Verify if the Upload_Cover_Photo is enabled
             if (Fields.Check_Job_Title_field()) 
             {
             	
                 System.out.println("The Job_Title_field is enabled.");

             } 
             else 
             {
                 System.out.println("The Job_Title_field is not enabled.");
             }
         } 
         else 
         {
             System.out.println("The Job_Title_field is not displayed.");
         }
         
		   // Verify if the Start_Date_field is displayed
         if (Fields.Check_Start_Date_field()) {
         	
             System.out.println("The Start_Date_field is displayed.");

             // Verify if the Upload_Cover_Photo is enabled
             if (Fields.Check_Start_Date_field()) {
             	
                 System.out.println("The Start_Date_field is enabled.");

             } else {
                 System.out.println("The Start_Date_field is not enabled.");
             }
         } else {
             System.out.println("The Start_Date_field is not displayed.");
         }
         
		   // Verify if the Check_End_date_field is displayed
         if (Fields.Check_End_date_field()) {
         	
             System.out.println("The End_date_field is displayed.");

             // Verify if the Upload_Cover_Photo is enabled
             if (Fields.Check_End_date_field()) {
             	
                 System.out.println("The End_date_field is enabled.");

             } else {
                 System.out.println("The End_date_field is not enabled.");
             }
         } else {
             System.out.println("The End_date_field is not displayed.");
         }
         
		   // Verify if the Check_Min_Exp_field is displayed
         if (Fields.Check_Min_Exp_field()) {
         	
             System.out.println("The Min_Exp_field is displayed.");

             // Verify if the Upload_Cover_Photo is enabled
             if (Fields.Check_Min_Exp_field()) {
             	
                 System.out.println("The Min_Exp_field is enabled.");

             } else {
                 System.out.println("The Min_Exp_field is not enabled.");
             }
         } else {
             System.out.println("The Min_Exp_field is not displayed.");
         }
         
		   // Verify if the Check_Max_Exp_field is displayed
         if (Fields.Check_Max_Exp_field()) {
         	
             System.out.println("The Check_Max_Exp_field is displayed.");

             // Verify if the Upload_Cover_Photo is enabled
             if (Fields.Check_Max_Exp_field()) {
             	
                 System.out.println("The Check_Max_Exp_field is enabled.");

             } else {
                 System.out.println("The Check_Max_Exp_field is not enabled.");
             }
         } else {
             System.out.println("The Check_Max_Exp_field is not displayed.");
         }
         
		   // Verify if the Check_Emp_Type_Dropdown is displayed
         if (Fields.Check_Emp_Type_Dropdown()) {
         	
             System.out.println("The Emp_Type_Dropdown is displayed.");

             if (Fields.Check_Emp_Type_Dropdown()) {
             	
                 System.out.println("The Emp_Type_Dropdown is enabled.");

             } else {
                 System.out.println("The Emp_Type_Dropdown is not enabled.");
             }
         } else {
             System.out.println("The Emp_Type_Dropdown is not displayed.");
         }
         
		   // Verify if the Check_Highest_Education_dropdown is displayed
         if (Fields.Check_Highest_Education_dropdown()) {
         	
             System.out.println("The Highest_Education_dropdown is displayed.");

             if (Fields.Check_Highest_Education_dropdown()) {
             	
                 System.out.println("The Highest_Education_dropdown is enabled.");

             } else {
                 System.out.println("The Highest_Education_dropdown is not enabled.");
             }
         } else {
             System.out.println("The Highest_Education_dropdown is not displayed.");
         }
         
		   // Verify if the Check_Required_degree_field is displayed
         if (Fields.Check_Required_degree_field()) {
         	
             System.out.println("The Required_degree_field is displayed.");

             // Verify if the Upload_Cover_Photo is enabled
             if (Fields.Check_Required_degree_field()) {
             	
                 System.out.println("The Required_degree_field is enabled.");

             } else {
                 System.out.println("The Required_degree_field is not enabled.");
             }
         } else {
             System.out.println("The Required_degree_field is not displayed.");
         }
         
		   // Verify if the Check_Add_Skill_Button is displayed
         if (Fields.Check_Add_Skill_Button()) {
         	
             System.out.println("The Add_Skill_Button is displayed.");

             if (Fields.Check_Add_Skill_Button()) {
             	
                 System.out.println("The Add_Skill_Button is enabled.");

             } else {
                 System.out.println("The Add_Skill_Button is not enabled.");
             }
         } else {
             System.out.println("The Add_Skill_Button is not displayed.");
         }
         
		   // Verify if the Check_Required_Skill_field is displayed
         if (Fields.Check_Required_Skill_field()) {
         	
             System.out.println("The Required_Skill_field is displayed.");

             if (Fields.Check_Required_Skill_field()) {
             	
                 System.out.println("The Required_Skill_field is enabled.");

             } else {
                 System.out.println("The Required_Skill_field is not enabled.");
             }
         } else {
             System.out.println("The Required_Skill_field is not displayed.");
         }
         
		   // Verify if the Check_Minimum_Pay_Ranges_field is displayed
         if (Fields.Check_Minimum_Pay_Ranges_field()) {
         	
             System.out.println("The Minimum_Pay_Ranges_field is displayed.");

             // Verify if the Upload_Cover_Photo is enabled
             if (Fields.Check_Minimum_Pay_Ranges_field()) {
             	
                 System.out.println("The Minimum_Pay_Ranges_field is enabled.");

             } else {
                 System.out.println("The Minimum_Pay_Ranges_field is not enabled.");
             }
         } else {
             System.out.println("The Minimum_Pay_Ranges_field is not displayed.");
         }
         
		   // Verify if the Check_Maximum_Pay_Ranges_field is displayed
         if (Fields.Check_Maximum_Pay_Ranges_field()) {
         	
             System.out.println("The Maximum_Pay_Ranges_field is displayed.");

             if (Fields.Check_Maximum_Pay_Ranges_field()) {
             	
                 System.out.println("The Maximum_Pay_Ranges_field is enabled.");

             } else {
                 System.out.println("The Maximum_Pay_Ranges_field is not enabled.");
             }
         } else {
             System.out.println("The Maximum_Pay_Ranges_field is not displayed.");
         }
         
		
     }
	 
	 	 
	 @Test
    // To check the all the fields/ dropdown displayed (Remaining)

	public void TC_ID_03_03() throws InterruptedException {
		 
		 Post_A_Job Fields = new Post_A_Job(driver);
		 
		   // Verify if the Check_Location_Type_dropdown is displayed
         if (Fields.Check_Location_Type_dropdown()) {
         	
             System.out.println("The Location_Type_dropdown is displayed.");

             if (Fields.Check_Location_Type_dropdown()) {
             	
                 System.out.println("The Location_Type_dropdown is enabled.");

             } else {
                 System.out.println("The Location_Type_dropdown is not enabled.");
             }
         } else {
             System.out.println("The Location_Type_dropdown is not displayed.");
         }
         
		   // Verify if the Check_Country_dropdown is displayed
         if (Fields.Check_Country_dropdown()) {
         	
             System.out.println("The Country_dropdown is displayed.");

             if (Fields.Check_Country_dropdown()) {
             	
                 System.out.println("The Country_dropdown is enabled.");

             } else {
                 System.out.println("The Country_dropdown is not enabled.");
             }
         } else {
             System.out.println("The Country_dropdown is not displayed.");
         }
         
		   // Verify if the Check_State_dropdown is displayed
         if (Fields.Check_State_dropdown()) {
         	
             System.out.println("The State_dropdown is displayed.");

             // Verify if the Upload_Cover_Photo is enabled
             if (Fields.Check_State_dropdown()) {
             	
                 System.out.println("The State_dropdown is enabled.");

             } else {
                 System.out.println("The State_dropdown is not enabled.");
             }
         } else {
             System.out.println("The State_dropdown is not displayed.");
         }
         
		   // Verify if the Check_City_dropdown is displayed
         if (Fields.Check_City_dropdown()) {
         	
             System.out.println("The City_dropdown is displayed.");

             if (Fields.Check_City_dropdown()) {
             	
                 System.out.println("The City_dropdown is enabled.");

             } else {
                 System.out.println("The City_dropdown is not enabled.");
             }
         } else {
             System.out.println("The City_dropdown is not displayed.");
         }
         
		   // Verify if the Check_Add_Benifit_Button is displayed
         if (Fields.Check_Add_Benifit_Button()) {
         	
             System.out.println("The Add_Benifit_Button is displayed.");

             if (Fields.Check_Add_Benifit_Button()) {
             	
                 System.out.println("The Add_Benifit_Button is enabled.");

             } else {
                 System.out.println("The Add_Benifit_Button is not enabled.");
             }
         } else {
             System.out.println("The Add_Benifit_Button is not displayed.");
         }
         
		   // Verify if the Check_Job_Benifit_button is displayed
         if (Fields.Check_Job_Benifit_button()) {
         	
             System.out.println("The Job_Benifit_button is displayed.");

             // Verify if the Upload_Cover_Photo is enabled
             if (Fields.Check_Job_Benifit_button()) {
             	
                 System.out.println("The Job_Benifit_button is enabled.");

             } else {
                 System.out.println("The Job_Benifit_button is not enabled.");
             }
         } else {
             System.out.println("The Job_Benifit_button is not displayed.");
         }
         
		   // Verify if the Check_Add_Keyword_field is displayed
         if (Fields.Check_Add_Keyword_field()) {
         	
             System.out.println("The Add_Keyword_field is displayed.");

             if (Fields.Check_Add_Keyword_field()) {
             	
                 System.out.println("The Add_Keyword_field is enabled.");

             } else {
                 System.out.println("The Add_Keyword_field is not enabled.");
             }
         } else {
             System.out.println("The Add_Keyword_field is not displayed.");
         }
         
		   // Verify if the Check_Description_field is displayed
         if (Fields.Check_Description_field()) {
         	
             System.out.println("The Description_field is displayed.");

             if (Fields.Check_Description_field()) {
             	
                 System.out.println("The Description_field is enabled.");

             } else {
                 System.out.println("The Description_field is not enabled.");
             }
         } else {
             System.out.println("The Description_field is not displayed.");
         }
         
		   // Verify if the Check_Submit_button is displayed
         if (Fields.Check_Submit_button()) {
         	
             System.out.println("The Submit_button is displayed.");

             if (Fields.Check_Submit_button()) {
             	
                 System.out.println("The Submit_button is enabled.");

             } else {
                 System.out.println("The Submit_button is not enabled.");
             }
         } else {
             System.out.println("The Submit_button is not displayed.");
         }       
         
}
	
	 	 
	 @Test
	 
	// Try to post a job with name "Test _Automation Engineer" and check the submit message
	public void TC_ID_03_04() throws InterruptedException, IOException {
		 
			
     	 String filePath = "C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\Company_Portal_JP\\src\\test\\resources\\tests\\TestData.xlsx";
         String sheetName = "Post_A_Job";
   	       	
   	// Initialize Excel utility
       ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
       Post_A_Job Post_A_Job_Enter_Data = new Post_A_Job(driver);

       // Iterate through rows in Excel
       int rowCount = excel.getRowCount();
       for (int i = 1; i <= rowCount; i++) { // Assuming row 0 is the header
           String Job_Title_1 = excel.getCellData(i, 0);
          // String  Start_Date_1 = excel.getCellData(i, 1);
          // String End_Date_1= excel.getCellData(i, 2);
           String Min_Experience_1 = excel.getCellData(i, 3);
           String Max_Experience_1 = excel.getCellData(i, 4);
           String Employment_Type_1= excel.getCellData(i, 5);
           String Educational_Level_1= excel.getCellData(i, 6);
           String Required_Degree_1= excel.getCellData(i, 7);
           String Skills_1= excel.getCellData(i, 8);
           String Required_Skill_1 = excel.getCellData(i, 9);
           String Required_Skill_2 = excel.getCellData(i, 10);
           String Minimum_Pay_Ranges_1 = excel.getCellData(i, 11);         
           String Maximum_Pay_Ranges_1= excel.getCellData(i, 12);
           String Location_Type_1= excel.getCellData(i, 13);
           String Country_1 = excel.getCellData(i, 14);
           String State_1 = excel.getCellData(i, 15);
           String City_1 = excel.getCellData(i, 16);         
           String Benifit_1= excel.getCellData(i, 17);
           String Job_Benifit_1= excel.getCellData(i, 18);
           String Job_Benifit_2= excel.getCellData(i, 19);
           String Add_Keyword_1 = excel.getCellData(i, 20);
           String Add_Keyword_2 = excel.getCellData(i, 21);
           String Job_Description_1 = excel.getCellData(i, 22);
      

           // Fill the registration form
           Post_A_Job_Enter_Data.Enter_Data(Job_Title_1,
        		 //  Start_Date_1, 
        		 //  End_Date_1,
        		   Min_Experience_1,
        		   Max_Experience_1,	
        		   Employment_Type_1,
        		   Educational_Level_1,
        		   Required_Degree_1,
        		   Skills_1, 
        		   Required_Skill_1,
        		   Required_Skill_2,
        		   Minimum_Pay_Ranges_1,      		   
        		   Maximum_Pay_Ranges_1,
        		   Location_Type_1,	
        		   Country_1,
        		   State_1,
        		   City_1,
        		   Benifit_1, 
        		   Job_Benifit_1,
        		   Job_Benifit_2,
        		   Add_Keyword_1,
        		   Add_Keyword_2,
        		   Job_Description_1);
           
           Post_A_Job_Enter_Data.Click_Submit_button();
           
           Thread.sleep(5000);
           
           break;
           
       }
       
}
	
	 
	 
	 @Test		
	 // Try to post a job with name "Data Analyst" and check the submit message
	public void TC_ID_03_05() throws InterruptedException, IOException {
		 
	     Post_A_Job Jobs = new Post_A_Job(driver);
	     
	     Jobs.Click_on_Post_a_Job();		 
		 
		 String filePath = "C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\Company_Portal_JP\\src\\test\\resources\\tests\\TestData.xlsx";
         String sheetName = "Post_A_Job";
   	       	
   	// Initialize Excel utility
       ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
       Post_A_Job Post_A_Job_Enter_Data = new Post_A_Job(driver);

       // Iterate through rows in Excel
       int rowCount = excel.getRowCount();
       for (int i = 2; i <= rowCount; i++) { // Assuming row 0 is the header
           String Job_Title_1 = excel.getCellData(i, 0);
          // String  Start_Date_1 = excel.getCellData(i, 1);
          // String End_Date_1= excel.getCellData(i, 2);
           String Min_Experience_1 = excel.getCellData(i, 3);
           String Max_Experience_1 = excel.getCellData(i, 4);
           String Employment_Type_1= excel.getCellData(i, 5);
           String Educational_Level_1= excel.getCellData(i, 6);
           String Required_Degree_1= excel.getCellData(i, 7);
           String Skills_1= excel.getCellData(i, 8);
           String Required_Skill_1 = excel.getCellData(i, 9);
           String Required_Skill_2 = excel.getCellData(i, 10);
           String Minimum_Pay_Ranges_1 = excel.getCellData(i, 11);         
           String Maximum_Pay_Ranges_1= excel.getCellData(i, 12);
           String Location_Type_1= excel.getCellData(i, 13);
           String Country_1 = excel.getCellData(i, 14);
           String State_1 = excel.getCellData(i, 15);
           String City_1 = excel.getCellData(i, 16);         
           String Benifit_1= excel.getCellData(i, 17);
           String Job_Benifit_1= excel.getCellData(i, 18);
           String Job_Benifit_2= excel.getCellData(i, 19);
           String Add_Keyword_1 = excel.getCellData(i, 20);
           String Add_Keyword_2 = excel.getCellData(i, 21);
           String Job_Description_1 = excel.getCellData(i, 22);
      

           // Fill the registration form
           Post_A_Job_Enter_Data.Enter_Data(Job_Title_1,
        		 //  Start_Date_1, 
        		 //  End_Date_1,
        		   Min_Experience_1,
        		   Max_Experience_1,	
        		   Employment_Type_1,
        		   Educational_Level_1,
        		   Required_Degree_1,
        		   Skills_1, 
        		   Required_Skill_1,
        		   Required_Skill_2,
        		   Minimum_Pay_Ranges_1,      		   
        		   Maximum_Pay_Ranges_1,
        		   Location_Type_1,	
        		   Country_1,
        		   State_1,
        		   City_1,
        		   Benifit_1, 
        		   Job_Benifit_1,
        		   Job_Benifit_2,
        		   Add_Keyword_1,
        		   Add_Keyword_2,
        		   Job_Description_1);
           
    Post_A_Job_Enter_Data.Click_Submit_button();
           
           Thread.sleep(5000);
           
           break;
       }

		 
		 
}
	
	 
	 @Test
	// Try to post a job with name "Project Manager" and check the submit message
	public void TC_ID_03_06() throws InterruptedException, IOException {
		
		    Post_A_Job Jobs = new Post_A_Job(driver);
		     
		    Jobs.Click_on_Post_a_Job();
		 
		 String filePath = "C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\Company_Portal_JP\\src\\test\\resources\\tests\\TestData.xlsx";
         String sheetName = "Post_A_Job";
   	       	
   	// Initialize Excel utility
       ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
       Post_A_Job Post_A_Job_Enter_Data = new Post_A_Job(driver);

       // Iterate through rows in Excel
       int rowCount = excel.getRowCount();
       for (int i = 3; i <= rowCount; i++) { // Assuming row 0 is the header
           String Job_Title_1 = excel.getCellData(i, 0);
          // String  Start_Date_1 = excel.getCellData(i, 1);
          // String End_Date_1= excel.getCellData(i, 2);
           String Min_Experience_1 = excel.getCellData(i, 3);
           String Max_Experience_1 = excel.getCellData(i, 4);
           String Employment_Type_1= excel.getCellData(i, 5);
           String Educational_Level_1= excel.getCellData(i, 6);
           String Required_Degree_1= excel.getCellData(i, 7);
           String Skills_1= excel.getCellData(i, 8);
           String Required_Skill_1 = excel.getCellData(i, 9);
           String Required_Skill_2 = excel.getCellData(i, 10);
           String Minimum_Pay_Ranges_1 = excel.getCellData(i, 11);         
           String Maximum_Pay_Ranges_1= excel.getCellData(i, 12);
           String Location_Type_1= excel.getCellData(i, 13);
           String Country_1 = excel.getCellData(i, 14);
           String State_1 = excel.getCellData(i, 15);
           String City_1 = excel.getCellData(i, 16);         
           String Benifit_1= excel.getCellData(i, 17);
           String Job_Benifit_1= excel.getCellData(i, 18);
           String Job_Benifit_2= excel.getCellData(i, 19);
           String Add_Keyword_1 = excel.getCellData(i, 20);
           String Add_Keyword_2 = excel.getCellData(i, 21);
           String Job_Description_1 = excel.getCellData(i, 22);
      

           // Fill the registration form
           Post_A_Job_Enter_Data.Enter_Data(Job_Title_1,
        		 //  Start_Date_1, 
        		 //  End_Date_1,
        		   Min_Experience_1,
        		   Max_Experience_1,	
        		   Employment_Type_1,
        		   Educational_Level_1,
        		   Required_Degree_1,
        		   Skills_1, 
        		   Required_Skill_1,
        		   Required_Skill_2,
        		   Minimum_Pay_Ranges_1,      		   
        		   Maximum_Pay_Ranges_1,
        		   Location_Type_1,	
        		   Country_1,
        		   State_1,
        		   City_1,
        		   Benifit_1, 
        		   Job_Benifit_1,
        		   Job_Benifit_2,
        		   Add_Keyword_1,
        		   Add_Keyword_2,
        		   Job_Description_1);
           
    Post_A_Job_Enter_Data.Click_Submit_button();
           
           Thread.sleep(5000);
           
           break;           
       }		 
		 
}	 
	 	 
	 @Test
	// Try to post a job with name "Team Lead" and check the submit message
	public void TC_ID_03_07() throws InterruptedException, IOException {
		 
		 Post_A_Job Jobs = new Post_A_Job(driver);
		     
		 Jobs.Click_on_Post_a_Job();
		 
		 String filePath = "C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\Company_Portal_JP\\src\\test\\resources\\tests\\TestData.xlsx";
         String sheetName = "Post_A_Job";
   	       	
   	// Initialize Excel utility
       ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
       Post_A_Job Post_A_Job_Enter_Data = new Post_A_Job(driver);

       // Iterate through rows in Excel
       int rowCount = excel.getRowCount();
       for (int i = 4; i <= rowCount; i++) { // Assuming row 0 is the header
           String Job_Title_1 = excel.getCellData(i, 0);
          // String  Start_Date_1 = excel.getCellData(i, 1);
          // String End_Date_1= excel.getCellData(i, 2);
           String Min_Experience_1 = excel.getCellData(i, 3);
           String Max_Experience_1 = excel.getCellData(i, 4);
           String Employment_Type_1= excel.getCellData(i, 5);
           String Educational_Level_1= excel.getCellData(i, 6);
           String Required_Degree_1= excel.getCellData(i, 7);
           String Skills_1= excel.getCellData(i, 8);
           String Required_Skill_1 = excel.getCellData(i, 9);
           String Required_Skill_2 = excel.getCellData(i, 10);
           String Minimum_Pay_Ranges_1 = excel.getCellData(i, 11);         
           String Maximum_Pay_Ranges_1= excel.getCellData(i, 12);
           String Location_Type_1= excel.getCellData(i, 13);
           String Country_1 = excel.getCellData(i, 14);
           String State_1 = excel.getCellData(i, 15);
           String City_1 = excel.getCellData(i, 16);         
           String Benifit_1= excel.getCellData(i, 17);
           String Job_Benifit_1= excel.getCellData(i, 18);
           String Job_Benifit_2= excel.getCellData(i, 19);
           String Add_Keyword_1 = excel.getCellData(i, 20);
           String Add_Keyword_2 = excel.getCellData(i, 21);
           String Job_Description_1 = excel.getCellData(i, 22);
      

           // Fill the registration form
           Post_A_Job_Enter_Data.Enter_Data(Job_Title_1,
        		 //  Start_Date_1, 
        		 //  End_Date_1,
        		   Min_Experience_1,
        		   Max_Experience_1,	
        		   Employment_Type_1,
        		   Educational_Level_1,
        		   Required_Degree_1,
        		   Skills_1, 
        		   Required_Skill_1,
        		   Required_Skill_2,
        		   Minimum_Pay_Ranges_1,      		   
        		   Maximum_Pay_Ranges_1,
        		   Location_Type_1,	
        		   Country_1,
        		   State_1,
        		   City_1,
        		   Benifit_1, 
        		   Job_Benifit_1,
        		   Job_Benifit_2,
        		   Add_Keyword_1,
        		   Add_Keyword_2,
        		   Job_Description_1);
           
    Post_A_Job_Enter_Data.Click_Submit_button();
           
           Thread.sleep(5000);
           
           break;
}
	 }
	 
	 @Test
	 
	// Try to post a job with name "Managing Director" and check the submit message
	public void TC_ID_03_08() throws InterruptedException, IOException {
		 
		    Post_A_Job Jobs = new Post_A_Job(driver);
		     
		     Jobs.Click_on_Post_a_Job();
		 
		 String filePath = "C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\Company_Portal_JP\\src\\test\\resources\\tests\\TestData.xlsx";
         String sheetName = "Post_A_Job";
   	       	
   	// Initialize Excel utility
       ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
       Post_A_Job Post_A_Job_Enter_Data = new Post_A_Job(driver);

       // Iterate through rows in Excel
       int rowCount = excel.getRowCount();
       for (int i = 5; i <= rowCount; i++) { // Assuming row 0 is the header
           String Job_Title_1 = excel.getCellData(i, 0);
          // String  Start_Date_1 = excel.getCellData(i, 1);
          // String End_Date_1= excel.getCellData(i, 2);
           String Min_Experience_1 = excel.getCellData(i, 3);
           String Max_Experience_1 = excel.getCellData(i, 4);
           String Employment_Type_1= excel.getCellData(i, 5);
           String Educational_Level_1= excel.getCellData(i, 6);
           String Required_Degree_1= excel.getCellData(i, 7);
           String Skills_1= excel.getCellData(i, 8);
           String Required_Skill_1 = excel.getCellData(i, 9);
           String Required_Skill_2 = excel.getCellData(i, 10);
           String Minimum_Pay_Ranges_1 = excel.getCellData(i, 11);         
           String Maximum_Pay_Ranges_1= excel.getCellData(i, 12);
           String Location_Type_1= excel.getCellData(i, 13);
           String Country_1 = excel.getCellData(i, 14);
           String State_1 = excel.getCellData(i, 15);
           String City_1 = excel.getCellData(i, 16);         
           String Benifit_1= excel.getCellData(i, 17);
           String Job_Benifit_1= excel.getCellData(i, 18);
           String Job_Benifit_2= excel.getCellData(i, 19);
           String Add_Keyword_1 = excel.getCellData(i, 20);
           String Add_Keyword_2 = excel.getCellData(i, 21);
           String Job_Description_1 = excel.getCellData(i, 22);
      

           // Fill the registration form
           Post_A_Job_Enter_Data.Enter_Data(Job_Title_1,
        		 //  Start_Date_1, 
        		 //  End_Date_1,
        		   Min_Experience_1,
        		   Max_Experience_1,	
        		   Employment_Type_1,
        		   Educational_Level_1,
        		   Required_Degree_1,
        		   Skills_1, 
        		   Required_Skill_1,
        		   Required_Skill_2,
        		   Minimum_Pay_Ranges_1,      		   
        		   Maximum_Pay_Ranges_1,
        		   Location_Type_1,	
        		   Country_1,
        		   State_1,
        		   City_1,
        		   Benifit_1, 
        		   Job_Benifit_1,
        		   Job_Benifit_2,
        		   Add_Keyword_1,
        		   Add_Keyword_2,
        		   Job_Description_1);
           
    Post_A_Job_Enter_Data.Click_Submit_button();
           
           Thread.sleep(5000);
           
           break;           
}

	
}
}