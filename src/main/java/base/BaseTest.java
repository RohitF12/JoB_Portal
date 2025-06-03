package base;

import config.Config;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import utils.ExcelUtilityReg;
import java.io.IOException;
import java.time.Duration;
import POM_Admin.Login_Page;
import POM_Candidate.Candidate_LoginPage;

public class BaseTest {
    public WebDriver driver;
    public WebDriver admindriver;
    public WebDriver companydriver;
    public WebDriver candidatedriver;

    public Property_File data = new Property_File();
    public Basic_Methods methods = new Basic_Methods();
    public EmailTest emailTest = new EmailTest();

    public WebDriver getDriver() {
    	
        return driver;
    }
        
    public void openAdminbrowser() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        admindriver = new ChromeDriver(options);
        admindriver.manage().window().maximize();
        admindriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        admindriver.get(Config.getProperty("Admin_Login"));

    }

    public void openCandidatebrowser() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        candidatedriver = new ChromeDriver(options);
        candidatedriver.manage().window().maximize();
        candidatedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        candidatedriver.get(Config.getProperty("Candidate_Login"));
    }

    public void openCompanybrowser() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        companydriver = new ChromeDriver(options);
        companydriver.manage().window().maximize();
        companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        companydriver.get(Config.getProperty("Company_Login"));
     }
    
    public void Company_register() {
    	
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(Config.getProperty("Company_Register"));
      }

    public void Candidate_register() {
   	
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(Config.getProperty("Candidate_Register"));
      }
      
    
    public void loginCompany() throws IOException
    {
 	   String username = Config.getProperty("username_Company");
        String password = Config.getProperty("password_Company");
        
        // Perform login using POM
        Candidate_LoginPage login2Portal = new Candidate_LoginPage(companydriver);
 	        login2Portal.enterUsername(username);
 	        login2Portal.enterPassword(password);
 	        login2Portal.clickLogin();
    }
    public void logincandidate() throws IOException
    
       {
    	
   	     String username = Config.getProperty("username_Candidate");
         String password = Config.getProperty("password_Candidate");
         
         // Perform login using POM
         Candidate_LoginPage login2Portal = new Candidate_LoginPage(candidatedriver);
	        login2Portal.enterUsername(username);
	        login2Portal.enterPassword(password);
	        login2Portal.clickLogin();
         
        }
    
   public void loginHR() throws IOException
  
   {
	     String username = Config.getProperty("username_Admin");
         String password = Config.getProperty("password_Admin");
         
         // Perform login using POM
         Candidate_LoginPage login2Portal = new Candidate_LoginPage(admindriver);
	        login2Portal.enterUsername(username);
	        login2Portal.enterPassword(password);
	        login2Portal.clickLogin();
         
	    }
   


   @AfterClass
   public void closeApp() {
	   
       System.out.println("Closing browsers...");

       if (admindriver != null) {
           System.out.println("Closing Admin Driver...");
           admindriver.quit();
       }

       if (candidatedriver != null) {
           System.out.println("Closing Candidate Driver...");
           candidatedriver.quit();
       }

       if (companydriver != null) {
           System.out.println("Closing Company Driver...");
           companydriver.quit();
       }

       if (driver != null) {
           System.out.println("Closing Default Driver...");
           driver.quit();
       }

       System.out.println("All drivers closed successfully.");
   }
}
    