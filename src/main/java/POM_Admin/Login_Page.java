package POM_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
     	@FindBy(name="email")
		private WebElement emailid;
		
		@FindBy(name="password")
		private WebElement pass;
		
		@FindBy(xpath="//button[text()='Login']")
		private WebElement loginbtn;
		
		public Login_Page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void HR_Login(String email, String password)
		{
			emailid.sendKeys(email);
			pass.sendKeys(password);
			loginbtn.click();
		}
}
