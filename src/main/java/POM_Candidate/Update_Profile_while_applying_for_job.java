package POM_Candidate;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseTest;
import utils.ExcelUtilityReg;

public class Update_Profile_while_applying_for_job extends BaseTest
{
public WebDriver driver;
	
	@FindBy(xpath="//span[text()='Job Listings']")
	private WebElement joblisting;
	
	@FindBy(xpath="//ul[@class='MuiList-root MuiList-padding css-1656cpk']//li")
	private List<WebElement> JobList;
	
    @FindBy(xpath="(//span[@class='MuiTouchRipple-root css-w0pj6f'])[2]")
    private WebElement UpdateProfileandApplyButton;
    
   // @FindBy(xpath="//span[text()='Upload']")
    @FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement uploadresume;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	private WebElement uploadphoto;
	
	@FindBy(xpath="//input[@aria-invalid='false']")
	private WebElement bdate;

	@FindBy(name="jp_age")
	private WebElement age;
	
	@FindBy(name="jp_designation")
	private WebElement desg;
	
	@FindBy(name="jp_address")
	private WebElement address;
	
	@FindBy(name="jp_country")
	private WebElement country;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> countries;
	
	@FindBy(name="jp_state")
	private WebElement state;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> states;
	
	@FindBy(xpath="//input[@role='combobox']")
	private WebElement clickcity;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> cities; 
	
	@FindBy(xpath="//input[@aria-autocomplete='list']")
	private WebElement qualification;
	
	@FindBy(xpath="//ul[@class='MuiAutocomplete-listbox css-12sniws']/li")
	private List<WebElement> listofqualification;
	
	@FindBy(name="jp_degree_name")
	private WebElement degree;
	
	@FindBy(xpath="//input[@placeholder='DD/MM/YYYY']")
	private WebElement year;
	
	@FindBy(name="jp_current_company")
	private WebElement currentcompany;
	
	@FindBy(name="jp_current_ctc")
	private WebElement CTC;
	
	@FindBy(name="jp_notice_period")
	private WebElement noticeperiod;
	
	@FindBy(name="jp_yoe")
	private WebElement yoe;
	
	@FindBy(xpath="//input[@placeholder='Skills']")
	private WebElement clickarrowskill;

	@FindBy(name="jp_language")
	private WebElement language;

	@FindBy(name="jp_about_me")
	private WebElement aboutme;
	
	@FindBy(xpath="//button[text()='Apply']")
	private WebElement ApplyButton;
	
	@FindBy(xpath="//p[text()='Add Skill']")
	private WebElement addskill;
	
	@FindBy(xpath="//input[@placeholder='Skills']")
	private WebElement enterskill;
	
	@FindBy(xpath="//button[text()='Add New Skill']")
	private WebElement clicktoaddskill;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextbutton;
	
	@FindBy(xpath="//button[text()='Skip']")
	private WebElement skipbtn;
	
	@FindBy(xpath="//button[text()='Reset']")
	private WebElement resetbtn;
	
	@FindBy(xpath="//button[text()='Review Job']")
	private WebElement ReviewJobtab;
	
	@FindBy(xpath="//h5[@class='MuiTypography-root MuiTypography-h5 css-zq6grw']")
	private WebElement jobtitleonReviewJobPage;
	
	@FindBy(xpath="//h4[text()='Applied']")
	private WebElement appliedtext;
	public boolean is_ResetButton_display()
	{
		return resetbtn.isDisplayed(); 
	}
	public WebElement click_Resetbutton()
	{
		return resetbtn;
	}
	public void clickskipbtn()
	{
		skipbtn.click();
	}
	public void clicknextbtn()
	{
		nextbutton.click();
	}
	public void viewjob()
	{
		for(WebElement job:JobList)
		{
			job.click();
			break;
		}
		
	}
	public void clickaddskill()
	{
		addskill.click();
	}
	
	public void enternewskill(String newskill)
	{
		enterskill.sendKeys(newskill);
	}
	public void newskilladded()
	{
		clicktoaddskill.click();
	}
	public Update_Profile_while_applying_for_job (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public boolean is_updateProfileandApplybutton_display()
	{
		return UpdateProfileandApplyButton.isDisplayed();
	}
	
	public WebElement getUpdateProfileandApplyButton() 
	{
		return UpdateProfileandApplyButton;
	}
	@FindBy(xpath="//h5[text()='Add Basic Detail']")
	private WebElement addbasicdetailstitle;
	@FindBy(xpath="//h5[text()='Upload Resume and Profile Photo']")
	private WebElement resumeprofiletitle;
	@FindBy(xpath="//h5[text()='Add Employment Details']")
	private WebElement empdetailstitle;
	@FindBy(xpath="//h5[text()='Add Education Details']")
	private WebElement educationtitle;
	@FindBy(xpath="//h5[text()='Add Address']")
	private WebElement addresstitle;
	@FindBy(xpath="//button[text()='Review Profile']")
	private WebElement reviewprofiletab;
	public void enter_details(String dob,String AGE,String profile,String skill,String lang, String Bio ,
			String resumepath, String photopath, String currentcompanyname, String ctcamonut, String expyear,
			 String noticeperioddays,String degreetype, String degreename, String passingyear,String add, String City) throws AWTException, IOException, InterruptedException
	{
		Assert.assertTrue(addbasicdetailstitle.isDisplayed(), "Basic details title should be display");
		bdate.click();
		bdate.sendKeys(Keys.CONTROL+"a");
		bdate.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(4000);
		bdate.sendKeys(dob);
		age.sendKeys(AGE);
		desg.click();
		desg.sendKeys(profile);
		clickarrowskill.click();
		Thread.sleep(2000);
		clickarrowskill.sendKeys(skill); 
		Thread.sleep(2000);
		clickarrowskill.sendKeys(Keys.ARROW_DOWN);
		clickarrowskill.sendKeys(Keys.ENTER);
        language.sendKeys(lang);
        aboutme.sendKeys(Bio);
        nextbutton.click();
        
        Assert.assertTrue(resumeprofiletitle.isDisplayed(), "Upload resume and photo title should be display");
		Thread.sleep(3000);
		uploadresume.click();
		methods.uploadfile(driver, resumepath);
	    Thread.sleep(4000);
		uploadphoto.click();
		methods.uploadfile(driver, photopath);
		nextbutton.click();
		
		Assert.assertTrue(empdetailstitle.isDisplayed(), "Employee details title should be display");
        currentcompany.sendKeys(currentcompanyname);
		CTC.sendKeys(ctcamonut);
		Thread.sleep(4000);
		yoe.sendKeys(Keys.CONTROL+"a");
		yoe.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(4000);
		yoe.sendKeys(expyear);
		noticeperiod.sendKeys(noticeperioddays);
		nextbutton.click();
        Thread.sleep(3000);

    //    Assert.assertTrue(educationtitle.isDisplayed(), "Education details title should be display");
		qualification.click();
		for(WebElement q:listofqualification)
	       {
	    	   String qualifyname = q.getText().trim(); //  trim extra spaces
	    	   if(qualifyname.equals(degreetype))
	    	   {
	    		   q.click();
	    		   break;
	    	   }
	    	  
	       }
		
		degree.sendKeys(degreename);
		year.click();
		year.sendKeys(Keys.ARROW_LEFT);
		year.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(4000);
		year.sendKeys(passingyear);
		nextbutton.click();
        Thread.sleep(3000);
      //  Assert.assertTrue(addresstitle.isDisplayed(), "Address details title should be display");
		address.sendKeys(add);
		clickcity.sendKeys(City);
		Thread.sleep(3000);
		clickcity.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		clickcity.sendKeys(Keys.ENTER);
		nextbutton.click();
		Assert.assertTrue(reviewprofiletab.isDisplayed(), "Review profile tab should be display");
	}
	@FindBy(xpath="//div[@role='button']")
	private WebElement skillValue;
	public void verify_data_is_correct() throws IOException, InterruptedException
	{
		String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
	     String sheetName="Candidate_Profile_deatils";
	     ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
	 
	     int rowCount = excel.getRowCount();
	     for(int i=1; i<= rowCount; i++)
	     {
	    	String dob = excel.getCellData(i, 2);
	 		String AGE = excel.getCellData(i, 4);
	 		String profile = excel.getCellData(i, 3);
	 		String skill = excel.getCellData(i, 17);
	 //		String lang = excel.getCellData(i, 18);
	 		String Bio = excel.getCellData(i, 19);
	 		String resumepath = excel.getCellData(i, 0);
	 		String photopath = excel.getCellData(i, 1);
	 		String currentcompanyname = excel.getCellData(i, 11);
	 		String ctcamonut = excel.getCellData(i, 12);
	 		String expyear = excel.getCellData(i, 15);
	 		String noticeperioddays = excel.getCellData(i, 13);
	 		String degreetype = excel.getCellData(i, 14);
	 		String degreename = excel.getCellData(i, 9);
	 	    String passingyear = excel.getCellData(i, 10);
	 		String add = excel.getCellData(i, 5);
	 	//	String City = excel.getCellData(i, 8);
		    String Country = excel.getCellData(i, 6);
		    String State = excel.getCellData(i, 7);
		 
		    
	        String actual_DOB = bdate.getAttribute("value").trim();
	        Thread.sleep(2000);
	    	String actual_age = age.getAttribute("value").trim();
			Thread.sleep(2000);
			String actual_desg = desg.getAttribute("value").trim();
			Thread.sleep(2000);
		//	String actual_language = language.getAttribute("value").trim();
			Thread.sleep(2000);
			String actual_aboutme = aboutme.getAttribute("value").trim();
			Thread.sleep(2000);
			nextbutton.click();
			nextbutton.click();
			Thread.sleep(2000);
			String actual_currentcompany = currentcompany.getAttribute("value").trim();
			Thread.sleep(4000);
			String actual_CTC = CTC.getAttribute("value").trim();
			Thread.sleep(2000);
			String actual_yoe = yoe.getAttribute("value").trim();
			Thread.sleep(2000);
			String actual_noticeperiod = noticeperiod.getAttribute("value").trim();
			Thread.sleep(2000);
			nextbutton.click();
			Thread.sleep(2000);
			String actual_qualification = qualification.getAttribute("value").trim();
			Thread.sleep(2000);
			String actual_degree = degree.getAttribute("value").trim();
			Thread.sleep(2000);
			String actual_year = year.getAttribute("value").trim();
			Thread.sleep(2000);
			nextbutton.click();
			Thread.sleep(2000);
			String actual_address = address.getAttribute("value").trim();
			Thread.sleep(2000);
		//	String actual_city = clickcity.getAttribute("value").trim();
			Thread.sleep(2000);
			String actual_country = country.getAttribute("value").trim();
			Thread.sleep(2000);
			String actual_state = state.getAttribute("value").trim();
			Thread.sleep(2000);
			nextbutton.click();
			Thread.sleep(5000);
			Assert.assertEquals(actual_DOB, dob, "DOB does not match");
			Assert.assertEquals(actual_age, AGE, "Age does not match");
			Assert.assertEquals(actual_desg, profile, "Designation does not match");
		
	//		Assert.assertEquals(actual_language, lang, "Language does not match");
			Assert.assertEquals(actual_aboutme, Bio, "Abour me does not match");
			
			Assert.assertEquals(actual_currentcompany, currentcompanyname, "Current company does not match");
			Assert.assertEquals(actual_CTC, ctcamonut, "CTC amount does not match");
			Assert.assertEquals(actual_yoe, expyear, "Year of experience does not match");
			Assert.assertEquals(actual_noticeperiod, noticeperioddays, "Notice period does not match");
			
			Assert.assertEquals(actual_qualification, degreetype, "Qualification does not match");
			Assert.assertEquals(actual_degree, degreename, "Degree does not match");
			Assert.assertEquals(actual_year, passingyear, "Passing year does not match");
			Assert.assertEquals(actual_address, add, "Address does not match");
	//		Assert.assertEquals(actual_city, City, "City does not match");
			Assert.assertEquals(actual_state, State, "State does not match");
			Assert.assertEquals(actual_country, Country, "Country does not match");
			break;
	     }
	}
	     public void update_details(String dob,String AGE,String profile,String skill,String lang, String Bio ,
	 			String resumepath, String photopath, String currentcompanyname, String ctcamonut, String expyear,
	 			 String noticeperioddays,String degreetype, String degreename, String passingyear,String add, String City) throws AWTException, IOException, InterruptedException
	 	{
	 		
	 		bdate.click();
	 		bdate.sendKeys(Keys.CONTROL+"a");
	 		bdate.sendKeys(Keys.BACK_SPACE);
	 	    bdate.sendKeys(dob);
	 		
	 		age.sendKeys(Keys.CONTROL+"a");
	 		age.sendKeys(Keys.BACK_SPACE);
	 		age.sendKeys(AGE);
	 		
	 		//desg.click();
	 		desg.sendKeys(Keys.CONTROL+"a");
	 		desg.sendKeys(Keys.BACK_SPACE);
	 		desg.sendKeys(profile);
	 		
	 		clickarrowskill.click();
	 		clickarrowskill.sendKeys(Keys.CONTROL+"a");
	 		clickarrowskill.sendKeys(Keys.BACK_SPACE);
	 		Thread.sleep(2000);
	 		clickarrowskill.sendKeys(skill);
	 		Thread.sleep(2000);
	 		clickarrowskill.sendKeys(Keys.ARROW_DOWN);
	 		clickarrowskill.sendKeys(Keys.ENTER);
	         
	        language.sendKeys(Keys.CONTROL+"a");
	        language.sendKeys(Keys.BACK_SPACE);
	        language.sendKeys(lang);
	        
	        aboutme.sendKeys(Keys.CONTROL+"a");
	        aboutme.sendKeys(Keys.BACK_SPACE);
	        aboutme.sendKeys(Bio);
	        nextbutton.click();
	        
	 		Thread.sleep(4000);
	 		Assert.assertTrue(uploadresume.isDisplayed(), "Upload resume should be display");
	 		uploadresume.click();
	 		methods.uploadfile(driver, resumepath);
	 	    Thread.sleep(4000);
	 	    Assert.assertTrue(uploadphoto.isDisplayed(), "Upload photo should be display");
	 		uploadphoto.click();
	 		methods.uploadfile(driver, photopath);
	 		nextbutton.click();
	        Thread.sleep(3000);

	        currentcompany.sendKeys(Keys.CONTROL+"a");
	        currentcompany.sendKeys(Keys.BACK_SPACE);
	        currentcompany.sendKeys(currentcompanyname);
	        
	        CTC.sendKeys(Keys.CONTROL+"a");
	        CTC.sendKeys(Keys.BACK_SPACE);
	 		CTC.sendKeys(ctcamonut);
	 		Thread.sleep(4000);
	 		
	 		yoe.sendKeys(Keys.CONTROL+"a");
	 		yoe.sendKeys(Keys.BACK_SPACE);
	 		yoe.sendKeys(expyear);
	 		
	 		noticeperiod.sendKeys(Keys.CONTROL+"a");
	 		noticeperiod.sendKeys(Keys.BACK_SPACE);
	 		noticeperiod.sendKeys(noticeperioddays);
	 		nextbutton.click();
	        Thread.sleep(3000);

	        qualification.sendKeys(Keys.CONTROL+"a");
	        qualification.sendKeys(Keys.BACK_SPACE);
	 		qualification.click();
	 		for(WebElement q:listofqualification)
	 	       {
	 	    	   String qualifyname = q.getText().trim(); //  trim extra spaces
	 	    	   if(qualifyname.equals(degreetype))
	 	    	   {
	 	    		   q.click();
	 	    		   break;
	 	    	   }
	 	    	  
	 	       }
	 		degree.sendKeys(Keys.CONTROL+"a");
	 		degree.sendKeys(Keys.BACK_SPACE);
	 		degree.sendKeys(degreename);
	 		
	 		year.sendKeys(Keys.CONTROL+"a");
	 		year.sendKeys(Keys.BACK_SPACE);
	 		year.click();
	 		year.sendKeys(Keys.ARROW_LEFT);
	 		year.sendKeys(Keys.ARROW_LEFT);
	 		Thread.sleep(3000);
	 		year.sendKeys(passingyear);
	 		nextbutton.click();
	 		
	 		address.sendKeys(Keys.CONTROL+"a");
	 		address.sendKeys(Keys.BACK_SPACE);
	        address.sendKeys(add);
	        
	        clickcity.sendKeys(Keys.CONTROL+"a");
	        clickcity.sendKeys(Keys.BACK_SPACE);
	 		clickcity.sendKeys(City);
	 		Thread.sleep(3000);
	 		clickcity.sendKeys(Keys.DOWN);
	 		Thread.sleep(2000);
	 		clickcity.sendKeys(Keys.ENTER);
	 		nextbutton.click();
	   }
	     public void verify_updateddata_is_correct() throws IOException, InterruptedException
	 	{
	 		String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
	 	     String sheetName="Candidate_Profile_deatils";
	 	     ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
	 	 
	 	     int rowCount = excel.getRowCount();
	 	     for(int i=2; i<= rowCount; i++)
	 	     {
	 	    	String dob = excel.getCellData(i, 2);
	 	 		String AGE = excel.getCellData(i, 4);
	 	 		String profile = excel.getCellData(i, 3);
	 	 		String skill = excel.getCellData(i, 17);
	 	 //		String lang = excel.getCellData(i, 18);
	 	 		String Bio = excel.getCellData(i, 19);
	 	 		String resumepath = excel.getCellData(i, 0);
	 	 		String photopath = excel.getCellData(i, 1);
	 	 		String currentcompanyname = excel.getCellData(i, 11);
	 	 		String ctcamonut = excel.getCellData(i, 12);
	 	 		String expyear = excel.getCellData(i, 15);
	 	 		String noticeperioddays = excel.getCellData(i, 13);
	 	 		String degreetype = excel.getCellData(i, 14);
	 	 		String degreename = excel.getCellData(i, 9);
	 	 	    String passingyear = excel.getCellData(i, 10);
	 	 		String add = excel.getCellData(i, 5);
	 	 	//	String City = excel.getCellData(i, 8);
	 		    String Country = excel.getCellData(i, 6);
	 		    String State = excel.getCellData(i, 7);
	 		 
	 	        String actual_DOB = bdate.getAttribute("value").trim();
	 	        Thread.sleep(2000);
	 	    	String actual_age = age.getAttribute("value").trim();
	 			Thread.sleep(2000);
	 			String actual_desg = desg.getAttribute("value").trim();
	 			Thread.sleep(2000);
	 		//	String actual_language = language.getAttribute("value").trim();
	 			Thread.sleep(2000);
	 			String actual_aboutme = aboutme.getAttribute("value").trim();
	 			Thread.sleep(2000);
	 			nextbutton.click();
	 			nextbutton.click();
	 			Thread.sleep(2000);
	 			String actual_currentcompany = currentcompany.getAttribute("value").trim();
	 			Thread.sleep(4000);
	 			String actual_CTC = CTC.getAttribute("value").trim();
	 			Thread.sleep(2000);
	 			String actual_yoe = yoe.getAttribute("value").trim();
	 			Thread.sleep(2000);
	 			String actual_noticeperiod = noticeperiod.getAttribute("value").trim();
	 			Thread.sleep(2000);
	 			nextbutton.click();
	 			Thread.sleep(2000);
	 			String actual_qualification = qualification.getAttribute("value").trim();
	 			Thread.sleep(2000);
	 			String actual_degree = degree.getAttribute("value").trim();
	 			Thread.sleep(2000);
	 			String actual_year = year.getAttribute("value").trim();
	 			Thread.sleep(2000);
	 			nextbutton.click();
	 			Thread.sleep(2000);
	 			String actual_address = address.getAttribute("value").trim();
	 			Thread.sleep(2000);
	 		//	String actual_city = clickcity.getAttribute("value").trim();
	 			Thread.sleep(2000);
	 			String actual_country = country.getAttribute("value").trim();
	 			Thread.sleep(2000);
	 			String actual_state = state.getAttribute("value").trim();
	 			Thread.sleep(2000);
	 			nextbutton.click();
	 			Thread.sleep(5000);
	 			Assert.assertEquals(actual_DOB, dob, "DOB does not match");
	 			Assert.assertEquals(actual_age, AGE, "Age does not match");
	 			Assert.assertEquals(actual_desg, profile, "Designation does not match");
	 		
	 	//		Assert.assertEquals(actual_language, lang, "Language does not match");
	 			Assert.assertEquals(actual_aboutme, Bio, "Abour me does not match");
	 			
	 			Assert.assertEquals(actual_currentcompany, currentcompanyname, "Current company does not match");
	 			Assert.assertEquals(actual_CTC, ctcamonut, "CTC amount does not match");
	 			Assert.assertEquals(actual_yoe, expyear, "Year of experience does not match");
	 			Assert.assertEquals(actual_noticeperiod, noticeperioddays, "Notice period does not match");
	 			
	 			Assert.assertEquals(actual_qualification, degreetype, "Qualification does not match");
	 			Assert.assertEquals(actual_degree, degreename, "Degree does not match");
	 			Assert.assertEquals(actual_year, passingyear, "Passing year does not match");
	 			Assert.assertEquals(actual_address, add, "Address does not match");
	 	//		Assert.assertEquals(actual_city, City, "City does not match");
	 			Assert.assertEquals(actual_state, State, "State does not match");
	 			Assert.assertEquals(actual_country, Country, "Country does not match");
	 			break;
	 	     }
	 	}
	    public void Verify_JobTitle_Same() throws IOException
	 	{
	 		String actualJobTitle=jobtitleonReviewJobPage.getText(); 
	 		String expectedJobTitle= data.getdata("JobTitle_On_Review_Page");
	 		if(actualJobTitle.equals(expectedJobTitle))
	 		{
	 			System.out.println("Job title is matching");
	 		}
	 		else 
	 		{
	 		     System.out.println("Job title does not match");
	 		}
	 	}
	 	public boolean is_ReviewJobTab_display()
	 	{
	 		return ReviewJobtab.isDisplayed();
	 	}
	 	public void ReviewJob()
	 	{
	 		ReviewJobtab.click();
	 	}
	 	public Boolean is_ApplyButton_display()
		{
			return ApplyButton.isDisplayed();
		}
		public void Apply()
		{
			ApplyButton.click(); 
		}
		public boolean verify_JobApplied_successfully()
		{
			return appliedtext.isDisplayed();
		}
		
     
}

