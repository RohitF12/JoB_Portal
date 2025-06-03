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
import config.Config;
import utils.ExcelUtilityReg;

public class Candidate_Profile extends BaseTest
{
	public  WebDriver driver;
	
	@FindBy(xpath = "//input[@name='email']")  WebElement  Email_comapny;
	
	@FindBy(xpath = "//input[@name='password']")  WebElement  Password_password;
	
	@FindBy(xpath = "//button[@type='submit']")	 WebElement  SubmitButton;

	@FindBy(xpath="//span[text()='Hi ']")
	//@FindBy(xpath="//div[@class='MuiBox-root css-1toqm9j']")
	private WebElement elipsismenu;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboard;
	
	@FindBy(xpath="//span[text()='About']")
	private WebElement about;
	
	@FindBy(xpath="//span[text()='Contact Us']")
	private WebElement contactus;
	
	@FindBy(xpath="//span[text()='Profile']")
	private WebElement profile;
	
	@FindBy(xpath="//span[text()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="//button[text()='Edit']")
	private WebElement edittab;
	
	@FindBy(xpath="//span[text()='Upload']")
	private WebElement uploadresume;
	public boolean is_uploadresumesection_displayed()
	{
		return uploadresume.isDisplayed();
	}
	@FindBy(xpath="//button[text()='View']")
	private WebElement viewresume;
	public boolean is_viewresumebutton_displayed()
	{
		return viewresume.isDisplayed();
	}
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div[3]/div/form/div[1]/div[1]/div/div[2]/div[2]/button")
	private WebElement uploadphoto;
	public boolean is_uploadphotosection_displayed()
	{
		return uploadphoto.isDisplayed();
	}
	@FindBy(xpath="(//button[text()='View'])[2]")
	private WebElement viewphoto;
	public boolean is_viewphotobutton_displayed()
	{
		return viewphoto.isDisplayed();
	}
	public void viewphoto()
	{
		viewphoto.click();
	}
	@FindBy(name="jp_dob")
	private WebElement bdate;
	public boolean is_DOBfield_displayed()
	{
		return bdate.isDisplayed();
	}
	@FindBy(name="jp_age")
	private WebElement age;
	
	@FindBy(name="jp_address")
	private WebElement address;
	public boolean is_addressfield_displayed()
	{
		return address.isDisplayed();
	}
	@FindBy(name="jp_country")
	private WebElement clickcountry;
	public boolean is_countryfield_displayed()
	{
		return clickcountry.isDisplayed();
	}
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> countries;
	
	@FindBy(name="jp_state")
	private WebElement clickstate;
	public boolean is_statefield_displayed()
	{
		return clickstate.isDisplayed();
	}
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> states;
	
	@FindBy(xpath="(//input[@role='combobox'])[1]")
	private WebElement clickcity;
	public boolean is_cityfield_displayed()
	{
		return clickcity.isDisplayed();
	}
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> cities; 
	
	@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]")
	private WebElement qualification;
	public boolean is_qualificationfield_displayed()
	{
		return qualification.isDisplayed();
	}
	@FindBy(xpath="//ul[@class='MuiAutocomplete-listbox css-12sniws']/li")
	private List<WebElement> listofqualification;
	
	@FindBy(name="jp_degree_name")
	private WebElement degree;
	public boolean is_degreefield_displayed()
	{
		return degree.isDisplayed();
	}
	@FindBy(name="jp_passingyear")
	private WebElement year;
	public boolean is_yearfield_displayed()
	{
		return year.isDisplayed();
	}
	@FindBy(name="jp_current_company")
	private WebElement currentcompany;
	public boolean is_currentcompanyfield_displayed()
	{
		return currentcompany.isDisplayed();
	}
	@FindBy(name="jp_current_ctc")
	private WebElement CTC;
	public boolean is_CTCfield_displayed()
	{
		return CTC.isDisplayed();
	}
	@FindBy(name="jp_notice_period")
	private WebElement noticeperiod;
	public boolean is_noticeperiodfield_displayed()
	{
		return noticeperiod.isDisplayed();
	}
	@FindBy(name="jp_yoe")
	private WebElement yoe;
	public boolean is_yoefield_displayed()
	{
		return yoe.isDisplayed();
	}
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div[3]/div/form/div[1]/div[6]/div[2]/div[1]/div[1]/div/div/input")
	private WebElement clickarrow;
	public boolean is_skilldropdownfield_displayed()
	{
		return clickarrow.isDisplayed();
	}
	@FindBy(name="jp_language")
	private WebElement language;
	public boolean is_languagefield_displayed()
	{
		return language.isDisplayed();
	}
	@FindBy(name="jp_about_me")
	private WebElement aboutme;
	public boolean is_aboutmefield_displayed()
	{
		return aboutme.isDisplayed();
	}
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitbtn;
	public boolean is_submitbtn_displayed()
	{
		return submitbtn.isDisplayed();
	}
	@FindBy(xpath="//p[text()='Add Skill']")
	private WebElement addskill;
	public boolean is_addskillbuttonfield_displayed()
	{
		return addskill.isDisplayed();
	}
	@FindBy(name="jp_skills")
	private WebElement enterskill;
	
	@FindBy(xpath="//button[text()='Add New Skill']")
	private WebElement clicktoaddskill;
	
	@FindBy(name="jp_designation")
	private WebElement designation;
	
	public boolean is_designationfield_displayed()
	{
		return designation.isDisplayed();
	}
	@FindBy(xpath="//button[text()='Security']")
	private WebElement securitytab;
	
	@FindBy(xpath="//button[text()='About']")
	private WebElement abouttab;
	
	@FindBy(xpath="//h6[text()='Bio']/parent::div/following-sibling::p")
	private WebElement biodetails;
	public boolean is_biodetails_displayed()
	{
		return biodetails.isDisplayed();
	}
	public String bio_Details()
	{
		return biodetails.getText();
	}
	
	@FindBy(xpath="//h6[text()='Education']/parent::div/following-sibling::p")
	private WebElement educationdetails;
	public boolean is_educationdetails_displayed()
	{
		return educationdetails.isDisplayed();
	}
	public String education_Details()
	{
		return educationdetails.getText();
	}
	
	@FindBy(xpath="//h6[text()='Address']/parent::div/following-sibling::p")
	private WebElement addressdetails;
	public boolean is_addressdetails_displayed()
	{
		return addressdetails.isDisplayed();
	}
	public String address_details()
	{
		return addressdetails.getText();
	}
	@FindBy(xpath="//h6[text()='Contact']/parent::div/following-sibling::p")
	private WebElement contactdetails;
	public boolean is_contactdetails_displayed()
	{
		return contactdetails.isDisplayed();
	}
	public String contact_details()
	{
		return contactdetails.getText();
	}
	@FindBy(xpath="//h6[text()='Email']/parent::div/following-sibling::p")
	private WebElement emaildetails;
	public boolean is_emaildetails_displayed()
	{
		return emaildetails.isDisplayed();
	}
	public String email_details()
	{
		return emaildetails.getText();
	}
	
	public Candidate_Profile (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void openelipsisimenu()
	{
		elipsismenu.click();
	}
	public boolean is_dashboardoption_display()
	{
		return dashboard.isDisplayed();
	}
	public boolean is_aboutoption_display()
	{
		return about.isDisplayed();
	}
	public boolean is_contactusoption_display()
	{
		return contactus.isDisplayed();
	}
	public boolean is_profileoption_display()
	{
		return profile.isDisplayed();
	}
	public boolean is_logoutoption_display()
	{
		return logout.isDisplayed();
	}
	public void opendashboard()
	{
		dashboard.click();
	}
	public void openaboutpage()
	{
		about.click();
	}
	public void opencontactuspage()
	{
		contactus.click();
	}
	public void openprofile()
	{
		profile.click();
	}
	public boolean is_abouttab_display()
	{
		return abouttab.isDisplayed();
	}
	public void clickonabouttab()
	{
		abouttab.click();
	}
	public boolean is_securitytab_display()
	{
		return securitytab.isDisplayed();
	}
	public void clickonsecurityttab()
	{
		securitytab.click();
	}
	public boolean is_edittab_display()
	{
		return edittab.isDisplayed();
	}
	public void clickonlogout()
	{
		logout.click();
	}
	public void clickonedittab()
	{
		edittab.click();
	}
	public void clicksubmitbtn()
	{
		submitbtn.click();
	}
	@FindBy(xpath="//div[text()='Profile updated successfully']")
	private WebElement validationmsg_updateprofile;
	public boolean is_validationmsg_display()
	{
		return validationmsg_updateprofile.isDisplayed();
	}
	@FindBy(name="current_password")
	private WebElement currentpass;
	public boolean is_currenpasswordfield_display()
	{
		return currentpass.isDisplayed();
	}
	@FindBy(xpath="(//button[@type='button'])[9]")
	private WebElement currentpasseye;
	
	@FindBy(name="new_password")
	private WebElement newpass;
	public boolean is_newpasswordfield_display()
	{
		return newpass.isDisplayed();
	}
	@FindBy(xpath="(//button[@type='button'])[10]")
	private WebElement newpasseye;
	
	@FindBy(name="confirm_password")
	private WebElement confirmpass;
	public boolean is_confirmpasswordfield_display()
	{
		return confirmpass.isDisplayed();
	}
	@FindBy(xpath="(//button[@type='button'])[11]")
	private WebElement confirmpasseye;
	
	@FindBy(xpath="//button[text()='Confirm']")
	private WebElement confirm;
	public boolean is_confirmbutton_display()
	{
		return confirm.isDisplayed();
	}
	@FindBy(xpath="(//button[text()='Confirm'])[2]")
	private WebElement confirmpasswordbtn;
	
	public void change_password(String CurrentPassword, String NewPassword, String ConfirmPassword) throws InterruptedException
	{
		currentpass.sendKeys(CurrentPassword);
		currentpasseye.click();
		newpass.sendKeys(NewPassword);
		newpasseye.click();
		confirmpass.sendKeys(ConfirmPassword);
		confirmpasseye.click(); 
		confirm.click();
		confirmpasswordbtn.click();
		Thread.sleep(3000);
	}
	public void enter_details_Profile(String resumepath, String photopath, String dob, String profile, String add, String Country, String State ,
			String City, String degreename, String passingyear, String currentcompanyname, String ctcamonut, String noticeperioddays,
			String expyear,String newskill, String skill, String lang, String Bio ) throws AWTException, IOException, InterruptedException
	{
		uploadresume.click();
		methods.uploadfile(driver, resumepath);
		viewresume.click();
		Thread.sleep(3000);
		methods.opentabandclosethetab(driver);
		uploadphoto.click();
		methods.uploadfile(driver, photopath);
		//viewphoto.click();
		
		
		bdate.click();
		bdate.sendKeys(dob);
		designation.click();
		designation.sendKeys(profile);
		address.sendKeys(add);
		clickcity.sendKeys(City);
		Thread.sleep(3000);
		clickcity.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		clickcity.sendKeys(Keys.ENTER); 
		
		//clickstate.sendKeys(State);
		
		//clickcountry.sendKeys(Country);
		
		qualification.click();
		for(WebElement q:listofqualification)
	       {
	    	   String qualifyname = q.getText().trim(); //  trim extra spaces
	    	   if(qualifyname.equals("Master's Degree"))
	    	   {
	    		   q.click();
	    		   break;
	    	   }
	    	  
	       }
		
		degree.sendKeys(degreename);
		year.click();
		year.sendKeys(Keys.ARROW_LEFT);
		year.sendKeys(Keys.ARROW_LEFT);
		year.sendKeys(passingyear);
		
		currentcompany.sendKeys(currentcompanyname);
		CTC.sendKeys(ctcamonut);
		noticeperiod.sendKeys(noticeperioddays);
		
		yoe.sendKeys(Keys.ARROW_LEFT);
		yoe.sendKeys(Keys.ARROW_LEFT);
		yoe.sendKeys(expyear);
		
		addskill.click();
		Thread.sleep(3000);
		enterskill.sendKeys(newskill);
		Thread.sleep(3000);
		clicktoaddskill.click();
		Thread.sleep(2000);
		clickarrow.click();
		Thread.sleep(2000);
		clickarrow.sendKeys(skill);
		Thread.sleep(2000);
		clickarrow.sendKeys(Keys.ARROW_DOWN);
        clickarrow.sendKeys(Keys.ENTER);
        
        language.sendKeys(lang);
        aboutme.sendKeys(Bio);
        
	}
	
	
	// For scenario : Update_Profile_while_applying_for_job 
	// Verify the details get updated in the profile section from the details added during Update_Profile_while_applying_for_job
	// We can call this method into TC_ID_06_Update_Profile_while_applying_for_job
	
	public void verify_details_on_Profile_Page() throws IOException, InterruptedException
	{
		 String FilePath = Config.getProperty("filePath");
	    	
		 String SheetName = Config.getProperty("sheetName_13");	
    	 
    	 ExcelUtilityReg excel = new ExcelUtilityReg(FilePath, SheetName);
	 
	     int rowCount = excel.getRowCount(); 
	     for(int i=2; i<= rowCount; i++)
	     {
	    	String dob = excel.getCellData(i, 2);
	 		String AGE = excel.getCellData(i, 4);
	 		String profile = excel.getCellData(i, 3);
	 		String add = excel.getCellData(i, 5);
	 		String City = excel.getCellData(i, 8);
		    String Country = excel.getCellData(i, 6);
		    String State = excel.getCellData(i, 7);
		    String degreetype = excel.getCellData(i, 14);
	 		String degreename = excel.getCellData(i, 9);
	 	    String passingyear = excel.getCellData(i, 10);
	 	    String currentcompanyname = excel.getCellData(i, 11);
	 		String ctcamonut = excel.getCellData(i, 12);
	 		String expyear = excel.getCellData(i, 15);
	 		String noticeperioddays = excel.getCellData(i, 13);
	 		String skill = excel.getCellData(i, 17);
	 		String lang = excel.getCellData(i, 18);
	 		String Bio = excel.getCellData(i, 19);
	 		
	 		
		 
	        String actual_DOB = bdate.getAttribute("value").trim();
	        Thread.sleep(2000);
	    	String actual_age = age.getAttribute("value").trim();
			Thread.sleep(2000);
			String actual_desg = designation.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_address = address.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_city = clickcity.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_country = clickcountry.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_state = clickstate.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_qualification = qualification.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_degree = degree.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_year = year.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_currentcompany = currentcompany.getAttribute("value").trim();
 			Thread.sleep(4000);
 			String actual_CTC = CTC.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_yoe = yoe.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_noticeperiod = noticeperiod.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_language = language.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_aboutme = aboutme.getAttribute("value").trim();
 			
 			Assert.assertEquals(actual_DOB, dob, "DOB does not match");
 			Assert.assertEquals(actual_age, AGE, "Age does not match");
 			Assert.assertEquals(actual_desg, profile, "Designation does not match");
 		
 			Assert.assertEquals(actual_address, add, "Address does not match");
 			Assert.assertEquals(actual_city, City, "City does not match");
 			Assert.assertEquals(actual_state, State, "State does not match");
 			Assert.assertEquals(actual_country, Country, "Country does not match");
 			
 			Assert.assertEquals(actual_qualification, degreetype, "Qualification does not match");
 			Assert.assertEquals(actual_degree, degreename, "Degree does not match");
 			Assert.assertEquals(actual_year, passingyear, "Passing year does not match");
 			
 			Assert.assertEquals(actual_currentcompany, currentcompanyname, "Current company does not match");
 			Assert.assertEquals(actual_CTC, ctcamonut, "CTC amount does not match");
 			Assert.assertEquals(actual_yoe, expyear, "Year of experience does not match");
 			Assert.assertEquals(actual_noticeperiod, noticeperioddays, "Notice period does not match");
 			
 			Assert.assertEquals(actual_language, lang, "Language does not match");
 			Assert.assertEquals(actual_aboutme, Bio, "Abour me does not match");
 	    	break;
	}
	     }
	
	public void Enter_Data(String Candidate_Email, 
			String Changed_Password) throws InterruptedException {
		
		Email_comapny.sendKeys(Candidate_Email);

		Password_password.sendKeys(Changed_Password);

		SubmitButton.click();
		
	}
	
	  }
