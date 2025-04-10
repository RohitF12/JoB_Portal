package POM_Admin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard 
{
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']/tr")
	private List<WebElement> noofjobpost;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboard;
	
	@FindBy(xpath="//h3[text()='Dashboard']")
	private WebElement pagetitle;
	
	@FindBy(xpath="(//div[@class='MuiBox-root css-1qhmto6'])[1]")
	private WebElement jobposted;
	
	@FindBy(xpath="(//div[@class='MuiBox-root css-1qhmto6'])[2]") 
	private WebElement applications;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']/tr")
	private List<WebElement> applicationssubmitted;

	@FindBy(xpath="(//div[@class='MuiBox-root css-1qhmto6'])[3]")
	private WebElement applicationsclosed;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']/tr")
	private List<WebElement> noofapplicationsclosed;
	
	@FindBy(xpath="//button[@title='Go to next page']")
	private WebElement nextbutton;
	
	@FindBy(xpath="(//div[@class='MuiBox-root css-1qhmto6'])[4]")
	private WebElement applicationspending;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']/tr")
	private List<WebElement> noofapplicationspending;
	
	public boolean is_dashboardModule_display()
	{
		return dashboard.isDisplayed();
	}
	public boolean is_PageTitle_display()
	{
		return pagetitle.isDisplayed();
	}
	public boolean is_jobPosted_display()
	{
		return jobposted.isDisplayed();
	}
	public void print_JobPost()
	{
		System.out.println(jobposted.getText());
	}
	public boolean is_ApplicationSubmitted_display()
	{
		return applications.isDisplayed();
	}
	public void print_ApplicationSubmitted()
	{
		System.out.println(applications.getText());
	}
	public boolean is_ApplicationClosed_display()
	{
		return applicationsclosed.isDisplayed();
	}
	public void print_ApplicationClosed()
	{
		System.out.println(applicationsclosed.getText());
	}
	public boolean is_ApplicationPending_display()
	{
		return applicationspending.isDisplayed();
	}
	public void print_ApplicationPending()
	{
		System.out.println(applicationspending.getText());
	}
	
	public void openjobs()
	{
		jobposted.click();
	}
	int totalJobCount=0;
	public void displaynoofjobpost() throws InterruptedException
	{
		
		boolean hasNextPage = true;
		while(hasNextPage)
		{
			totalJobCount += noofjobpost.size();		    
			if(nextbutton.isEnabled())
		    {	
				nextbutton.click();
			Thread.sleep(3000);
		    }
		    else 
		    {
		    	hasNextPage=false;
		    }
		}
	    System.out.println("No. of job post - "+totalJobCount);

    }
	public void verify_correctCount_display_for_JobPost()
	{
		dashboard.click();
		String text=jobposted.getText();
		String NoofjobPost = text.replaceAll("[^0-9]", "");
		int displayedCount = Integer.parseInt(NoofjobPost);
		if(displayedCount==totalJobCount)
		{
			System.out.println("Job post count is correct.");
	    } 
		else 
		{
	        System.out.println(" Mismatch! Displayed: " + displayedCount + ", Counted: " + totalJobCount);
	    }
	}
	
	public void openapplicationsubmitted()
	{
		applications.click();
	}
	int totalApplicationSubmittedCount=0;
	public void noofapplicationssubmitted() throws InterruptedException
	{
		boolean hasNextPage = true;
		while(hasNextPage)
		{
			totalApplicationSubmittedCount += applicationssubmitted.size();		    
			if(nextbutton.isEnabled())
		    {	
				nextbutton.click();
			Thread.sleep(3000);
		    }
		    else 
		    {
		    	hasNextPage=false;
		    }
		}
	    System.out.println("No. of applications submitted - "+totalApplicationSubmittedCount);
	}
	public void verify_correctCount_display_for_ApplicationSubmitted()
	{
		dashboard.click();
		String text=applications.getText();
		String NoofApplicationSubmitted = text.replaceAll("[^0-9]", "");
		int displayedCount = Integer.parseInt(NoofApplicationSubmitted);
		if(displayedCount==totalApplicationSubmittedCount)
		{
			System.out.println("Submitted Applications count is correct.");
	    } 
		else 
		{
	        System.out.println(" Mismatch! Displayed: " + displayedCount + ", Counted: " + totalApplicationSubmittedCount);
	    }
	}
	public void closedapplications()
	{
		applicationsclosed.click();
	}

	int totalApplicationClosedCount=0;
	public void displaynoofclosedapplications() throws InterruptedException
	{
		boolean hasNextPage = true;
		while(hasNextPage)
		{
			totalApplicationClosedCount += noofapplicationsclosed.size();		    
			if(nextbutton.isEnabled())
		    {	
				nextbutton.click();
			   Thread.sleep(3000);
		    }
		    else 
		    {
		    	hasNextPage=false;
		    }
		}
	    System.out.println("No. of applications closed - "+totalApplicationClosedCount);
	}
	public void verify_correctCount_display_for_ApplicationClosed()
	{
		dashboard.click();
		String text=applicationsclosed.getText();
		String NoofApplicationClosed = text.replaceAll("[^0-9]", "");
		int displayedCount = Integer.parseInt(NoofApplicationClosed);
		if(displayedCount==totalApplicationClosedCount)
		{
			System.out.println("Closed Applications count is correct.");
	    } 
		else 
		{
	        System.out.println(" Mismatch! Displayed: " + displayedCount + ", Counted: " + totalApplicationClosedCount);
	    }
	}	
	public void pendingapplications()
	{
		applicationspending.click();
	}
	int totalApplicationsPendingCount=0;
	public void displaynoofpendingapplications() throws InterruptedException
	{
		
		boolean hasNextPage = true;
		while(hasNextPage)
		{
			totalApplicationsPendingCount += noofapplicationspending.size();		    
			if(nextbutton.isEnabled())
		    {	
				nextbutton.click();
			Thread.sleep(3000);
		    }
		    else 
		    {
		    	hasNextPage=false;
		    }
		}
	    System.out.println("No. of applications pending - "+totalApplicationsPendingCount);
	}
	public void verify_correctCount_display_for_ApplicationPending()
	{
		dashboard.click();
		String text=applicationspending.getText();
		String NoofApplicationPending = text.replaceAll("[^0-9]", "");
		int displayedCount = Integer.parseInt(NoofApplicationPending);
		if(displayedCount==totalApplicationsPendingCount)
		{
			System.out.println("Pending Applications count is correct.");
	    } 
		else 
		{
	        System.out.println(" Mismatch! Displayed: " + displayedCount + ", Counted: " + totalApplicationsPendingCount);
	    }
	}	
	
	
	public Dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

}
