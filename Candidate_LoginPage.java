package POM_Candidate;


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
		}
		                  
