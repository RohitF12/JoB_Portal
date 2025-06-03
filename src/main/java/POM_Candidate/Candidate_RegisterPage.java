package POM_Candidate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mailosaur.models.Message;

import base.EmailTest;
import base.Property_File;
import utils.ExcelUtilityReg;

public class Candidate_RegisterPage 
{
	@FindBy(xpath="//a[text()='Candidate Register']")
	private WebElement candidateregisterbutton;
	
	@FindBy(name="jp_candidate_name")
	private WebElement Candidatename;
	
	@FindBy(name="jp_email")
	private WebElement Candidatemail;
	
	@FindBy(name="jp_contactno")
	private WebElement Candidateno;
	
	@FindBy(name="jp_password")
	private WebElement Candidatepassword;
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement eyeicon;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement agreecheckbox;
	
	@FindBy(xpath="//button[text()='View Terms & Conditions']")
	private WebElement viewtermsconditonbutton;
	
	@FindBy(xpath="//button[@aria-label='close']")
	private WebElement close_viewtermsconditon;
	
	@FindBy(xpath="//button[text()='View Privacy Policy']")
	private WebElement viewprivacypolicybutton;
	
	@FindBy(xpath="(//button[@aria-label='close'])[1]")
	private WebElement close_viewprivacypolicy;
	
    @FindBy(xpath="//button[text()='Register']")
	private WebElement registerbtn;
    
    @FindBy(name="otp")
	private WebElement otp;
	
    @FindBy(xpath="//button[text()='Verify OTP']")
    private WebElement verifyotp;
    
    @FindBy(xpath="//button[text()='Resend OTP']")
    private WebElement resendotpbtn;
    
    @FindBy(xpath="//button[text()='Cancel']")
    private WebElement cancelbtn;
    
	public Candidate_RegisterPage  (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void openregisterpage()
	{
		candidateregisterbutton.click();
	}
	public boolean is_candidatenamefield_present()
	{
		return Candidatename.isDisplayed();
	}
	public boolean is_candidatemailfield_present()
	{
		return Candidatemail.isDisplayed();
	}
	public boolean is_candidatenumberfield_present()
	{
		return Candidateno.isDisplayed();
	}
	public boolean is_candidatepasswordfield_present()
	{
		return Candidatepassword.isDisplayed();
	}
	public boolean is_checkbox_present()
	{
		return agreecheckbox.isDisplayed();
	}
	
    public void selectcheckbox()
    {
    	agreecheckbox.click();
    }

	public boolean is_checkbox_selected()
	{
		return agreecheckbox.isSelected();
	}
	public boolean is_viewtermsconditonbutton_present()
	{
		return viewtermsconditonbutton.isDisplayed();
	}
	public void viewtermsconditon_page_display()
	{
		viewtermsconditonbutton.click();
	}
	public void close_viewtermsconditonpage()
	{
		close_viewtermsconditon.click();
	}
	public boolean is_viewprivacypolicybutton_present()
	{
		return viewprivacypolicybutton.isDisplayed();
	}
	public void viewprivacypolicy_page_display()
	{
		viewprivacypolicybutton.click();
	}
	public void close_viewprivacypolicypage()
	{
		close_viewprivacypolicy.click();
	}
	public boolean is_registerbutton_present()
	{
		return registerbtn.isDisplayed();
	}
	public void clickonregisterbutton()
	{
		registerbtn.click();
	}
	public boolean is_otpfield_present()
	{
		return otp.isDisplayed();
	}
	public boolean is_verifyotpbutton_present()
	{
		return verifyotp.isEnabled();
	}
	public void enterdata_register(String Candidate_Name, String Candidate_Email, String Candidate_ContactNo, String Password)
	{
		ExcelUtilityReg.r_email=Candidate_Email;
		ExcelUtilityReg.r_password=Password;

		Candidatename.sendKeys(Candidate_Name);
		Candidatemail.sendKeys(Candidate_Email);
		Candidateno.sendKeys(Candidate_ContactNo);
		Candidatepassword.sendKeys(Password);
		eyeicon.click();
	}
	public boolean Is_OTPField_display()
	{
		return otp.isDisplayed();
	}
	public boolean Is_VerifyOTPbutton_display()
	{
		return verifyotp.isDisplayed();
	}
	public void enterotp(String OTP)
	{
	    otp.sendKeys(OTP);
    }
	public void verifyOTP()
	{
		verifyotp.click();
	}
	public boolean Is_ResendOTPbutton_display()
	{
		return resendotpbtn.isDisplayed();
	}
	public boolean Is_Cancelbutton_display()
	{
		return cancelbtn.isDisplayed();
	}
}
