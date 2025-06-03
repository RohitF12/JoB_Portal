package POM_Company;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import base.BaseTest;
import utils.ExcelUtilityReg;

public class Company_Trash_Job extends BaseTest {
	
public WebDriver driver;

     @FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td[2]") private List<WebElement> JobList;
     
	@FindBy(xpath = "//input[@name='email']")  WebElement  Email;
	
	@FindBy(xpath = "//input[@name='password']")  WebElement  Password;
	
	@FindBy(xpath = "//button[@type='submit']")	 WebElement  SubmitButton;
	
	@FindBy(xpath = "//a[@href='/trash']")	 WebElement  Trash;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div[1]/h3") WebElement  Page_Name_Trash;
	
    @FindBy(xpath = "//th[text()='Posted On']") WebElement  Column_1;
	
	@FindBy(xpath = "//th[text()='Title']") WebElement  Column_2;
	
	@FindBy(xpath = "//th[text()='Company']") WebElement  Column_3;
	
	@FindBy(xpath = "//th[text()='Type']") WebElement  Column_4;
	
	@FindBy(xpath = "//th[text()='Restore']") WebElement  Column_5;
		
	@FindBy(xpath = "//a[@href='/jobs/listings/company']")	 WebElement  Job_Listing;

	@FindBy(xpath = "//p[text()= 'Automation Engineer']") WebElement  Job_1;
    
	@FindBy(xpath = "//input[contains(@class, 'MuiInputBase-inputAdornedStart css-1gmu8xx')]") WebElement  SearchBar;
	
    @FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td[7]")WebElement  Delete_Job_Icon;
    
//	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[7]/button") WebElement  Delete_Job_Icon;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/button[2]") WebElement  Confirm_Delete_Job;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td[2]")WebElement  Delete_Job_Text;
	
//	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[2]/p") WebElement  Delete_Job_Text;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[5]/button") WebElement  Restore_Job;

	@FindBy(xpath = "//p[text()='Automation Engineer']") WebElement  Restore_Job_Text;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[1]") WebElement  Row_Per_Page_5;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[2]") WebElement  Row_Per_Page_10;

	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[3]") WebElement  Row_Per_Page_20;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[4]") WebElement  Row_Per_Page_25;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div") WebElement  Row_Per_Page;


    
   //@FindBy(xpath = "//input[@name='jp_title']") WebElement  Job_Title;
	
	   // Constructor to initialize elements
	   public Company_Trash_Job(WebDriver driver) {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
		
	   }

	// Methods to interact with the elements
	public void enterUsername(String username) {
	   // driver.findElement(Email).sendKeys(username);
		Email.sendKeys(username);
	}

	public void enterPassword(String password) {
	  //  driver.findElement(passwordField).sendKeys(password);
		Password.sendKeys(password);
	}

	public void clickLogin() {
	    //driver.findElement(loginButton).click();
		SubmitButton.click();
	     }
	     
	   public void Click_on_Trash() throws InterruptedException {
		
		Thread.sleep(3000);
			    
		Trash.click();
		
	    }

	   public String Check_Page_Name_displayed () throws InterruptedException {
		
		return  Page_Name_Trash.getText();
     			    			
	    }
	
	// Method to fetch actual column names from the webpage

		public String Check_column_1_Name () throws InterruptedException {
			
		return Column_1.getText();
			    
		    }
		public String Check_column_2_Name () throws InterruptedException {
			
		return Column_2.getText();
			    
		    }
		public String Check_column_3_Name () throws InterruptedException {
			
		return Column_3.getText();
			    
		    }
		public String Check_column_4_Name () throws InterruptedException {
			
		return Column_4.getText();
			    
		    }
		public String Check_column_5_Name () throws InterruptedException {
			
		return Column_5.getText();
			    
		    }
		
		  public void Enter_Job_1_in_Search_Bar (String Search_Job_1) {
			  
			Job_Listing.click();
		    	
		    SearchBar.sendKeys(Search_Job_1);
		    	
		  }
		   public void delete_job () throws InterruptedException {
			   
			   Delete_Job_Icon.click();
			
			   Confirm_Delete_Job.click();

		}   

		   public String Get_deleted_job_Text () throws InterruptedException {
			   
			  return Delete_Job_Text.getText();
		}   
		   
		   public void Restore_Job () throws InterruptedException {
			   
			   Restore_Job.click();
			   
			   Thread.sleep(5000);
			   
			}   
		   
		   public String Get_job_Text () throws InterruptedException {
			   
			  return Restore_Job_Text.getText();
		} 
		   
		   public void Check_Row_Per_Page () throws InterruptedException  {
				 
				  
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				    js.executeScript("arguments[0].scrollIntoView(true);", Row_Per_Page);
				    
					 Thread.sleep(3000);
				   
				 Row_Per_Page.click(); 
					
				 Thread.sleep(3000);
				 
				 Row_Per_Page_5.click();
				 
				 Thread.sleep(3000);
				 
				 Row_Per_Page.click(); 

				 Thread.sleep(3000);
				 
				 Row_Per_Page_10.click();
				 
				 Thread.sleep(3000);
				 
				 Row_Per_Page.click(); 
			     
				 Thread.sleep(3000);
				 
				 Row_Per_Page_20.click();
				 
				 Thread.sleep(3000);
				 
				 Row_Per_Page.click(); 

				 Thread.sleep(3000);
				 
				 Row_Per_Page_25.click();
				 
				 Thread.sleep(3000);
				    }
		   
		   
		   public void verify_restore_job() throws IOException
		   {
			   if(!JobList.isEmpty())
	    	  {
			   String FilePath = data.getdata("filePath");
		    	
		    	String SheetName = data.getdata("sheetName_4");
		    	Company_Trash_Job Trash = new Company_Trash_Job(companydriver);
		      // Initialize Excel utility
		        ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
		        
		        for (int i = 1; i <=1; i++)
		         { // Assuming row 0 is the header
		        	
		            String Search_Job_2 = excel.getCellData(i, 1);
		            Trash.Enter_Job_1_in_Search_Bar(Search_Job_2);
		            String actualJob = JobList.get(0).getText();
	    		    Assert.assertEquals(actualJob, Search_Job_2, "Job is not restored");	
	    		    System.out.println("Job is verified " +actualJob);
	    		    break;
	    		 }  
		   }
	    	 else
	    	 {
	    		 System.out.println("Job is not listed. Verification failed");
	    	 }
		   }

			 
			   }
	
    