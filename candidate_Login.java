package applied_Candidates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Launch.Launch_Website_Candidate;

public class candidate_Login extends Launch_Website_Candidate{
	
	 public void Login3App() throws InterruptedException { 
			
			// Find the UserID input field and enter the correct UserID
		    WebElement userIdField = driver.findElement(By.xpath("//input[@name='email']"));
		    userIdField.sendKeys("testmohan@gmail.com");

		    // Find the Password input field and enter the correct password
		    WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
		    passwordField.sendKeys("Password@12345");

		    // Find the login button and click it
		    WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/button"));
		    loginButton.click();
		    
		    Thread.sleep(15000);

		}
		
}
