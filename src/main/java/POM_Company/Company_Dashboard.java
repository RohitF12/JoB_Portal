package POM_Company;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class Company_Dashboard extends BaseTest{
	
public static WebDriver driver;

	// Locators for Toggle Button
	 @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div[1]/button") WebElement ToggleButtonOpen;
	 
	 @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/button") WebElement ToggleButtonClosed;
	 
	 @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div[1]/h3") WebElement  Page_Name;
	 
	 @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[1]/h6[1]") WebElement  Company_Name;
	 
	 @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[1]/h6[2]") WebElement  Date_Name;
	 	 	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div[2]/a/button") 
	 WebElement Pending_Applications;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[3]/div/div[2]/a/button") 
	 WebElement Accepted_Applications;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[4]/div/div[2]/a/button") 
	 WebElement Shortlisted_Applications;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[2]/a/button") 
	 WebElement Job_Posted;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/button") 
	 WebElement Latest_Candidate_Applications;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/a/button")
	 WebElement Home;
	 
		// Constructor to initialize elements
		public Company_Dashboard(WebDriver driver) {
		   this.driver = driver;
		  PageFactory.initElements(driver, this);
			
		   }

	    
	    public boolean Check_Page_Name_displayed () throws InterruptedException {
	    	
	    	Page_Name.getText();
	        	
	    	return Page_Name.isDisplayed();
	        }


	    public String Check_Page_Name () throws InterruptedException {
	    	
	    	return Page_Name.getText();
	    	 
	    }
	    
	    // Methods to verify ToogleButton
        public boolean CheckCompanyNameandDate() throws InterruptedException {
       
        	Company_Name.getText();
        	
        	Date_Name.getText();
        	
        	return Company_Name.isDisplayed();
       	       	 
        }
    
        // Methods to verify ToogleButton
         public void ToggleButtonAction() throws InterruptedException {
        
        	 ToggleButtonOpen.click();
        	 
 	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	 
        	 ToggleButtonClosed.click();
         }
          
          public void Click_Job_Posted() throws InterruptedException {
              
        	  Job_Posted.click();
                         
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
         }
          
          public void Click_Pending_Applications() throws InterruptedException {
              
          Pending_Applications.click();
                             
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
             
             }
          
          public void Click_Accepted_Applications() throws InterruptedException {
              
          Accepted_Applications.click();
                                 
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                 
             }
          
          public void Click_Shortlisted_Applications() throws InterruptedException {
              
          Shortlisted_Applications.click();
                                     
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                     
           }
          
          public void Click_Latest_Candidate_Applications() throws InterruptedException {
              
          Latest_Candidate_Applications.click();
                                         
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          
          
             }
          public void Click_Home() throws InterruptedException {
              
          Home.click();
                                             
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                           
            }
          
          	
	

}
