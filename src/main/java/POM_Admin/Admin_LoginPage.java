package POM_Admin;


	import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
    import org.testng.Assert;


	public class Admin_LoginPage
	
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
			
			@FindBy(xpath="//h1[@class='MuiBox-root css-1xhcss2']") private WebElement heading;
			
			@FindBy(xpath="//img[@src='/static/media/dreamer.b787ed08356dba904dc9bc03f344a6bf.svg']") private WebElement logo;

			
			
	public Admin_LoginPage (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
	
	
		public boolean is_companymailfield_present()
			{
				return emailid.isDisplayed();
			}
			public void enteremail(String Candidate_Email)
			{
				emailid.sendKeys(Candidate_Email);
			}
			public boolean is_companypasswordsfield_present()
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
			
	         public void enterUsername(String Email) {
				
				emailid.sendKeys(Email);
				
			}
			public void enterPassword(String Password) {
				
				passwords.sendKeys(Password);
			}
			public void clickLogin() {
				
				login.click();
			}
			
			public boolean Heading_and_Logo()
			{
				heading.isDisplayed();
				
				return logo.isDisplayed();
			}
			
			public boolean Email_Field()
			
			{
				emailid.isEnabled();
				
				return emailid.isDisplayed();
				
			}
			
			public boolean Password_Field(){	
				
				passwords.isEnabled();
				
				return passwords.isDisplayed();
			}
			
	   public boolean Login_Button(){	
				
		   login.isEnabled();
				
				return login.isDisplayed();
			}
	   
	   public void Password_click(){	
			
		   passwords.click();
		   
		   passwords.clear();
		   passwords.sendKeys("1234567"); // 7 characters
	        String enteredPassword1 = passwords.getAttribute("value");
	        Assert.assertTrue(enteredPassword1.length() <= 8, "Password accepted less than 8 characters!");

	        
	        // Test case 2: More than 15 characters
	        passwords.clear();
	                	
	        passwords.sendKeys(Keys.CONTROL + "A");
	        passwords.sendKeys(Keys.BACK_SPACE);
        	 
	        passwords.sendKeys("1234567890123456"); // 16 characters
	        String enteredPassword2 = passwords.getAttribute("value");
	        Assert.assertTrue(enteredPassword2.length() >= 15, "Password accepted more than 15 characters!");

	        // Test case 3: Valid length password (8-15 characters)
	        passwords.clear();
	        passwords.sendKeys(Keys.CONTROL + "A");
	        passwords.sendKeys(Keys.BACK_SPACE);
	        
	        passwords.sendKeys("Password@1234"); // 11 characters
	        String enteredPassword3 = passwords.getAttribute("value");
	        Assert.assertTrue(enteredPassword3.length() >= 8 && enteredPassword3.length() <= 15, "Password not accepting valid length!");

	        System.out.println("Password field validation successful.");

			}
		}
		                  
