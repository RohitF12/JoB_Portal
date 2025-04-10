package Candidate_TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Candidate.Candidate_LoginPage;
import POM_Candidate.Candidate_Profile;
import base.BaseTest;
import utils.ExcelUtilityReg;

//TC_ID_06_11 to TC_ID_06_14

public class TC_ID_06_Security_ChangePassword extends BaseTest
{
	   @Test
	   public void TC_ID_06_11() throws IOException
	   {
		   openCandidatebrowser();
		   logincandidate();
		   //To check security tab is clickable
		    Candidate_Profile p= new Candidate_Profile(candidatedriver);
		    p.openelipsisimenu(); 
		    p.openprofile();
	        p.clickonsecurityttab();
	   }
	   @Test
	   public void TC_ID_06_12()
	   {
		   //To click on security tab and check the elements available.
		   Candidate_Profile p= new Candidate_Profile(candidatedriver);
		   p.is_currenpasswordfield_display();
		   p.is_newpasswordfield_display();
		   p.is_confirmpasswordfield_display();
		   p.is_confirmbutton_display();
	   }
	   @Test
	   public void TC_ID_06_13() throws IOException, InterruptedException
	   {
		   //Check to change the password and save it
		   Candidate_Profile p= new Candidate_Profile(candidatedriver);
		  
		   String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
	  	   String sheetName="Candidate_change_password";
	  	   
	  	   ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
	  	   int rowCount = excel.getRowCount();
	  	   for(int i=1; i<=rowCount; i++)
	  	   {
	  		   String CurrentPassword = excel.getCellData(i, 0);
	  		   String NewPassword = excel.getCellData(i, 1);
	  		   String ConfirmPassword = excel.getCellData(i, 2);
	  		   p.change_password(CurrentPassword, NewPassword, ConfirmPassword);
	  		   break;
	  	   }
	  	   String actualURL= candidatedriver.getCurrentUrl();
		   System.out.println(actualURL);
		   String ExpectedURL=data.getdata("candidateloginurl");
		   Assert.assertEquals(actualURL, ExpectedURL,"Login page does not display");
	  	   
	  	}
	   @Test
	   public void TC_ID_06_14() throws IOException
	   {
		   //To check after changing the password user able to login with new password
		     Candidate_LoginPage  loginpage = new Candidate_LoginPage(candidatedriver);
			 String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
	    	 String sheetName="Candidate_Register";
	    	 ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
	    	 
	    	 int rowCount = excel.getRowCount();
	    	 for(int i=1; i<= rowCount; i++)
	    	 {
	     		String Candidate_Email = excel.getCellData(i, 1);
	    		loginpage.enteremail(Candidate_Email);
	    		loginpage.enterpassword(data.getdata("changedpassword")); // call changed password from property file
	    		loginpage.Clicklogin();
	    		break;

	    	 }
	   }
	  
}
