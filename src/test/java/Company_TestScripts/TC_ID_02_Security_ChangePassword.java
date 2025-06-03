package Company_TestScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM_Company.Company_LoginPage;
import POM_Company.Profile;
import base.BaseTest;
import utils.ExcelUtilityReg;
import utils.TestListener;

@Listeners(TestListener.class)

public class TC_ID_02_Security_ChangePassword extends BaseTest
{
	 @Test
	   // To click on security tab and check the information available.
	    public void TC_ID_02_11 () throws InterruptedException, IOException {
		    openCompanybrowser();
			loginCompany();
		   Thread.sleep(3000);
	    	Profile Security = new Profile(companydriver);
	    	Security.SelectProfileIcon();
	    	Security.SelectProfile();
	    	Security.Click_on_Security();
	    	
	    	Security.Check_Security_Current_Pass();
	    	
	    	Security.Check_Security_New_Pass();
	    	
	    	Security.Check_Security_New_Pass();
	    	
	    	Security.Check_Security_Confirm_Pass();
	    	     
	    }    
    @Test
   // Try to change the password and save it
    public void TC_ID_02_12 () throws InterruptedException, IOException {
    	
     	 String filePath = data.getdata("filePath");   
		  String SheetName = data.getdata("sheetName_24");	
	       	
   	// Initialize Excel utility
       ExcelUtilityReg excel = new ExcelUtilityReg(filePath, SheetName);
        Profile Update_password = new Profile(companydriver);

        // Iterate through rows in Excel
 //       int rowCount = excel.getRowCount();
        for (int i = 1; i <= 1; i++) { // Assuming row 0 is the header
            String Current_Password = excel.getCellData(i, 0);
            String  New_Password = excel.getCellData(i, 1);
            String Confirm_Password= excel.getCellData(i, 2);
              
            // Fill the registration form
            Update_password.Update_Password(Current_Password, New_Password, Confirm_Password);
                    
            Update_password.Check_Update_Button_1();
            
            Update_password.Check_Cancel_Button();
            
            Update_password.Check_Update_Button_1();
            
            Update_password.Check_Final_Confirm_Button();
            
            break;
        }
    }
      
    @Test
    public void Login_with_changedPassword() throws IOException
    {
         Company_LoginPage   loginpage = new Company_LoginPage (companydriver);

		 String filePath =data.getdata("filePath");
   	     String sheetName=data.getdata("sheetName_1");
   	     ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
   	 
   	     int rowCount = excel.getRowCount();
   	     for(int i=1; i<= rowCount; i++)
   	     {
    		String company_Email = excel.getCellData(i, 1);
    		loginpage.enteremail(company_Email);
    		loginpage.enterpassword(data.getdata("Changed_password"));
    		loginpage.Clicklogin();
    		break;
         }
     }
}
	  
