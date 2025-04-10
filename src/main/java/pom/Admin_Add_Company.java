package pom;

import java.time.Duration;

import org.openqa.selenium.By;
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

public class Admin_Add_Company {
	public WebDriver driver;
	public Closed_Tab windowUtil;
		
	@FindBy(xpath = "//input[@name='email']")  WebElement  Email_Admin;
		
	@FindBy(xpath = "//input[@name='password']")  WebElement  Password_Admin;
	
	@FindBy(xpath = "//button[@type='submit']")	 WebElement  SubmitButton_Admin;
		
	@FindBy(xpath = "//h3[@class='MuiBox-root css-13wauj2']") WebElement  Add_company_page_title;
  
	@FindBy(xpath = "//a[@href='/company/addCompany']") WebElement  Add_Company;
	
	@FindBy(xpath = "//button[contains(@class,'MuiIconButton-sizeMedium css-adjfm3')]") WebElement  hamburger_menu;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/form/div[1]/div[1]/div[2]") WebElement Logo_Displayed;
	   
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]") WebElement Cover_Photo_Displayed;
	
	@FindBy(xpath = "//input[@name='jp_logo']") WebElement Logo;
   
	@FindBy(xpath = "//input[@name='jp_cover_photo']") WebElement Cover_Photo;
	
	@FindBy(xpath = "//input[@name='jp_company_name']") WebElement Company_Name;

	@FindBy(xpath = "//input[@name='jp_cin']") WebElement CIN_Number;

	@FindBy(xpath = "//input[@name='jp_is_verified' and @value='1']") WebElement Verified;

	@FindBy(xpath = "//input[@name='jp_is_verified' and @value='0']") WebElement UnVerified;

	@FindBy(xpath = "//label[text()='City *']/following-sibling::div//input") WebElement City;

	@FindBy(xpath = "//input[@name='jp_state']") WebElement State;

	@FindBy(xpath = "//input[@name='jp_country']") WebElement Country;

	@FindBy(xpath = "//input[@name='jp_website']") WebElement Website;

	@FindBy(xpath = "//input[@name='jp_email']") WebElement Email_Name;

	@FindBy(xpath = "//input[@name='jp_contact_no']") WebElement Phone_Number;

	@FindBy(xpath = "//input[@name='jp_founded']") WebElement Foundation_Date;

	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedStart MuiAutocomplete-input MuiAutocomplete-inputFocused css-g6az5p']") WebElement Indutry;

	@FindBy(xpath = "//input[@name='jp_social_media_links']") WebElement Social_Media;
	
	@FindBy(xpath = "//textarea[@name='jp_about_company']") WebElement Description;

	@FindBy(xpath = "//button[span[text()='Add']]") WebElement Add_Button;



	public Admin_Add_Company(WebDriver driver) {
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
    
   public void Click_on_Add_Company_page() throws InterruptedException {
	   
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));   
	    
	// Correct way to wait for an existing WebElement
	 wait.until(ExpectedConditions.visibilityOf(Add_Company));

	  Add_Company.click();

   }

   public boolean Check_Page_Name_displayed () throws InterruptedException {

	   Add_company_page_title.getText();
	
   return Add_company_page_title.isDisplayed();
   } 

     public String Check_Page_Name () throws InterruptedException {

     return Add_company_page_title.getText();
} 
   public void Scroll_down2_Add_Company () throws InterruptedException {
	   
   //scroll to middle with Javascript Executor
   JavascriptExecutor j = (JavascriptExecutor) driver;
   j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", Add_Company);
   System.out.println("Text is: " + Add_Company.getText()); 

   }
   public void Click_on_hamburger_menu() throws InterruptedException {

	    hamburger_menu.click();  // First click on the menu
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));   
	    
	    // Correct way to wait for an existing WebElement
	    wait.until(ExpectedConditions.visibilityOf(hamburger_menu));
	    
	    // Now interact with the element again if needed
	    hamburger_menu.click(); // or hamburger_menu.getText();
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
	 	wait.until(ExpectedConditions.visibilityOf(Company_Name));

	   Assert.assertTrue(Company_Name.isDisplayed(), "Element is NOT displayed on the page.");
	    
	   Assert.assertTrue(Company_Name.isEnabled(), "Element is NOT Enabled on the page.");

   }
   
   public void Check_CIN_Number() throws InterruptedException {

	   Assert.assertTrue(CIN_Number.isDisplayed(), "Element is NOT displayed on the page.");
	    
	   Assert.assertTrue(CIN_Number.isEnabled(), "Element is NOT Enabled on the page.");

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

	   Assert.assertTrue(City.isDisplayed(), "Element is NOT displayed on the page.");
	    
	   Assert.assertTrue(City.isEnabled(), "Element is NOT Enabled on the page.");

   }
   public void Check_State() throws InterruptedException {

	   Assert.assertTrue(State.isDisplayed(), "Element is NOT displayed on the page.");
	    
	   Assert.assertTrue(State.isEnabled(), "Element is NOT Enabled on the page.");

   }
   public void Check_Country() throws InterruptedException {

	   Assert.assertTrue(Country.isDisplayed(), "Element is NOT displayed on the page.");
	    
	   Assert.assertTrue(Country.isEnabled(), "Element is NOT Enabled on the page.");

   }
   public void Check_Website() throws InterruptedException {

	   Assert.assertTrue(Website.isDisplayed(), "Element is NOT displayed on the page.");
	    
	   Assert.assertTrue(Website.isEnabled(), "Element is NOT Enabled on the page.");

   }
   public void Check_Emial() throws InterruptedException {

	   Assert.assertTrue(Email_Name.isDisplayed(), "Element is NOT displayed on the page.");
	    
	   Assert.assertTrue(Email_Name.isEnabled(), "Element is NOT Enabled on the page.");

   }
   public void Check_PhoneNumber() throws InterruptedException {

	   Assert.assertTrue(Phone_Number.isDisplayed(), "Element is NOT displayed on the page.");
	    
	   Assert.assertTrue(Phone_Number.isEnabled(), "Element is NOT Enabled on the page.");

   }
   public void Check_Foundation_Date() throws InterruptedException {

	   Assert.assertTrue(Foundation_Date.isDisplayed(), "Element is NOT displayed on the page.");
	    
	   Assert.assertTrue(Foundation_Date.isEnabled(), "Element is NOT Enabled on the page.");

   }
   public void Check_Industry() throws InterruptedException {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));   
 	    
	 	// Correct way to wait for an existing WebElement
	 	wait.until(ExpectedConditions.visibilityOf(Indutry)); 	
	   
	   Assert.assertTrue(Indutry.isDisplayed(), "Element is NOT displayed on the page.");
	    
	   Assert.assertTrue(Indutry.isEnabled(), "Element is NOT Enabled on the page.");

   }
   public void Check_SocialMedia() throws InterruptedException {

	   Assert.assertTrue(Social_Media.isDisplayed(), "Element is NOT displayed on the page.");
	    
	   Assert.assertTrue(Social_Media.isEnabled(), "Element is NOT Enabled on the page.");

   }
   public void Check_Description() throws InterruptedException {

	   Assert.assertTrue(Description.isDisplayed(), "Element is NOT displayed on the page.");
	    
	   Assert.assertTrue(Description.isEnabled(), "Element is NOT Enabled on the page.");

   }
   public void Check_Add_button() throws InterruptedException {

	   Assert.assertTrue(Add_Button.isDisplayed(), "Element is NOT displayed on the page.");
	    
	   Assert.assertTrue(Add_Button.isEnabled(), "Element is NOT Enabled on the page.");

   }
  
   public void Upload_Logo(String filePath_photo_1) throws InterruptedException {

	   // Send the file path to the file input element
	   Logo.sendKeys("filePath_photo_1");
              
	   if (Logo.isDisplayed()) {  	  
            	  
           System.out.println("Photo File upload test passed!");
       } else {
           System.out.println("Photo File upload test failed!");
       }
       
   } 
   public void Upload_Cover_Photo(String filePath_Cover_photo_1) throws InterruptedException {

      // Send the file path to the file input element
	   Cover_Photo.sendKeys("filePath_Cover_photo_1");
	   
      if (Cover_Photo.isDisplayed()) {
          System.out.println("Cover Photo upload test passed!");
      } else {
          System.out.println("Cover Photo upload test failed!");
      }
       
       
          }
   
   public void Add_company_Data(String Upload_Logo, 
	        String Upload_Cover,
	        String Company_Name_EData,
	        String CIN_Number_EData,
	        String City_EData,
	        String State_EData,
	        String Country_EData,
	        String Website_EData,
	        String Email_EData,
	        String Phone_Number_EData,
	       // String Foundation_Date_EData,   		                 
	        String Industry_EData,
	        String Social_Media_EData,
	        String Description_EData) throws InterruptedException {
		
	   Logo.sendKeys(Upload_Logo);
	   
	   Cover_Photo.sendKeys(Upload_Cover);
		
		Thread.sleep(3000);
		
		Company_Name.sendKeys(Company_Name_EData);
		
		CIN_Number.sendKeys(CIN_Number_EData);
		
		Verified.click();
		
		City.sendKeys(City_EData);
		
		State.sendKeys(State_EData);

		Country.sendKeys(Country_EData);

		Website.sendKeys(Website_EData);

	    Email_Name.sendKeys(Email_EData);

		Phone_Number.sendKeys(Phone_Number_EData);

	//	Foundation_Date.sendKeys(Foundation_Date_EData);

		Indutry.sendKeys(Industry_EData);

		Social_Media.sendKeys(Social_Media_EData);
		
		Description.sendKeys(Description_EData);

	}
  
   public void Click_on_Add_button() throws InterruptedException {

	   Add_Button.click();
	       
	          }
   
   public void Foundation_Date_1 (String Foundation_Date_Company_1) throws InterruptedException {
		
	   Foundation_Date.sendKeys(Keys.CONTROL + "A");

	   Foundation_Date.sendKeys(Keys.BACK_SPACE);
		
	   Foundation_Date.click();
		
		Thread.sleep(3000);
		
		Foundation_Date.sendKeys(Foundation_Date_Company_1);
			
				    	
		}
   public void Foundation_Date_2 (String Foundation_Date_Company_2) throws InterruptedException {
		
	   Foundation_Date.sendKeys(Keys.CONTROL + "A");

	   Foundation_Date.sendKeys(Keys.BACK_SPACE);
		
	   Foundation_Date.click();
		
		Thread.sleep(3000);
		
		Foundation_Date.sendKeys(Foundation_Date_Company_2);
			
				    	
		}
   public void Foundation_Date_3 (String Foundation_Date_Company_3) throws InterruptedException {
		
	   Foundation_Date.sendKeys(Keys.CONTROL + "A");

	   Foundation_Date.sendKeys(Keys.BACK_SPACE);
		
	   Foundation_Date.click();
		
		Thread.sleep(3000);
		
		Foundation_Date.sendKeys(Foundation_Date_Company_3);
			
				    	
		}
   public void Foundation_Date_4 (String Foundation_Date_Company_4) throws InterruptedException {
		
	   Foundation_Date.sendKeys(Keys.CONTROL + "A");

	   Foundation_Date.sendKeys(Keys.BACK_SPACE);
		
	   Foundation_Date.click();
		
		Thread.sleep(3000);
		
		Foundation_Date.sendKeys(Foundation_Date_Company_4);
			
				    	
		}
   public void Foundation_Date_5 (String Foundation_Date_Company_5) throws InterruptedException {
		
	   Foundation_Date.sendKeys(Keys.CONTROL + "A");

	   Foundation_Date.sendKeys(Keys.BACK_SPACE);
		
	   Foundation_Date.click();
		
		Thread.sleep(3000);
		
		Foundation_Date.sendKeys(Foundation_Date_Company_5);
			
				    	
		}
   
        }
