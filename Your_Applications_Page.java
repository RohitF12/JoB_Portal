package POM_Candidate;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Your_Applications_Page 
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
	
	@FindBy(xpath="(//button[text()='View Details'])[1]")
	private WebElement details;
	
	@FindBy(xpath="//p[contains(@class,'MuiTypography-root')]")
	private WebElement status;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[2]/button")
	private WebElement resume;
	
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
	public void applystatusfilter(String status) throws InterruptedException
	{
		statusfilter.click();
		for(WebElement statusoption : statusoptions)
		{
			if(statusoption.equals(status))
			{
				statusoption.click();
			}
		}
	}
	public void display_statusfilteroptions()
	{
		statusfilter.click();
		for(WebElement statusoption : statusoptions)
		{
			System.out.println("Status filter options are - " +statusoption.getText());
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
