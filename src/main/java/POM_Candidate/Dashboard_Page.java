package POM_Candidate;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_Page
{
	@FindBy(xpath = "//input[@name='email']")  WebElement  Email;
	
	@FindBy(xpath = "//input[@name='password']")  WebElement  Password;
	
	@FindBy(xpath = "//button[@type='submit']")	 WebElement  SubmitButton;
	
	@FindBy(xpath="//div[@class='MuiBox-root css-4la022']")
	private WebElement datenameondashboard;
	
	@FindBy(xpath="//strong[text()='Latest Jobs']")
	private WebElement latestjobtitle;
	
	@FindBy(xpath="//strong[text()='Job Status']")
	private WebElement JobStatustitle;
	
	@FindBy(xpath="//h6[@class='MuiTypography-root MuiTypography-h6 css-1f6my4d']") // It stores 1st job jobtitle of dashboard
	private WebElement dashboardlatestjob;
	
	@FindBy(xpath="(//p[@class='MuiTypography-root MuiTypography-body1 css-zvpxtd'])[2]") // It stores 1st job jobtitle of job listing
	private WebElement latestjob;
	
	@FindBy(xpath="//span[text()='Job Listings']")
	private WebElement joblisting;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-6oltfs']")
	private WebElement navigationtojobListing;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-1b6zz33']")
	private WebElement navigationtoapplications;
	
	
	@FindBy(xpath="//button[text()='Apply']")
	private WebElement applybtn;
	
	@FindBy(xpath="(//div[@aria-controls='Job requirements'])[1]")
	private WebElement req;
	
	@FindBy(xpath="(//div[@aria-controls='Job requirements'])[2]")
	private WebElement sal;
	
	@FindBy(xpath="(//div[@aria-controls='Job requirements'])[3]")
	private WebElement benefit;
	
	@FindBy(xpath="(//div[@aria-controls='Job requirements'])[4]")
	private WebElement skills;
	
	@FindBy(xpath="//span[text()='Apply']")
	private WebElement button;
	
	
	
	
	public Dashboard_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// Methods to interact with the elements
	public void enterUsername(String username_Candidate) {
	   // driver.findElement(Email).sendKeys(username);
		Email.sendKeys(username_Candidate);
	}

	public void enterPassword(String password_Candidate) {
	  //  driver.findElement(passwordField).sendKeys(password);
		Password.sendKeys(password_Candidate);
	}

	public void clickLogin() {
	    //driver.findElement(loginButton).click();
		SubmitButton.click();
	     }
	
	

	
	public void navigateTo_joblisting()
	{
		navigationtojobListing.click();
	}
	public void navigateTo_YourAppliactions()
	{
		navigationtoapplications.click();
	}
	public void verify_latestjobs_display_correctly() throws InterruptedException
	{
		String Dashboardlatestjob = dashboardlatestjob.getText();
		System.out.println("Dashboard Job title = " + dashboardlatestjob.getText());
		Thread.sleep(4000);
		
		joblisting.click();
		System.out.println("Job listing Job title = " + latestjob.getText());
        String joblistinglatestjob = latestjob.getText();
	    if (Dashboardlatestjob.equals(joblistinglatestjob)) 
	    {
	        System.out.println("Dashboard latest jobs and job listing jobs are matching");
	    } 
	    else 
	    {
	        System.out.println("Dashboard latest jobs and job listing jobs are NOT matching");
	    }
			
  }
	
	public boolean is_todaysdateandname_display()
	{
		return datenameondashboard.isDisplayed();
	}
	public void display_name_todaysDate()
	{
		System.out.println(datenameondashboard.getText());
	}
	public boolean is_title_display()
	{
		latestjobtitle.isDisplayed();
		return JobStatustitle.isDisplayed();
	}
	public void display_title()
	{
		System.out.println(latestjobtitle.getText());
		System.out.println(JobStatustitle.getText());
	}
	public void clickapply()
	{
		applybtn.click();
	}
	public void viewrequirments()
	{
		req.click();
	}
	public void viewsalary()
	{
		sal.click();
	}
	public void viewbenefit()
	{
		benefit.click();	
	}
	public void viewskill()
	{
		skills.click();
	}
	public void applyjob()
	{
		button.click();
	}


}
