package Job_Listing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Launch.Launch_Website_Company;



public class TC_ID_04_Job_Listing extends Launch_Website_Company {
	
	
	 @Test
	   public void Login() throws InterruptedException { 

		 Login_Company.LoginApp1 y = new Login_Company.LoginApp1();
	  
	     y.Login2App();
	    
	     Thread.sleep(5000);
	    
	}

	  @Test
		 //Click on Job Listing  page and check page name displayed  
		 public void TC_ID_04_01() throws InterruptedException { 
				  
		       WebElement Job_Listing = driver.findElement(By.xpath("//a[@href='/jobs/listings/company']"));
				 
		       Job_Listing.click();
				 
				 Thread.sleep(5000);
			
				  // Locate the heading element
		        WebElement headingElement = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/h1"));

		        // Get the text of the heading element
		        String actualHeading = headingElement.getText();

		        // Expected heading name
		        String expectedHeading = "Job Listings";

		        // Compare the text with the expected heading name
		        Assert.assertEquals(actualHeading, expectedHeading, "The page heading is not as expected.");
		        
		        Thread.sleep(15000);       
			 		  
	   }
		
		   @Test
		   //To check the search bar is working or not  
		   public void TC_ID_04_02() throws InterruptedException { 
		             
			// Locate the search bar using its name, id, class, or other attributes
			   
		       WebElement searchBar = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input")); 

		       // Check if the search bar is displayed and enabled
		       
		       if (searchBar.isDisplayed() && searchBar.isEnabled()) {
		   
		           // Optionally, submit the search form
		        
		           System.out.println("Search bar is present and interactable");
		       } else {
		           System.out.println("Search bar is not interactable");
		       }
		       
		       // Interact with the search bar (e.g., send some text)
			   
		       searchBar.sendKeys("Android Developer");
		       
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
				 //To check the column name displayed.
				 public void TC_ID_04_03() throws InterruptedException { 
				  
				// Click on the Team page and check the New Button and Columns Name available
					
					//Check the columns name available
					
					 String Column_01 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/thead/tr/th[1]")).getText();
					  
					 System.out.println("Name of 1st Column displayed = " + Column_01);	 
					 
					 String Column_02 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/thead/tr/th[2]")).getText();
						  
					 System.out.println("Name of 2nd Column displayed = " + Column_02);
						
					 String Column_03 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/thead/tr/th[3]")).getText();
						  
					 System.out.println("Name of 3rd Column displayed = " + Column_03);
						
					 String Column_04 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/thead/tr/th[4]")).getText();
						  
					 System.out.println("Name of 4th Column displayed = " + Column_04);
						
					 String Column_05 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/thead/tr/th[5]")).getText();
						  
					 System.out.println("Name of 5th Column displayed = " + Column_05);
						
					 String Column_06 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/thead/tr/th[6]")).getText();
						  
					 System.out.println("Name of 6th Column displayed = " + Column_06);
					 
					 String Column_07 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/thead/tr/th[7]")).getText();
					  
					 System.out.println("Name of 6th Column displayed = " + Column_07);
									 
					 Thread.sleep(10000);
				    
	}
			  @Test
				 //To check the View button is working fine
				 public void TC_ID_04_04() throws InterruptedException { 
				  
				  
				  WebElement search_Jobs = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input")); 
			        
				  search_Jobs.sendKeys("Android Developer");
			       
				  search_Jobs.click();
			       
			       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			       search_Jobs.sendKeys(Keys.ENTER);

			       Thread.sleep(15000);
			       
//			       WebElement Jobs_Name = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]")); 
//			       
//			       System.out.println("Jobs_Name Name Displayed is"+Jobs_Name.getText());

				   // Locate the View_Button and other attributes
			       WebElement View_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[5]/button")); 
			       // Check if the filter element is displayed
			       if (View_Button.isDisplayed()) {
			           System.out.println("View_Button element is displayed.");

			           // Check if the filter element is enabled
			           if (View_Button.isEnabled()) {
			               System.out.println("View_Button element is enabled.");
			           } else {
			               System.out.println("View_Button element is NOT enabled.");
			           }
			       } else {
			           System.out.println("View_Button element is NOT displayed.");
			       }
			      
			        Thread.sleep(15000);
			       }
				   

			  @Test
				 //To check that information displayed in the page
				 public void TC_ID_04_05() throws InterruptedException { 
				  
			       WebElement View_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[5]/button")); 
			                                                             

			       View_Button.click();
			       
			        Thread.sleep(5000);
			       
//			       //Job_title_Name
//			    	
//			        String description = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/h4")).getText();
//					  
//				   System.out.println("description displayed is = " + description);
//					
//				   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				   //Company_Name
				   
			        String Company_Name = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/h6")).getText();
					  
					System.out.println("description displayed is = " + Company_Name);
						
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Posted_On
					
			        String Posted_On = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[2]/p[1]")).getText();
					  
					System.out.println("description displayed is = " + Posted_On);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Apply_By
					
					String Apply_By = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[2]/p[2]")).getText();
					  
					System.out.println("description displayed is = " + Apply_By);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Employment_Type - Full-Time   
					
					String Employment_Type = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[1]")).getText();
					  
					System.out.println("description displayed is = " + Employment_Type);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Experience_Level = Senior  
					
					String Experience_Level = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[3]")).getText();
					  
					System.out.println("description displayed is = " + Experience_Level);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Highest_Education_Level =Master Degree 
					
					String Highest_Education_Level = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[4]")).getText();
					  
					System.out.println("description displayed is = " + Highest_Education_Level);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
//				   //Required_Degree = BE 
//					
//					String Required_Degree = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[4]")).getText();
//					  
//					System.out.println("description displayed is = " + Required_Degree);
//							
//					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Description
					
					String Description = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div/p")).getText();
					  
					System.out.println("description displayed is = " + Description);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Max_Salary_Ranges
					
					String Max_Salary_Ranges = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[5]/div/h4[3]")).getText();
					  
					System.out.println("description displayed is = " + Max_Salary_Ranges);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					//Min_Salary_Ranges
					
				    String Min_Salary_Ranges = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[5]/div/h4[1]")).getText();
								  
				    System.out.println("description displayed is = " + Min_Salary_Ranges);
										
				    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Benefits
					
					String Benefits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[4]/div/div/p")).getText();
					  
					System.out.println("description displayed is = " + Benefits);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						   
			  }
			  
			  @Test
				 //To check that Cross button
				 public void TC_ID_04_06() throws InterruptedException { 
				  
				   // Locate the Close Button
			        WebElement Close_Button = driver.findElement(By.xpath("//button[@aria-label='close']")); 
			        // Check if the Close Button is displayed
			        if (Close_Button.isDisplayed()) {
			            System.out.println("Close Button element is displayed.");

			            // Check if the Close Button is enabled
			            if (Close_Button.isEnabled()) {
			                System.out.println("Close Button element is enabled.");
			            } else {
			                System.out.println("Close Button element is NOT enabled.");
			            }
			        } else {
			            System.out.println("Close Button element is NOT displayed.");
			        }
			        
			        Thread.sleep(5000);
			        //Cross_Button
			        
			        WebElement Close_Button1 = driver.findElement(By.xpath("//button[@aria-label='close']"));
			    	  
			        Close_Button1.click();
			             
			        }
			  @Test
				 //To check the Android Developer information displayed on view button
				 public void TC_ID_04_07() throws InterruptedException { 
				  			  
				  WebElement search_Jobs = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input")); 
				  
				  search_Jobs.click();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				  search_Jobs.clear();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			        
				  search_Jobs.sendKeys("Android Developer");
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			       
				  search_Jobs.click();
			       
			       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			       search_Jobs.sendKeys(Keys.ENTER);

			       Thread.sleep(10000);
				  
				  WebElement View_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[5]/button")); 

			       View_Button.click();
			       
			        Thread.sleep(5000);
			       
			        
//				       //Job_title_Name
//				    	
//				        String description = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/h4")).getText();
//						  
//					   System.out.println("description displayed is = " + description);
//						
//					   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					   //Company_Name
					   
				        String Company_Name = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/h6")).getText();
						  
						System.out.println("description displayed is = " + Company_Name);
							
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Posted_On
						
				        String Posted_On = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[2]/p[1]")).getText();
						  
						System.out.println("description displayed is = " + Posted_On);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Apply_By
						
						String Apply_By = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[2]/p[2]")).getText();
						  
						System.out.println("description displayed is = " + Apply_By);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Employment_Type - Full-Time   
						
						String Employment_Type = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[1]")).getText();
						  
						System.out.println("description displayed is = " + Employment_Type);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Experience_Level = Senior  
						
						String Experience_Level = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[3]")).getText();
						  
						System.out.println("description displayed is = " + Experience_Level);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Highest_Education_Level =Master Degree 
						
						String Highest_Education_Level = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[4]")).getText();
						  
						System.out.println("description displayed is = " + Highest_Education_Level);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
//					   //Required_Degree = BE 
//						
//						String Required_Degree = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[4]")).getText();
//						  
//						System.out.println("description displayed is = " + Required_Degree);
//								
//						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Description
						
						String Description = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div/p")).getText();
						  
						System.out.println("description displayed is = " + Description);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Max_Salary_Ranges
						
						String Max_Salary_Ranges = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[5]/div/h4[3]")).getText();
						  
						System.out.println("description displayed is = " + Max_Salary_Ranges);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
						//Min_Salary_Ranges
						
					    String Min_Salary_Ranges = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[5]/div/h4[1]")).getText();
									  
					    System.out.println("description displayed is = " + Min_Salary_Ranges);
											
					    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Benefits
						
						String Benefits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[4]/div/div/p")).getText();
						  
						System.out.println("description displayed is = " + Benefits);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
			        
			        WebElement Close_Button1 = driver.findElement(By.xpath("//button[@aria-label='close']"));
			    	  
			        Close_Button1.click();
			        
			        Thread.sleep(5000);

			  }
			  
			  
			  @Test
				 //To check the Project Manager information displayed on view button
				 public void TC_ID_04_08() throws InterruptedException { 
				  
				  
	              WebElement search_Jobs = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input")); 
				  
				  search_Jobs.click();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				  search_Jobs.clear();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			        
				  search_Jobs.sendKeys("Project Manager");
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			       
				  search_Jobs.click();
			       
			       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			       search_Jobs.sendKeys(Keys.ENTER);

			       Thread.sleep(10000);
				  
				  WebElement View_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[5]/button")); 

			       View_Button.click();
			       
			        Thread.sleep(5000);
			       
			        
				       //Job_title_Name
				    	
				        String description = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[1]/h4")).getText();
						  
					   System.out.println("description displayed is = " + description);
						
					   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					   //Company_Name
					   
				        String Company_Name = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/h6")).getText();
						  
						System.out.println("description displayed is = " + Company_Name);
							
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Posted_On
						
				        String Posted_On = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[2]/p[1]")).getText();
						  
						System.out.println("description displayed is = " + Posted_On);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Apply_By
						
						String Apply_By = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[2]/p[2]")).getText();
						  
						System.out.println("description displayed is = " + Apply_By);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Employment_Type - Full-Time   
						
						String Employment_Type = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[1]")).getText();
						  
						System.out.println("description displayed is = " + Employment_Type);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Experience_Level = Senior  
						
						String Experience_Level = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[3]")).getText();
						  
						System.out.println("description displayed is = " + Experience_Level);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Highest_Education_Level =Master Degree 
						
						String Highest_Education_Level = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[4]")).getText();
						  
						System.out.println("description displayed is = " + Highest_Education_Level);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
//					   //Required_Degree = BE 
//						
//						String Required_Degree = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[4]")).getText();
//						  
//						System.out.println("description displayed is = " + Required_Degree);
//								
//						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Description
						
						String Description = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div/p")).getText();
						  
						System.out.println("description displayed is = " + Description);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Max_Salary_Ranges
						
						String Max_Salary_Ranges = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[5]/div/h4[3]")).getText();
						  
						System.out.println("description displayed is = " + Max_Salary_Ranges);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
						//Min_Salary_Ranges
						
					    String Min_Salary_Ranges = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[5]/div/h4[1]")).getText();
									  
					    System.out.println("description displayed is = " + Min_Salary_Ranges);
											
					    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					   
					   //Benefits
						
						String Benefits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[4]/div/div/p")).getText();
						  
						System.out.println("description displayed is = " + Benefits);
								
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			        
			        WebElement Close_Button1 = driver.findElement(By.xpath("//button[@aria-label='close']"));
			    	  
			        Close_Button1.click();
			        
			        Thread.sleep(5000);
				  
				  
			  }
				  
			  @Test
				 //To check the Data Analyst information displayed on view button
				 public void TC_ID_04_09() throws InterruptedException { 
				  
	              WebElement search_Jobs = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input")); 
				  
				  search_Jobs.click();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				  search_Jobs.clear();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			        
				  search_Jobs.sendKeys("Data Analyst");
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			       
				  search_Jobs.click();
			       
			       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			       search_Jobs.sendKeys(Keys.ENTER);

			       Thread.sleep(10000);
				  
			       WebElement View_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr/td[5]/button")); 

			       View_Button.click();
			       
			        Thread.sleep(5000);
			       
			       //Job_title_Name
			    	
			        String description = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[1]/h4")).getText();
					  
				   System.out.println("description displayed is = " + description);
					
				   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				   
				   //Company_Name
				   
			        String Company_Name = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/h6")).getText();
					  
					System.out.println("description displayed is = " + Company_Name);
						
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Posted_On
					
			        String Posted_On = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[2]/p[1]")).getText();
					  
					System.out.println("description displayed is = " + Posted_On);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Apply_By
					
					String Apply_By = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[2]/p[2]")).getText();
					  
					System.out.println("description displayed is = " + Apply_By);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Employment_Type - Full-Time   
					
					String Employment_Type = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[1]")).getText();
					  
					System.out.println("description displayed is = " + Employment_Type);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Experience_Level = Senior  
					
					String Experience_Level = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[3]")).getText();
					  
					System.out.println("description displayed is = " + Experience_Level);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Highest_Education_Level =Master Degree 
					
					String Highest_Education_Level = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[4]")).getText();
					  
					System.out.println("description displayed is = " + Highest_Education_Level);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
//				   //Required_Degree = BE 
//					
//					String Required_Degree = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[4]")).getText();
//					  
//					System.out.println("description displayed is = " + Required_Degree);
//							
//					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Description
					
					String Description = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div/p")).getText();
					  
					System.out.println("description displayed is = " + Description);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Max_Salary_Ranges
					
					String Max_Salary_Ranges = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[5]/div/h4[3]")).getText();
					  
					System.out.println("description displayed is = " + Max_Salary_Ranges);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					//Min_Salary_Ranges
					
				    String Min_Salary_Ranges = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[5]/div/h4[1]")).getText();
								  
				    System.out.println("description displayed is = " + Min_Salary_Ranges);
										
				    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Benefits
					
					String Benefits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[4]/div/div/p")).getText();
					  
					System.out.println("description displayed is = " + Benefits);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
					
			        WebElement Close_Button1 = driver.findElement(By.xpath("//button[@aria-label='close']"));
			    	  
			        Close_Button1.click();
			        
			        Thread.sleep(5000); 
			  }
			  
			  @Test
				 //To check the Team Lead information displayed on view button
				 public void TC_ID_04_10() throws InterruptedException { 
			  
	             WebElement search_Jobs = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input")); 
				  
				  search_Jobs.click();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				  search_Jobs.clear();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			        
				  search_Jobs.sendKeys("Team Lead");
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			       
				  search_Jobs.click();
			       
			       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			       search_Jobs.sendKeys(Keys.ENTER);

			       Thread.sleep(10000);
				  
			       WebElement View_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr/td[5]/button")); 

			       View_Button.click();
			       
			        Thread.sleep(5000);
			       
	       //Job_title_Name
			    	
			        String description = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[1]/h4")).getText();
					  
				   System.out.println("description displayed is = " + description);
					
				   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				   
				   //Company_Name
				   
			        String Company_Name = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/h6")).getText();
					  
					System.out.println("description displayed is = " + Company_Name);
						
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Posted_On
					
			        String Posted_On = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[2]/p[1]")).getText();
					  
					System.out.println("description displayed is = " + Posted_On);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Apply_By
					
					String Apply_By = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[2]/p[2]")).getText();
					  
					System.out.println("description displayed is = " + Apply_By);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Employment_Type - Full-Time   
					
					String Employment_Type = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[1]")).getText();
					  
					System.out.println("description displayed is = " + Employment_Type);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Experience_Level = Senior  
					
					String Experience_Level = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[3]")).getText();
					  
					System.out.println("description displayed is = " + Experience_Level);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Highest_Education_Level =Master Degree 
					
					String Highest_Education_Level = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[4]")).getText();
					  
					System.out.println("description displayed is = " + Highest_Education_Level);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
//				   //Required_Degree = BE 
//					
//					String Required_Degree = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[4]")).getText();
//					  
//					System.out.println("description displayed is = " + Required_Degree);
//							
//					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Description
					
					String Description = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div/p")).getText();
					  
					System.out.println("description displayed is = " + Description);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Max_Salary_Ranges
					
					String Max_Salary_Ranges = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[5]/div/h4[3]")).getText();
					  
					System.out.println("description displayed is = " + Max_Salary_Ranges);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					//Min_Salary_Ranges
					
				    String Min_Salary_Ranges = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[5]/div/h4[1]")).getText();
								  
				    System.out.println("description displayed is = " + Min_Salary_Ranges);
										
				    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Benefits
					
					String Benefits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[4]/div/div/p")).getText();
					  
					System.out.println("description displayed is = " + Benefits);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
			        
			        WebElement Close_Button1 = driver.findElement(By.xpath("//button[@aria-label='close']"));
			    	  
			        Close_Button1.click();
			        
			        Thread.sleep(5000); 
	}

			  @Test
				 //To check the Managing Director information displayed on view button
				 public void TC_ID_04_11() throws InterruptedException { 
				  				  
	               WebElement search_Jobs = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input")); 
				  
				  search_Jobs.click();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				  search_Jobs.clear();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			        
				  search_Jobs.sendKeys("Managing Director");
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			       
				  search_Jobs.click();
			       
			       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			       search_Jobs.sendKeys(Keys.ENTER);

			       Thread.sleep(10000);
					    
			       WebElement View_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr/td[5]/button")); 

			       View_Button.click();
			       
			        Thread.sleep(5000);
				       
	       //Job_title_Name
			    	
			        String description = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[1]/h4")).getText();
					  
				   System.out.println("description displayed is = " + description);
					
				   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				   
				   //Company_Name
				   
			        String Company_Name = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/h6")).getText();
					  
					System.out.println("description displayed is = " + Company_Name);
						
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Posted_On
					
			        String Posted_On = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[2]/p[1]")).getText();
					  
					System.out.println("description displayed is = " + Posted_On);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Apply_By
					
					String Apply_By = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[2]/p[2]")).getText();
					  
					System.out.println("description displayed is = " + Apply_By);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Employment_Type - Full-Time   
					
					String Employment_Type = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[1]")).getText();
					  
					System.out.println("description displayed is = " + Employment_Type);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Experience_Level = Senior  
					
					String Experience_Level = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[3]")).getText();
					  
					System.out.println("description displayed is = " + Experience_Level);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Highest_Education_Level =Master Degree 
					
					String Highest_Education_Level = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[4]")).getText();
					  
					System.out.println("description displayed is = " + Highest_Education_Level);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
//				   //Required_Degree = BE 
//					
//					String Required_Degree = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[4]")).getText();
//					  
//					System.out.println("description displayed is = " + Required_Degree);
//							
//					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Description
					
					String Description = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div/p")).getText();
					  
					System.out.println("description displayed is = " + Description);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Max_Salary_Ranges
					
					String Max_Salary_Ranges = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[5]/div/h4[3]")).getText();
					  
					System.out.println("description displayed is = " + Max_Salary_Ranges);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					//Min_Salary_Ranges
					
				    String Min_Salary_Ranges = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[5]/div/h4[1]")).getText();
								  
				    System.out.println("description displayed is = " + Min_Salary_Ranges);
										
				    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   
				   //Benefits
					
					String Benefits = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[4]/div/div/p")).getText();
					  
					System.out.println("description displayed is = " + Benefits);
							
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     
				        WebElement Close_Button1 = driver.findElement(By.xpath("//button[@aria-label='close']"));
				    	  
				        Close_Button1.click();
				        
				        Thread.sleep(5000); 
				        
			  }
			  	 
			  @Test
				 //To check that Edit button working fine 
				 public void TC_ID_04_12() throws InterruptedException { 
				  
	              WebElement search_Jobs = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input")); 
				  
				  search_Jobs.click();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				  search_Jobs.clear();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			        
				  search_Jobs.sendKeys("Android developer");
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			       
				  search_Jobs.click();
			       
			       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			       search_Jobs.sendKeys(Keys.ENTER);

			       Thread.sleep(10000);
				  
				  WebElement Edit_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr/td[6]/button")); 

				  Edit_Button.click();
			       
			      Thread.sleep(5000); 
				  
			   // Locate the Job_Title_Field    
		    	  
		    	  WebElement Job_Title_Field = driver.findElement(By.xpath("//input[@name='jp_title']"));
		    	  
		          // Check if the field is displayed
		          boolean isDisplayed = Job_Title_Field.isDisplayed();

		          // Check if the field is enabled
		          boolean isEnabled = Job_Title_Field.isEnabled();

		          // Print the results
		          System.out.println("Job_Title_Field Displayed: " + isDisplayed);
		          System.out.println("Job_Title_Field Enabled: " + isEnabled);
			   
//			  //Company_List_Dropdown 
//			   
//	    	  WebElement Company_List_Dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[1]/div[2]/div/div/input"));
//		    	  
//		          // Check if the field is displayed
//		          boolean isDisplayed1 = Company_List_Dropdown.isDisplayed();
	//
//		          // Print the results
//		          System.out.println("Company_List_Dropdown Displayed: " + isDisplayed1);
			   
			   //Start_Date
			   
		           WebElement Start_Date = driver.findElement(By.xpath("//input[@name='jp_start_date']"));
		    	  
		          // Check if the field is displayed
		          boolean isDisplayed2 = Start_Date.isDisplayed();

		          // Check if the field is enabled
		          boolean isEnabled2 = Start_Date.isEnabled();

		          // Print the results
		          System.out.println("Start_Date Displayed: " + isDisplayed2);
		          System.out.println("Start_Date Enabled: " + isEnabled2);  
		          
		        //End_Date
				   
	   	           WebElement End_Date = driver.findElement(By.xpath("//input[@name='jp_end_date']"));
			    	  
			          // Check if the field is displayed
			          boolean isDisplayed3 = End_Date.isDisplayed();

			          // Check if the field is enabled
			          boolean isEnabled3 = End_Date.isEnabled();

			          // Print the results
			          System.out.println("End_Date Displayed: " + isDisplayed3);
			          System.out.println("End_Date Enabled: " + isEnabled3);    
			      
	             // Basic Requirements               
			          
			     //Employment_Type 
			          			          
		                WebElement Employment_Type = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/div/div[3]/div[1]/div/div/input"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed4 = Employment_Type.isDisplayed();
			            boolean isEnabled4 = Employment_Type.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed4, "Employment_Type is not displayed");
			            Assert.assertTrue(isEnabled4, "Employment_Type is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed4 && isEnabled4) {
			                System.out.println("Employment_Type is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Employment_Type is either not displayed or not enabled.");
			            } 
			          
			     //Experience_Level
			            
			            WebElement Experience_Level = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/div/div[3]/div[2]/div/div/div[1]"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed5 = Experience_Level.isDisplayed();
			            boolean isEnabled5 = Experience_Level.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed5, "Experience_Level is not displayed");
			            Assert.assertTrue(isEnabled5, "Experience_Level is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed5 && isEnabled5) {
			                System.out.println("Experience_Level is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Experience_Level is either not displayed or not enabled.");
			            }   
			            
			            		            
				     //Highest_Education_Level
			            
			            WebElement Highest_Education_Level = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/div/div[3]/div[3]/div/div/input"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed6 = Highest_Education_Level.isDisplayed();
			            boolean isEnabled6 = Highest_Education_Level.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed6, "Highest_Education_Level is not displayed");
			            Assert.assertTrue(isEnabled6, "Highest_Education_Level is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed6 && isEnabled6) {
			                System.out.println("Highest_Education_Level is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Highest_Education_Level is either not displayed or not enabled.");
			            } 
			          
			            	            
	                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
			            //identify element
		                WebElement m = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/div/div[9]/div/div/div/div[1]/span"));
		                //scroll to middle with Javascript Executor
		                JavascriptExecutor j = (JavascriptExecutor) driver;
		                j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m);
		                System.out.println("Text is: " + m.getText()); 
		                
		 		       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			      	            
			            
			     //Required_Degree_field  
			            
			            WebElement Required_Degree_field = driver.findElement(By.xpath("//input[@name='jp_required_degree']"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed7 = Required_Degree_field.isDisplayed();
			            boolean isEnabled7 = Required_Degree_field.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed7, "Required_Degree_field is not displayed");
			            Assert.assertTrue(isEnabled7, "Required_Degree_field is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed7 && isEnabled7) {
			                System.out.println("Required_Degree_field is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Required_Degree_field is either not displayed or not enabled.");
			            } 
			          
			         	            
		                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
			            //identify element
		                WebElement m1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/div/div[6]/div/div[1]/div/input"));
		                //scroll to middle with Javascript Executor
		                JavascriptExecutor j1 = (JavascriptExecutor) driver;
		                j1.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m1);
		                System.out.println("Text is: " + m1.getText()); 
		                
		 		       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
			            
			            
			     //Skill_Requirement
			          
			     //Add_Skill_Button
			            
			            WebElement Add_Skill_Button = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/div/div[4]/button"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed8 = Add_Skill_Button.isDisplayed();
			            boolean isEnabled8 = Add_Skill_Button.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed8, "Add_Skill_Button is not displayed");
			            Assert.assertTrue(isEnabled8, "Add_Skill_Button is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed8 && isEnabled8) {
			                System.out.println("Add_Skill_Button is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Add_Skill_Button is either not displayed or not enabled.");
			            }  
			            
			          
			     //Required_Skill
			            
			            WebElement Required_Skill = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/div/div[6]/div/div[1]/div/input"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed9 = Required_Skill.isDisplayed();
			            boolean isEnabled9 = Required_Skill.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed9, "Required_Skill is not displayed");
			            Assert.assertTrue(isEnabled9, "Required_Skill is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed9 && isEnabled9) {
			                System.out.println("Required_Skill is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Required_Skill is either not displayed or not enabled.");
			            }  
			          
					                
			     //Pay Range
			       		   
			     //Minimum_Pay_Ranges
			            
			            WebElement Minimum_Pay_Ranges = driver.findElement(By.xpath("//input[@name='jp_minimum_salary']"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed10 = Minimum_Pay_Ranges.isDisplayed();
			            boolean isEnabled10 = Minimum_Pay_Ranges.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed10, "Minimum_Pay_Ranges is not displayed");
			            Assert.assertTrue(isEnabled10, "Minimum_Pay_Ranges is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed10 && isEnabled10) {
			                System.out.println("Minimum_Pay_Ranges is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Minimum_Pay_Ranges is either not displayed or not enabled.");
			            }  
			          
			     //Maximum_Pay_Ranges 
			            
			            WebElement Maximum_Pay_Ranges = driver.findElement(By.xpath("//input[@name='jp_maximum_salary']"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed11 = Maximum_Pay_Ranges.isDisplayed();
			            boolean isEnabled11 = Maximum_Pay_Ranges.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed11, "Maximum_Pay_Ranges is not displayed");
			            Assert.assertTrue(isEnabled11, "Maximum_Pay_Ranges is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed11 && isEnabled11) {
			                System.out.println("Maximum_Pay_Ranges is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Maximum_Pay_Ranges is either not displayed or not enabled.");
			            }  
			  
			            
			            driver.navigate().back();
			            
			            Thread.sleep(7000);
						
	                          }
			
			  
			  @Test
				 //Try to update the job End date  
				 public void TC_ID_04_13() throws InterruptedException { 
				  
				  WebElement Job_Listing = driver.findElement(By.xpath("//a[@href='/jobs/listings/company']"));
					 
			      Job_Listing.click();
					 
				  Thread.sleep(5000);
				  			  
                  WebElement search_Jobs = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input")); 
				  
				  search_Jobs.click();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				  search_Jobs.clear();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			        
				  search_Jobs.sendKeys("Android developer");
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			       
				  search_Jobs.click();
			       
			       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			       search_Jobs.sendKeys(Keys.ENTER);

			       Thread.sleep(10000);
				  
				  WebElement Edit_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr/td[6]/button")); 

				  Edit_Button.click();
				  
				    Thread.sleep(2000);
				  
				  //End_Date
		            
		   	      WebElement End_Date = driver.findElement(By.xpath("//input[@name='jp_end_date']"));
		   	           
		   	      End_Date.click();
		   	        
		          Thread.sleep(2000);	
				    	  
		   	      End_Date.sendKeys("30092024");
		   	        
		          Thread.sleep(2000);	
		          
		          //Employment_Type 
		          
			       WebElement Employment_Type = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/div/div[3]/div[1]/div/div/input"));
			       
			       Employment_Type.click();
			       
		           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		           
		           // Perform the keyboard actions: down arrow key and enter key
			       
		           Employment_Type.sendKeys(Keys.BACK_SPACE);
				            
				   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			       Employment_Type.sendKeys("Part-Time");
			       
			       // Perform the keyboard actions: down arrow key and enter key
			          Employment_Type.sendKeys(Keys.ARROW_UP);
				            
				      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				      Employment_Type.sendKeys(Keys.ENTER);
				            
				      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					          
				       Employment_Type.sendKeys(Keys.TAB);
				            
				      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			       
			       Thread.sleep(2000);	
		          	         
			       
			          //identify element
				  WebElement m1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/button"));
				
				  //scroll to middle with Javascript Executor
				
				  JavascriptExecutor j1 = (JavascriptExecutor) driver;
				 
				  j1.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m1);
				             
				  System.out.println("Text is: " + m1.getText()); 
				  
				  //click on update button 
				  
	              WebElement Update = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/button"));
	  	           
	              Update.click();
	              
	              
	              //identify element
				   WebElement m = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/div/div[7]/div[3]/div/div/input"));
				   //scroll to middle with Javascript Executor
				   JavascriptExecutor j = (JavascriptExecutor) driver;
			       j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m);
	              System.out.println("Text is: " + m.getText()); 
	              
	             //Country 
		          
			       WebElement Country = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/div/div[7]/div[4]/div/div/div/input"));
			       
			       Country.click();
			       
		           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		           
//		           // Perform the keyboard actions: down arrow key and enter key
//		           Country.sendKeys(Keys.BACK_SPACE);
//				            
//				      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				      Country.sendKeys("India");
			       
			       // Perform the keyboard actions: down arrow key and enter key
				      Country.sendKeys(Keys.ARROW_UP);
				            
				      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				      Country.sendKeys(Keys.ENTER);
				            
				      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					          
				      Country.sendKeys(Keys.TAB);
				            
				      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			       
			       Thread.sleep(2000);	
			       
			 	  //identify element
					  WebElement m2 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/button"));				
					  //scroll to middle with Javascript Executor				
					  JavascriptExecutor j2 = (JavascriptExecutor) driver;				 
					  j2.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m2);				             
					  System.out.println("Text is: " + m2.getText()); 				  
					  //click on update button 				  
		              WebElement Update1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/button"));
		  	           
		          Update1.click();
	              
		          Thread.sleep(12000);	
		          
		          //click_on_view
		          
	               WebElement search_Jobs1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input")); 
				  
	               search_Jobs1.click();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				  search_Jobs1.clear();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			        
				  search_Jobs1.sendKeys("Android developer");
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			       
				  search_Jobs1.click();
			       
			       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			       search_Jobs1.sendKeys(Keys.ENTER);

			       Thread.sleep(10000);
				  
				  WebElement View_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr/td[5]/button")); 

			       View_Button.click();
					  
			       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				  String Employment_Type1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[1]")).getText();
				  
			      System.out.println("description displayed is = " + Employment_Type1);
							
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				              				  				  
				  //Close
				  
				  WebElement Close = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button")); 

				  Close.click();
				  
				  Thread.sleep(5000);

			  }
		
			
			  @Test
				 //Click on delete icon and check the job is removed from the list or not 
				 public void TC_ID_04_14() throws InterruptedException { 
				  
	              WebElement search_Jobs = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/input")); 
				  
				  search_Jobs.click();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				  search_Jobs.clear();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			        
				  search_Jobs.sendKeys("Android developer");
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			       
				  search_Jobs.click();
			       
			       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			       search_Jobs.sendKeys(Keys.ENTER);

				      Thread.sleep(5000);
			      
			         WebElement delete = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[7]/button"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed11 = delete.isDisplayed();
			            boolean isEnabled11 = delete.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed11, "delete is not displayed");
			            Assert.assertTrue(isEnabled11, "delete is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed11 && isEnabled11) {
			                System.out.println("delete is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("delete is either not displayed or not enabled.");
			            } 
			      
			      WebElement Delete = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[7]/button")); 
			        
			      Delete.click();
			      
			      Thread.sleep(3000);
			      
			      WebElement Delete_Pop_Up = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]")); 
			        
			      Delete_Pop_Up.click();
			      
			      Thread.sleep(3000);
			      
			      //identify element
				   WebElement m = driver.findElement(By.xpath("//a[@href='/trash']"));
				   //scroll to middle with Javascript Executor
				   JavascriptExecutor j = (JavascriptExecutor) driver;
			       j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m);
	             System.out.println("Text is: " + m.getText()); 
	                    
			     Thread.sleep(3000);

				 WebElement Trash = driver.findElement(By.xpath("//a[@href='/trash']"));
				 
				 Trash.click();
				 
			    Thread.sleep(3000);
			    
			    WebElement Delete_Jobs = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/button[1]"));
				 
			    Delete_Jobs.click();
			    
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
//			    String Delete_Jobs1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/table/tbody/tr/td[1]")).getText();
//				  
//				System.out.println("Delete_Jobs1 Column displayed = "+Delete_Jobs1 );
//				
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.navigate().refresh();
				
			     Thread.sleep(5000);

			  }
			
	  
			  @Test
				 //To check the row per page drop down working fine.
				 public void TC_ID_04_15() throws InterruptedException { 
				  
				  
				  WebElement Job_Listing = driver.findElement(By.xpath("//a[@href='/jobs/listings/company']"));
					 
			     Job_Listing.click();
					 
			     Thread.sleep(5000);
				  
			     //Row_per_page
			     
			     WebElement Row_per_page = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/div[2]/div"));

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
		            
				   WebElement Row_per_page_displayed = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/div[2]/div"));

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
				 //To check the Next-Previouse page button working 
				 public void TC_ID_04_16() throws InterruptedException { 
				  
				  WebElement Job_Listing = driver.findElement(By.xpath("//a[@href='/jobs/listings/company']"));
					 
				  Job_Listing.click();
						 
				  Thread.sleep(5000);
		            
				  //Scroll down to move next
				  
			/*      //identify element
				   WebElement m = driver.findElement(By.xpath("//button[@aria-label='Go to next page']"));
				   //scroll to middle with Javascript Executor
				   JavascriptExecutor j = (JavascriptExecutor) driver;
			       j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m);
	             System.out.println("Text is: " + m.getText());
				  			  
				  //Next_button
				  
				     WebElement Next_button = driver.findElement(By.xpath("//button[@aria-label='Go to next page']"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed11 = Next_button.isDisplayed();
			            boolean isEnabled11 = Next_button.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed11, "Next_button is not displayed");
			            Assert.assertTrue(isEnabled11, "Next_button is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed11 && isEnabled11) {
			                System.out.println("Next_button is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Next_button is either not displayed or not enabled.");
			            } 
				     
					     WebElement Row_per_page1 = driver.findElement(By.xpath("//button[@aria-label='Go to next page']"));
					     
					     Row_per_page1.click();
					     
						 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						 
						 Thread.sleep(5000);


						  //Previous_button
						  
					     WebElement Previous_button = driver.findElement(By.xpath("//button[@aria-label='Go to previous page']"));

				            // Check if the field is displayed and enabled
				            boolean isDisplayed12 = Previous_button.isDisplayed();
				            boolean isEnabled12 = Previous_button.isEnabled();

				            // Assert the conditions
				            Assert.assertTrue(isDisplayed11, "Previous_button is not displayed");
				            Assert.assertTrue(isEnabled11, "Previous_button is not enabled");

				            // Use if-else for additional logic
				            if (isDisplayed11 && isEnabled11) {
				                System.out.println("Previous_button is displayed and enabled. Ready for interaction.");
				            } else {
				                System.out.println("Previous_button is either not displayed or not enabled.");
				            } 
					     
						     WebElement Previous_button1 = driver.findElement(By.xpath("//button[@aria-label='Go to previous page']"));
						     
						     Previous_button1.click();
						     
							 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				*/  
	   }
	   	 
	     }


