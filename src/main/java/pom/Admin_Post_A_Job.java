package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Closed_Tab;

public class Admin_Post_A_Job {
	
	public WebDriver driver;
	public Closed_Tab windowUtil;
		
	@FindBy(xpath = "//input[@name='email']")  WebElement  Email_Admin;
		
	@FindBy(xpath = "//input[@name='password']")  WebElement  Password_Admin;
	
	@FindBy(xpath = "//button[@type='submit']")	 WebElement  SubmitButton_Admin;
	
	@FindBy(xpath = "//a[@href='/jobs/postjob']")	 WebElement  Post_a_Job;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div[1]/h3") WebElement  Page_Name_Post_a_Job;

//	@FindBy(xpath = "//input[@name='jp_title']") WebElement  Job_Title;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/form/div[1]/div[1]/div/div/input") WebElement  Job_Title;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[1]/div[1]/div[2]/div/div/input") WebElement  Company;
	
	@FindBy(xpath = "//input[@name='jp_start_date']") WebElement  Start_Date;

	@FindBy(xpath = "//input[@name='jp_end_date']") WebElement  End_date;
	
	@FindBy(xpath = "//input[@name='jp_min_exp']") WebElement  Min_Exp;

	@FindBy(xpath = "//input[@name='jp_max_exp']") WebElement  Max_Exp;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[1]/div[4]/div[1]/div/div/input") WebElement  Emp_Type;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[1]/div[4]/div[2]/div/div/input") WebElement  Highest_Education;
	
	@FindBy(xpath = "//input[@name='jp_required_degree']") WebElement  Required_degree;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[1]/div[5]/button") WebElement  Add_Skill;
	
	@FindBy(xpath = "//input[@name='jp_skills']") WebElement  Skills;
	
	//@FindBy(xpath = "/html/body/div[3]/div[3]/form/div[1]/div/div/input") WebElement  Skills;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/form/div[2]/button[2]") WebElement  Add_New_Skill;
	
	//@FindBy(xpath = "/html/body/div[3]/div[3]/form/div[2]/button[2]") WebElement  Add_New_Skill;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[1]/div[6]/div/div/input") WebElement  Required_Skill;
	
	@FindBy(xpath = "//input[@name='jp_minimum_salary']") WebElement  Minimum_Pay_Ranges;
	
	@FindBy(xpath = "//input[@name='jp_maximum_salary']") WebElement  Maximum_Pay_Ranges;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[1]/div[8]/div/div[1]/div[1]/div/div/input") WebElement  Location_Type;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[1]/div[8]/div/div[1]/div[2]/div/div/input") WebElement  Country;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[1]/div[8]/div/div[2]/div[1]/div/div/input") WebElement  State;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[1]/div[8]/div/div[2]/div[2]/div/div/input") WebElement  City;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/form/div[1]/div[9]/button") WebElement  Add_Benifit_Button;
	
	@FindBy(xpath = "//input[@name='jp_benefits']") WebElement  Benifit;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/form/div[2]/button[2]") WebElement  Add_New_Benifit_Button;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[1]/div[10]/div/div/div/input") WebElement  Job_Benifit;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[1]/div[12]/div/div/div/div/input") WebElement  Add_Keyword;
	
	@FindBy(xpath = "//div[contains(@class, 'ql-editor ql-blank')]") WebElement  Description;

	@FindBy(xpath = "//button[contains(@class, 'MuiButton-contained')]") WebElement  Submit;	
		
   // Constructor to initialize elements
   public Admin_Post_A_Job(WebDriver driver) {
   this.driver = driver;
   PageFactory.initElements(driver, this);
	
   }

  // Methods to interact with the elements
  public void enterUsername(String username) {
   // driver.findElement(Email).sendKeys(username);
	Email_Admin.sendKeys(username);
  }

  public void enterPassword(String password) {
  //  driver.findElement(passwordField).sendKeys(password);
	Password_Admin.sendKeys(password);
  }

   public void clickLogin() {
    //driver.findElement(loginButton).click();
	SubmitButton_Admin.click();
     }
     
  public void Click_on_Post_a_Job() throws InterruptedException {
	   
	Post_a_Job.click();
	
    }

public boolean Check_Page_Name_displayed () throws InterruptedException {
	
	Post_a_Job.getText();
    	
	return Post_a_Job.isDisplayed();
    }


public String Check_Page_Name () throws InterruptedException {
	
	return Page_Name_Post_a_Job.getText();
	 
	 
   
    } 

     public boolean Check_Job_Title_field() throws InterruptedException {
	 
    	 Job_Title.isDisplayed();
	 
	 return Job_Title.isEnabled();
	
}
     
     public boolean Check_Company_field() throws InterruptedException {
    	 
    	 Company.isDisplayed();
	 
	 return Company.isEnabled();
	
}

public boolean Check_End_date_field() throws InterruptedException {
	 
	End_date.isDisplayed();
	 
	 return End_date.isEnabled();
	
}

public boolean Check_Start_Date_field() throws InterruptedException {
	 
	Start_Date.isDisplayed();
	 
	 return Start_Date.isEnabled();
	
}

public boolean Check_Min_Exp_field() throws InterruptedException {
	 
	Min_Exp.isDisplayed();
	 
	 return Min_Exp.isEnabled();
	
}

public boolean Check_Max_Exp_field() throws InterruptedException {
	 
	Max_Exp.isDisplayed();
	 
	 return Max_Exp.isEnabled();
	
}

public boolean Check_Emp_Type_Dropdown() throws InterruptedException {
	 
	Emp_Type.isDisplayed();
	 
	 return Emp_Type.isEnabled();
	
}

public boolean Check_Highest_Education_dropdown() throws InterruptedException {
	 
	Highest_Education.isDisplayed();
	 
	 return Highest_Education.isEnabled();
	
}

public boolean Check_Required_degree_field() throws InterruptedException {
	 
	Required_degree.isDisplayed();
	 
	 return Required_degree.isEnabled();
	
}

public boolean Check_Add_Skill_Button() throws InterruptedException {
	 
	Add_Skill.isDisplayed();
	 
	 return Add_Skill.isEnabled();
	
}

public boolean Check_Required_Skill_field() throws InterruptedException {
	 
	Required_Skill.isDisplayed();
	 
	 return Required_Skill.isEnabled();
	
}
public boolean Check_Minimum_Pay_Ranges_field() throws InterruptedException {
	 
	Minimum_Pay_Ranges.isDisplayed();
	 
	 return Minimum_Pay_Ranges.isEnabled();
	
}
public boolean Check_Maximum_Pay_Ranges_field() throws InterruptedException {
	 
	Maximum_Pay_Ranges.isDisplayed();
	 
	 return Maximum_Pay_Ranges.isEnabled();
	
}
public boolean Check_Location_Type_dropdown() throws InterruptedException {
	 
	Location_Type.isDisplayed();
	 
	 return Location_Type.isEnabled();
	
}
public boolean Check_Country_dropdown() throws InterruptedException {
	 
	Country.isDisplayed();
	 
	 return Country.isEnabled();
	
}
public boolean Check_State_dropdown() throws InterruptedException {
	 
	State.isDisplayed();
	 
	 return State.isEnabled();
	
}
public boolean Check_City_dropdown() throws InterruptedException {
	 
	City.isDisplayed();
	 
	 return City.isEnabled();
	
}
public boolean Check_Add_Benifit_Button() throws InterruptedException {
	 
	Add_Benifit_Button.isDisplayed();
	 
	 return Add_Benifit_Button.isEnabled();
	
}
public boolean Check_Job_Benifit_button() throws InterruptedException {
	 
	Job_Benifit.isDisplayed();
	 
	 return Job_Benifit.isEnabled();
	
}
public boolean Check_Add_Keyword_field() throws InterruptedException {
	 
	Add_Keyword.isDisplayed();
	 
	 return Add_Keyword.isEnabled();
	
}
public boolean Check_Description_field() throws InterruptedException {
	 
	Description.isDisplayed();
	 
	 return Description.isEnabled();
	
}
public boolean Check_Submit_button() throws InterruptedException {
	 
	Submit.isDisplayed();
	 
	 return Submit.isEnabled();
	
}

public void Click_Submit_button() throws InterruptedException {
	
	   //scroll to middle with Javascript Executor
	   JavascriptExecutor j = (JavascriptExecutor) driver;
	   j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", Submit);
	 
       Submit.click();	
}

public void Enter_Data(String Job_Title_1, 
		String Company_1,
       // String End_Date_1, 
        String Min_Experience_1,
        String Max_Experience_1,
        String Employment_Type_1,
        String Educational_Level_1,
        String Required_Degree_1,
        String Skills_1,
        String Required_Skill_1,
        String Required_Skill_2,
        String Minimum_Pay_Ranges_1,
        String Maximum_Pay_Ranges_1,   		                 
        String Location_Type_1,
        String Country_1,
        String State_1,
        String City_1,
        String Benifit_1,
        String Job_Benifit_1,
        String Job_Benifit_2,
        String Add_Keyword_1,
        String Add_Keyword_2,
        String Job_Description_1
        ) throws InterruptedException {
	
	Job_Title.sendKeys(Job_Title_1);
	
	Thread.sleep(3000);

	Company.sendKeys(Company_1);

	Company.sendKeys(Keys.ARROW_UP);
	
	Company.sendKeys(Keys.ENTER);
	
	Company.click();
	
	Thread.sleep(3000);
		
	Min_Exp.sendKeys(Min_Experience_1);
	
	Max_Exp.sendKeys(Max_Experience_1);
	
	
	Emp_Type.sendKeys(Employment_Type_1);

	Emp_Type.sendKeys(Keys.ARROW_UP);

	Emp_Type.sendKeys(Keys.ENTER);
	
	
	Highest_Education.sendKeys(Educational_Level_1);

	Highest_Education.sendKeys(Keys.ARROW_UP);

	Highest_Education.sendKeys(Keys.ENTER);
		
	Required_degree.sendKeys(Required_Degree_1);
		
	Add_Skill.click();
	
	Skills.sendKeys(Skills_1);
	
	Add_New_Skill.click();
		
	Required_Skill.sendKeys(Required_Skill_1);
	
	Required_Skill.sendKeys(Keys.ARROW_UP);

	Required_Skill.sendKeys(Keys.ENTER);
	
    Required_Skill.sendKeys(Required_Skill_2);
	
	Required_Skill.sendKeys(Keys.ARROW_UP);

	Required_Skill.sendKeys(Keys.ENTER);
	
	
	Minimum_Pay_Ranges.sendKeys(Minimum_Pay_Ranges_1);
	
	Maximum_Pay_Ranges.sendKeys(Maximum_Pay_Ranges_1);
	
	Thread.sleep(2000);
	
	Location_Type.sendKeys(Location_Type_1);
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	Location_Type.sendKeys(Keys.ARROW_UP);

	Location_Type.sendKeys(Keys.ENTER);

    Country.sendKeys(Country_1);
    
    Thread.sleep(4000); 

    Country.sendKeys(Keys.ARROW_UP);

    Country.sendKeys(Keys.ENTER);

    State.sendKeys(State_1);
    
  //  State.sendKeys(Keys.ENTER);
    
    Thread.sleep(3000);   
    
    State.sendKeys(Keys.ARROW_DOWN);

   State.sendKeys(Keys.ENTER);

   City.sendKeys(City_1);
   
   Thread.sleep(4000);
   
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

   City.sendKeys(Keys.ARROW_UP);

   City.sendKeys(Keys.ENTER);


   Add_Benifit_Button.click();
   
   Thread.sleep(3000);
   
   Benifit.sendKeys(Benifit_1);
	
   Add_New_Benifit_Button.click();
		
   Job_Benifit.sendKeys(Job_Benifit_1);
	
   Job_Benifit.sendKeys(Keys.ARROW_UP);

   Job_Benifit.sendKeys(Keys.ENTER);
	
   Job_Benifit.sendKeys(Job_Benifit_2);
	
   Job_Benifit.sendKeys(Keys.ARROW_UP);

   Job_Benifit.sendKeys(Keys.ENTER);
	   

	Add_Keyword.sendKeys(Add_Keyword_1);
	
	Add_Keyword.sendKeys(Keys.ENTER);
	
    Add_Keyword.sendKeys(Add_Keyword_2);
	
	Add_Keyword.sendKeys(Keys.ENTER);

	Description.sendKeys(Job_Description_1);
	
	//Submit.click();

}

public void Start_End_Date_1 (String Start_Date_1,String End_Date_1) throws InterruptedException {
	
	   Start_Date.sendKeys(Keys.CONTROL + "A");

	   Start_Date.sendKeys(Keys.BACK_SPACE);
		
	    Start_Date.click();
		
		Thread.sleep(3000);
		
		End_date.sendKeys(Start_Date_1);
	
		End_date.sendKeys(Keys.CONTROL + "A");

		End_date.sendKeys(Keys.BACK_SPACE);
		
		End_date.click(); 
		
		Thread.sleep(3000);
		
		End_date.sendKeys(End_Date_1);
							    	
		}
public void Start_End_Date_2 (String Start_Date_2,String End_Date_2) throws InterruptedException {
	
	   Start_Date.sendKeys(Keys.CONTROL + "A");

	   Start_Date.sendKeys(Keys.BACK_SPACE);
		
	    Start_Date.click();
		
		Thread.sleep(3000);
		
		End_date.sendKeys(Start_Date_2);
	
		End_date.sendKeys(Keys.CONTROL + "A");

		End_date.sendKeys(Keys.BACK_SPACE);
		
		End_date.click(); 
		
		Thread.sleep(3000);
		
		End_date.sendKeys(End_Date_2);
							    	
		}
public void Start_End_Date_3 (String Start_Date_3,String End_Date_3) throws InterruptedException {
	
	   Start_Date.sendKeys(Keys.CONTROL + "A");

	   Start_Date.sendKeys(Keys.BACK_SPACE);
		
	    Start_Date.click();
		
		Thread.sleep(3000);
		
		End_date.sendKeys(Start_Date_3);
	
		End_date.sendKeys(Keys.CONTROL + "A");

		End_date.sendKeys(Keys.BACK_SPACE);
		
		End_date.click(); 
		
		Thread.sleep(3000);
		
		End_date.sendKeys(End_Date_3);
							    	
		}

public void Start_End_Date_4 (String Start_Date_4,String End_Date_4) throws InterruptedException {
	
	   Start_Date.sendKeys(Keys.CONTROL + "A");

	   Start_Date.sendKeys(Keys.BACK_SPACE);
		
	    Start_Date.click();
		
		Thread.sleep(3000);
		
		End_date.sendKeys(Start_Date_4);
	
		End_date.sendKeys(Keys.CONTROL + "A");

		End_date.sendKeys(Keys.BACK_SPACE);
		
		End_date.click(); 
		
		Thread.sleep(3000);
		
		End_date.sendKeys(End_Date_4);
							    	
		}

public void Start_End_Date_5 (String Start_Date_5,String End_Date_5) throws InterruptedException {
	
	   Start_Date.sendKeys(Keys.CONTROL + "A");

	   Start_Date.sendKeys(Keys.BACK_SPACE);
		
	    Start_Date.click();
		
		Thread.sleep(3000);
		
		End_date.sendKeys(Start_Date_5);
	
		End_date.sendKeys(Keys.CONTROL + "A");

		End_date.sendKeys(Keys.BACK_SPACE);
		
		End_date.click(); 
		
		Thread.sleep(3000);
		
		End_date.sendKeys(End_Date_5);
							    	
		}
}

