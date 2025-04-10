package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.util.Iterator;
import java.util.Set;


public class Profile {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='email']")  WebElement  Email;
	
	@FindBy(xpath = "//input[@name='password']")  WebElement  Password;
	
	@FindBy(xpath = "//button[@type='submit']")	 WebElement  SubmitButton;

	// Locators for Toggle Button
	 @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div[1]/button") WebElement ToggleButtonOpen;
	 
	 @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/button") WebElement ToggleButtonClosed;

	 
/*	 private By usernameField = By.xpath("//input[@name='email']");
	 private By passwordField = By.xpath("//input[@name='password']");
	 private By loginButton = By.xpath("//button[@type='submit']");
	 private By ToggleButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/button");
*/
	 
	 @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div[2]/button") WebElement Notification;
	 
	 @FindBy(xpath="//p[@class='MuiTypography-root MuiTypography-body1 css-9259jl']") WebElement ClickrecentNotifixcation;
	 
	 @FindBy(xpath="//button[@id=':r3:']") WebElement ClearAll;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div/div") WebElement ClickonProfile;
	 
	 @FindBy(xpath="/html/body/div[3]/div[3]/ul/div[1]/li/a") WebElement CheckDashboard;
	 
	 @FindBy(xpath="//a[@href='https://www.reyan.co.in/about.php']") WebElement CheckAboutUs;
	 
	 @FindBy(xpath="//a[@href='https://www.reyan.co.in/contact-us.php']") WebElement CheckContactUs;
	 
	 @FindBy(xpath="//a[@href='/profile']") WebElement CheckProfileSection;
	 
	 @FindBy(xpath="/html/body/div[3]/div[3]/ul/div[6]/li") WebElement CheckLogout;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[2]/a/button") 
	 
	 WebElement Job_Posted;
	 	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div[2]/a/button") 
	 WebElement Pending_Applications;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[3]/div/div[2]/a/button") 
	 WebElement Accepted_Applications;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[4]/div/div[2]/a/button") 
	 WebElement Shortlisted_Applications;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/button") WebElement Latest_Candidate_Applications;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/a/button") WebElement Home;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/button[1]") WebElement About;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/button[2]") WebElement Edit_Profile;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/button[3]") WebElement Security;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[1]") WebElement Profile_Picture;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]") WebElement Email_Address;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[3]/div/form/div[1]/div[1]/div[2]/button") WebElement  Upload_Logo;

	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[3]/div/form/div[1]/div[1]/div[1]/button") WebElement  View_button_upload_Logo;
	 
	 @FindBy(xpath="//input[@name='jp_logo']") WebElement fileInput_Profile;

	 @FindBy(xpath="//input[@name='jp_cover_photo']") WebElement fileInput_Cover_photo;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[3]/div/form/div[1]/div[2]/div[2]/button") WebElement  Upload_Cover_Photo;

	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[3]/div/form/div[1]/div[2]/div[1]/button") WebElement View_button_Upload_Cover_Photo;
	 
	 @FindBy(xpath="//input[@name='jp_company_name']") WebElement Add_Company_Name;
	 
	 @FindBy(xpath="//input[@name='jp_cin']") WebElement CIN_No;
	 
	 @FindBy(xpath="//input[@name='jp_country']") WebElement Country;
	 
	 @FindBy(xpath="//input[@name='jp_state']") WebElement State;
	 
	 @FindBy(xpath="//input[contains(@class, 'MuiAutocomplete-input')]") WebElement City;
	 
	 @FindBy(xpath="//input[@name='jp_website']") WebElement Website_link;

	 @FindBy(xpath="//input[@name='jp_email']") WebElement Email_Id;

	 @FindBy(xpath="//input[@name='jp_contact_no']") WebElement Phone_Number;

	 @FindBy(xpath="//input[@name='jp_founded']") WebElement Foundation_Date;

	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[3]/div/form/div[5]/div[1]/div[2]/div/div/input") WebElement Industry;
	 
	 @FindBy(xpath="//input[@name='jp_social_media_links']") WebElement Social_Media;

	 @FindBy(xpath="//textarea[@name='jp_about_company']") WebElement Description;
     
	 @FindBy(xpath="//button[@type='submit']") WebElement Update_Button;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/p") WebElement About_Description;	              
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/p") WebElement About_Address;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/p") WebElement About_Email;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[3]/p") WebElement About_Website;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[4]/p") WebElement About_Phone;
	 
	 @FindBy(xpath="//input[@name='current_password']") WebElement Security_Current_Pass;
	 
	 @FindBy(xpath="//input[@name='new_password']") WebElement Security_New_Pass;
	 
	 @FindBy(xpath="//input[@name='confirm_password']") WebElement Security_Confirm_Pass;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[4]/form/div/button") WebElement Confirm_Button;
	 
	 @FindBy(xpath="/html/body/div[3]/div[3]/div/div[2]/button[1]") WebElement Cancel_Button;
	 
	 @FindBy(xpath="/html/body/div[3]/div[3]/div/div[2]/button[2]") WebElement Final_confirm_Button;

		 
	// Constructor to initialize elements
	 public Profile (WebDriver driver) {
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
    
        // Methods to verify ToogleButton
         public void ToggleButtonAction() throws InterruptedException {
        
        	 ToggleButtonOpen.click();
        	 
 	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	 
        	 ToggleButtonClosed.click();
         }
         
        public boolean CheckNotificationIconDisplayed() throws InterruptedException {
        	
        	return Notification.isDisplayed();
        	
        }
        
         public boolean CheckNotificationIconEnabled() throws InterruptedException {
        	
        	return Notification.isEnabled();
        
         }
         
         public void CheckNotificationIconClick() throws InterruptedException {
         
         Notification.click();
         }
         
         public void ClickonRecentNotifications() throws InterruptedException {
             
         ClickrecentNotifixcation.click();
        }
         
         public void ClickClearAllButton() throws InterruptedException {
             
         ClearAll.click();
         }
         
         public void SelectProfileIcon() throws InterruptedException {
             
         ClickonProfile.click();
                  
        }
         
         public void SelectDashboardicon() throws InterruptedException {
             
        CheckDashboard.click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         }
         
         public void SelectAboutUs() throws InterruptedException {
             
          CheckAboutUs.click();
             
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
              driver.switchTo().window(Child_Id01).close();
          }
           
          // Switch back to the parent window
          driver.switchTo().window(Parent_id01);
           
    
         }
         
         public void SelectContactUs() throws InterruptedException {
             
         CheckContactUs.click();
                
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
             driver.switchTo().window(Child_Id01).close();
         }
          
         // Switch back to the parent window
         driver.switchTo().window(Parent_id01);
               
        }
         
         public void SelectProfile() throws InterruptedException {
             
         CheckProfileSection.click();
                    
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                   
          }
         
          public void SelectLogoutIcon() throws InterruptedException {
             
          CheckLogout.click();
                        
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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
          
          public void Check_About_Tab() throws InterruptedException {
        	  
              // Verify if the About tab is displayed
              if (About.isDisplayed()) {
                  System.out.println("The About tab is displayed.");

                  // Verify if the tab is enabled
                  if (About.isEnabled()) {
                      System.out.println("The About tab is enabled.");
                      
                	  About.click();
                      
                  } else {
                      System.out.println("The About tab is not enabled.");
                  }
              } else {
                  System.out.println("The About tab is not displayed.");
              }
                                                               
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          }
          
          public void Check_Edit_Profile_Tab() throws InterruptedException {
        	  
              // Verify if the tab is displayed
              if (About.isDisplayed()) {
                  System.out.println("The Edit_Profile_Tab is displayed.");

                  // Verify if the tab is enabled
                  if (About.isEnabled()) {
                      System.out.println("The Edit_Profile_Tab is enabled.");
                      
                      Edit_Profile.click();
                      
                  } else {
                      System.out.println("The Edit_Profile_Tab is not enabled.");
                  }
              } else {
                  System.out.println("The Edit_Profile_Tab is not displayed.");
              }
                                                               
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          }
          
          public void Check_Security_Tab() throws InterruptedException {
        	  
              // Verify if the Security_Tab is displayed
              if (About.isDisplayed()) {
                  System.out.println("The Security_Tab is displayed.");

                  // Verify if the tab is enabled
                  if (About.isEnabled()) {
                      System.out.println("The Security_Tab is enabled.");
                      
                      Security.click();
                      
                  } else {
                      System.out.println("The Security_Tab is not enabled.");
                  }
              } else {
                  System.out.println("The Security_Tab is not displayed.");
              }
                                                               
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          }
          
          public void Check_Profile_Picture() throws InterruptedException {
        	  
        	  if (Profile_Picture.isDisplayed()) {
                  System.out.println("The Profile_Picture is displayed.");

              } else {
                  System.out.println("The Profile_Picture is not displayed.");
              }
                                                               
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	  
          }
          
          public void Upload_Profile(String ProfilePicfilePath) throws InterruptedException {
              
        	  fileInput_Profile.sendKeys(ProfilePicfilePath);                         
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        
               }
          
      public void Upload_CoverPhoto(String CoverPicfilePath) throws InterruptedException {
              
    	  fileInput_Cover_photo.sendKeys(CoverPicfilePath);
                         
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        
               }

         public void Check_Email_Address() throws InterruptedException {
        	  
          	  if (Email_Address.isDisplayed()) {
                  System.out.println("The Email_Address is displayed.");

              } else {
                  System.out.println("The Email_Address is not displayed.");
              }
                                                               
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	  
          }
         
         public boolean Check_Upload_Logo() throws InterruptedException {
       	  
        	       Upload_Logo.isDisplayed();
        	 
        	 return Upload_Logo.isEnabled();        
        
         }
              
         public boolean Check_View_button_upload_Logo() throws InterruptedException {
          	  
        	 View_button_upload_Logo.isDisplayed();
        	 
        	 return View_button_upload_Logo.isEnabled();
         }
         
         public boolean Check_Upload_Cover_Photo() throws InterruptedException {
         	 
        	 Upload_Cover_Photo.isDisplayed();
        	 
        	 return Upload_Cover_Photo.isEnabled();
        	        
         }
         
         public boolean Check_View_button_Upload_Cover_Photo() throws InterruptedException {
        	 
        	 View_button_Upload_Cover_Photo.isDisplayed();
        	 
        	 return View_button_Upload_Cover_Photo.isEnabled();
        	
         }
         
         public boolean Check_Company_Name_field() throws InterruptedException {
        	 
        	 Add_Company_Name.isDisplayed();
        	 
        	 return Add_Company_Name.isEnabled();
        	
         }
         
         public boolean Check_CIN_NO_field() throws InterruptedException {
        	 
        	 CIN_No.isDisplayed();
        	 
        	 return CIN_No.isEnabled();
        	
         }
        public boolean Check_Country_dropdown() throws InterruptedException {
	 
        	Country.isDisplayed();
	 
	     return Country.isEnabled();
	
        }
         public boolean Check_State_dropdown() throws InterruptedException {
	 
	   State.isDisplayed();
	 
	    return State.isEnabled();
	
       }
       public boolean Check_City_dropdown() throws InterruptedException {
	 
	   City.isDisplayed();
	 
	   return City.isEnabled();
	
        }
     public boolean Check_Website_field() throws InterruptedException {
	 
    	 Website_link.isDisplayed();
	 
	 return Website_link.isEnabled();
	
      }
       public boolean Check_Email_field() throws InterruptedException {
	 
    	   Email_Id.isDisplayed();
	 
	 return Email_Id.isEnabled();
	
     }
    public boolean Check_PhoneNo_field() throws InterruptedException {
	 
    	Phone_Number.isDisplayed();
	 
	 return Phone_Number.isEnabled();
	
      }
       public boolean Check_Foundation_Date_field() throws InterruptedException {
	 
    	   Foundation_Date.isDisplayed();
	 
	 return Foundation_Date.isEnabled();
	
      }
     public boolean Check_Industry_field() throws InterruptedException {
	 
    	 Social_Media.isDisplayed();
	 
	 return Social_Media.isEnabled();
	
      }
     public boolean Check_SocialMedia_field() throws InterruptedException {
	 
    	 Industry.isDisplayed();
	 
	 return Industry.isEnabled();
	
      }
       public boolean Check_Description_field() throws InterruptedException {
	 
    	   Description.isDisplayed();
	 
	 return Description.isEnabled();
	
      }
       public boolean Check_Update_Button() throws InterruptedException {
	 
    	   Update_Button.isDisplayed();
    	   
    		 Update_Button.click();
	 
	 return Update_Button.isEnabled();
	 
	
	
}
       public void Enter_Data(String AddCompanyName1, 
    		                  String CIN_Number1 ,
    		                  String City1, 
    		                  String State1,
    		                  String Country1,
    		                  String Website1,
    		                  String Email1,
    		                  String PhoneNo1,
    		                //  String FoundationDate1,
    		                  String Industry1,
    		                  String SocialMedia1,   		                 
    		                  String Description1
    		                  ) throws InterruptedException {
    	   
    	   Add_Company_Name.sendKeys(Keys.CONTROL + "A");
    	   
    	   Add_Company_Name.sendKeys(Keys.BACK_SPACE);
    	       	  
    	   Add_Company_Name.sendKeys(AddCompanyName1);
    	   
    	   CIN_No.sendKeys(Keys.CONTROL + "A");
    	   
    	   CIN_No.sendKeys(Keys.BACK_SPACE);
              
    	   CIN_No.sendKeys(CIN_Number1);
    	   
    	   Country.sendKeys(Keys.CONTROL + "A");
           
    	   Country.sendKeys(Keys.BACK_SPACE);  
    	   
    	   City.sendKeys(City1);
     	   
    	    City.sendKeys(Keys.ARROW_UP);
  	      
    	    City.sendKeys(Keys.TAB);
    	   
    /*	   Country.sendKeys(Keys.ARROW_UP);
 	      
 	      Country.sendKeys(Keys.ENTER);
    	   
 	     State.sendKeys(Keys.CONTROL + "A");
           
   	     State.sendKeys(Keys.BACK_SPACE);
    */	   
    	   State.sendKeys(State1);
    	   
    	   State.sendKeys(Keys.TAB);
     /*     
    	   State.sendKeys(Keys.ENTER);
    	   
    	   City.sendKeys(Keys.CONTROL + "A");
         
   	       City.sendKeys(Keys.BACK_SPACE);
     */	   
    	   Country.sendKeys(Country1);  
    	   
    	   State.sendKeys(Keys.TAB);
    /*	   
    	    Website_link.sendKeys(Keys.CONTROL + "A");
            
    	    Website_link.sendKeys(Keys.BACK_SPACE);
   */  
    	   Website_link.sendKeys(Website1);
    	   
    	   Email_Id.sendKeys(Keys.CONTROL + "A");
           
    	   Email_Id.sendKeys(Keys.BACK_SPACE);
   	    
    	   Email_Id.sendKeys(Email1);
    	   
    	   Phone_Number.sendKeys(Keys.CONTROL + "A");
           
    	   Phone_Number.sendKeys(Keys.BACK_SPACE);
    	   
    	   Phone_Number.sendKeys(PhoneNo1);
    	   
    	//   Foundation_Date.click();
    	   
    	//   Foundation_Date.sendKeys(Keys.CONTROL + "A");
           
         //  Foundation_Date.sendKeys(Keys.BACK_SPACE);
           
        //   Foundation_Date.click();
           
           Thread.sleep(3000);
           
    	//   Foundation_Date.sendKeys(FoundationDate1);
    	   
           Industry.sendKeys(Keys.CONTROL + "A");
           
    	   Industry.sendKeys(Keys.BACK_SPACE);
    	   
    	   Industry.sendKeys(Industry1);
    	   
    	   Social_Media.sendKeys(Keys.CONTROL + "A");
           
    	   Social_Media.sendKeys(Keys.BACK_SPACE);
    	   
    	   Social_Media.sendKeys(SocialMedia1);
    	   
    	   Description.sendKeys(Keys.CONTROL + "A");
           
           Description.sendKeys(Keys.BACK_SPACE);
    	   
    	   Description.sendKeys(Description1);
    	   
    	 
       }
       
       public void send_Foundation_Date () throws InterruptedException {
    	    
       	   Foundation_Date.click();
    	   
       	   Foundation_Date.sendKeys(Keys.CONTROL + "A");
              
              Foundation_Date.sendKeys(Keys.BACK_SPACE);
              
             Foundation_Date.click();
              
              Thread.sleep(3000);
              
       	   Foundation_Date.sendKeys("11101995");
}      
       
       public void Check_Update_Button_1() throws InterruptedException {
    
    		 Update_Button.click();	
}

      public void Check_About_Description() throws InterruptedException {

    	  About_Description.isDisplayed();
    	  
    	  About_Description.getText();
}
      public void Check_About_Address() throws InterruptedException {

    	  About_Address.isDisplayed();
    	  
    	  About_Address.getText();
}
      
      public void Check_About_Email() throws InterruptedException {

    	  About_Email.isDisplayed();
    	  
    	  About_Email.getText();
}
      
      public void Check_About_Website() throws InterruptedException {

    	  About_Website.isDisplayed();
    	  
    	  About_Website.getText();
}
      
      public void Check_About_Phone_No() throws InterruptedException {

    	  About_Phone.isDisplayed();
    	  
    	  About_Phone.getText();
       
      }
      
      public void Click_on_Security() throws InterruptedException {

    	  Security.click();
	   	       
      }      
      
      public boolean Check_Security_Current_Pass() throws InterruptedException {

    	  Security_Current_Pass.isEnabled();
		return Security_Current_Pass.isDisplayed();
	   	       
      }      
      
      public boolean Check_Security_New_Pass() throws InterruptedException {

    	  Security_New_Pass.isEnabled();
		return Security_New_Pass.isDisplayed();
	   	       
      }  

      public boolean Check_Security_Confirm_Pass() throws InterruptedException {

    	  Security_Confirm_Pass.isEnabled();
		return Security_Confirm_Pass.isDisplayed();
	   	       
      }  
      
      public boolean Check_Security_Confirm_Button() throws InterruptedException {

    	  Confirm_Button.isEnabled();
		return Confirm_Button.isDisplayed();
	   	       
      }  
      
      public void Update_Password(String Current_Password, 
              String New_Password,
              String Confirm_Password) throws InterruptedException {
    	  
   	       	  
    	  Security_Current_Pass.sendKeys(Current_Password);
    	  
    	  Security_New_Pass.sendKeys(New_Password);
    	  
    	  Security_Confirm_Pass.sendKeys(Confirm_Password);
   	   
      }
      
      public void Check_Cancel_Button() throws InterruptedException {

    	  Cancel_Button.click();	   	       
      } 
      
      public void Check_Final_Confirm_Button() throws InterruptedException {

    	 Final_confirm_Button.click();
  	       
      }  
   }

   