package base;


import config.Config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;

public class BaseTest_Admin {
	 public static WebDriver driver; // Global WebDriver instance
	 
	   public WebDriver getDriver() {
	        return driver;
	   }

    public void Launch() {
       // System.setProperty("webdriver.chrome.driver", Config.getProperty("chromedriver.path"));
    	 WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(Config.getProperty("app.url.admin"));
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
    
    
}

