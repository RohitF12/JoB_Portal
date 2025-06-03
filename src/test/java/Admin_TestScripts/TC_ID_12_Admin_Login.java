package Admin_TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Admin.Admin_LoginPage;
import POM_Candidate.Candidate_LoginPage;
import base.BaseTest;
import base.Config;
import utils.ExcelUtilityReg;

//TC_ID_05_12 to TC_ID_05_15
public class TC_ID_12_Admin_Login extends BaseTest{
	
  //To check that application Launcing successfully/build check
	@Test
	public void TC_ID_12_01() throws IOException, InterruptedException
	{
		openAdminbrowser();
		
	//	loginHR();
		
		//To check that application Launcing sucessfully/build check
	//	admindriver.get(Config.getProperty("Admin_Login"));	
		String actualurl = admindriver.getCurrentUrl();		   
		String expectedurl="https://test-jobs.reyan.co.in/session/login/admin";
		Assert.assertEquals(actualurl,expectedurl );
		
		Thread.sleep(3000);
		
	}	
	

	@Test
  //To check that HR Login heading and page Logo
	public void TC_ID_12_02() throws IOException, InterruptedException
	{
		Admin_LoginPage login = new Admin_LoginPage(admindriver);
		
		login.Heading_and_Logo();
		
		Thread.sleep(3000);

			
	}
	

//	To check that Email Id field Display/Enable
	@Test
	public void TC_ID_12_03() throws IOException, InterruptedException
	{
		Admin_LoginPage login = new Admin_LoginPage(admindriver);

		login.Email_Field();
		
		
	}
	
	
//	To check that Password field Display/Enable
	@Test
	public void TC_ID_12_04() throws IOException, InterruptedException
	{
		
		Admin_LoginPage login = new Admin_LoginPage(admindriver);
		
		login.Password_Field();
		
		Thread.sleep(3000);

	}
	
//	Application should not be login without Userid and Password.
	@Test
	public void TC_ID_12_05() throws IOException, InterruptedException
	{
		Admin_LoginPage login = new Admin_LoginPage(admindriver);
		
//		 String filePath = data.getdata("filePath");   
//		  String SheetName = data.getdata("sheetName_17");
//		
// 	     ExcelUtilityReg excel = new ExcelUtilityReg(filePath, SheetName);
// 	 
// 	     int rowCount = excel.getRowCount();
// 	     for(int i=1; i<= rowCount; i++)
// 	     {
//  		   String Email = excel.getCellData(i, 0);
// 		    String Password = excel.getCellData(i, 1);
// 		   login.emailenter(Email);;
// 		   login.enterpassword(Password);
 		  login.Clicklogin();
 //		    break;
 //		  }
 		  
 		 Thread.sleep(3000);
	}
	
//	To check login with Correct UserId and Wrong password 
	@Test
	public void TC_ID_12_06() throws IOException, InterruptedException
	{
		Admin_LoginPage login = new Admin_LoginPage(admindriver);
		
		 String FilePath = Config.getProperty("filePath");
		  String SheetName = Config.getProperty("sheetName_20");
		  
  	     ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
  	 
  	     int rowCount = excel.getRowCount();
  	     for(int i=1; i<= 1; i++)
  	     {
   		String Email = excel.getCellData(i, 0);
  		    String Password = excel.getCellData(i, 1);
  		login.enterUsername(Email);;
  		login.enterPassword(Password);
  		login.Clicklogin();
  		
  	   admindriver.navigate().refresh();
       break;
  		  }
  	     
  	     
//  	    Assert.assertTrue(login.is_errormsg_display_for_Wrongpassword(), "Password must be 8 characters length");
//  	    login.print_errormsg_for_Wrongpassword();
//  	  login.clear_entered_EmailPassword();
  	 
	}

	
//	To check login with Correct UserId and blank Password
	@Test
	public void TC_ID_12_07() throws IOException, InterruptedException
	{
		Admin_LoginPage login = new Admin_LoginPage(admindriver);
		
			 String FilePath = Config.getProperty("filePath");
		  String SheetName = Config.getProperty("sheetName_20");
		  
  	     ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
  	 
  	     int rowCount = excel.getRowCount();
  	     for(int i=2; i<= 2; i++)
  	     {
   		String Email = excel.getCellData(i, 0);
  		String Password = excel.getCellData(i, 1);
  		login.emailenter(Email);;
  		login.enterpassword(Password);
  		login.Clicklogin();
  		
 	   admindriver.navigate().refresh();

  		    break;
  		  }
//  	      Assert.assertTrue(login.is_errormsg_display_for_BlankPassword(), "Password is required!");
//  	    login.print_errormsg_for_BlankPassword();
//  	  login.clear_entered_EmailPassword();
  	  
	}
	
//	Enter wrong UserId and Correct password 
	@Test
	public void TC_ID_12_08() throws IOException, InterruptedException
	{
		Admin_LoginPage login = new Admin_LoginPage(admindriver);
		
	 String FilePath = Config.getProperty("filePath");
		  String SheetName = Config.getProperty("sheetName_20");
		  
  	     ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
  	 
  	     int rowCount = excel.getRowCount();
  	     for(int i=3; i<= 3; i++)
  	     {
   		String Email = excel.getCellData(i, 0);
  		    String Password = excel.getCellData(i, 1);
  		  login.emailenter(Email);;
  		  login.enterpassword(Password);
  		  login.Clicklogin();
  	 	 
  		  admindriver.navigate().refresh();

 		    break;  		
 		    }
//  	      Assert.assertTrue(login.is_errormsg_display_for_Wrongemail(), "Invalid Email address");
//  	    login.print_errormsg_for_Wrongemail();
//  	    login.clear_entered_EmailPassword();
  	      	    
  	       Thread.sleep(3000);
	} 
	
	
//	To check login with blank UserId and correct Password
	@Test
	public void TC_ID_12_09() throws IOException, InterruptedException
	{
		Admin_LoginPage login = new Admin_LoginPage(admindriver);
		
	       String FilePath = Config.getProperty("filePath");
	       
		  String SheetName = Config.getProperty("sheetName_20");
		  
  	     ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
  	 
  	     int rowCount = excel.getRowCount();
  	     for(int i=4; i<= 4; i++)
  	     {
   		String Email = excel.getCellData(i, 0);
  		    String Password = excel.getCellData(i, 1);
  		  login.emailenter(Email);;
  		login.enterpassword(Password);
  		login.Clicklogin();

		  admindriver.navigate().refresh();

		    break;
  	     
  	     }
//  	      Assert.assertTrue(login.is_errormsg_display_for_BlankEmail(), "Email is required!");
//  	    login.print_errormsg_for_BlankEmail();
  	    
	       Thread.sleep(3000);

	} 
//	To check that Login Button Enabled/Displayed
	@Test
	public void TC_ID_12_10() throws IOException, InterruptedException
	{
		Admin_LoginPage login = new Admin_LoginPage(admindriver);

		login.Login_Button();
	}
	
//	To check that Password should be accept 8-15 character only
	@Test
	public void TC_ID_12_11() throws IOException, InterruptedException
	
	{
		Admin_LoginPage login = new Admin_LoginPage(admindriver);

		  // Locate the password input field
		login.Password_click();
        // Test case 1: Less than 8 characters
		
	  	  admindriver.navigate().refresh();
	  	  
 	       Thread.sleep(3000);


          }
	
//	Enter Correct UserId and Correct Password
	@Test
	public void TC_ID_12_12() throws IOException, InterruptedException
	{
		Admin_LoginPage login = new Admin_LoginPage(admindriver);
		
	 String FilePath = Config.getProperty("filePath");
		  String SheetName = Config.getProperty("sheetName_20");
		  
  	     ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
 	 
 	     int rowCount = excel.getRowCount();
 	     for(int i=5; i<= 5; i++)
 	     {
  		String Email = excel.getCellData(i, 0);
 		    String Password = excel.getCellData(i, 1);
 		  login.emailenter(Email);;
 		login.enterpassword(Password);
 		login.Clicklogin();
 		    break;
 		    
 		 //  String Email = excel.getCellData(i, 0);
		  //  String Password = excel.getCellData(i, 1);
 		    
 		  }
	}
	
	}
