package Company_TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import POM_Candidate.Candidate_LoginPage;
import POM_Company.Company_LoginPage;
import base.BaseTest;
import utils.ExcelUtilityReg;
import utils.TestListener;

@Listeners(TestListener.class)

//TC_ID_05_12 to TC_ID_05_15
public class TC_ID_01_Login_with_InvalidData extends BaseTest
{
	@Test
	public void TC_ID_01_12() throws IOException, InterruptedException
	{
		openCompanybrowser();
		//To check login with Correct Email and Wrong password 
		Company_LoginPage   loginpage = new Company_LoginPage (companydriver);
		
		 String filePath =data.getdata("filePath");
   	     String sheetName=data.getdata("sheetName_23");
	
   	     ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
   	 
   	     int rowCount = excel.getRowCount();
   	     for(int i=1; i<= rowCount; i++)
   	     {
    		String Email = excel.getCellData(i, 0);
   		    String Password = excel.getCellData(i, 1);
   		    loginpage.emailenter(Email);;
   		    loginpage.enterpassword(Password);
   		    loginpage.Clicklogin();
   		    break;
   		  }
   	      Assert.assertTrue(loginpage.is_errormsg_display_for_Wrongpassword(), "Password must be 8 characters length");
   	      loginpage.print_errormsg_for_Wrongpassword();
 		  loginpage.clear_entered_EmailPassword();

	}
	@Test
	public void TC_ID_01_13() throws IOException, InterruptedException
	{
		
		//To check login with Correct Email and blank Password
		Company_LoginPage   loginpage = new Company_LoginPage (companydriver);	
		
		 String filePath =data.getdata("filePath");
   	     String sheetName=data.getdata("sheetName_23");
				
   	     ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
   	 
   	     int rowCount = excel.getRowCount();
   	     for(int i=2; i<= rowCount; i++)
   	     {
    		String Email = excel.getCellData(i, 0);
   		    String Password = excel.getCellData(i, 1);
   		    loginpage.emailenter(Email);;
   		    loginpage.enterpassword(Password);
   		    loginpage.Clicklogin();
   		    break;
   		  }
   	      Assert.assertTrue(loginpage.is_errormsg_display_for_BlankPassword(), "Password is required!");
   	      loginpage.print_errormsg_for_BlankPassword();
   	      loginpage.clear_entered_EmailPassword();
	}
	@Test
	public void TC_ID_01_14() throws IOException, InterruptedException
	{
		
		//Enter wrong Email and Correct password 
		Company_LoginPage   loginpage = new Company_LoginPage (companydriver);	
          
		 String filePath =data.getdata("filePath");
   	     String sheetName=data.getdata("sheetName_23");
				
   	     ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
   	 
   	     int rowCount = excel.getRowCount();
   	     for(int i=3; i<= rowCount; i++)
   	     {
    		String Email = excel.getCellData(i, 0);
   		    String Password = excel.getCellData(i, 1);
   		    loginpage.emailenter(Email);;
   		    loginpage.enterpassword(Password);
   		    loginpage.Clicklogin();
   		    break;
   		  }
   	      Assert.assertTrue(loginpage.is_errormsg_display_for_Wrongemail(), "Invalid Email address");
   	      loginpage.print_errormsg_for_Wrongemail();
   	      loginpage.clear_entered_EmailPassword();
	} 
	@Test
	public void TC_ID_01_15() throws IOException, InterruptedException
	{
		
		//To check login with blank Email and correct Password 
		Company_LoginPage   loginpage = new Company_LoginPage (companydriver);		
		
		 String filePath =data.getdata("filePath");
   	     String sheetName=data.getdata("sheetName_23");
		
   	     ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
   	 
   	     int rowCount = excel.getRowCount();
   	     for(int i=4; i<= rowCount; i++)
   	     {
    		String Email = excel.getCellData(i, 0);
   		    String Password = excel.getCellData(i, 1);
   		    loginpage.emailenter(Email);;
   		    loginpage.enterpassword(Password);
   		    loginpage.Clicklogin();
   		    break;
   		  }
   	      Assert.assertTrue(loginpage.is_errormsg_display_for_BlankEmail(), "Email is required!");
   	      loginpage.print_errormsg_for_BlankEmail();
	} 

}
