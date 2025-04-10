package POM_Candidate;


	import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	public class Candidate_LoginPage 
	{

		    @FindBy(name="email")
			private WebElement emailid;
		   
			@FindBy(name="password")
			private WebElement passwords;
			
			@FindBy(xpath="//button[text()='Login']")
			private WebElement login;

			@FindBy(xpath="//p[text()='Password must be 8 characters length']")
			private WebElement errormsg_wrongpassword;
			
			@FindBy(xpath="//p[text()='Invalid Email address']")
			private WebElement errormsg_wrongemail;
			
			@FindBy(xpath="//p[text()='Password is required!']")
			private WebElement errormsg_blankpassword;
			
			@FindBy(xpath="//p[text()='Email is required!']")
			private WebElement errormsg_blankemail;
			
			public Candidate_LoginPage (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			public boolean is_candidatemailfield_present()
			{
				return emailid.isDisplayed();
			}
			public void enteremail(String Candidate_Email)
			{
				emailid.sendKeys(Candidate_Email);
			}
			public boolean is_candidatepasswordsfield_present()
			{
				return passwords.isDisplayed();
			}
			public void enterpassword(String Password)
			{
				passwords.sendKeys(Password);
			}
			public boolean is_loginbutton_enable()
			{
				return login.isEnabled();
			}
			public void Clicklogin()
			{
				login.click();
			}
			public void emailenter(String Email)
			{
				emailid.sendKeys(Email);
			}
			public void clear_entered_EmailPassword() throws InterruptedException
				{
				    passwords.click();
				    passwords.sendKeys(Keys.CONTROL+"a");
		    	    passwords.sendKeys(Keys.BACK_SPACE);
		    	    Thread.sleep(3000);
			    	emailid.click();
			    	emailid.sendKeys(Keys.CONTROL+"a");
			    	emailid.sendKeys(Keys.BACK_SPACE);
			    	
			    	
				}
			public boolean is_errormsg_display_for_Wrongpassword()
			{
				return errormsg_wrongpassword.isDisplayed();
			}
			public void print_errormsg_for_Wrongpassword()
			{
				System.out.println("Error msg : "+errormsg_wrongpassword.getText());
			}
			public boolean is_errormsg_display_for_Wrongemail()
			{
				return errormsg_wrongemail.isDisplayed();
			}
			public void print_errormsg_for_Wrongemail()
			{
				System.out.println("Error msg : "+errormsg_wrongemail.getText());
			}
			public boolean is_errormsg_display_for_BlankPassword()
			{
				return errormsg_blankpassword.isDisplayed();
			}
			public void print_errormsg_for_BlankPassword()
			{
				System.out.println("Error msg : "+errormsg_blankpassword.getText());
			}
			public boolean is_errormsg_display_for_BlankEmail()
			{
				return errormsg_blankemail.isDisplayed();
			}
			public void print_errormsg_for_BlankEmail()
			{
				System.out.println("Error msg : "+errormsg_blankemail.getText());
			}
		}
		                  
