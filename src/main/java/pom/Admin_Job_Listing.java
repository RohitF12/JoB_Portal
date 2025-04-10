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
import utils.Closed_Tab;

public class Admin_Job_Listing {
	
	public WebDriver driver;
	public Closed_Tab windowUtil;
		
	@FindBy(xpath = "//input[@name='email']")  WebElement  Email_Admin;
		
	@FindBy(xpath = "//input[@name='password']")  WebElement  Password_Admin;
	
	@FindBy(xpath = "//button[@type='submit']")	 WebElement  SubmitButton_Admin;
	
    @FindBy(xpath = "//span[text()='Job Listings']")	 WebElement  Job_Listing_Page;
	
	@FindBy(xpath = "//h3[text()='Job Listings']") WebElement  Page_Name_Job_Listing;
	
	@FindBy(xpath = "//input[contains(@class, 'MuiInputBase-inputAdornedStart css-1gmu8xx')]") WebElement  SearchBar;

	@FindBy(xpath = "//th[text()='Title']") WebElement  Column_1;
	
	@FindBy(xpath = "//th[text()='Posted On']") WebElement  Column_2;
	
	@FindBy(xpath = "//th[text()='Type']") WebElement  Column_3;
	
	@FindBy(xpath = "//th[text()='Experience']") WebElement  Column_4;
	
	@FindBy(xpath = "//th[text()='City']") WebElement  Column_5;
	
	@FindBy(xpath = "//th[text()='Edit']") WebElement  Column_6;
	
	@FindBy(xpath = "//th[text()='Delete']") WebElement  Column_7;
	
	@FindBy(xpath = "//p[text()= 'Automation Engineer']") WebElement  Job_1;
	
	@FindBy(xpath = "//p[text()= 'Data Analyst']") WebElement  Job_2;
	
	@FindBy(xpath = "//p[text()= 'Team Lead']") WebElement  Job_3;
	
	@FindBy(xpath = "//p[text()= 'Project Manager']") WebElement  Job_4;
	
	@FindBy(xpath = "//p[text()= 'Managing Director']") WebElement  Job_5;	

	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/h5") WebElement  Job_Name;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/h6") WebElement  Company_Name;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[2]/p[1]") WebElement  Type;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[2]/p[2]") WebElement  Location_Type;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[2]/p[3]") WebElement  Year;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[2]/p[2]") WebElement  Location;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[1]/div[3]/p[1]") WebElement  Posted_On;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[1]/div[3]/p[2]") WebElement  Apply_By;
	
	@FindBy(xpath = "//div[contains(@class, 'MuiBox-root css-1i27l4i')]") WebElement  Salary_range;
	
	@FindBy(xpath = "//div[contains(@class, 'MuiBox-root css-1a7cwwd')]") WebElement  Skill;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div/div[1]/p") WebElement  Benifit;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[1]/div") WebElement  Description;	
	
	@FindBy(xpath = "//td[contains(@class, 'MuiTableCell-body')]//button") WebElement  Edit_button;	

	@FindBy(xpath = "//input[@name='jp_title']") WebElement  Job_Title_Displayed;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/form/div[1]/div[1]/div[2]/div/div/input") WebElement  Company_Field;
	
	@FindBy(xpath = "//input[@name='jp_start_date']") WebElement  Start_Date_Displayed;
	
	@FindBy(xpath = "//input[@name='jp_end_date']") WebElement  End_Date_Displayed;
	
	@FindBy(xpath = "//input[@name='jp_min_exp']") WebElement  Min_Exp_Displayed;
	
	@FindBy(xpath = "//input[@name='jp_max_exp']") WebElement  Max_Exp_Displayed;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/form/div[1]/div[4]/div[1]/div/div/input") WebElement  Employment_Type_Displayed;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/form/div[1]/div[4]/div[2]/div/div/input") WebElement  Highest_Education_Displayed;
	
	@FindBy(xpath = "//input[@name='jp_required_degree']") WebElement  Required_Degree_Displayed;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/form/div[1]/div[6]/div/div/div[1]/span") WebElement  Required_Skill_Displayed;
	
	@FindBy(xpath = "//input[@name='jp_minimum_salary']") WebElement  Minimum_Pay_Ranges_Displayed;
	
	@FindBy(xpath = "//input[@name='jp_maximum_salary']") WebElement  Maximum_Pay_Ranges_Displayed;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/form/div[1]/div[8]/div/div[1]/div[1]/div/div/div[1]/span") WebElement  Location_Type_Displayed;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/form/div[1]/div[8]/div/div[1]/div[2]/div/div/div[1]/span") WebElement  Country_Displayed;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/form/div[1]/div[8]/div/div[2]/div[1]/div/div/input") WebElement  State_Displayed;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/form/div[1]/div[8]/div/div[2]/div[2]/div/div/input") WebElement  City_Displayed;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/form/div[1]/div[10]/div/div/div/div[1]/span") WebElement  Benifit_Displayed;
		
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/form/div[1]/div[12]/div/div/div/div/div[1]/span") WebElement  Keyword_Displayed;
		
	@FindBy(xpath = "//div[contains(@class, 'ql-editor')]") WebElement  Description_Displayed;
	
	@FindBy(xpath = "//button[@aria-label='Close']") WebElement  Closed_Window;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/form/div[2]/button") WebElement  Update_Job;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[1]") WebElement  Row_Per_Page_5;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[2]") WebElement  Row_Per_Page_10;

	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[3]") WebElement  Row_Per_Page_20;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[4]") WebElement  Row_Per_Page_25;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/div/div/input") WebElement  Employment_Type_Filter;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/input") WebElement  Experience_Level_Filter;
    
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/div/div/div/input") WebElement  Location_Filter;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[8]/button") WebElement  Delete_Icon;

	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/button[2]") WebElement  Confirm_Delete_Button;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[2]") WebElement  Deleted_Job;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/div[2]/div") WebElement  Row_Per_Page;
	
	@FindBy(xpath = "//a[@href='/trash']") WebElement  Trash;
	
	 // Constructor to initialize elements
	   public Admin_Job_Listing(WebDriver driver) {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
		
	   }

	  // Methods to interact with the elements
	  public void enterUsername(String username) {
	   // driver.findElement(Email).sendKeys(username);
		Email_Admin.sendKeys(username);
	  }

	  public void enterPassword(String password) {
	  //  driver.findElement(passwordField).sendKeys(password);
		Password_Admin.sendKeys(password);
	  }

	   public void clickLogin() {
	    //driver.findElement(loginButton).click();
		SubmitButton_Admin.click();
	     }

	   public void Click_on_Job_Listing_Page() throws InterruptedException {
			
		    
			Job_Listing_Page.click();
			
		    }

		public boolean Check_Page_Name_displayed () throws InterruptedException {
			
			Page_Name_Job_Listing.getText();
		    	
			return Page_Name_Job_Listing.isDisplayed();
		    }


		public String Check_Page_Name () throws InterruptedException {
			
			return Page_Name_Job_Listing.getText();
			 
			 
		   
		    }
	    public boolean Check_Search_Bar () throws InterruptedException {
			
	    	SearchBar.isEnabled();
		    	
			return SearchBar.isDisplayed();
		    }

	    public void Enter_Job_1_in_Search_Bar (String Search_Job_1) {
	    	
	    	SearchBar.sendKeys(Search_Job_1);
	    	
	    }
	    
	    public void Enter_Job_2_in_Search_Bar (String Search_Job_2) {
	    	
	    	SearchBar.sendKeys(Search_Job_2);
	    	
	    }
	    		                               
	   public void Enter_Job_3_in_Search_Bar (String Search_Job_3) {
	    	
	    	SearchBar.sendKeys(Search_Job_3);
	    	
	    }
	   public void Enter_Job_4_in_Search_Bar (String Search_Job_4) {
	   	
	   	SearchBar.sendKeys(Search_Job_4);
	   	
	   }
	   
	   public void Enter_Job_5_in_Search_Bar (String Search_Job_5) {
		   	
		   	SearchBar.sendKeys(Search_Job_5);
		   	
		   }
	   public void Clear_Search_Bar () throws InterruptedException {
			   
	   	SearchBar.clear();
	       
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
		public String Check_column_7_Name () throws InterruptedException {
			
		return Column_7.getText();
			    
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
		
		public void Click_Job_4 () throws InterruptedException {
			
			Job_4.click();
			
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
		
	public void Click_Job_5 () throws InterruptedException {
			
			Job_5.click();
			
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
		
		
			
		public void Check_Job_Name () throws InterruptedException {
				
			Job_Name.getText();
			
			System.out.println(Job_Name.getText());
				    	
				    }
		

		public void Check_company_name () throws InterruptedException {
				
			Company_Name.getTagName();

			
				    }

		public void Check_Type () throws InterruptedException {
				
			Type.getText();
				    	
				    }

		public String Check_location_Type () throws InterruptedException {
				
			return Location_Type.getText();
				    	
				    }

		public void Check_Year () throws InterruptedException {
				
			Year.getText();    	
				    }

		public void Check_location () throws InterruptedException {
				
			Location.getText();   	
				    }

		public void Check_Posted_By () throws InterruptedException {
				
			Posted_On.getText();  	
				    }

		public void Check_Apply_By () throws InterruptedException {
				
			Apply_By.getText();	
				    }

		public void Check_Salary_range () throws InterruptedException {
				
			Salary_range.getText();
			
				    }

		public void Check_Skill () throws InterruptedException {
				
			Skill.getText();
				    	
				    }

		public void Check_benifit () throws InterruptedException {
				
			Benifit.getText();    	
				    }

		public void Check_description () throws InterruptedException {
				
			Description.getText();
				    	
				    }
		
		public boolean Check_Edit_button () throws InterruptedException {
			
			Edit_button.isEnabled();
			
			return Edit_button.isDisplayed();
				   
		}
		
		public void Click_Edit_button () throws InterruptedException {
			
			Edit_button.click();
				   
		}
		
		public String Displayed_Job_Name () throws InterruptedException {
			
			return Job_Title_Displayed.getText();			    	
				    
		}
		
		public boolean Displayed_Company_Name () throws InterruptedException {
			
			return Company_Field.isDisplayed();
							    			    
		}
		
		public void Displayed_Start_Date () throws InterruptedException {
				
			Start_Date_Displayed.getTagName();		
			
			System.out.println(Start_Date_Displayed.getTagName());
				    }

		public void Displayed_End_Date () throws InterruptedException {
			
			End_Date_Displayed.getText();
			
			System.out.println(End_Date_Displayed.getText());
			
				    }
		public void Displayed_Min_Exp () throws InterruptedException {
				
			Min_Exp_Displayed.getText();
			
			System.out.println(Min_Exp_Displayed.getText());
				    	
				    }
		
		public void Displayed_Max_Exp () throws InterruptedException {
			
			Max_Exp_Displayed.getText();
			
			System.out.println(Max_Exp_Displayed.getText());
				    	
				    }

		public void Displayed_Employment_Type () throws InterruptedException {
				
			 Employment_Type_Displayed.getText();
			 
			 System.out.println(Employment_Type_Displayed.getText());
				    	
				    }
		
		public void Displayed_Highest_Education () throws InterruptedException {
			
			Highest_Education_Displayed.getText();
			
			System.out.println(Highest_Education_Displayed.getText());
				    	
				    }
		
		public void Displayed_Required_degree () throws InterruptedException {
			
			Required_Degree_Displayed.getText();
			
			System.out.println(Required_Degree_Displayed.getText());
				    	
				    }

		public void Displayed_Skill () throws InterruptedException {
				
			Required_Skill_Displayed.getText();   
			
	        System.out.println(Required_Skill_Displayed.getText());
				    }

		public void Displayed_Min_Pay () throws InterruptedException {
				
			Min_Exp_Displayed.getText(); 
			
			System.out.println(Min_Exp_Displayed.getText());
				    }
		
		public void Displayed_Max_Pay () throws InterruptedException {
			
			Max_Exp_Displayed.getText();   
			
			System.out.println(Max_Exp_Displayed.getText());

				    }

		public void Displayed_Location_Type () throws InterruptedException {
				
			Location_Type_Displayed.getText();  
			
			System.out.println(Location_Type_Displayed.getText());

				    }

		public void Displayed_Country () throws InterruptedException {
				
			Country_Displayed.getText();	
			
			System.out.println(Country_Displayed.getText());
				    }

		public void Displayed_State () throws InterruptedException {
				
			State_Displayed.getText();
			
			System.out.println(State_Displayed.getText());
			
				    }

		public void Displayed_City () throws InterruptedException {
				
			City_Displayed.getText();
			
			System.out.println(City_Displayed.getText());
				    	
				    }

		public void Displayed_benifit () throws InterruptedException {
				
			Benifit_Displayed.getText();   
			
			System.out.println(Benifit_Displayed.getText());
				    
		}

		public void Displayed_Keyword () throws InterruptedException {
			
			Keyword_Displayed.getText(); 
			
			System.out.println(Keyword_Displayed.getText());
		
		}
		
		
		public void Displayed_description () throws InterruptedException {
				
			Description_Displayed.getText();
			
			System.out.println(Description_Displayed.getText());
				    	
		}
		
		public void Click_Close () throws InterruptedException {
			
			Closed_Window.click();
				    	
		}
		
	public void Update_End_Date (String Data_Chnage_1) throws InterruptedException {
		
		End_Date_Displayed.sendKeys(Keys.CONTROL + "A");

		End_Date_Displayed.sendKeys(Keys.BACK_SPACE);
		
		End_Date_Displayed.click();
		
		Thread.sleep(3000);
		
		End_Date_Displayed.sendKeys("31052025");
			
		End_Date_Displayed.sendKeys(Data_Chnage_1);
				    	
		}

	public void Update_End_Date_1 (String End_Date_Update_1) throws InterruptedException {
						
		End_Date_Displayed.sendKeys(Keys.CONTROL + "A");

		End_Date_Displayed.sendKeys(Keys.BACK_SPACE);
				
		End_Date_Displayed.click();
				
		Thread.sleep(3000);
				
		End_Date_Displayed.sendKeys(End_Date_Update_1);
					
						    	
				}

	public void Update_Employment_Type (String Data_Change_2) throws InterruptedException {
		
		 // Scroll into view before clicking
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", Employment_Type_Displayed);
		
		Employment_Type_Displayed.sendKeys(Keys.CONTROL + "A");

		Employment_Type_Displayed.sendKeys(Keys.BACK_SPACE);
		
		Employment_Type_Displayed.sendKeys(Data_Change_2);
		
		Employment_Type_Displayed.sendKeys(Keys.ARROW_UP);

		Employment_Type_Displayed.sendKeys(Keys.ENTER);
		
		Employment_Type_Displayed.sendKeys(Keys.TAB);
			    	
	}
		
	public void Click_Update_Job_button() {
	    // Scroll into view before clicking
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", Update_Job);
	    
	    // Add a slight delay to ensure the element is visible
	    try {
	        Thread.sleep(1000); // 1 second
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }

	    // Click the button
	    Update_Job.click();
	}

		
	public void Update_State (String Data_Chnage_1) throws InterruptedException {
		
		 // Scroll into view before clicking
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", State_Displayed);
		
		State_Displayed.sendKeys(Keys.CONTROL + "A");

		State_Displayed.sendKeys(Keys.BACK_SPACE);
		
		State_Displayed.click();
		
		Thread.sleep(2000);
			
		State_Displayed.sendKeys(Data_Chnage_1);
		
	    Thread.sleep(4000);

		State_Displayed.sendKeys(Keys.ARROW_UP);

		State_Displayed.sendKeys(Keys.ENTER);
		
		State_Displayed.sendKeys(Keys.TAB);
				    	
	 }

	 public void Update_City (String Data_Chnage_2) throws InterruptedException {
		 
		 // Scroll into view before clicking
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", City_Displayed);
		
		City_Displayed.sendKeys(Keys.CONTROL + "A");

		City_Displayed.sendKeys(Keys.BACK_SPACE);
		
		City_Displayed.click();
		
		Thread.sleep(5000);
			
		City_Displayed.sendKeys(Data_Chnage_2);
		
	      Thread.sleep(4000);
	      
		City_Displayed.sendKeys(Keys.ARROW_UP);

		City_Displayed.sendKeys(Keys.ENTER);
		
		City_Displayed.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
					    	
		}
	 
	 public void Clear_Search_bar_1 () throws InterruptedException  {
		 
		 Thread.sleep(3000);
			
		 SearchBar.sendKeys(Keys.CONTROL + "A");

		 SearchBar.sendKeys(Keys.BACK_SPACE);
		 
		Thread.sleep(3000);

	 }
	 
	 
	 public void Update_Highest_Education (String Data_Chnage_1) throws InterruptedException {
		 
		 // Scroll into view before clicking
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", Highest_Education_Displayed);
			
		 Highest_Education_Displayed.sendKeys(Keys.CONTROL + "A");

		 Highest_Education_Displayed.sendKeys(Keys.BACK_SPACE);
			
		 Highest_Education_Displayed.click();
			
			Thread.sleep(2000);
				
			Highest_Education_Displayed.sendKeys(Data_Chnage_1);
			
		    Thread.sleep(4000);

		    Highest_Education_Displayed.sendKeys(Keys.ARROW_UP);

		    Highest_Education_Displayed.sendKeys(Keys.ENTER);
			
			State_Displayed.sendKeys(Keys.TAB);
					    	
		 }

		 public void Update_Required_Degree (String Data_Chnage_2) throws InterruptedException {
			 
			 // Scroll into view before clicking
			    JavascriptExecutor js = (JavascriptExecutor) driver;
			    js.executeScript("arguments[0].scrollIntoView(true);", Required_Degree_Displayed);
			
			 Required_Degree_Displayed.sendKeys(Keys.CONTROL + "A");

			 Required_Degree_Displayed.sendKeys(Keys.BACK_SPACE);
			
			 Required_Degree_Displayed.click();
			
			Thread.sleep(2000);
				
			Required_Degree_Displayed.sendKeys(Data_Chnage_2);
			
		      Thread.sleep(4000);
		  
		      Required_Degree_Displayed.sendKeys(Keys.TAB);
					    	
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
	 
	 public void Filter_By_Employment_Type_1 (String Filter_Data_1) throws InterruptedException  {
		 
		 // Scroll into view before clicking
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", Employment_Type_Filter); 
	  
		Employment_Type_Filter.sendKeys(Filter_Data_1);
		 
		Employment_Type_Filter.sendKeys(Keys.ARROW_UP);

		Employment_Type_Filter.sendKeys(Keys.ENTER);
		
	    Thread.sleep(5000);

	    
	  } 
	 
	 public void Filter_By_Employment_Type_2 (String Filter_Data_2) throws InterruptedException  {
		 
		 Employment_Type_Filter.sendKeys(Keys.CONTROL + "A");

		 Employment_Type_Filter.sendKeys(Keys.BACK_SPACE);
		  
		 Employment_Type_Filter.sendKeys(Filter_Data_2);
		 		 
			Employment_Type_Filter.sendKeys(Keys.ARROW_UP);

			Employment_Type_Filter.sendKeys(Keys.ENTER);
			
		    Thread.sleep(5000);
		    
		Employment_Type_Filter.sendKeys(Keys.CONTROL + "A");

		Employment_Type_Filter.sendKeys(Keys.BACK_SPACE);
			  
			
	    
	  } 
	 
	 public void Filter_By_Year_of_Experience_2 (String Filter_Data_1) throws InterruptedException  {
		  
		 Experience_Level_Filter.sendKeys(Filter_Data_1);
		 		 
		 Experience_Level_Filter.sendKeys(Keys.ARROW_DOWN);

		 Experience_Level_Filter.sendKeys(Keys.ENTER);
			
		    Thread.sleep(5000);
	    
	  } 
	 
	 public void Filter_By_Year_of_Experience_5 (String Filter_Data_2) throws InterruptedException  {
		 
		 Experience_Level_Filter.sendKeys(Keys.CONTROL + "A");

		 Experience_Level_Filter.sendKeys(Keys.BACK_SPACE);
		  
		 Experience_Level_Filter.sendKeys(Filter_Data_2);
		 		 
		 Experience_Level_Filter.sendKeys(Keys.ARROW_DOWN);

		 Experience_Level_Filter.sendKeys(Keys.ENTER);
			
		    Thread.sleep(5000);
			 Experience_Level_Filter.sendKeys(Keys.CONTROL + "A");

			 Experience_Level_Filter.sendKeys(Keys.BACK_SPACE);    
			 
			    Thread.sleep(3000);

	  } 
	 
	 public void Filter_By_Location (String Filter_Data_1) throws InterruptedException  {
		  
		 Location_Filter.sendKeys(Filter_Data_1);
		 
		 Thread.sleep(5000);
		 		 
		 Location_Filter.sendKeys(Keys.ARROW_DOWN);

		 Location_Filter.sendKeys(Keys.ENTER);
			
		 Thread.sleep(5000);
		    
		 Location_Filter.sendKeys(Keys.CONTROL + "A");

		 Location_Filter.sendKeys(Keys.BACK_SPACE);
	    
	  } 
	 
	 public void Delete_Job () throws InterruptedException  {

		     Delete_Icon.click();
		 
		    Thread.sleep(3000);
		    
		    Confirm_Delete_Button.click();
		    
		    Thread.sleep(3000);

	  } 
	 

	 public void click_Trash () throws InterruptedException  {
		 
		    // Scroll into view before clicking
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", Trash);
		    
		    // Add a slight delay to ensure the element is visible
		    try {
		        Thread.sleep(1000); // 1 second
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }

		 Trash.click();
		 
		 Thread.sleep(3000);
		    
		 Deleted_Job.getText();
		 
		 System.out.println(Deleted_Job.getText());
		   
	  }

}
