package POM_Admin;

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

public class Edit_Candidate extends BaseTest
{
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td[6]")
	private WebElement Editcandidate;
	public Edit_Candidate(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td[1]")
	private List<WebElement> candidate_names;
	
	@FindBy(xpath="//span[text()='Candidate List']")
	private WebElement candidatelist;

	@FindBy(xpath="//span[text()='Add Candidate']")
	private WebElement addcandidate;

	@FindBy(name="jp_candidate_name")
	private WebElement candidatename;
	
	@FindBy(name="jp_email")
	private WebElement email;
	
	@FindBy(xpath="//span[text()='Upload']")
	private WebElement uploadresume;
	
	@FindBy(xpath="//button[text()='View']")
	private WebElement viewresume;
	
	@FindBy(xpath="(//div[@class='MuiBox-root css-16dbpsk'])[2]")
	private WebElement uploadphoto;
	
	@FindBy(name="jp_dob")
	private WebElement bdate;

	@FindBy(name="jp_designation")
	private WebElement designation;
	
	@FindBy(name="jp_contactno")
	private WebElement Phoneno;
	
	@FindBy(name="jp_address")
	private WebElement address;

	@FindBy(xpath="(//input[@role='combobox'])[2]")
	private WebElement clickcity;
	
	@FindBy(xpath="(//input[@role='combobox'])[3]")
	private WebElement qualification;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> listofqualification;
	
	@FindBy(name="jp_degree_name")
	private WebElement degree;
	
	@FindBy(name="jp_passingyear")
	private WebElement year;
	
	@FindBy(name="jp_current_company")
	private WebElement currentcompany;
	
	@FindBy(name="jp_current_ctc")
	private WebElement CTC;
	
	@FindBy(name="jp_notice_period")
	private WebElement noticeperiod;
	
	@FindBy(name="jp_yoe")
	private WebElement yoe;
	
	@FindBy(xpath="//p[text()='Add Skill']")
	private WebElement addskill;
	
	@FindBy(name="jp_skills")
	private WebElement enterskill;
	
	@FindBy(xpath="//button[text()='Add New Skill']")
	private WebElement clicktoaddskill;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	private List<WebElement> listofskills;
	
	@FindBy(xpath="/html/body/div[3]/div[3]/div/div/form/div[1]/div[6]/div[2]/div[1]/div[1]/div/div")
	private WebElement clickarrow;

	@FindBy(xpath="(//input[@role='combobox'])[4]")
	private WebElement clearskills;
	@FindBy(name="jp_language")
	private WebElement language;

	@FindBy(name="jp_about_me")
	private WebElement aboutme;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement update;

	public void update_button()
	{
		update.click();
	}
	@FindBy(xpath="//h3[text()='Add New Candidate']")
	private WebElement pagename;
	public boolean is_PaneName_display()
	{
		return pagename.isDisplayed() ;
	}
	public boolean is_Add_CandidateModule_display()
	{
		return addcandidate.isDisplayed() ;
	}
	public void openaddcandidatepage()
	{
		addcandidate.click();
	}
	@FindBy(name="jp_state")private WebElement state;
	@FindBy(name="jp_country")private WebElement country;
	public void verify_details_on_Edit_Page() throws IOException, InterruptedException
	{
		 String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
	     String sheetName="Add_Candidate";
	     ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
	 
	     int rowCount = excel.getRowCount();
	     for(int i=1; i<= rowCount; i++)
	     {
	    	 String Candidate_Name = excel.getCellData(i, 0);
    		 String Candidate_Email = excel.getCellData(i, 1);
    		 String resumepath = excel.getCellData(i,2);
        	 String photopath = excel.getCellData(i, 3);
             String dob =  excel.getCellData(i, 4);
        	 String profile = excel.getCellData(i, 5);
        	 String Phone_no = excel.getCellData(i, 6);
        	 String add = excel.getCellData(i, 7);
        	 String Country=excel.getCellData(i, 8);
        	 String State = excel.getCellData(i, 9);
        	 String City = excel.getCellData(i, 10);
        	 String degreetype = excel.getCellData(i, 11);
        	 String degreename = excel.getCellData(i, 12);
        	 String passingyear = excel.getCellData(i, 13);
        	 String currentcompanyname = excel.getCellData(i, 14);
        	 String ctcamonut = excel.getCellData(i, 15);
        	 String noticeperioddays = excel.getCellData(i, 16);
        	 String expyear = excel.getCellData(i, 17);
        	 String newskill = excel.getCellData(i, 18);
        	 String skill = excel.getCellData(i, 19);
        	 String lang= excel.getCellData(i, 20);
        	 String Bio = excel.getCellData(i, 21);
	 		
		 
	        String actual_DOB = bdate.getAttribute("value").trim();
	        Thread.sleep(2000);
			String actual_desg = designation.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_address = address.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_city = clickcity.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_country = country.getAttribute("value").trim();
 			Thread.sleep(2000);
 			String actual_state = state.getAttribute("value").trim();
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
	 public void Update_candidate_details(String Candidate_Name,String Candidate_Email,String resumepath, String photopath, String dob,
			String Phone_no,String profile,  String add, String City, String degreetype,String degreename, 
			String passingyear, String currentcompanyname, String ctcamonut, String noticeperioddays,
			String expyear,String newskill, String skill, String lang, String Bio ) throws AWTException, IOException, InterruptedException
	{
		uploadresume.click();
		methods.uploadfile(admindriver, resumepath);
		viewresume.click();
		Thread.sleep(3000);
		methods.opentabandclosethetab(admindriver);
		uploadphoto.click();
		methods.uploadfile(admindriver, photopath);
		candidatename.sendKeys(Keys.CONTROL+"a");
		candidatename.sendKeys(Keys.BACK_SPACE);
        candidatename.sendKeys(Candidate_Name);
        
        email.sendKeys(Keys.CONTROL+"a");
        email.sendKeys(Keys.BACK_SPACE);
		email.sendKeys(Candidate_Email);
		
		bdate.click();
		bdate.sendKeys(Keys.CONTROL+"a");
		bdate.sendKeys(Keys.BACK_SPACE);
		bdate.sendKeys(dob);
		
		designation.click();
		designation.sendKeys(Keys.CONTROL+"a");
		designation.sendKeys(Keys.BACK_SPACE);
		designation.sendKeys(profile);
		
		Phoneno.sendKeys(Keys.CONTROL+"a");
		Phoneno.sendKeys(Keys.BACK_SPACE);
		Phoneno.sendKeys(Phone_no);
		
		address.sendKeys(Keys.CONTROL+"a");
		address.sendKeys(Keys.BACK_SPACE);
		address.sendKeys(add);
		
		clickcity.sendKeys(Keys.CONTROL+"a");
		clickcity.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		clickcity.sendKeys(City);
		Thread.sleep(4000);
		clickcity.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		clickcity.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		qualification.sendKeys(Keys.CONTROL+"a");
		qualification.sendKeys(Keys.BACK_SPACE);
		qualification.click();
		Thread.sleep(2000);
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
		year.click();
		year.sendKeys(Keys.CONTROL+"a");
		year.sendKeys(Keys.BACK_SPACE);
		year.sendKeys(Keys.ARROW_LEFT);
		year.sendKeys(Keys.ARROW_LEFT);
		year.sendKeys(passingyear);
		currentcompany.sendKeys(Keys.CONTROL+"a");
		currentcompany.sendKeys(Keys.BACK_SPACE);
		currentcompany.sendKeys(currentcompanyname);
		CTC.sendKeys(Keys.CONTROL+"a");
		CTC.sendKeys(Keys.BACK_SPACE);
		CTC.sendKeys(ctcamonut);
		noticeperiod.sendKeys(Keys.CONTROL+"a");
		noticeperiod.sendKeys(Keys.BACK_SPACE);
		noticeperiod.sendKeys(noticeperioddays);
		yoe.sendKeys(Keys.CONTROL+"a");
		yoe.sendKeys(Keys.BACK_SPACE);
		yoe.sendKeys(Keys.ARROW_LEFT);
		yoe.sendKeys(Keys.ARROW_LEFT);
		yoe.sendKeys(expyear);
		
		addskill.click();
		Thread.sleep(3000);
		enterskill.sendKeys(newskill);
		Thread.sleep(3000);
		clicktoaddskill.click();
		Thread.sleep(3000);

		
		clearskills.sendKeys(Keys.CONTROL+"a");
		clearskills.sendKeys(Keys.BACK_SPACE);
		clickarrow.click();
		for(WebElement s:listofskills)
		{
			 String skills = s.getText().trim(); //  trim extra spaces
	    	   if(skills.equals(skill))
	    	   {
	    		   s.click();
	    		   break;
	    	   }
		}
		language.sendKeys(Keys.CONTROL+"a");
		language.sendKeys(Keys.BACK_SPACE);
        language.sendKeys(lang);
        aboutme.sendKeys(Keys.CONTROL+"a");
        aboutme.sendKeys(Keys.BACK_SPACE);
        aboutme.sendKeys(Bio);
        
	}
	 public void openeditpage()
	 {
		 Editcandidate.click();
	 }
	 
	 @FindBy(xpath="//h1[@class='MuiBox-root css-5ng64g']")
	 private WebElement name;
	 @FindBy(xpath="//span[contains(text(),'Notice Period')]")
	 private WebElement noticePeriod;
	 @FindBy(xpath="//span[contains(text(),'Current CTC')]")
	 private WebElement cTc;
	 @FindBy(xpath="//span[contains(text(),'Designation')]")
	 private WebElement desg;
	 @FindBy(xpath="//span[contains(text(),'YOE')]")
	 private WebElement YOE;
	 @FindBy(xpath="//span[contains(text(),'Current Company')]")
	 private WebElement CurrentCompany;
	 @FindBy(xpath="//p[@class='MuiBox-root css-8v8inm']")
	 private WebElement BIO;
	 @FindBy(xpath="//div[@class='MuiStack-root css-13xg822']")
	 private WebElement skills;
	 @FindBy(xpath="//p[@class='MuiBox-root css-6a51i6']")
	 private WebElement education ;
	 @FindBy(xpath="(//p[@class='MuiBox-root css-6a51i6'])[2]")
	 private WebElement deg;
	 @FindBy(xpath="(//div[@class='MuiStack-root css-13xg822'])[2]")
	 private WebElement languages;
	 @FindBy(xpath="(//p[@class='MuiBox-root css-6a51i6'])[3]")
	 private WebElement PhoneNo;
	 @FindBy(xpath="(//p[@class='MuiBox-root css-6a51i6'])[4]")
	 private WebElement emailId;
	 @FindBy(xpath="//p[@class='MuiTypography-root MuiTypography-body1 css-1r9oow0']")
	 private WebElement addresses;
	 @FindBy(xpath="(//p[@class='MuiTypography-root MuiTypography-body1 css-1r9oow0'])[2]")
	 private WebElement CITY;

	public void verify_Updated_candidateDetails_are_correct() throws IOException, InterruptedException
	{
		 String filePath = "C:\\Users\\MadhaviBamabawale\\eclipse-workspace\\RCS\\src\\test\\resources\\tests\\TestData.xlsx";
    	 String sheetName="Add_Candidate";
    	 ExcelUtilityReg excel = new ExcelUtilityReg(filePath, sheetName);
    	 int rowCount = excel.getRowCount();
    	 for(int i=2; i<= rowCount; i++)
    	 {
    		 String Candidate_Name = excel.getCellData(i, 0);
    		 String Candidate_Email = excel.getCellData(i, 1);
    		 String resumepath = excel.getCellData(i,2);
        	 String photopath = excel.getCellData(i, 3);
             String dob =  excel.getCellData(i, 4);
        	 String profile = excel.getCellData(i, 5);
        	 String Phone_no = excel.getCellData(i, 6);
        	 String add = excel.getCellData(i, 7);
        	 String City = excel.getCellData(i, 10);
        	 String degreetype = excel.getCellData(i, 11);
        	 String degreename = excel.getCellData(i, 12);
        	 String passingyear = excel.getCellData(i, 13);
        	 String currentcompanyname = excel.getCellData(i, 14);
        	 String ctcamonut = excel.getCellData(i, 15);
        	 String noticeperioddays = excel.getCellData(i, 16);
        	 String expyear = excel.getCellData(i, 17);
        	 String newskill = excel.getCellData(i, 18);
        	 String skill = excel.getCellData(i, 19);
        	 String lang= excel.getCellData(i, 20);
        	 String Bio = excel.getCellData(i, 21);
        	
        	 String actual_candidateName=name.getText().replaceAll(".*[:\\-] ?", "").trim();
     		 Thread.sleep(3000);
        	 String actual_noticePeriod=noticePeriod.getText().replaceAll(".*[:\\-] ?", "").trim();
        	 Thread.sleep(3000);
        	 String actual_CTC=cTc.getText().replaceAll(".*[:\\-] ?", "").trim();
        	 Thread.sleep(3000);
        	 String actual_designation=desg.getText().replaceAll(".*[:\\-] ?", "").trim();
        	 Thread.sleep(3000);
        	 String actual_yoe=YOE.getText().replaceAll(".*[:\\-] ?", "").trim();
        	 Thread.sleep(3000);
        	 String actual_CurrentCompany=CurrentCompany.getText().replaceAll(".*[:\\-] ?", "").trim();
        	 Thread.sleep(3000);
            // String actual_Bio=BIO.getText().replaceAll("\\s+", " ").trim();
          //   Thread.sleep(3000);
        	 String actual_skills=skills.getText().replaceAll(".*[:\\-] ?", "").trim();
        	 Thread.sleep(3000);
        	 String actual_qualification=education.getText().replaceAll(".*[:\\-] ?", "").trim();
        	 Thread.sleep(3000);
        	 String actual_degree=deg.getText().replaceAll(".*[:\\-] ?", "").trim();
        	 Thread.sleep(3000);
        	 String actual_language=languages.getText().replaceAll(".*[:\\-] ?", "").trim();
        	 Thread.sleep(3000);
          	 String actual_PhoneNo=PhoneNo.getText().replaceAll(".*[:\\-] ?", "").trim();
          	 Thread.sleep(3000);
         	 String actual_emailId=emailId.getText().replaceAll(".*[:\\-] ?", "").trim();
         	 Thread.sleep(3000); 
        	 String actual_add=addresses.getText().replaceAll(".*[:\\-] ?", "").trim();
        	 Thread.sleep(3000);
        	 String actual_city=CITY.getText().replaceAll(".*[:\\-] ?", "").trim();
        	 
        	 Assert.assertEquals(actual_candidateName, Candidate_Name, "Name does not match");
        	 Assert.assertEquals(actual_noticePeriod, noticeperioddays, "Notice period does not match");
        	 Assert.assertEquals(actual_CTC, ctcamonut, "CTC does not match");
        	 Assert.assertEquals(actual_designation, profile, "Designation does not match");
        	 Assert.assertEquals(actual_yoe, expyear, "YOE does not match");
        	 Assert.assertEquals(actual_CurrentCompany, currentcompanyname, "Current company does not match");
        //	 Assert.assertEquals(actual_Bio, Bio, "Bio does not match");
        	 Assert.assertEquals(actual_skills, skill, "Skills does not match");
        	 Assert.assertEquals(actual_qualification, degreetype, "Qualification does not match");
        	 Assert.assertEquals(actual_degree, degreename, "Degree does not match");
        	 Assert.assertEquals(actual_language, lang, "Language does not match");
        	 Assert.assertEquals(actual_PhoneNo, Phone_no, "Phone number does not match");
        	 Assert.assertEquals(actual_emailId, Candidate_Email, "Emailid does not match");
        	 Assert.assertEquals(actual_city, City, "city does not match");
        	 break;
    	 }
	}
}
