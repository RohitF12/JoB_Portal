package applied_Candidates;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Launch.Launch_Website_Company;

public class TC_ID_05_Applied_Candidates extends Launch_Website_Company  {
		
		 @Test
		   public void Login() throws InterruptedException { 
	  
			 Login_Company.LoginApp1 y = new Login_Company.LoginApp1();
		  
		     y.Login2App();
		    
		     Thread.sleep(5000);
		    
		}  

		  @Test
		   //To check the page name displayed 
		   public void TC_ID_05_01() throws InterruptedException { 
	        
	        WebElement Post_a_job = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[1]/div[4]/a/button"));
			 
	        Post_a_job.click();
			 
			 Thread.sleep(5000);
			
			  // Locate the heading element
	        WebElement headingElement = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/h1"));

	        // Get the text of the heading element
	        String actualHeading = headingElement.getText();

	        // Expected heading name
	        String expectedHeading = "Applied Candidates";

	        // Compare the text with the expected heading name
	        Assert.assertEquals(actualHeading, expectedHeading, "The page heading is not as expected.");
	        
	        Thread.sleep(15000);
	        
		   }	 
		  

		  @Test
		   //Make candidate to apply the existing job
		   public void TC_ID_05_02() throws InterruptedException { 
			  
//			applied_Candidates.candidate_Login x= new  applied_Candidates.candidate_Login ();
//			
//			x.Login3App();
		 
	    		  
	    		  JavascriptExecutor js = (JavascriptExecutor) driver;    		  
	    		  js.executeScript("window.open()");
	    		  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    		  driver.switchTo().window(tabs.get(1));

	  	        // Switch to the new tab
	  	        for (String handle : driver.getWindowHandles()) {
	  	            driver.switchTo().window(handle);
	  	        }

	  	        // Navigate to a different URL in the new tab 
	  	     driver.get("https://jobs.reyan.co.in/session/login/candidate");
	  	 	 
	  	     Thread.sleep(5000);
	  	    
	  	  // Wait for the login button to be clickable
	  	 
	  	 
	  	     WebElement emailid = driver.findElement(By.xpath("//input[@name='email']"));
	  	 
	  	     emailid.sendKeys("testmohan@gmail.com");
	  	     

	  	     WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
	  	 
	  	    Password.sendKeys("Password@12345");
	  	    
	  	    WebElement Login = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/button"));
		  	 
	       Login.click();
	       
	       Thread.sleep(5000);

	       	       
	       //click on job listing page 
	       
	       WebElement Job_Listing = driver.findElement(By.xpath("//a[@href='/jobs/listings/candidate']"));
		  	 
	       Job_Listing.click();
	       
			  Thread.sleep(5000);

	/*		  //identify element
			   WebElement m = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/p[1]"));
			   //scroll to middle with Javascript Executor
			   JavascriptExecutor js2 = (JavascriptExecutor) driver;
			   js2.executeScript("arguments[0].scrollIntoView(true);", m);
	          System.out.println("Text is: " + m.getText());  

		*/	  Thread.sleep(5000);
			  
			  WebElement Select_pagedropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/div[2]/div"));
			  	 
			  Select_pagedropdown.click();
			  
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

			  WebElement Select_25 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]"));
			  	 
			  Select_25.click();
			  
			  Thread.sleep(5000);
	       
	       //click on filter- Full time - Fresher/Entry level- Mid level
	       
	       WebElement Fulltime = driver.findElement(By.xpath("//input[@name='fullTime']"));
		  	 
	       Fulltime.click();
	       
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	      
	      WebElement Fresher = driver.findElement(By.xpath("//input[@name='Fresher/Entry-Level']"));
		  	 
	      Fresher.click();
	       
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	  
		  WebElement Searchbar = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input"));
		  	 
		  Searchbar.sendKeys("Android Developer");
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		  	         
		  //Click_on_Android_developer_Apply
          
		  WebElement Apply = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[7]/button"));
		  	 
		  Apply.click(); 
		  
		  Thread.sleep(5000);
		  
		  //identify element
		   WebElement m1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[3]/button"));
		   //scroll to middle with Javascript Executor
		   JavascriptExecutor js1 = (JavascriptExecutor) driver;
		   js1.executeScript("arguments[0].scrollIntoView(true);", m1);
           System.out.println("Text is: " + m1.getText());  		  
		  Thread.sleep(10000);
		  			  		  
		  WebElement Apply1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[3]/button"));
		  	 
		  Apply1.click(); 
		  
		  Thread.sleep(10000);
		  
	/*	  //Click_On_Your_Application
		  
		  WebElement Your_Application = driver.findElement(By.xpath("//a[@href='/jobs/candidate/applied']"));
		  	 
		  Your_Application.click(); 
		  
		  driver.close();
		  
		  */
		  }
		  
		  @Test
		   //To check the page name displayed 
		   public void TC_ID_05_03() throws InterruptedException { 
		  
			  JavascriptExecutor js = (JavascriptExecutor) driver;    		  
    		  js.executeScript("window.open()");
    		  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    		  driver.switchTo().window(tabs.get(1));

  	        // Switch to the new tab
  	        for (String handle : driver.getWindowHandles()) {
  	            driver.switchTo().window(handle);
  	        }

  	        // Navigate to a different URL in the new tab 
  	     driver.get("https://jobs.reyan.co.in/session/login/company");
  	 	 
  	     Thread.sleep(5000);
  	    
  	  // Wait for the login button to be clickable
  	   	 
  	     WebElement emailid = driver.findElement(By.xpath("//input[@name='email']"));
  	 
  	     emailid.sendKeys("rfulzele@reyan.co.in");
  	     
  	     WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
  	 
  	    Password.sendKeys("password@123");
  	    
  	    WebElement Login = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/button"));
	  	 
       Login.click();
       
       Thread.sleep(5000);
       
       //click on Applied_Candidate
       
       WebElement Applied_Candidate = driver.findElement(By.xpath("//a[@href='/jobs/company/applied']"));
	  	 
       Applied_Candidate.click();
       
    // Locate the search bar using its name, id, class, or other attributes
	   
       WebElement searchBar = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input")); 

       // Check if the search bar is displayed and enabled
       
       if (searchBar.isDisplayed() && searchBar.isEnabled()) {
   
           // Optionally, submit the search form
        
           System.out.println("Search bar is present and interactable");
       } else {
           System.out.println("Search bar is not interactable");
       }
       
       
		  }
				  
		 @Test
		 //Try to search the Applied candidate and check the display list 
		 public void TC_ID_05_04() throws InterruptedException { 
       
		 WebElement searchBar = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input")); 	 
       
       // Interact with the search bar (e.g., send some text)
	   
       searchBar.sendKeys("Test Rohit");
       
      //Click a candidate with name
       
       WebElement search_Candidate = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input")); 
       
       search_Candidate.click();
       
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       search_Candidate.sendKeys(Keys.ENTER);
       
       Thread.sleep(5000);
       
       search_Candidate.clear();
       
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
        Thread.sleep(5000);  
  
		  
		  }
		  
		 @Test
		 //To check the column name displayed
		 public void TC_ID_05_05() throws InterruptedException { 
			 
				// Click on the Team page and check the New Button and Columns Name available
				
				//Check the columns name available
				
				 String Column_01 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/table/thead/tr/th[1]")).getText();
				  
				 System.out.println("Name of 1st Column displayed = " + Column_01);	 
				 
				 String Column_02 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/table/thead/tr/th[2]")).getText();
					  
				 System.out.println("Name of 2nd Column displayed = " + Column_02);
					
				 String Column_03 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/table/thead/tr/th[3]")).getText();
					  
				 System.out.println("Name of 3rd Column displayed = " + Column_03);
					
				 String Column_04 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/table/thead/tr/th[4]")).getText();
					  
				 System.out.println("Name of 4th Column displayed = " + Column_04);
					
				 String Column_05 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/table/thead/tr/th[5]")).getText();
					  
				 System.out.println("Name of 5th Column displayed = " + Column_05);
					
				 String Column_06 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/table/thead/tr/th[6]")).getText();
					  
				 System.out.println("Name of 6th Column displayed = " + Column_06);
				 
				 String Column_07 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/table/thead/tr/th[7]")).getText();
				  
				 System.out.println("Name of 7th Column displayed = " + Column_07);
				 
				 String Column_08 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/table/thead/tr/th[8]")).getText();
				  
				 System.out.println("Name of 8th Column displayed = " + Column_08);
				 								 
				 Thread.sleep(10000);	 
		 }
		 
		 @Test
		 //To check the row per page  
		 public void TC_ID_05_06() throws InterruptedException { 
						  
		     //Row_per_page
		     
		     WebElement Row_per_page = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div"));

	            // Check if the field is displayed and enabled
	            boolean isDisplayed11 = Row_per_page.isDisplayed();
	            boolean isEnabled11 = Row_per_page.isEnabled();

	            // Assert the conditions
	            Assert.assertTrue(isDisplayed11, "Row_per_page is not displayed");
	            Assert.assertTrue(isEnabled11, "Row_per_page is not enabled");

	            // Use if-else for additional logic
	            if (isDisplayed11 && isEnabled11) {
	                System.out.println("Row_per_page is displayed and enabled. Ready for interaction.");
	            } else {
	                System.out.println("Row_per_page is either not displayed or not enabled.");
	            } 
		     
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
			   WebElement Row_per_page_displayed = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div"));

			   Row_per_page_displayed.click();
			   
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   
			   WebElement Select_25_rows = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]"));

			   Select_25_rows.click();
			   
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			   Thread.sleep(5000);
			   
			   driver.navigate().refresh();
			   
			   Thread.sleep(5000);

		 }
		 
		 @Test
		 //To check Applied on, status and Job Title filter 
		 public void TC_ID_05_07() throws InterruptedException { 
		 
			 //Applied_on
			 			 
			   WebElement Applied_on = driver.findElement(By.xpath("//button[@aria-label='Sort']"));

	            // Check if the field is displayed and enabled
	            boolean isDisplayed11 = Applied_on.isDisplayed();
	            boolean isEnabled11 = Applied_on.isEnabled();

	            // Assert the conditions
	            Assert.assertTrue(isDisplayed11, "Applied_on is not displayed");
	            Assert.assertTrue(isEnabled11, "Applied_on is not enabled");

	            // Use if-else for additional logic
	            if (isDisplayed11 && isEnabled11) {
	                System.out.println("Applied_on is displayed and enabled. Ready for interaction.");
	            } else {
	                System.out.println("Applied_on is either not displayed or not enabled.");
	            } 
		     
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
			   Applied_on.click();
			   
			   Thread.sleep(5000);
			   
			 //Job_title
			 
			   WebElement Job_title = driver.findElement(By.xpath("//button[@id='Job Title']"));

	            // Check if the field is displayed and enabled
	            boolean isDisplayed12 = Applied_on.isDisplayed();
	            boolean isEnabled12 = Applied_on.isEnabled();

	            // Assert the conditions
	            Assert.assertTrue(isDisplayed11, "Job_title is not displayed");
	            Assert.assertTrue(isEnabled11, "Job_title is not enabled");

	            // Use if-else for additional logic
	            if (isDisplayed11 && isEnabled11) {
	                System.out.println("Job_title is displayed and enabled. Ready for interaction.");
	            } else {
	                System.out.println("Job_title is either not displayed or not enabled.");
	            } 
		     
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
			   Applied_on.click();
			   
			   Thread.sleep(5000); 
			   
			 //Status
			 
			   WebElement Status = driver.findElement(By.xpath("//button[@id='Status']"));

	            // Check if the field is displayed and enabled
	            boolean isDisplayed13 = Status.isDisplayed();
	            boolean isEnabled13 = Status.isEnabled();

	            // Assert the conditions
	            Assert.assertTrue(isDisplayed13, "Status is not displayed");
	            Assert.assertTrue(isEnabled13, "Status is not enabled");

	            // Use if-else for additional logic
	            if (isDisplayed13 && isEnabled13) {
	                System.out.println("Status is displayed and enabled. Ready for interaction.");
	            } else {
	                System.out.println("Status is either not displayed or not enabled.");
	            } 
		     
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
			   Status.click();
			   
			   Thread.sleep(5000);
		 }
		 
		 @Test
		 //To check download Resume is working 
		 public void TC_ID_05_08() throws InterruptedException { 
			 
			 //Download_resume
 			 
			   WebElement Download_resume = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/table/tbody/tr/td[7]/button"));

	            // Check if the field is displayed and enabled
	            boolean isDisplayed11 = Download_resume.isDisplayed();
	            boolean isEnabled11 = Download_resume.isEnabled();

	            // Assert the conditions
	            Assert.assertTrue(isDisplayed11, "Download_resume is not displayed");
	            Assert.assertTrue(isEnabled11, "Download_resume is not enabled");

	            // Use if-else for additional logic
	            if (isDisplayed11 && isEnabled11) {
	                System.out.println("Download_resume is displayed and enabled. Ready for interaction.");
	            } else {
	                System.out.println("Download_resume is either not displayed or not enabled.");
	            } 
		     
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
			   Download_resume.click();
			   
			   Thread.sleep(5000);	 
			 
		 }
		 
		 @Test
		 //To check that view_candidate functionality 
		 public void TC_ID_05_09() throws InterruptedException { 
			 
			 //view_candidate
 			 
			   WebElement view_candidate = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/table/tbody/tr/td[8]/button"));

	            // Check if the field is displayed and enabled
	            boolean isDisplayed11 = view_candidate.isDisplayed();
	            boolean isEnabled11 = view_candidate.isEnabled();

	            // Assert the conditions
	            Assert.assertTrue(isDisplayed11, "view_candidate is not displayed");
	            Assert.assertTrue(isEnabled11, "view_candidate is not enabled");

	            // Use if-else for additional logic
	            if (isDisplayed11 && isEnabled11) {
	                System.out.println("view_candidate is displayed and enabled. Ready for interaction.");
	            } else {
	                System.out.println("Download_resume is either not displayed or not enabled.");
	            } 
		     
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
			   view_candidate.click();
			   
			   Thread.sleep(5000);
			   
			   //click_on_close
			   
			   WebElement click_on_close = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button"));
			   
			   click_on_close.click();
			   
			   Thread.sleep(5000);


		 }
		 
		 @Test
		 //To change the status from pending to accepted of applied job 
		 public void TC_ID_05_10() throws InterruptedException {
			 
			 
			 WebElement Status = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/table/tbody/tr/td[6]/div"));
			   
			 Status.click();
			 
			 Thread.sleep(3000);
			 
			 WebElement Status_Accepted = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]"));
			   
			 Status_Accepted.click();
			 
			 Thread.sleep(5000);

		 }
		 
		 @Test
		 
		 //login with the candidate and check the applied job status 
		 public void TC_ID_05_11() throws InterruptedException {
			 
			 JavascriptExecutor js = (JavascriptExecutor) driver;    		  
   		  js.executeScript("window.open()");
   		  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
   		  driver.switchTo().window(tabs.get(1));

 	        // Switch to the new tab
 	        for (String handle : driver.getWindowHandles()) {
 	            driver.switchTo().window(handle);
 	        }

 	        // Navigate to a different URL in the new tab 
 	     driver.get("https://jobs.reyan.co.in/session/login/candidate");
 	 	 
 	     Thread.sleep(5000);
 	    
 	  // Wait for the login button to be clickable
 	 
 	 
 	     WebElement emailid = driver.findElement(By.xpath("//input[@name='email']"));
 	 
 	     emailid.sendKeys("testmohan@gmail.com");
 	     

 	      WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
 	 
 	     Password.sendKeys("Password@12345");
 	    
 	     WebElement Login = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/button"));
	  	 
        Login.click();
      
        Thread.sleep(5000);
       
			 
       }
		 
    }