package Candidate_TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mailosaur.MailosaurException;

import POM_Candidate.Candidate_LoginPage;
import POM_Candidate.Forgot_PasswordPage;
import base.BaseTest;
import utils.ExcelUtilityReg;

//TC_ID_21_01 to TC_ID_21_13

public class TC_ID_21_Forgot_Password extends BaseTest
{
	@Test
	public void TC_ID_21_01() throws IOException
	{
		//Verify forgot password page is display
	    Forgot_PasswordPage f = new Forgot_PasswordPage (candidatedriver);
	    Assert.assertTrue(f.is_forgotPassword_display(), "Foorgot password link should be display");
	    f.clickforgotpass();
	}
	@Test
	public void TC_ID_21_02()
	{
		//Verify elements on forgot password page
		Forgot_PasswordPage f = new Forgot_PasswordPage (candidatedriver);
		Assert.assertTrue(f.is_EmailidField_display(),"Emailid field should be display");
		Assert.assertTrue(f.is_Reset_Password_Button_display(),"Reset passwort button should be display");
		Assert.assertTrue(f.is_GoBack_button_display(),"Go back button should be display");
	}
	@Test
	public void TC_ID_21_03()
	{
		//Verify go button is clickable
		Forgot_PasswordPage f = new Forgot_PasswordPage (candidatedriver);
		f.click_GoBack_button();
	}
	@Test
	public void TC_ID_21_04() throws IOException
	{
		//Verify user able to enter emailid
		Forgot_PasswordPage f = new Forgot_PasswordPage (candidatedriver);
		f.clickforgotpass();
		 String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
    	 String sheetName="Candidate_Register";
    	 ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
    	 int rowCount = excel.getRowCount();
    	 for(int i=1;i<=rowCount;i++)
    	 {
    		 String Candidate_Email=excel.getCellData(i, 1);
    		 f.enteremailid(Candidate_Email);
    		 break;
    	 }
	}
	@Test
	public void TC_ID_21_05()
	{
		//Verify reset button is clickable and display verify otp page
		Forgot_PasswordPage f = new Forgot_PasswordPage (candidatedriver);
		methods.DoubleClick(candidatedriver, f.getResetpassbtn());
	}
	@Test
	public void TC_ID_21_06()
	{
		//Verify elements on verify otp page
		Forgot_PasswordPage f = new Forgot_PasswordPage (candidatedriver);
		Assert.assertTrue(f.is_EnterOTP_Field_display(),"Enter OTP field should be display");
		Assert.assertTrue(f.is_VerifyOTP_Button_display(),"Verify OTP button should be display");
    }
	@Test
	public void TC_ID_21_07() throws IOException, MailosaurException, InterruptedException
	{
		//Verify user able to enter otp
		Forgot_PasswordPage f = new Forgot_PasswordPage (candidatedriver);
		Thread.sleep(20000);
		String OTP = emailTest.ReadEmail();
		f.enterotp(OTP);
	}
	@Test
	public void TC_ID_21_08() 
	{
		//Verify verifyOTP button is clickable and display reset password page
		Forgot_PasswordPage f = new Forgot_PasswordPage (candidatedriver);
		f.clickverifyotp();
	}
	/*@Test
	public void TC_ID_21_09() 
	{
		//Verify elements on reset password page
		Forgot_PasswordPage f = new Forgot_PasswordPage (candidatedriver);
		Assert.assertTrue(f.is_EnterNewPassword_Field_display(),"Enter new password field should be display");
		Assert.assertTrue(f.is_EnterConfirmPassword_Field_display(),"Enter confirm password field should be display");
		Assert.assertTrue(f.is_ChangePassword_Button_display(),"Change password button should be display");
	}
	@Test
	public void TC_ID_21_10() throws IOException 
	{
		//Verify user able to enter new password
		 Forgot_PasswordPage f = new Forgot_PasswordPage (candidatedriver);
		 String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
    	 String sheetName="Forgot_Password";
    	 ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
    	 int rowCount = excel.getRowCount();
    	 for(int i=1;i<=rowCount;i++)
    	 {
    		 String New_Password = excel.getCellData(i, 0);
    		 String Confirm_Password = excel.getCellData(i, 1);
    		 f.Change_Password(New_Password, Confirm_Password);
    		 break;
    	 }
    }
	@Test
	public void TC_ID_21_11()
	{
		//Verify change password button is clickable
		Forgot_PasswordPage f = new Forgot_PasswordPage (candidatedriver);
		f.clickchangepassword();
	}
	@Test
	public void TC_ID_21_12() throws IOException
	{
		//Verify user able to login with changed password
		Forgot_PasswordPage f = new Forgot_PasswordPage (candidatedriver);
		Candidate_LoginPage  loginpage = new Candidate_LoginPage(candidatedriver);
		 String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
    	 String sheetName="Candidate_Register";
    	 ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
    	 int rowCount = excel.getRowCount();
    	 for(int i=1;i<=rowCount;i++)
    	 {
    		 String Candidate_Email = excel.getCellData(i, 1);
    		 String Changed_Password = excel.getCellData(i, 4);
    		 loginpage.emailenter(Candidate_Email);
    		 f.enterchangedpass(Changed_Password);
    		 loginpage.Clicklogin();
    		 break;
    	 }
	}*/
}
