package POM_Admin;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseTest;

public class Trash_Page extends BaseTest
{
	@FindBy(xpath="//span[text()='Trash']") private WebElement trash;
	
	@FindBy(xpath="//span[text()='Job Listings']") private WebElement jobListingModule;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td[8]") private WebElement Deletejob;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td[2]") private List<WebElement> JobList;
	
	@FindBy(xpath="//button[text()='Delete']") private WebElement DeleteButton ;

	@FindBy(xpath="//span[text()='Company List']") private WebElement CompanyList;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td[7]") private WebElement Deletecompany;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td") private List<WebElement> Companylist;
	
	@FindBy(xpath="//button[text()='Deleted Companies']") private WebElement Deletecompanytab;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td[5]")private WebElement restore;
	 
	public Trash_Page(WebDriver driver)
	 {
	    PageFactory.initElements(driver, this);
	 }
	 public void openJobList()
	 {
		 jobListingModule.click();;
	 }
	 public void Delete_Job()
	 {
		 Deletejob.click();
	 }
	 public void Confirm_Delete()
	 {
		 DeleteButton.click();
	 }
	 public void openCompanyList()
	 {
		 CompanyList.click();
	 }
	 public void Delete_Company()
	 {
		 Deletecompany.click();
	 }
	 public WebElement Open_trash()
	 {
		 return trash;
	 }
	 public void Restore()
	 {
		restore.click();
	 }
     public void verify_deletedJob() throws IOException
     {
    	 if(!JobList.isEmpty())
    	 {
    		 String expecetdJob = data.getdata("DeletedJob");
    		 String actualJob = JobList.get(0).getText();
    		 Assert.assertEquals(actualJob, expecetdJob, "Job is not deleted");	
    		 System.out.println("Job is verified " +actualJob);
    	 }
    	 else
    	 {
    		 System.out.println("Job is not listed. Verification failed");
    	 }
     }
     public void verify_restoredJob() throws IOException
     {
    	 if(!JobList.isEmpty())
    	 {
    		 String expecetdJob = data.getdata("DeletedJob");
    		 String actualJob = JobList.get(0).getText();
    		 Assert.assertEquals(actualJob, expecetdJob, "Job is not restored");	
    		 System.out.println("Job is verified " +actualJob);
    	 }
    	 else
    	 {
    		 System.out.println("Job is not listed. Verification failed");
    	 }
     }
     public void verify_deletedComapny() throws IOException
     {
    	 Deletecompanytab.click();
    	 if(!Companylist.isEmpty())
    	 {
    		 String expecetdcompany = data.getdata("DeletedComapny");
    		 String actualcompany = Companylist.get(0).getText();
    		 Assert.assertEquals(actualcompany, expecetdcompany, "Company is not deleted");	
    		 System.out.println("Company is verified " +actualcompany);
    	 }
    	 else
    	 {
    		 System.out.println("Company is not listed. Verification failed");
    	 }
     }
     public void verify_restoreComapny() throws IOException
     {
    	 if(!Companylist.isEmpty())
    	 {
    		 String expecetdcompany = data.getdata("DeletedComapny");
    		 String actualcompany = Companylist.get(0).getText();
    		 Assert.assertEquals(actualcompany, expecetdcompany, "Company is not deleted");	
    		 System.out.println("Company is verified " +actualcompany);
    	 }
    	 else
    	 {
    		 System.out.println("Company is not listed. Verification failed");
    	 }
     }
}
