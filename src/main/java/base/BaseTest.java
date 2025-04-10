
package base;



import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelUtilityReg;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Admin.Login_Page;
import POM_Candidate.Candidate_LoginPage;

public class BaseTest 
{
	 public static  WebDriver admindriver; // Global WebDriver instance
	 public static WebDriver companydriver; 
	 public static WebDriver candidatedriver; 
	 public static Property_File data = new Property_File();
	 public Basic_Methods methods = new  Basic_Methods();
	 public EmailTest emailTest = new EmailTest();

	 
        public void openAdminbrowser() throws IOException 
        {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        admindriver = new ChromeDriver(options);
        admindriver.manage().window().maximize();
        admindriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        admindriver.get(data.getdata("Adminloginurl"));
        }
	    public void openCandidatebrowser() throws IOException 
        {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        candidatedriver = new ChromeDriver(options);
        candidatedriver.manage().window().maximize();
        candidatedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        candidatedriver.get(data.getdata("candidateloginurl"));
        }
	    public void openCompanybrowser() throws IOException 
        {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions(); 
        companydriver = new ChromeDriver(options);
        companydriver.manage().window().maximize();
        companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        companydriver.get(data.getdata("companyloginurl"));
        }
	    
	    
	   public void logincandidate() throws IOException
	    {
	    	Candidate_LoginPage  loginpage = new Candidate_LoginPage(candidatedriver);
			 String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
	   	     String sheetName="Candidate_Register";
	   	     ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
	   	 
	   	     int rowCount = excel.getRowCount();
	   	     for(int i=1; i<= rowCount; i++)
	   	     {
	    		String Candidate_Email = excel.getCellData(i, 1);
	   		    String Password = excel.getCellData(i, 3);
	   		    loginpage.enteremail(Candidate_Email);
	   		    loginpage.enterpassword(Password);
	   		    loginpage.Clicklogin();
	   		    break;
	   	     }
	    }
	   public void loginHR() throws IOException
	   {
		   Login_Page l = new Login_Page(admindriver);
		    String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
			String sheetName="HR_Login";
			ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
			   	 
			int rowCount = excel.getRowCount();
			for(int i=1; i<= rowCount; i++)
			{
			  String email = excel.getCellData(i, 0);
			  String password = excel.getCellData(i, 1);
			  l.HR_Login(email, password);
			  break;
		    }
	   }
}

 /*  public void closeapp(ITestResult res) throws IOException{
   		
   		String name = res.getName();
   		int Status = res.getStatus();
   		if(Status==2)
   		{
   			TakeScreenshot p = new TakeScreenshot();
   			p.Capturescreenshot(driver, name);
   		
   		driver.quit();
   	}
        
 */       
    
    


