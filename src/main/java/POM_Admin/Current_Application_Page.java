package POM_Admin;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseTest;

public class Current_Application_Page extends BaseTest
{
	@FindBy(xpath="//span[text()='Current Applications']")
	private WebElement currentapplications;
	
	@FindBy(xpath="//h3[text()='Applied Candidates']") private WebElement pagename;
	public boolean display_pagename()
	{
		return pagename.isDisplayed();
	}
	@FindBy(xpath="//thead[@class='MuiTableHead-root css-1wbz3t9']") private WebElement columnname;
	public boolean display_columnname()
	{
		return columnname.isDisplayed();
	}
	public void print_columnname()
	{
		System.out.println(columnname.getText());
	}
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']/tr")
	private List<WebElement> noofcurrentapplications;
	
	@FindBy(xpath="//button[@title='Go to next page']")
	private WebElement nextbtn;
	
	@FindBy(xpath="(//input[@role='combobox'])[2]")private WebElement activecandidate;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> activeCandidatefilter;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchbox;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td[4]") 
	private List<WebElement> jobtitles;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td[6]") 
	private List<WebElement> TypeOfStatus;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td[7]") 
	private WebElement composeMail;
	
	@FindBy(xpath="(//input[@role='combobox'])[1]")
	private WebElement statusfiler;

	@FindBy(xpath="(//ul[@role='listbox'])[1]//li") private List<WebElement> statuses;
	
	@FindBy(xpath="//button[@aria-label='Sort']")
	private WebElement appliedOn_sortarrow;
	
	public boolean is_display_Mail_icon()
	{
		return composeMail.isDisplayed();
	}
	@FindBy(name="subject")
	private WebElement subject;
	
	@FindBy(name="message")
	private WebElement mailbody;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;

	@FindBy(xpath="//div[text()='Mail sent successfully']")
	private WebElement validationmsg;
	
	@FindBy(xpath="//button[text()='View Resume']") private WebElement viewResumebtn;
	
	@FindBy(xpath="//a[@aria-label='View Job Details']") private WebElement viewJobdetailsHyperlink;
	public void ViewResume()
	{
		viewResumebtn.click();
	}
	public void ViewJobdetails()
	{
		viewJobdetailsHyperlink.click();
	}
	public void clickonmailbutton()
	{
		composeMail.click();
	}
	public void Sent_Mail(String Subject,String MailBody)
	{
		subject.sendKeys(Subject);
		mailbody.sendKeys(MailBody);
		submit.click();
	}
	public String getValidationmsg() 
	{
		return validationmsg.getText();
	}
    public void sort_On_Date() throws InterruptedException 
	{
		 appliedOn_sortarrow.click();
		 Thread.sleep(4000);
		 appliedOn_sortarrow.click();
	}
    public void opencurrentapplications()
	{
		currentapplications.click();
	}
	public void displaynoofopencurrentapplications() throws InterruptedException
	{
		int totalRowCount=0;
		boolean hasNextPage = true;
		while(hasNextPage)
		{
			totalRowCount += noofcurrentapplications.size();		    
			if(nextbtn.isEnabled())
		    {	
				nextbtn.click();
			    Thread.sleep(3000);
		    }
		    else 
		    {
		    	hasNextPage=false;
		    }
		}
	    System.out.println("No. of current applications - "+totalRowCount);
	}
	public void applyfilter() throws InterruptedException, IOException
	{
		activecandidate.click();
		Thread.sleep(2000);
		for(WebElement option :activeCandidatefilter)
		{
			String selctfilter=option.getText();
			String CandidateType =data.getdata("candidatetype");
			if(selctfilter.equals(CandidateType))
			{
				option.click();
				break;
			}
		}
	}
	
	
	public void searchbyvalue(String jobtitle_and_candidateName) throws InterruptedException
	{
		searchbox.sendKeys(jobtitle_and_candidateName);
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.CONTROL+"a");
		searchbox.sendKeys(Keys.BACK_SPACE);
	} 
	public void verify_ListDisplay_OnSearchCriteria() throws IOException
	{
		if(!jobtitles.isEmpty())
		{
			String actualname=jobtitles.get(0).getText();
			String expectedname=data.getdata("jobtitle_and_candidateName");
			Assert.assertEquals(actualname, expectedname,"Candidate list does not display on serached criteria");
			System.out.println("Candidate successfully verified: " + actualname);
		}	
		else
		{
			System.out.println("Candidate list is empty. Verification failed.");
		}
	}
	public boolean status_filter_display()
	{
		return statusfiler.isDisplayed();
	}
	public void applystatusfilter(String StatusFilter) throws InterruptedException, IOException
	{
		statusfiler.click();
		statusfiler.sendKeys(StatusFilter);
		statusfiler.sendKeys(Keys.ARROW_DOWN);
		statusfiler.sendKeys(Keys.ENTER);
	}
	public void verify_ListDisplay_OnStatusApplied() throws IOException
	{
		if(!TypeOfStatus.isEmpty())
		{
			String sortStatus=TypeOfStatus.get(0).getText();
			String  actualStatus= data.getdata("StatusFilter");
			Assert.assertEquals(sortStatus, actualStatus, "Candidate list does not display on applied staus filter");
			System.out.println("Candidate successfully verified: " + sortStatus);
		}	
		else
		{
			System.out.println("Candidate list is empty. Verification failed.");
		}
		
	}
	public void open_application()
	{
		for(WebElement application:jobtitles)
		{
			application.click();
			break;
		}
	}
	public Current_Application_Page(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	
}                                                                                                                                                  
