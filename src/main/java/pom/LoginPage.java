package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {

	 public static WebDriver driver; // Global WebDriver instance
	
	 
    // Locators for the elements on the login page
    public By usernameField = By.xpath("//input[@name='email']");
    public By passwordField = By.xpath("//input[@name='password']");
    public By loginButton = By.xpath("/html/body/div/div/div/div/div[2]/div/form/button"); 
    public By errorMessage = By.xpath("//p[contains(@class, 'error-message-class')]");    
    public By clickRegisterPageLink = By.xpath("//a[@href='/session/signup/company']"); 
    
    public LoginPage(WebDriver driver) {
        this.driver = driver; // Assign WebDriver instance
    }

        public void enterUsername(String username) {
            driver.findElement(usernameField).sendKeys(username);
        }

        public void enterPassword(String password) {
            driver.findElement(passwordField).sendKeys(password);
        }

        public HomePage clickLogin() {
            driver.findElement(loginButton).click();
            return new HomePage(driver);
        
   }

		public void clickRegisterLink() {
			driver.findElement(clickRegisterPageLink).click();
			return;
			
		}
}