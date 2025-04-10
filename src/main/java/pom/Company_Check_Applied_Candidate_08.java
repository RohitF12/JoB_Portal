package pom;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Closed_Tab;

public class Company_Check_Applied_Candidate_08 {
	
    @FindBy(xpath = "//input[@name='email']")  WebElement  Email;
	
	@FindBy(xpath = "//input[@name='password']")  WebElement  Password;
	
	@FindBy(xpath = "//button[@type='submit']")	 WebElement  SubmitButton;	
	
	@FindBy(xpath = "//span[text()='Applied Candidates']")	 WebElement  Applied_Candidate_Page;
	
	@FindBy(xpath = "//h3[text()='Applied Candidates']") WebElement  Page_Name_Applied_Candidate;
	
    @FindBy(xpath = "//th[text()='Applied On']") WebElement  Column_1;
	
	@FindBy(xpath = "//th[text()='Candidate']") WebElement  Column_2;
	
	@FindBy(xpath = "//th[text()='Job Title']") WebElement  Column_3;
	
	@FindBy(xpath = "//th[text()='Current CTC']") WebElement  Column_4;
	
	@FindBy(xpath = "//th[text()='Notice Period']") WebElement  Column_5;
	
	@FindBy(xpath = "//th[text()='Status']") WebElement  Column_6;
	
	//@FindBy(xpath = "//th[text()='Status']") WebElement  Search_Candidate_1;

	@FindBy(xpath = "//p[text()= 'Automation Engineer']") WebElement  Job_1;
	
	@FindBy(xpath = "//p[text()= 'Data Analyst']") WebElement  Job_2;
	
	@FindBy(xpath = "//p[text()= 'Team Lead']") WebElement  Job_3;
	
	@FindBy(xpath = "//td[contains(text(),'Automation Engineer')]") WebElement  Automation_Tester;
	
	@FindBy(xpath = "//td[contains(text(),'Data Analyst')]") WebElement  Data_Analyst;
	
	@FindBy(xpath = "//td[contains(text(),'Team Lead')]") WebElement  Team_Lead;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]") WebElement  Read_Text_Candidate_Page;
	
	@FindBy(xpath = "//button[contains(text(),'View Resume')]") WebElement  Resume;
	
	@FindBy(xpath = "//a[@aria-label='View Job Details']") WebElement  Job_Link;
	
	@FindBy(xpath = "//div[contains(text(),'Pending')]") WebElement  Status_Pending;

	@FindBy(xpath = "//li[@data-value='shortlisted']") WebElement  Change2shortlisted;
	
	@FindBy(xpath = "//li[@data-value='accepted']") WebElement  Change2Accepted;
	
	@FindBy(xpath = "//li[@data-value='rejected']") WebElement  Change2Rejected;
	
	@FindBy(xpath = "//div[contains(text(),'Short-Listed')]") WebElement  Text_Status_Check;
	
	@FindBy(xpath = "//div[contains(text(),'Accepted')]") WebElement  Text_Status_Check_Accepted;
	
	@FindBy(xpath = "//div[contains(text(),'Rejected')]") WebElement  Text_Status_Check_Rejected;
	
	@FindBy(xpath = "//button[contains(@class,'MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1731d36')]") WebElement  Continue;

	@FindBy(xpath = "//div[text()='Short-Listed']") WebElement  New_Status_Text;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[1]") WebElement  Job_Status_Chnage_Button;
	
	@FindBy(xpath = "//li[@data-value='shortlisted']") WebElement  Accepted;
	
	@FindBy(xpath = "//button[contains(@class,'MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1731d36')]") WebElement  Continue_Accepted;
	
	@FindBy(xpath = "//div[text()='Accepted']") WebElement  New_Status_Accpted_Text;
	
	@FindBy(xpath = "//div[text()='Rejected']") WebElement  New_Status_Rejecetd_Text;
	
    @FindBy(xpath = "//input[@name='email']")  WebElement  Email_Candidate;
	
	@FindBy(xpath = "//input[@name='password']")  WebElement  Password_Candidate;
	
	@FindBy(xpath = "//button[@type='submit']")	 WebElement  SubmitButton_Candidate;
	
	@FindBy(xpath = "//div[@class='MuiAvatar-root MuiAvatar-circular css-1kn060p']") WebElement  Click_Profile;
	
	@FindBy(xpath = "//a[@href='/dashboard/default']")	 WebElement  Dashboard;
	
	@FindBy(xpath = "//a[@href='/jobs/candidate/applied']")	 WebElement  Your_Application;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div/div/input")	 WebElement  Click_Filter;

	@FindBy(xpath = "//h2[contains(@class, 'MuiBox-root css-2x8b4e')]")	 WebElement  Job_Name;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/div[2]/div") WebElement  Row_Per_Page;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[1]") WebElement  Row_Per_Page_5;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[2]") WebElement  Row_Per_Page_10;
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[3]") WebElement  Row_Per_Page_20;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[4]") WebElement  Row_Per_Page_25;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/div/input")	 WebElement  Filter_By_Status;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr/td[2]/div") WebElement  Candidate_Name;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/input")	 WebElement  Filter_By_Active_InActive;

	@FindBy(xpath = "") WebElement  Candidate_Status;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/img") WebElement  RCS_IMG;

	
	private WebDriver driver;
	private Closed_Tab windowUtil;

  // Constructor to initialize elements
  public Company_Check_Applied_Candidate_08(WebDriver driver) {
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
   
   public void Click_on_Applied_Candidate_Page() throws InterruptedException {
		
	   Applied_Candidate_Page.click();
		
	    }

	public boolean Check_Page_Name_displayed () throws InterruptedException {
		
		Page_Name_Applied_Candidate.getText();
	    	
		return Page_Name_Applied_Candidate.isDisplayed();
	    }


	public String Check_Page_Name () throws InterruptedException {
				
        String text = Page_Name_Applied_Candidate.getText();
        System.out.println("Text of the element: " + text);
			 	 
	   return text;
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
		public String Check_column_6_Name () throws InterruptedException {
			
		return Column_6.getText();
			    
		    }
		
		public void Click_Job_1() throws InterruptedException {
		    // Click on Job_1 link/button
		    Job_1.click();

		    // Wait for the new window to open
		    Thread.sleep(10000); // Adjust if needed

		    // Get all window handles
		    Set<String> handles = driver.getWindowHandles();
		    Iterator<String> it = handles.iterator();

		    // Get   Window ID
		    String parentWindow = it.next();
		    String childWindow = null;

		    // Identify the child window handle
		    while (it.hasNext()) {
		        childWindow = it.next();
		    }

		    // If a child window exists, switch to it
		    if (childWindow != null) {
		        driver.switchTo().window(childWindow);
		        
		        // Wait for 15 seconds to read the data
		        Thread.sleep(15000);

		        // Close the child window
		        driver.close();
		    }

		    // Switch back to the parent window
		    driver.switchTo().window(parentWindow);
		}

		
		public void Click_Job_2 () throws InterruptedException {
			
			Job_2.click();
			
		    Thread.sleep(10000); // Adjust if needed
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        Set<String> handles01 = driver.getWindowHandles();
	        
	        Iterator<String> it01 = handles01.iterator();
	         
	        String Parent_id01 = it01.next();
	        String Child_Id01 = null;
	         
	        // Identify the child window handle
	        while (it01.hasNext()) {
	            Child_Id01 = it01.next();
	        }
	         
	        // Switch to child window and close it
	        if (Child_Id01 != null) {
	        	
	        	  Thread.sleep(3000);
	        	  
	            driver.switchTo().window(Child_Id01).close();
	            
	            Thread.sleep(3000);
	            }
	         
	        // Switch back to the parent window
	        driver.switchTo().window(Parent_id01);
	              
		}
		
		
		public void Click_Job_3 () throws InterruptedException {
			
			Job_3.click();
			
		    Thread.sleep(10000); 
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        Set<String> handles01 = driver.getWindowHandles();
	        
	        Iterator<String> it01 = handles01.iterator();
	         
	        String Parent_id01 = it01.next();
	        String Child_Id01 = null;
	         
	        // Identify the child window handle
	        while (it01.hasNext()) {
	            Child_Id01 = it01.next();
	        }
	         
	        // Switch to child window and close it
	        if (Child_Id01 != null) {
	        	
	            Thread.sleep(3000);
	            
	            driver.switchTo().window(Child_Id01).close();
	            
	            Thread.sleep(3000);
	        }
	         
	        // Switch back to the parent window
	        driver.switchTo().window(Parent_id01);
	              
		}
		
		public void Click_Job_Automation_Tester() throws InterruptedException {
			
			Automation_Tester.click();
				
		}
		
		public String Get_Text_Candidate_Page() throws InterruptedException {
			
			Read_Text_Candidate_Page.getText();
						
			String pageText = Read_Text_Candidate_Page.getText();
	        System.out.println("Page Text:\n" + pageText);
			return pageText;
			
			
			
		}
		
	  public void Check_Resume() throws InterruptedException {
		  		  
		  
		// Store main tab handle
		  String mainTab = driver.getWindowHandle();

		  // Switch to new tab
		  for (String tab : driver.getWindowHandles()) {
		      if (!tab.equals(mainTab)) {
		          driver.switchTo().window(tab);
		          break;
		      }
		  }
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		  WebElement viewResumeButton1 = wait.until(ExpectedConditions.elementToBeClickable(Resume));
		  viewResumeButton1.click();

    	  Thread.sleep(5000);
    	  
    	  Set<String> windowHandles = driver.getWindowHandles();
    	  Iterator<String> iterator = windowHandles.iterator();

    	  // Get the main tab and child tab
    	  String parentWindow = iterator.next();
    	  String childWindow = iterator.next();
    	  String CurrentWindow = iterator.next();

    	  // Switch to the resume tab (child tab)
    	  driver.switchTo().window(CurrentWindow);

    	  // Close the resume tab
    	  driver.close();
    	  
    	  driver.switchTo().window(childWindow);
		  		 
    	  		  
		}
	  
	  public void Check_Job_Link() throws InterruptedException {
		  
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		  WebElement viewJobButton1 = wait.until(ExpectedConditions.elementToBeClickable(Job_Link));
		  viewJobButton1.click();
		  		  
		  Thread.sleep(5000);
		     	  
    	  Set<String> windowHandles = driver.getWindowHandles();
    	  Iterator<String> iterator = windowHandles.iterator();

    	  // Get the main tab and child tab
    	  String parentWindow = iterator.next();
    	  String childWindow = iterator.next();
    	  String CurrentWindow = iterator.next();

    	  // Switch to the resume tab (child tab)
    	  driver.switchTo().window(CurrentWindow);

    	  driver.close();
    	  
    	  driver.switchTo().window(childWindow);

		  
		}
	
	    
	    public void Status_ShortListed() throws InterruptedException {
			 
	    	 Status_Pending.click();
			 			 
			  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			  WebElement Status_ShortListed = wait.until(ExpectedConditions.elementToBeClickable(Change2shortlisted));
			  Status_ShortListed.click();
			 			 
			 Thread.sleep(3000);
			 
			 Continue.click();
			 
			 Thread.sleep(4000);
			 			  
			}
	    
	    public String Text_Status_ShortListed() throws InterruptedException {
			 	    		   				   	  
	    	  return Text_Status_Check.getText();

			 			  
			}
	    
	    public void Select_Data_Analyst_Job() throws InterruptedException {
		
	    	  Data_Analyst.click();
					 
			  
			}
	   
	    
	    public void Status_Accepted() throws InterruptedException {
	    	

			// Store main tab handle
			  String mainTab = driver.getWindowHandle();

			  // Switch to new tab
			  for (String tab : driver.getWindowHandles()) {
			      if (!tab.equals(mainTab)) {
			          driver.switchTo().window(tab);
			          break;
			      }
			  }

						 
	    	   Status_Pending.click();
 			 
			  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			  WebElement Status_Accepted = wait.until(ExpectedConditions.elementToBeClickable(Change2Accepted));
			  Status_Accepted.click();
			 			 
			 Thread.sleep(3000);
			 
			 Continue.click();
			 
			 Thread.sleep(4000);
			 			  
			}
	    public String Text_Status_Accepted() throws InterruptedException {
			 
	    	return	 Text_Status_Check_Accepted.getText();
}
	    public void Select_Team_Lead_Job() throws InterruptedException {
			
	    	Team_Lead.click();
					 
			  
			}

	    public void Status_Rejected() throws InterruptedException {
			 
	    	// Store main tab handle
			  String mainTab = driver.getWindowHandle();

		   // Switch to new tab
			  for (String tab : driver.getWindowHandles()) {
			      if (!tab.equals(mainTab)) {
			          driver.switchTo().window(tab);
			          break;
			      }
			  }

						 
	    	  Status_Pending.click();
			 
			  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			  
			  WebElement Status_Rejected = wait.until(ExpectedConditions.elementToBeClickable(Change2Rejected));
			  			  
			  Status_Rejected.click();
			  			 
			 Thread.sleep(3000);
			 
			 Continue.click();
			 
			 Thread.sleep(4000);

			 			  
			}
	    public String Text_Status_Rejected() throws InterruptedException {
			 
	    	return	 Text_Status_Check_Rejected.getText();
	    	
         } 
	    
	    public void LogIn_Candidate(String username_Candidate, String password_Candidate ) throws InterruptedException {
			 			 
			 Email_Candidate.sendKeys(username_Candidate);
			 
			 Password_Candidate.sendKeys(password_Candidate);
			 
			 SubmitButton_Candidate.click();
			 
			}
	    public void Submit_Candidate() throws InterruptedException {
			 				 
				 SubmitButton_Candidate.click();
				 
				}
		    
	    
	    public void Check_Job_Status() throws InterruptedException {
			 
	    	Click_Profile.click();
	    	
	    	Dashboard.click();
	    	
	    	Your_Application.click();
	    	
	    	Click_Filter.click();
	    	
	    	Click_Filter.sendKeys("Shortlisted");
	    	
	    	Click_Filter.sendKeys(Keys.ARROW_UP);

	    	Click_Filter.sendKeys(Keys.ENTER);
	    	
	        System.out.println(Job_Name.getText());
	    	
	    	Click_Filter.click();
	    	
	    	Click_Filter.sendKeys(Keys.CONTROL + "A");

	    	Click_Filter.sendKeys(Keys.BACK_SPACE);
	    	
	    	Click_Filter.click();
	    	
	    	Click_Filter.sendKeys("Accepted"); 
	    	
	    	Click_Filter.sendKeys(Keys.ARROW_UP);

	    	Click_Filter.sendKeys(Keys.ENTER);
	    	
	    	System.out.println(Job_Name.getText());
	    	
	    	Click_Filter.click();
	    	
	    	Click_Filter.sendKeys(Keys.CONTROL + "A");

	    	Click_Filter.sendKeys(Keys.BACK_SPACE);
	    	
	    	Click_Filter.click();
	    	
	    	Click_Filter.sendKeys("Rejected");
	    	
	    	Click_Filter.sendKeys(Keys.ARROW_UP);

	    	Click_Filter.sendKeys(Keys.ENTER);
	    	
	         System.out.println(Job_Name.getText());
	    	
//	    	Click_Filter.click();
//	    	
//	    	Click_Filter.sendKeys(Keys.CONTROL + "A");
//
//	    	Click_Filter.sendKeys(Keys.BACK_SPACE);
			 
	    	
			}
	    	    
	    public void Filter_By_Status() throws InterruptedException {
			 
	    	Filter_By_Status.click();
	    	
	    	Filter_By_Status.sendKeys("Pending");
	    	
	    	Filter_By_Status.sendKeys(Keys.ARROW_UP);

	    	Filter_By_Status.sendKeys(Keys.ENTER);
	    	
	    	Thread.sleep(4000);
	    	
	    	Candidate_Name.getText();
	    	
	    	Filter_By_Status.click();
	    	
	    	Filter_By_Status.sendKeys(Keys.CONTROL + "A");

	    	Filter_By_Status.sendKeys(Keys.BACK_SPACE);
	    		    		 	    	
	    	Filter_By_Status.sendKeys("ShortListed");
	    	
	    	Filter_By_Status.sendKeys(Keys.ARROW_UP);

	    	Filter_By_Status.sendKeys(Keys.ENTER);
	    	
	    	Thread.sleep(4000);
	    	
	        System.out.println("Candidate Name"+ Candidate_Name.getText());	
	        
	    	Filter_By_Status.click();	    	
	    	
	    	Filter_By_Status.sendKeys(Keys.CONTROL + "A");

	    	Filter_By_Status.sendKeys(Keys.BACK_SPACE);
	    	
	    	Filter_By_Status.click();
	    	
	    	Filter_By_Status.sendKeys("Accepted");
	    	
	    	Filter_By_Status.sendKeys(Keys.ARROW_UP);

	    	Filter_By_Status.sendKeys(Keys.ENTER);
	    	
	    	Thread.sleep(4000);
	    	
	    	System.out.println("Candidate Name"+ Candidate_Name.getText());		
	    	
	    	Filter_By_Status.click();	    	
	    	
	    	Filter_By_Status.sendKeys(Keys.CONTROL + "A");

	    	Filter_By_Status.sendKeys(Keys.BACK_SPACE);
	    	
	    	Filter_By_Status.click();
	    	
	    	Filter_By_Status.sendKeys("Rejected");
	    	
	    	Filter_By_Status.sendKeys(Keys.ARROW_UP);

	    	Filter_By_Status.sendKeys(Keys.ENTER);
	    	
	    	Thread.sleep(4000);
	    	
	    	System.out.println("Candidate Name"+ Candidate_Name.getText());		
	    	
	    	Filter_By_Status.click();	    	
	    	
	    	Filter_By_Status.sendKeys(Keys.CONTROL + "A");

	    	Filter_By_Status.sendKeys(Keys.BACK_SPACE);
	    	
	    //	Filter_By_Status.sendKeys(Keys.TAB);
				 
				
	    }
	    
	    public void Filter_By_Active_Inactive() throws InterruptedException {
	    	
	    	Filter_By_Active_InActive.click();
	    	
	    	Filter_By_Active_InActive.sendKeys("Active");
	    	
	    	Filter_By_Active_InActive.sendKeys(Keys.ARROW_DOWN);

	    	Filter_By_Active_InActive.sendKeys(Keys.ENTER);
	    	
	    	Thread.sleep(4000);
	    	
//	    	if (Candidate_Name.isDisplayed()) {
//	    	    System.out.println("Candidate Name: " + Candidate_Name.getText());
//	    	} else {
//	    	    System.out.println("No Inactive Candidate Displayed");
//	    	}	  
	    	
	    	Filter_By_Active_InActive.click();
	    	
	    	Filter_By_Active_InActive.sendKeys(Keys.CONTROL + "A");

	    	Filter_By_Active_InActive.sendKeys(Keys.BACK_SPACE);
	    	
	    	Filter_By_Active_InActive.click();	    	
	    		 	    	
	    	Filter_By_Active_InActive.sendKeys("InActive");
	    	
	    	Filter_By_Active_InActive.sendKeys(Keys.ARROW_UP);

	    	Filter_By_Active_InActive.sendKeys(Keys.ENTER);
	    	
	    	Thread.sleep(4000);
	    	
//	    	if (Candidate_Name.isDisplayed()) {
//	    	    System.out.println("Candidate Name: " + Candidate_Name.getText());
//	    	} else {
//	    	    System.out.println("No Inactive Candidate Displayed");
//	    	}

	    	
	    	Filter_By_Active_InActive.click();

	    	Filter_By_Active_InActive.sendKeys(Keys.CONTROL + "A");

	    	Filter_By_Active_InActive.sendKeys(Keys.BACK_SPACE);
	    	
	    	driver.navigate().refresh();
	    	
	    	Thread.sleep(3000);
	    
	    	
      }
	    
	    public void Both_Filter_Together() throws InterruptedException {
	    	
            Filter_By_Status.click();
	    	
	    	Filter_By_Status.sendKeys("Pending");
	    	
	    	Filter_By_Status.sendKeys(Keys.ARROW_UP);

	    	Filter_By_Status.sendKeys(Keys.ENTER);
	    	
	    	Thread.sleep(4000);
	    	
	    	Filter_By_Active_InActive.click();
	    	
	    	Filter_By_Active_InActive.sendKeys("Active");
	    	
	    	Filter_By_Active_InActive.sendKeys(Keys.ARROW_DOWN);

	    	Filter_By_Active_InActive.sendKeys(Keys.ENTER);
	    	
	    	Thread.sleep(4000);
	    	
	     	if (Candidate_Name.isDisplayed()) {
	    	    System.out.println("Candidate Name: " + Candidate_Name.getText());
	    	} else {
	    	    System.out.println("No Inactive Candidate Displayed");
	    	}

 }
	    public void Check_Row_Per_Page () throws InterruptedException  {
	   	 
	  	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  	    js.executeScript("arguments[0].scrollIntoView(true);", Row_Per_Page);
	  	    
	  	    // Add a slight delay to ensure the element is visible
	  	    try {
	  	        Thread.sleep(1000); // 1 second
	  	    } catch (InterruptedException e) {
	  	        e.printStackTrace();
	  	        
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
	   
	     }

}

