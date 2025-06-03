package Company_TestScripts;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.mailosaur.MailosaurException;

import POM_Company.Company_LoginPage;
import POM_Company.Company_RegisterPage;
import base.BaseTest;
import config.Config;
import utils.ExcelUtilityReg;
import utils.TestListener;

@Listeners(TestListener.class)


public class TC_ID_01_Register_and_Login extends BaseTest {
	
	@Test
	public void TC_ID_01_01() throws IOException
	{
		openCompanybrowser();
		//To check that application Launcing sucessfully/build check
		companydriver.get(Config.getProperty("companyloginurl"));
		String actualurl = companydriver.getCurrentUrl();
		String expectedurl="https://test-jobs.reyan.co.in/session/login/company";
		Assert.assertEquals(actualurl,expectedurl );
	}
	@Test
	public void TC_ID_01_02() throws IOException
	{
		//To check that the Register page open
		Company_RegisterPage r = new Company_RegisterPage(companydriver);
		r.openregisterpage();
		String actualurl=companydriver.getCurrentUrl();
		String expectedurl= "https://test-jobs.reyan.co.in/session/signup/company";
		Assert.assertEquals(actualurl, expectedurl);
	}
	@Test
	public void TC_ID_01_03()
	{
		//To check that all the fields available
		Company_RegisterPage r = new Company_RegisterPage(companydriver);
		
		Assert.assertTrue(r.is_Companynamefield_present(), "company name field should be available");
		Assert.assertTrue(r.is_Companymailfield_present(), "company email field should be available");
		Assert.assertTrue(r.is_Companynumberfield_present(), "company number field should be available");
		Assert.assertTrue(r.is_Companypasswordfield_present(), "company password field should be available");
		//Assert.assertTrue(r.is_checkbox_present(), "Checkbox field should be available");
		Assert.assertTrue(r.is_viewtermsconditonbutton_present(), "Terms and condition button should be available");
		Assert.assertTrue(r.is_viewprivacypolicybutton_present(), "View privacy policy button should be available");
		Assert.assertTrue(r.is_registerbutton_present(), "company button should be available");
	}
	@Test
	public void TC_ID_01_04() throws IOException
	{
		//Enter Details of company 
		Company_RegisterPage r = new Company_RegisterPage(companydriver);
		
		 String filePath =data.getdata("filePath");
    	 String sheetName=data.getdata("sheetName_1");
    	 ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
    	 
    	 for(int i=1; i<= 1; i++)
    		 
    	 {
    		String Company_Name = excel.getCellData(i, 0);
    		String Company_Email = excel.getCellData(i, 1);
    		String Company_ContactNo = excel.getCellData(i, 2);
    		String Password = excel.getCellData(i, 3);
    		r.enterdata_register(Company_Name, Company_Email, Company_ContactNo, Password);
    		break;
    	 }
	}
	@Test
	public void TC_ID_01_05() throws InterruptedException
	{
		//Verify agree terms and condition checkbox is selected
		Company_RegisterPage r = new Company_RegisterPage(companydriver);
		r.selectcheckbox();
		Assert.assertTrue(r.is_checkbox_selected(), "Checkbox should be selected");
	}
	@Test
	public void TC_ID_01_06()
	{
		//Verify user able to view terms and condition by clicking on  view terms and condition button 
		Company_RegisterPage r = new Company_RegisterPage(companydriver);
		r.viewtermsconditon_page_display();
		r.close_viewtermsconditonpage();
	}
	@Test
	public void TC_ID_01_07()
	{
        //Verify user able to privacy policy by clicking on  privacy policy button
		Company_RegisterPage r = new Company_RegisterPage(companydriver);
		r.viewprivacypolicy_page_display();
		r.close_viewprivacypolicypage();
	}
	@Test
	public void TC_ID_01_08() throws InterruptedException
	{
		//Verify user able to register on the portal by clicking on register button and display login page
		Company_RegisterPage r = new Company_RegisterPage(companydriver);
		Thread.sleep(2000);
        r.clickonregisterbutton();
	}
	@Test
	public void TC_ID_01_09()
	{
		//Verify elements on verify OTP page
		Company_RegisterPage r = new Company_RegisterPage(companydriver);
		Assert.assertTrue(r.Is_OTPField_display(), "OTP field should be display");
		Assert.assertTrue(r.Is_VerifyOTPbutton_display(), "Verify OTP button should be display");
		Assert.assertTrue(r.Is_ResendOTPbutton_display(), "Resend OTP button should be display");
		Assert.assertTrue(r.Is_Cancelbutton_display(), "Cancel button should be display");

	}
	@Test()
	public  void TC_ID_01_10() throws IOException, MailosaurException, InterruptedException
	{
		//Verify user able to validate OTP
		Company_RegisterPage r = new Company_RegisterPage(companydriver);
		Thread.sleep(10000);
		String OTP=emailTest.ReadEmail();
		r.enterotp(OTP);
	    r.verifyOTP();
       
	}
	@Test
	public void TC_ID_01_11()
	{
		//Verify login page with fields available
		Company_LoginPage  loginpage = new Company_LoginPage(companydriver);
         Assert.assertTrue(loginpage.is_companymailfield_present(), "Email field should be available");
         Assert.assertTrue(loginpage.is_companypasswordsfield_present(), "Password field should be available");
         
	}
    @Test
    public void TC_ID_01_17() throws InterruptedException
    {
		Company_LoginPage  loginpage = new Company_LoginPage(companydriver);
		Thread.sleep(3000);
        Assert.assertTrue(loginpage.is_loginbutton_enable(), "Login button should be enable");
    }
	@Test
	public void TC_ID_01_16() throws IOException
	{
		//Enter Correct Email and Correct Password
		Company_LoginPage  loginpage = new Company_LoginPage(companydriver);
		
			 String filePath =data.getdata("filePath");
	    	 String sheetName=data.getdata("sheetName_1");
	    	 ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
	    	 
	    	 int rowCount = excel.getRowCount();
	    	 for(int i=1; i<= rowCount; i++)
	    	 {
	     		String company_Email = excel.getCellData(i, 1);
	    		String Password = excel.getCellData(i, 3);
	    		loginpage.enteremail(company_Email);
	    		loginpage.enterpassword(Password);
	    		loginpage.Clicklogin();
	    		break;

	    	 }
		
	}
	
}

    
