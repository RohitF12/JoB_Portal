package pom;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	 static WebDriver driver;

	    // Locators for registration fields
	    @FindBy(xpath = "//input[@name='jp_company_name']")     
	    WebElement usernameField;

	    @FindBy(xpath = "//input[@name='jp_email']") 
	    WebElement emailField;

	    @FindBy(xpath = "//input[@name='jp_cin']") 
	    WebElement CIN;

	    @FindBy(xpath = "//input[@name='jp_password']") 
	    WebElement PasswordField;
	    
		// Locator for the Terms of Service checkbox
	    @FindBy(xpath = "/html/body/div/div/div/div/div[2]/div/form/div[5]/span/input") 
	    WebElement termsCheckbox;
	    
	    // Locators for "View Terms and Conditions" buttons
	    @FindBy(xpath = "/html/body/div/div/div/div/div[2]/div/form/div[6]/button[1]")
		static WebElement viewTermsButton;

	    @FindBy(xpath = "/html/body/div/div/div/div/div[2]/div/form/div[6]/button[2]") // Locators for"View Privacy Policy" buttons
	    static  WebElement viewPrivacyButton;	
	    
	    // Locators for "View Terms and Conditions" buttons
	    @FindBy(xpath = "//button[@aria-label='close']") 
	    static WebElement CloseButton;
	    	    
	    @FindBy(xpath = "//button[@type='submit']")
		static WebElement registerButton;
	    	    
 // Constructor to initialize elements
	    public RegistrationPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
 
    
	    // Methods to verify fields
	    public boolean isUsernameFieldPresent() {
	    	
	        return usernameField.isDisplayed();
	    }
        
	    public void UsernameField() {
	    	
	    	usernameField.click();
	    }
	    
	    public boolean isEmailFieldPresent() {
	        return emailField.isDisplayed();
	    }

	    public boolean isCINFieldPresent() {
	        return CIN.isDisplayed();
	    }

	    public boolean isPasswordFieldPresent() {
	        return PasswordField.isDisplayed();
	    }
	    
	    // Method to check if the check box is displayed
	    public boolean isTermsCheckboxDisplayed() {
	        return termsCheckbox.isDisplayed();
	    }

	    // Method to select the check  box
	    public void selectTermsCheckbox() {
	    	//termsCheckbox.click();
	        if (!termsCheckbox.isSelected()) {
	            termsCheckbox.click();
	        }
	    }

	    // Method to deselect the check box (if allowed)
	    public void deselectTermsCheckbox() {
	    	//termsCheckbox.click();
	        if (termsCheckbox.isSelected()) {
	            termsCheckbox.click();
	        }
	    }
	        
	     // Method to check if the checkbox is selected
	     public boolean isTermsCheckboxSelected() {
	     return termsCheckbox.isSelected();
	    }

	    
	     // Method to click on "View Terms and Conditions" button
	     public static void clickViewTerms() {
	    	 
	         viewTermsButton.click();
	         
	      // Set up the WebDriver and configure implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	         
	         CloseButton.click();
	     }

	     // Method to click on "View Privacy Policy" button
	     public static void clickViewPrivacy() {
	         viewPrivacyButton.click();
	         
	         // Set up the WebDriver and configure implicit wait
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		         
		         CloseButton.click();
		    
	}
	     	     
		 public static boolean isRegisterButtonPresent() {
		         
		    	registerButton.isDisplayed();
		        
		        return registerButton.isEnabled();
		        
		        
		 }
		 
		// Methods to interact with input fields
		    public void enterCompanyName(String CompanyName) {
		    	usernameField.sendKeys(CompanyName);
		    }

		    public void enterCompanyEmail(String CompanyEmail) {
		    	emailField.sendKeys(CompanyEmail);
		    }
		    
		    public void enterCIN(String CompanyCIN) {
		    	CIN.sendKeys(CompanyCIN);
		    }

		    public void enterCompanyPassword(String CompanyPassword) {
		    	PasswordField.sendKeys(CompanyPassword);
		    }

		    // Click the Register button
		    public void clickRegisterButton() {
		        registerButton.click();
		
}
}