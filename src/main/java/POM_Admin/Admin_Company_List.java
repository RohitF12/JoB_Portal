package POM_Admin;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.Closed_Tab;

public class Admin_Company_List {
	
		public WebDriver driver;
		public Closed_Tab windowUtil;
			
		@FindBy(xpath = "//input[@name='email']")  WebElement  Email_Admin;
			
		@FindBy(xpath = "//input[@name='password']")  WebElement  Password_Admin;
		
		@FindBy(xpath = "//button[@type='submit']")	 WebElement  SubmitButton_Admin;
			
		@FindBy(xpath = "//h3[@class='MuiBox-root css-13wauj2']") WebElement  Company_List_title;
	  
		@FindBy(xpath = "//a[@href='/company/listings/sa']") WebElement  Company_List;
		
		@FindBy(xpath = "//button[contains(@class,'MuiIconButton-sizeMedium css-adjfm3')]") WebElement  hamburger_menu;

		@FindBy(xpath = "//input[contains(@class,'MuiInputBase-inputAdornedStart css-1gmu8xx')]") WebElement  Search_Bar;

		@FindBy(xpath = "//th[text()='Company']") WebElement  Column_1;
			
		@FindBy(xpath = "//th[text()='State']") WebElement  Column_2;
			
		@FindBy(xpath = "//th[text()='Industry']") WebElement  Column_3;
			
		@FindBy(xpath = "//th[text()='Email']") WebElement  Column_4;
			
		@FindBy(xpath = "//th[text()='View']") WebElement  Column_5;
			
		@FindBy(xpath = "//th[text()='Edit']") WebElement  Column_6;
		
		@FindBy(xpath = "//th[text()='Delete']") WebElement  Column_7;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[5]/button") WebElement  View_Button;

		@FindBy(xpath = "//button[@aria-label='close']") WebElement  view_Cross_Button;
		
		@FindBy(xpath = "//img[contains(@class, 'MuiAvatar-img')]") WebElement  Profile_Image;
	
		@FindBy(xpath = "//img[contains(@class, 'MuiCardMedia-img css-rhsghg')]") WebElement  Cover_Image;

		@FindBy(xpath = "//p[contains(@class, 'MuiTypography-root MuiTypography-body1 css-qgagwn')]") WebElement  Company_Name;

		@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div[1]/div[2]/span[2]") WebElement  Foundation_Date;

		@FindBy(xpath = "//p[contains(@class, 'MuiTypography-root MuiTypography-body2 css-1nkubbr')]") WebElement  About;

		@FindBy(xpath = "//p[contains(@class, 'MuiTypography-root MuiTypography-body1 css-1729mly')]") WebElement  Email;

		@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div[2]/div[2]/div[2]/p") WebElement  Address;

		@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div[2]/div[2]/div[3]/p") WebElement  Website;
		
		@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div[2]/div[2]/div[4]/p") WebElement  Number;
		
		@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[6]/button") WebElement  Edit_Button;

		@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/form/div[1]/div[1]/div[2]") WebElement Logo_Displayed;
		   
		@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]") WebElement Cover_Photo_Displayed;
		
		@FindBy(xpath = "//input[@name='jp_logo']") WebElement Logo;
	   
		@FindBy(xpath = "//input[@name='jp_cover_photo']") WebElement Cover_Photo;
		
		@FindBy(xpath = "//input[@name='jp_company_name']") WebElement Company_Name_field;

		@FindBy(xpath = "//input[@name='jp_cin']") WebElement CIN_Number_field;

		@FindBy(xpath = "//input[@name='jp_is_verified' and @value='1']") WebElement Verified;

		@FindBy(xpath = "//input[@name='jp_is_verified' and @value='0']") WebElement UnVerified;

		@FindBy(xpath = "//label[text()='City *']/following-sibling::div//input") WebElement City_field;

		@FindBy(xpath = "//input[@name='jp_state']") WebElement State_field;

		@FindBy(xpath = "//input[@name='jp_country']") WebElement Country_field;

		@FindBy(xpath = "//input[@name='jp_website']") WebElement Website_field;

		@FindBy(xpath = "//input[@name='jp_email']") WebElement Email_Name_field;

		@FindBy(xpath = "//input[@name='jp_contact_no']") WebElement Phone_Number_field;

		@FindBy(xpath = "//input[@name='jp_founded']") WebElement Foundation_Date_Field;

		@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/form/div[5]/div[1]/div[2]/div/div/input") WebElement Indutry_field;

		@FindBy(xpath = "//input[@name='jp_social_media_links']") WebElement Social_Media_field;
		
		@FindBy(xpath = "//textarea[@name='jp_about_company']") WebElement Description_field;

		@FindBy(xpath = "//button[span[text()='Update']]") WebElement Update_Button;

		@FindBy(xpath = "//button[@aria-label='Close']") WebElement Close_Icon;
		
		@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/table/tbody/tr/td[7]/button") WebElement delete_Icon;

		@FindBy(xpath = "//button[contains(@class, 'MuiButton-colorPrimary css-p26qxd')]") WebElement delete_button;
		
		@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[1]") WebElement  Row_Per_Page_5;
		
		@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[2]") WebElement  Row_Per_Page_10;

		@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[3]") WebElement  Row_Per_Page_20;
		
		@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[4]") WebElement  Row_Per_Page_25;
		
		@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/div[2]/div") WebElement  Row_Per_Page;
		
		@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div[1]/div[5]/a/button") WebElement  Trash;

		
		public Admin_Company_List(WebDriver driver) {
		    this.driver = driver;
		    PageFactory.initElements(driver, this);
		}


	  //Methods to interact with the elements
	   public void enterUsername(String username_Admin) {

		   Email_Admin.sendKeys(username_Admin);
	  }

	  public void enterPassword(String password_Admin) {
		Password_Admin.sendKeys(password_Admin);
	   }

	   public void clickLogin() {
		SubmitButton_Admin.click();
	  }

	   public void Click_on_Company_List_page() throws InterruptedException {
		   
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));   
			    
			// Correct way to wait for an existing WebElement
			 wait.until(ExpectedConditions.visibilityOf(Company_List));

			 Company_List.click();

		   }

		   public boolean Check_Page_Name_displayed () throws InterruptedException {

			   Company_List_title.getText();
			
		   return Company_List_title.isDisplayed();
		   } 

		     public String Check_Page_Name () throws InterruptedException {

		     return Company_List_title.getText();
		} 
		   public void Scroll_down2_Add_Company () throws InterruptedException {
			   
		   //scroll to middle with Javascript Executor
		   JavascriptExecutor j = (JavascriptExecutor) driver;
		   j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", Company_List);
		   System.out.println("Text is: " + Company_List.getText()); 

		   }
		   
		   public void Click_on_hamburger_menu() throws InterruptedException {

			    hamburger_menu.click();  // First click on the menu
			    
			    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));   
			    
			    // Correct way to wait for an existing WebElement
			    wait.until(ExpectedConditions.visibilityOf(hamburger_menu));
			    
			    // Now interact with the element again if needed
			    hamburger_menu.click(); // or hamburger_menu.getText();
			
		   }
		   
		   public boolean Check_Search_Bar () throws InterruptedException {
				
			   Search_Bar.isEnabled();
			    	
				return Search_Bar.isDisplayed();
			
			    }

		    public void Enter_Company_1_in_Search_Bar (String Search_Compnay_1) {
		    	
		    	Search_Bar.sendKeys(Search_Compnay_1);
		    	
		    }
		    
		    public void Enter_Company_2_in_Search_Bar (String Search_Compnay_2) {
		    	
		    	Search_Bar.sendKeys(Search_Compnay_2);
		    	
		    }
		    		                               
		   public void Enter_Company_3_in_Search_Bar (String Search_Compnay_3) {
		    	
			   Search_Bar.sendKeys(Search_Compnay_3);
		    	
		    }
		   public void Enter_Company_4_in_Search_Bar (String Search_Compnay_4) {
		   	
			   Search_Bar.sendKeys(Search_Compnay_4);
		   	
		   }
		   
		   public void Enter_Company_5_in_Search_Bar (String Search_Compnay_5) {
			   	
			   Search_Bar.sendKeys(Search_Compnay_5);
			   	
			   }
		   public void Clear_Search_Bar () throws InterruptedException {
				   
			   //Search_Bar.clear();
			   
			   Search_Bar.click();
			   
			   Search_Bar.sendKeys(Keys.CONTROL + "A");

			   Search_Bar.sendKeys(Keys.BACK_SPACE);
			   
		       
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
		   
	    public void View_Button () throws InterruptedException {
		    			       
			View_Button.click();
			
			Thread.sleep(3000);
		
			view_Cross_Button.click();
			
		 }	
	    
	    public void Only_View_Button () throws InterruptedException {
		       
			View_Button.click();
			
			Thread.sleep(3000);
			
		 }
	    
	    public void Check_Page_Details () throws InterruptedException {
		       			
			if (Profile_Image.isDisplayed()) {
				
			    System.out.println("Profile Image is displayed");
			    
			} else {	
			    System.out.println("Profile image is not displayed");
			}
	
			
			if (Cover_Image.isDisplayed()) {
				
			    System.out.println("Cover_Image Image is displayed");
			    
			} else {	
			    System.out.println("Cover_Image is not displayed");
			}
	    }
			public String Data_check_Company_Name() throws InterruptedException {
			    
			    String companyText = Company_Name.getText(); // Get the text from the element
			    
			    if (!companyText.isEmpty()) { // Check if the text is not empty
			        System.out.println("Company_Name Image is displayed: " + companyText);
			    } else {
			        System.out.println("Company_Name is not displayed");
			    }
			    
			    return companyText; // Returning the text if needed
			}
			
            public String Data_About() throws InterruptedException {
			    
			    String About_Text = About.getText(); // Get the text from the element
			    
			    if (!About_Text.isEmpty()) { // Check if the text is not empty
			        System.out.println("About Image is displayed: " + About_Text);
			    } else {
			        System.out.println("About is not displayed");
			    }
			    
			    return About_Text; // Returning the text if needed
			}	
			
             public String Data_Foundation_Date() throws InterruptedException {
			    
			    String Foundation_Date_Text = Foundation_Date.getText(); // Get the text from the element
			    
			    if (!Foundation_Date_Text.isEmpty()) { // Check if the text is not empty
			        System.out.println("Foundation_Date Image is displayed: " + Foundation_Date_Text);
			    } else {
			        System.out.println("Foundation_Date is not displayed");
			    }
			    
			    return Foundation_Date_Text; // Returning the text if needed
			}
	
             public String Email_Text() throws InterruptedException {
 			    
 			    String EmailText = Email.getText(); // Get the text from the element
 			    
 			    if (!EmailText.isEmpty()) { // Check if the text is not empty
 			        System.out.println("Email Image is displayed: " + EmailText);
 			    } else {
 			        System.out.println("Email is not displayed");
 			    }
 			    
 			    return EmailText; // Returning the text if needed
 			}
             
             public String Data_Address() throws InterruptedException {
  			    
  			    String AddressText = Address.getText(); // Get the text from the element
  			    
  			    if (!AddressText.isEmpty()) { // Check if the text is not empty
  			        System.out.println("AddressText Image is displayed: " + AddressText);
  			    } else {
  			        System.out.println("AddressText is not displayed");
  			    }
  			    
  			    return AddressText; // Returning the text if needed
  			}
             
             public String Data_Website() throws InterruptedException {
  			    
  			    String WebsiteText = Website.getText(); // Get the text from the element
  			    
  			    if (!WebsiteText.isEmpty()) { // Check if the text is not empty
  			        System.out.println("WebsiteText Image is displayed: " + WebsiteText);
  			    } else {
  			        System.out.println("WebsiteText is not displayed");
  			    }
  			    
  			    return WebsiteText; // Returning the text if needed
  			}
             
             public String Data_Number() throws InterruptedException {
            	 
                 // Scroll into view before clicking
                 JavascriptExecutor js = (JavascriptExecutor) driver;
                 js.executeScript("arguments[0].scrollIntoView(true);", Number);
            	          	 
  			    String NumberText = Number.getText(); // Get the text from the element
  			    
  			    if (!NumberText.isEmpty()) { // Check if the text is not empty
  			        System.out.println("NumberText Image is displayed: " + NumberText);
  			    } else {
  			        System.out.println("NumberText is not displayed");
  			    }
  			    
  			    return NumberText; // Returning the text if needed
  			}
			
             public void Closed_button() throws InterruptedException {
   			    
            	 view_Cross_Button.click();   			   
   			}
             
             
             public void Edit_Button_() throws InterruptedException {
    			    
            	 Edit_Button.click();             
             
      }
             
      public void Check_Logo() throws InterruptedException {
            	   
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));   
            	 	    
      // Correct way to wait for an existing WebElement
      wait.until(ExpectedConditions.visibilityOf(Logo_Displayed)); 	

      Assert.assertTrue(Logo_Displayed.isDisplayed(), "Element is NOT displayed on the page.");
            	    
      Assert.assertTrue(Logo_Displayed.isEnabled(), "Element is NOT Enabled on the page.");

       }
            	   
       public void Check_Cover_Photo() throws InterruptedException {

       Assert.assertTrue(Cover_Photo_Displayed.isDisplayed(), "Element is NOT displayed on the page.");
            		    
       Assert.assertTrue(Cover_Photo_Displayed.isEnabled(), "Element is NOT Enabled on the page.");

        }
            	   
            	   
      public void Check_Company_name() throws InterruptedException {
            		   
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));   
            	 	    
            		 	// Correct way to wait for an existing WebElement
      wait.until(ExpectedConditions.visibilityOf(Company_Name_field));

      Assert.assertTrue(Company_Name_field.isDisplayed(), "Element is NOT displayed on the page.");
            		    
      Assert.assertTrue(Company_Name_field.isEnabled(), "Element is NOT Enabled on the page.");

      }
            	   
       public void Check_CIN_Number() throws InterruptedException {

       Assert.assertTrue(CIN_Number_field.isDisplayed(), "Element is NOT displayed on the page.");
            		    
       Assert.assertTrue(CIN_Number_field.isEnabled(), "Element is NOT Enabled on the page.");

       }
            	   public void Check_radio_button_verified() throws InterruptedException {

            		   Assert.assertTrue(Verified.isDisplayed(), "Element is NOT displayed on the page.");
            		    
            		   Assert.assertTrue(Verified.isEnabled(), "Element is NOT Enabled on the page.");

            	   }
            	   public void Check_radio_button_Unverified() throws InterruptedException {

            		   Assert.assertTrue(UnVerified.isDisplayed(), "Element is NOT displayed on the page.");
            		    
            		   Assert.assertTrue(UnVerified.isEnabled(), "Element is NOT Enabled on the page.");

            	   }
            	   public void Check_City() throws InterruptedException {

            		   Assert.assertTrue(City_field.isDisplayed(), "Element is NOT displayed on the page.");
            		    
            		   Assert.assertTrue(City_field.isEnabled(), "Element is NOT Enabled on the page.");

            	   }
            	   public void Check_State() throws InterruptedException {

            		   Assert.assertTrue(State_field.isDisplayed(), "Element is NOT displayed on the page.");
            		    
            		   Assert.assertTrue(State_field.isEnabled(), "Element is NOT Enabled on the page.");

            	   }
            	   public void Check_Country() throws InterruptedException {

            		   Assert.assertTrue(Country_field.isDisplayed(), "Element is NOT displayed on the page.");
            		    
            		   Assert.assertTrue(Country_field.isEnabled(), "Element is NOT Enabled on the page.");

            	   }
            	   public void Check_Website() throws InterruptedException {

            		   Assert.assertTrue(Website_field.isDisplayed(), "Element is NOT displayed on the page.");
            		    
            		   Assert.assertTrue(Website_field.isEnabled(), "Element is NOT Enabled on the page.");

            	   }
            	   public void Check_Emial() throws InterruptedException {

            		   Assert.assertTrue(Email_Name_field.isDisplayed(), "Element is NOT displayed on the page.");
            		    
            		   Assert.assertTrue(Email_Name_field.isEnabled(), "Element is NOT Enabled on the page.");

            	   }
            	   public void Check_PhoneNumber() throws InterruptedException {

            		   Assert.assertTrue(Phone_Number_field.isDisplayed(), "Element is NOT displayed on the page.");
            		    
            		   Assert.assertTrue(Phone_Number_field.isEnabled(), "Element is NOT Enabled on the page.");

            	   }
            	   public void Check_Foundation_Date() throws InterruptedException {

            		   Assert.assertTrue(Foundation_Date_Field.isDisplayed(), "Element is NOT displayed on the page.");
            		    
            		   Assert.assertTrue(Foundation_Date_Field.isEnabled(), "Element is NOT Enabled on the page.");

            	   }
            	   public void Check_Industry() throws InterruptedException {

            	         // Scroll into view before clicking
                       JavascriptExecutor js = (JavascriptExecutor) driver;
                       js.executeScript("arguments[0].scrollIntoView(true);", Indutry_field);	
            		   
            		   Assert.assertTrue(Indutry_field.isDisplayed(), "Element is NOT displayed on the page.");
            		    
            		   Assert.assertTrue(Indutry_field.isEnabled(), "Element is NOT Enabled on the page.");

            	   }
            	   public void Check_SocialMedia() throws InterruptedException {

            		   Assert.assertTrue(Social_Media_field.isDisplayed(), "Element is NOT displayed on the page.");
            		    
            		   Assert.assertTrue(Social_Media_field.isEnabled(), "Element is NOT Enabled on the page.");

            	   }
            	   public void Check_Description() throws InterruptedException {

            		   Assert.assertTrue(Description_field.isDisplayed(), "Element is NOT displayed on the page.");
            		    
            		   Assert.assertTrue(Description_field.isEnabled(), "Element is NOT Enabled on the page.");

            	   }
                      public void Check_Update_Button() throws InterruptedException {

            		   Assert.assertTrue(Update_Button.isDisplayed(), "Element is NOT displayed on the page.");
            		    
            		   Assert.assertTrue(Update_Button.isEnabled(), "Element is NOT Enabled on the page.");

            	   }
  
         public void Clicked_Closed_Icon () throws InterruptedException {

         Assert.assertTrue(Close_Icon.isDisplayed(), "Element is NOT displayed on the page.");
               		    
         Assert.assertTrue(Close_Icon.isEnabled(), "Element is NOT Enabled on the page.");

               	   }              
         	
         public void Clicked_Cross_Icon () throws InterruptedException {

           

                   	   }  
         public void Click_Update_button() {
             // Scroll into view before clicking
             JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("arguments[0].scrollIntoView(true);", Update_Button);
             
             // Add a slight delay to ensure the element is visible
             try {
                 Thread.sleep(1000); // 1 second
             } catch (InterruptedException e) {
             }

             // Click the button
             Update_Button.click();
         }

         public void Update_City (String Data_Change_1) throws InterruptedException {
          	
        	 City_field.sendKeys(Keys.CONTROL + "A");

        	 City_field.sendKeys(Keys.BACK_SPACE);
          	
        	 City_field.click();
        	 
        	 City_field.sendKeys(Data_Change_1);
          	
          	Thread.sleep(3000);
          				    	
          	}
         	
         public void Update_State (String Data_Change_2) throws InterruptedException {
         	
        	State_field.sendKeys(Keys.CONTROL + "A");

        	State_field.sendKeys(Keys.BACK_SPACE);
         	
        	State_field.click();
         		
         	State_field.sendKeys(Data_Change_2);
         	
            Thread.sleep(4000);
         			    	
          }
         
         public void Update_Phone_Number (String Data_Change_1) throws InterruptedException {
          	
        	 Phone_Number_field.sendKeys(Keys.CONTROL + "A");

        	 Phone_Number_field.sendKeys(Keys.BACK_SPACE);
         	
        	 Phone_Number_field.click();
         		
        	 Phone_Number_field.sendKeys(Data_Change_1);
         	
            Thread.sleep(4000);
         			    	
          }
         
         public void Update_Industry_Number (String Data_Change_2) throws InterruptedException {
          	
        	 Indutry_field.sendKeys(Keys.CONTROL + "A");

        	 Indutry_field.sendKeys(Keys.BACK_SPACE);
         	
        	 Indutry_field.click();
         		
        	 Indutry_field.sendKeys(Data_Change_2);
         	
             Thread.sleep(4000);
         			    	
          }
         
         public void Click_radio_button_Unverified() throws InterruptedException {

        	 UnVerified.click();

  	   }
         
         public void Click_delete_button() throws InterruptedException {

        	 delete_Icon.click();
        	 
        	 delete_button.click();

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
     	    
//     	 Deleted_Job.getText();
//     	 
//     	 System.out.println(Deleted_Job.getText());
//     	   
       }    
       	    
       	    
       	    
          }


