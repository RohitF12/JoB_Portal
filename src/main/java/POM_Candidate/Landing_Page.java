package POM_Candidate;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landing_Page 
{
	@FindBy(xpath="//div[@class='MuiBox-root css-12s4nnp']//li")
	private List<WebElement> no_of_jobs;
	
	@FindBy(xpath="//a[text()='Next >']")
	private WebElement nextbtn;
	
	@FindBy(xpath="//input[@placeholder='Search by keyword']")
	private WebElement searchbox;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement searchbutton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> allchebox;
	
	@FindBy(xpath="//input[@aria-autocomplete='list']")
	private  WebElement expefilter;
	
	@FindBy(xpath="(//input[@aria-label='Salary range'])[2]")
	private WebElement salaryrangeslider;
	
	@FindBy(xpath="//button[text()='Apply']")
	private WebElement applybutton;
	
	@FindBy(xpath="//a[text()='View Profile']")
	private WebElement viewprofilelink;
	
	@FindBy(xpath="//a[text()='Edit Profile']")
	private WebElement editprofilelink;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//h4[text()='Applied']")
	private WebElement appliedtext;
	
	@FindBy(xpath="//div[@class='MuiBox-root css-wsvd6j']")
    private WebElement jobdetails;
	
	public void openjob()
	{
		for(WebElement job : no_of_jobs)
		{
			for(int i=0;i<1;i++)
			{
				job.click();
			}
		}
	}
	public WebElement getSalaryrangeslider() 
	{
		return salaryrangeslider;             //to change salary, go to methods class and give offset like -20, negative value to move left side
	}
	public Landing_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public boolean is_display_searchbox()
	{
		return searchbox.isDisplayed()	;
	}
	public boolean is_display_salatyrange()
	{
		return salaryrangeslider.isDisplayed()	;
	}
	public boolean is_display_expefilter()
	{
		return expefilter.isDisplayed()	;
	}
	public void applyjobtypefilter()
	{
		for(int i=1;i<2;i++) // change number (i=0) and limit (i<8) as per checkbox selection, starts from i=0
		{                                               
			allchebox.get(i).click();
		}
	}
	public void applyloctypefilter()
	{
		for(int i=5;i<6;i++) // change number (i=0) and limit (i<8) as per checkbox selection, starts from i=0
		{
			allchebox.get(i).click();
		}
	}
	public void applyfilter( String keyword,String experience) throws InterruptedException
	{
		searchbox.sendKeys(keyword);
		searchbutton.click();
		expefilter.sendKeys(experience);
		expefilter.sendKeys(Keys.ARROW_DOWN);
		expefilter.sendKeys(Keys.ENTER);
	}
	public void display_no_of_jobs() throws InterruptedException
	{
		int totaljobs=0;
		boolean hasNextPage = true;
		while(hasNextPage)
		{
			totaljobs += no_of_jobs.size(); 
			if(nextbtn.isEnabled())
		    {	
				nextbtn.click();
			    Thread.sleep(3000);
		    }
		    else 
		    {
		    	hasNextPage=false;
		    }
			break;
		}
	    System.out.println("No. of jobs - "+totaljobs);
	}
	public boolean is_jobdetails_display()
    {
    	return jobdetails.isDisplayed();
    }
    public void displayjobdetails() throws InterruptedException
	{
    	String text=jobdetails.getText();
    	System.out.println(text);
	}
    public boolean is_applybutton_display()
    {
    	return applybutton.isDisplayed();
    }
	public void applytojob()
	{
		applybutton.click();
	}
    public boolean is_viewprofilelink_display()
    {
    	return viewprofilelink.isDisplayed();
    }
	public void viewprofile_before_applying_to_job()
	{
		viewprofilelink.click();
	}
	public boolean is_editprofilelink_display()
    {
    	return editprofilelink.isDisplayed();
    }
	public void editprofile_before_applying_to_job()
	{
		editprofilelink.click();
	}
	public void submitjob()
	{
		submit.click();
	}
	public boolean is_applied_text_display()
    {
    	return appliedtext.isDisplayed();
    }
}
