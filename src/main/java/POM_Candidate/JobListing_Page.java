package POM_Candidate;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class JobListing_Page 
{
	    
	    @FindBy(xpath="//h3[text()='Job Listings']")
	    private WebElement pagename;
	    
		@FindBy(xpath="//span[text()='Job Listings']")
		private WebElement joblisting;
		
		@FindBy(xpath="//input[@placeholder='Filter by employment type']")
		private WebElement employtype;
		
		@FindBy(xpath="//ul[@id='tags-outlined-listbox']//li")
		private List<WebElement> list_employmenttype;
		
		@FindBy(xpath="(//input[@role='combobox'])[2]")
		private WebElement explevel;
		
		@FindBy(xpath="(//input[@role='combobox'])[3]")
		private WebElement loc;
		
		@FindBy(xpath="//tr[@class='MuiTableRow-root MuiTableRow-head css-11xsv6f']//th")
		private List<WebElement> columnheading;
		
		@FindBy(xpath="//ul[@id=':rk:-listbox']//div//p")
		private List<WebElement> allvalues;
		
		@FindBy(xpath="//input[@type='text']")
		private WebElement searchbox;
		
		@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']")
		private WebElement openjob;
		
		@FindBy(xpath="//div[@class='MuiBox-root css-wsvd6j']")
        private WebElement jobdetails;
		
        
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
		
		public JobListing_Page (WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		public boolean is_page_name_display()
        {
        	return pagename.isDisplayed();
        }
		public void print_pagename()
		{
			System.out.println("Page Name - "+pagename.getText());
		}
		public void openjoblisting()
		{
			joblisting.click();
		}
		public void displaycolumnheading()
		{
			for(WebElement heading:columnheading)
			{
				heading.isDisplayed();
			    System.out.println(heading.getText());
			}
		}
		public void clickemployeetype()
		{
			employtype.click();
		}
		public void applyFilters(String Employment_Type,String Location, String Experience_Level, String Searchby_JobTitleCompanyName) throws InterruptedException
		{
			for(WebElement Employmenttype : list_employmenttype)
			{
				String employmenttype = Employmenttype.getText();
				System.out.println(employmenttype);
				if(employmenttype.equals(Employment_Type))
				{
					Employmenttype.click();
					break;
				}
			}
			
			explevel.click();
			Thread.sleep(2000);
			explevel.sendKeys(Experience_Level);
			explevel.sendKeys(Keys.ARROW_DOWN);
			explevel.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			loc.sendKeys(Location);
			Thread.sleep(4000);
			loc.sendKeys(Keys.DOWN);
			Thread.sleep(3000);
			loc.sendKeys(Keys.ENTER);
			
			searchbox.sendKeys(Searchby_JobTitleCompanyName);
		}
		
		public void openajob()
		{
			openjob.click();
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



