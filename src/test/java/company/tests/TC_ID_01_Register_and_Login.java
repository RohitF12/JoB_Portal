package company.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseTest;

import pom.LoginPage;
import pom.RegistrationPage;
import utils.ExcelUtilityReg;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;


public class TC_ID_01_Register_and_Login extends BaseTest {
	
	RegistrationPage registrationPage;


    @Test
    public void TC_ID_01_01 () throws InterruptedException, IOException {
    	
      
    	
    	// Get the expected URL from properties file
        String expectedUrl =data.getdata("app.url");
        
        // Get the current URL from the browser
        String actualUrl = driver.getCurrentUrl();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Verify the URL
        Assert.assertEquals(actualUrl, expectedUrl, "The URL does not match!");

        // Optionally, verify if Username and Password fields are displayed
      /*
        Assert.assertTrue(LoginPage.isUsernameFieldDisplayed(), "Username field is not displayed!");
        Assert.assertTrue(LoginPage.isPasswordFieldDisplayed(), "Password field is not displayed!");
      */
        System.out.println("Application launched successfully, and the login page is displayed.");
        
        
    }
    
    @Test
    //To check that the Register link working fine.
    public void TC_ID_01_02 () throws InterruptedException, IOException {
    	
    	 LoginPage loginPage = new LoginPage(driver);
    	 
		// Click on the Register link
    	 loginPage.clickRegisterLink();
    	 
        // Verify that the Registration page is displayed
        String expectedUrl = data.getdata("registrationUrl"); // Load the expected registration URL from config
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Register link did not navigate to the Registration page!");
        System.out.println("Register link navigates to the Registration page successfully.");
    	
    }
    
    @Test
    //To check that all the fields available on registration Page 
    public void TC_ID_01_03 () throws InterruptedException {
    	
    	registrationPage = new RegistrationPage(driver);
    	
    	// Validate all fields are displayed
    	
        Assert.assertTrue(registrationPage.isUsernameFieldPresent(), "Username field is not displayed!");
        Assert.assertTrue(registrationPage.isEmailFieldPresent(), "Email field is not displayed!");
        Assert.assertTrue(registrationPage.isCINFieldPresent(), "CIN field is not displayed!");
        Assert.assertTrue(registrationPage.isPasswordFieldPresent(), "Confirm Password field is not displayed!");
  /*    Assert.assertTrue(registrationPage.isRegisterButtonPresent(), "Register button is not displayed!");               */
        
        Thread.sleep(5000);      
    }
    
    @Test
    //To check the I have read and agree to the terms of service.checkbox is working fine  
    public void TC_ID_01_04() throws InterruptedException {
    	
    	registrationPage = new RegistrationPage(driver);
    	
    	// Check if the checkbox is displayed
      //  Assert.assertTrue(registrationPage.isTermsCheckboxDisplayed(), "Terms checkbox is not displayed!");

        // Select the checkbox and verify it's selected
        registrationPage.selectTermsCheckbox();
        Assert.assertTrue(registrationPage.isTermsCheckboxSelected(), "Terms checkbox is not selected after clicking!");

        // Deselect the checkbox (if allowed) and verify it's deselected
        registrationPage.deselectTermsCheckbox();
        Assert.assertFalse(registrationPage.isTermsCheckboxSelected(), "Terms checkbox is still selected after clicking again!");
    	
         }
    
    @Test
    //To check that view Term and Condition and View Privacy Policy Button  
    public void TC_ID_01_05() throws InterruptedException {
    	
    	registrationPage = new RegistrationPage(driver);
    	
        // Click "View Terms and Conditions" button
    	RegistrationPage.clickViewTerms();

    	RegistrationPage.clickViewPrivacy();
    	
        }
    	
    @Test
    //To check Register button is enable and working fine  
    public void TC_ID_01_06() throws InterruptedException {
    	
    	registrationPage = new RegistrationPage(driver);
    	
    	RegistrationPage.isRegisterButtonPresent();
    	
      }
    	

        @Test
        //Enter Details of Company and try to Register a New Company 
        public void TC_ID_01_07() throws InterruptedException, IOException {
        	
        	  String filePath = "C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\Company_Portal_JP\\src\\test\\resources\\tests\\TestData.xlsx";
              String sheetName = "RegisterCompany"; // Confirm this matches your Excel sheet name
        	       	
        	// Initialize Excel utility
            ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
            registrationPage = new RegistrationPage(driver);

            // Iterate through rows in Excel
            int rowCount = excel.getRowCount();
            for (int i = 1; i <= rowCount; i++) { // Assuming row 0 is the header
                String companyName = excel.getCellData(i, 0);
                String companyEmail = excel.getCellData(i, 1);
                String companyPhone = excel.getCellData(i, 2);
                String companyAddress = excel.getCellData(i, 3);

                // Fill the registration form
                registrationPage.enterCompanyName(companyName);
                registrationPage.enterCompanyEmail(companyEmail);
                registrationPage.enterCIN(companyPhone);
                registrationPage.enterCompanyPassword(companyAddress);
                registrationPage.clickRegisterButton();

            
}
            }
        }
