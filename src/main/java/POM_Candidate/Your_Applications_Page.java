package POM_Candidate;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseTest;

public class Your_Applications_Page extends BaseTest
{
	@FindBy(xpath="//h3[text()='Your Applications']")
	private WebElement pagename;
	
	@FindBy(xpath="//span[text()='Your Applications']")
	private WebElement yourapp;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchbox;
	
	@FindBy(xpath="//input[@placeholder='Status']")
	private WebElement statusfilter;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> statusoptions;
	
	@FindBy(xpath="//ul[@class='MuiList-root MuiList-padding css-1ontqvh']//li")
	private List<WebElement> applications;
	
	@FindBy(xpath="(//button[text()='View Details'])[1]")
	private WebElement details;
	
	@FindBy(xpath="//p[contains(@class,'MuiTypography-root')]")
	private WebElement status;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[2]/button")
	private WebElement resume;
	
	@FindBy(xpath="//h2[@class='MuiBox-root css-2x8b4e']")
	private WebElement jobtitle_on_listingpage;
	
	@FindBy(xpath="//h5[contains(@class,'MuiTypography-root MuiTypography-h5')]")
	private WebElement jobtitle_on_applicationlisting;
	
	public void verify_samejob_display() throws IOException
	{
		String text2 = jobtitle_on_applicationlisting.getText();
		String extractedText = text2.replace("Applied For: ", "").trim();
		System.out.println("Extracted text :"+extractedText);
		
		String text1=data.getdata("text3");   
		
		if(extractedText.equals(text1))
		{
			System.out.println("Same job display on view application page");
		} 
		else
		{
			System.out.println("Same job doesnot display on view application page");
		}
	}
	public Your_Applications_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openapplications()
	{
		yourapp.click();
	}
	public boolean is_page_name_display()
    {
    	return pagename.isDisplayed();
    }
	public void print_pagename()
	{
		System.out.println("Page Name - "+pagename.getText());
	}
	public boolean is_searchbox_display()
    {
    	return searchbox.isDisplayed();
    }
	public boolean is_statusfilter_display()
    {
    	return statusfilter.isDisplayed();
    }
	public void searchjob(String jobtitle)
	{
		searchbox.click();
		searchbox.sendKeys(jobtitle);
	}
	public void display_statusfilteroptions()
	{
		statusfilter.click();
		for(WebElement statusoption : statusoptions)
		{
			System.out.println("Status filter options are - " +statusoption.getText());
		}
	}
	public void display_Pending_Applications()
	{
	
	    statusfilter.click();
	
	    statusfilter.sendKeys("Pending");
	
	    statusfilter.sendKeys(Keys.ARROW_UP);

	    statusfilter.sendKeys(Keys.ENTER);
	    for(WebElement pending:applications)
	    {
		   System.out.println("Pending application display below : " + pending.getText());
	    }
	}
	public void display_Shortlisted_Applications() throws InterruptedException
	{
		/*for(WebElement status :statusoptions )
		{
			String selectstatus= status.getText().trim();
			if(selectstatus.equals(Status))
			{
				status.click();
				for(WebElement pending:applications)
				{
					System.out.println("Pending application display below : " + pending.getText());
				}
			}
			else
			{
				System.out.println("No any pending applications in the list");
			}
		break;
		}*/
		statusfilter.sendKeys(Keys.CONTROL + "A");

		statusfilter.sendKeys(Keys.BACK_SPACE);
		
		statusfilter.click();
		
		statusfilter.sendKeys("Shortlisted");
		
		statusfilter.sendKeys(Keys.ARROW_UP);

		statusfilter.sendKeys(Keys.ENTER);
		for(WebElement shortlist:applications)
		{
			System.out.println("Shorlist application display below : " + shortlist.getText());
		}
	}
	public void display_Accepted_Applications()
	{
		statusfilter.sendKeys(Keys.CONTROL + "A");

		statusfilter.sendKeys(Keys.BACK_SPACE);
		
		statusfilter.click();
		
		statusfilter.sendKeys("Accepted");
		
		statusfilter.sendKeys(Keys.ARROW_UP);

		statusfilter.sendKeys(Keys.ENTER);
		for(WebElement accepted:applications)
		{
			System.out.println("Accepted application display below : " + accepted.getText());
		}
	}
		
	public void display_Rejected_Applications()
	{
		statusfilter.sendKeys(Keys.CONTROL + "A");

		statusfilter.sendKeys(Keys.BACK_SPACE);
		
		statusfilter.click();
		
		statusfilter.sendKeys("Rejected");
		
		statusfilter.sendKeys(Keys.ARROW_UP);

		statusfilter.sendKeys(Keys.ENTER);
		for(WebElement rejected:applications)
		{
			System.out.println("Rejected application display below : " + rejected.getText());
		}
    }
	public void viewdetails()
	{
		details.click();
	}
	public void viewresume()
	{
		resume.click();
	}



}
