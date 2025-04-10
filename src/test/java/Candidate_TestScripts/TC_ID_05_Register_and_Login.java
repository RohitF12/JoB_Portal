package Candidate_TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mailosaur.MailosaurException;

import base.BaseTest;
import base.EmailTest;
import utils.ExcelUtilityReg;
import POM_Candidate.Candidate_LoginPage;
import POM_Candidate.Candidate_RegisterPage;

// TC_ID_05_01 to TC_ID_05_11 & 16

public class TC_ID_05_Register_and_Login extends BaseTest
{
	
	@Test
	public void TC_ID_05_01() throws IOException
	{
		openCandidatebrowser();
		//To check that application Launcing sucessfully/build check
		candidatedriver.get(data.getdata("candidateloginurl"));
		String actualurl = candidatedriver.getCurrentUrl();
		String expectedurl="https://test-jobs.reyan.co.in/session/login/candidate";
		Assert.assertEquals(actualurl,expectedurl );
	}
	@Test
	public void TC_ID_05_02() throws IOException
	{
		//To check that the Register page open
		Candidate_RegisterPage r = new Candidate_RegisterPage(candidatedriver);
		r.openregisterpage();
		String actualurl=candidatedriver.getCurrentUrl();
		String expectedurl= "https://test-jobs.reyan.co.in/session/signup/candidate";
		Assert.assertEquals(actualurl, expectedurl);
	}
	@Test
	public void TC_ID_05_03()
	{
		//To check that all the fields available
		Candidate_RegisterPage r = new Candidate_RegisterPage(candidatedriver);
		Assert.assertTrue(r.is_candidatemailfield_present(), "Candidate name field should be available");
		Assert.assertTrue(r.is_candidatemailfield_present(), "Candidate email field should be available");
		Assert.assertTrue(r.is_candidatenumberfield_present(), "Candidate number field should be available");
		Assert.assertTrue(r.is_candidatepasswordfield_present(), "Candidate password field should be available");
		//Assert.assertTrue(r.is_checkbox_present(), "Checkbox field should be available");
		Assert.assertTrue(r.is_viewtermsconditonbutton_present(), "Terms and condition button should be available");
		Assert.assertTrue(r.is_viewprivacypolicybutton_present(), "View privacy policy button should be available");
		Assert.assertTrue(r.is_registerbutton_present(), "Register button should be available");
		
	}

	@Test
	public void TC_ID_05_04() throws IOException
	{
		//Enter Details of candidate 
		Candidate_RegisterPage r = new Candidate_RegisterPage(candidatedriver);
		
		 String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
    	 String sheetName="Candidate_Register";
    	 ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
    	 int rowCount = excel.getRowCount();
    	 for(int i=1; i<= rowCount; i++)
    	 {
    		String Candidate_Name = excel.getCellData(i, 0);
    		String Candidate_Email = excel.getCellData(i, 1);
    		String Candidate_ContactNo = excel.getCellData(i, 2);
    		String Password = excel.getCellData(i, 3);
    		r.enterdata_register(Candidate_Name, Candidate_Email, Candidate_ContactNo, Password);
    		break;
    	 }
	}
	@Test
	public void TC_ID_05_05() throws InterruptedException
	{
		//Verify agree terms and condition checkbox is selected
		Candidate_RegisterPage r = new Candidate_RegisterPage(candidatedriver);
		r.selectcheckbox();
		Assert.assertTrue(r.is_checkbox_selected(), "Checkbox should be selected");
	}
	@Test
	public void TC_ID_05_06()
	{
		//Verify user able to view terms and condition by clicking on  view terms and condition button 
		Candidate_RegisterPage r = new Candidate_RegisterPage(candidatedriver);
		r.viewtermsconditon_page_display();
		r.close_viewtermsconditonpage();
	}
	@Test
	public void TC_ID_05_07()
	{
        //Verify user able to privacy policy by clicking on  privacy policy button
		Candidate_RegisterPage r = new Candidate_RegisterPage(candidatedriver);
		r.viewprivacypolicy_page_display();
		r.close_viewprivacypolicypage();
	}
	@Test
	public void TC_ID_05_08() throws InterruptedException
	{
		//Verify user able to register on the potal by clicking on register button and display login page
		Candidate_RegisterPage r = new Candidate_RegisterPage(candidatedriver);
		Thread.sleep(2000);
        r.clickonregisterbutton();
	}
	@Test
	public void TC_ID_05_09()
	{
		//Verify elements on verify OTP page
		Candidate_RegisterPage r = new Candidate_RegisterPage(candidatedriver);
		Assert.assertTrue(r.Is_OTPField_display(), "OTP field should be display");
		Assert.assertTrue(r.Is_VerifyOTPbutton_display(), "Verify OTP button should be display");
		Assert.assertTrue(r.Is_ResendOTPbutton_display(), "Resend OTP button should be display");
		Assert.assertTrue(r.Is_Cancelbutton_display(), "Cancel button should be display");

	}
	@Test()
	public  void TC_ID_05_10() throws IOException, MailosaurException, InterruptedException
	{
		//Verify user able to validate OTP
		Candidate_RegisterPage r = new Candidate_RegisterPage(candidatedriver);
		Thread.sleep(10000);
		String OTP=emailTest.ReadEmail();
		r.enterotp(OTP);
	    r.verifyOTP();
       
	}
	@Test
	public void TC_ID_05_11()
	{
		//Verify login page with fields available
		 Candidate_LoginPage  loginpage = new Candidate_LoginPage(candidatedriver);
         Assert.assertTrue(loginpage.is_candidatemailfield_present(), "Email field should be available");
         Assert.assertTrue(loginpage.is_candidatepasswordsfield_present(), "Password field should be available");
         Assert.assertTrue(loginpage.is_loginbutton_enable(), "Login button should be available");
	}
	@Test
	public void TC_ID_05_16() throws IOException
	{
		//Enter Correct Email and Correct Password
		 Candidate_LoginPage  loginpage = new Candidate_LoginPage(candidatedriver);
			 String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
	    	 String sheetName="Candidate_Register";
	    	 ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
	    	 
	    	 int rowCount = excel.getRowCount();
	    	 for(int i=1; i<= rowCount; i++)
	    	 {
	     		String Candidate_Email = excel.getCellData(i, 1);
	    		String Password = excel.getCellData(i, 3);
	    		loginpage.enteremail(Candidate_Email);
	    		loginpage.enterpassword(Password);
	    		loginpage.Clicklogin();
	    		break;

	    	 }
		
	}
	
}
