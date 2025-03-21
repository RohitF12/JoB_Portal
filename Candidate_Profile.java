package POM_Candidate;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class Candidate_Profile extends BaseTest
{
	public  WebDriver driver;

	@FindBy(xpath="//span[text()='Hi ']")
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
	
	public void change_password(String CurrentPassword, String NewPassword, String ConfirmPassword)
	{
		currentpass.sendKeys(CurrentPassword);
		currentpasseye.click();
		newpass.sendKeys(NewPassword);
		newpasseye.click();
		confirmpass.sendKeys(ConfirmPassword);
		confirmpasseye.click();
		confirm.click();
		confirmpasswordbtn.click();;
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
	
	
	 /* public void resume(String resumepath) throws AWTException, IOException 
	{
		uploadresume.click();
		methods.uploadfile(driver, resumepath);
	}
	public void viewResume()
	{
		viewresume.click();
	}
	public void photo(String photopath) throws AWTException, IOException
	{
		uploadphoto.click();
		methods.uploadfile(driver, photopath);
	}
	public void enterdate(String dob) throws InterruptedException
	{
		bdate.click();
		Thread.sleep(3000);
		bdate.sendKeys(dob);
	}
	public void enterdesignation(String profile)
	{
		designation.click();
		designation.sendKeys(profile);
	}
	public void enteradd(String add)
	{
		address.sendKeys(add);		
	}
	public void entercountry(String Country) throws InterruptedException
	{
		clickcountry.click();
		clickcountry.sendKeys(Country);
      /* for(WebElement country:countries)
       {
    	   String countryName = country.getText().trim(); //  trim extra spaces
    	   if(countryName.equals("India"))
    	   {
    		   country.click();
    		   break;
    	   }
    	  
    }*/

	/*public void addstate(String State)
	{
		clickstate.click();
		clickstate.sendKeys(State);
		/* for(WebElement state:states)
	       {
	    	   String stateName = state.getText().trim(); //  trim extra spaces
	    	   if(stateName.equals("Telangana"))
	    	   {
	    		   state.click();
	    		   break;
	    	   }
	    	  
	       }
	} 
	
	public void selectcity(String City)
	{
		clickcity.click();
		clickcity.sendKeys(City);
		/*for(WebElement city:cities)
	       {
	    	   String cityName = city.getText().trim(); //  trim extra spaces
	    	   if(cityName.equals("Hyderabad"))
	    	   {
	    		   city.click();
	    		   break;
	    	   }
	    	  
	       }
	}
	public void selectqualification()
	{
		qualification.click();
		//qualification.sendKeys(Keys.CONTROL + "a");
	//	qualification.sendKeys(Keys.BACK_SPACE);	
		for(WebElement q:listofqualification)
	       {
	    	   String qualifyname = q.getText().trim(); //  trim extra spaces
	    	   if(qualifyname.equals("Master's Degree"))
	    	   {
	    		   q.click();
	    		   break;
	    	   }
	    	  
	       }
		
	}
	public void adddegree(String degreename)
	{
		degree.sendKeys(degreename);
	}
	public void enteryear(String passingyear) throws InterruptedException
	{
		
		year.click();
		year.sendKeys(Keys.ARROW_LEFT);
		year.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(3000);
		year.sendKeys(passingyear);
		Thread.sleep(3000);

	}
	public void entercurrentcompany(String currentcompanyname)
	{
		currentcompany.sendKeys(currentcompanyname);
	}
	public void enterctc(String ctcamonut)
	{
		CTC.sendKeys(ctcamonut);
	}
	public void enternoticeperiod(String noticeperioddays)
	{
		noticeperiod.sendKeys(noticeperioddays);
	}
	public void enteryoe(String expyear)
	{
		yoe.sendKeys(Keys.ARROW_LEFT);
		yoe.sendKeys(Keys.ARROW_LEFT);
		yoe.sendKeys(expyear);
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
	public void selectskill(String skill) throws InterruptedException
	{
		clickarrow.click();
		Thread.sleep(3000);
		clickarrow.sendKeys(skill);
		clickarrow.sendKeys(Keys.ARROW_DOWN);
        clickarrow.sendKeys(Keys.ENTER);
	}
	public void enterlanguage(String lang)
	{
		language.sendKeys(lang);
	}
	public void enteraboutme(String Bio)
	{
		aboutme.sendKeys(Bio);
	}
	*/
	
}
