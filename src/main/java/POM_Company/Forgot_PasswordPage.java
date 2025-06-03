package POM_Company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot_PasswordPage 
{
	@FindBy(xpath="//a[text()='Forgot password?']")
    private WebElement forgotpass;
	
	@FindBy(name="email")
    private WebElement emailid;
	
	@FindBy(xpath="//button[text()='Reset Password']")
    private WebElement resetpassbtn;
	
	@FindBy(xpath="//button[text()='Go Back']")
	private WebElement gobackbutton;
	
	@FindBy(xpath="//input[@type='text']")
    private WebElement otp;

	@FindBy(xpath="//button[text()='Verify OTP']")
	private WebElement verifyotp;
	
	public void Click_Resetpassbtn()
	{
		 resetpassbtn.click();
	}
	@FindBy(name="newPassword")
	private WebElement enternew;
	
	@FindBy(name="confirmPassword")
	private WebElement enterconfirm;
	
	@FindBy(xpath="//button[text()='Change Password']")
	private WebElement changepassord;
	
	@FindBy(name="email")
	private WebElement oldemail;
	
	@FindBy(name="password")
	private WebElement changedpassword;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginbtn;
	
	public Forgot_PasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public boolean is_forgotPassword_display()
	{
		return forgotpass.isDisplayed();
	}
	public void clickforgotpass()
	{
		forgotpass.click();
	}
	public boolean is_EmailidField_display()
	{
		return emailid.isDisplayed();
	}
	public boolean is_Reset_Password_Button_display()
	{
		return resetpassbtn.isDisplayed();
	}
	public void enteremailid(String Candidate_Email)
	{
		//emailid.click();
		emailid.sendKeys(Candidate_Email);
	}
	public void clickresetpass()
	{
		resetpassbtn.click();
	}
	public boolean is_GoBack_button_display()
	{
		return gobackbutton.isDisplayed();
	}
	public void click_GoBack_button()
	{
		gobackbutton.click();
	}
	public boolean is_EnterOTP_Field_display()
	{
		return otp.isDisplayed();
	}
	public boolean is_VerifyOTP_Button_display()
	{
		return verifyotp.isDisplayed();
	}
	public void enterotp(String OTP)
	{
		otp.sendKeys(OTP);
	}
	public void clickverifyotp()
	{
		verifyotp.click();
	}
	public boolean is_EnterNewPassword_Field_display()
	{
		return enternew.isDisplayed();
	}
	public boolean is_EnterConfirmPassword_Field_display()
	{
		return enterconfirm.isDisplayed();
	}
	public boolean is_ChangePassword_Button_display()
	{
		return changepassord.isDisplayed();
	}
	public void Change_Password(String New_Password, String Confirm_Password)
	{
		enternew.sendKeys(New_Password);
		enterconfirm.sendKeys(Confirm_Password);
	}
	public void clickchangepassword()
	{
		changepassord.click();
	}
	public void enteroldemail(String Candidate_Email)
	{
		oldemail.sendKeys(Candidate_Email);
	}
	public void enterchangedpass(String Changed_Password)
	{
		changedpassword.sendKeys(Changed_Password);
	}
	public void clickloginbutton()
	{
		loginbtn.click();
	}

}
