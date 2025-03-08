package base;


import config.Config;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;

public class BaseTest {
	 public static WebDriver driver; // Global WebDriver instance
	 
	   public WebDriver getDriver() {
	        return driver;
	   }

    public void setup() {
        System.setProperty("webdriver.chrome.driver", Config.getProperty("chromedriver.path"));
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(Config.getProperty("app.url"));
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

