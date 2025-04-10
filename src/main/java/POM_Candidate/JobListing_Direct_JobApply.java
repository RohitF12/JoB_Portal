package POM_Candidate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobListing_Direct_JobApply 
{
	@FindBy(xpath="//button[text()='Apply']")
	private WebElement applybtn;
	
	@FindBy(xpath="(//div[@aria-controls='Job requirements'])[1]")
	private WebElement req;
	
	@FindBy(xpath="(//div[@aria-controls='Job requirements'])[2]")
	private WebElement sal;
	
	@FindBy(xpath="(//div[@aria-controls='Job requirements'])[3]")
	private WebElement benefit;
	
	@FindBy(xpath="(//div[@aria-controls='Job requirements'])[4]")
	private WebElement skills;
	
	@FindBy(xpath="//span[text()='Apply']")
	private WebElement button;
	
	@FindBy(xpath="//h4[text()='Applied']")
	private WebElement appliedtext;
	
	public JobListing_Direct_JobApply (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public boolean is_applybutton_enable()
	{
		return applybtn.isSelected();
	}
	public void clickapply()
	{
		applybtn.click();
	}
	public void viewrequirments()
	{
		req.click();
	}
	public void viewsalary()
	{
		sal.click();
	}
	public void viewbenefit()
	{
		benefit.click();	
	}
	public void viewskill()
	{
		skills.click();
	}
	public void applyjob()
	{
		button.click();
	}
	public boolean is_applied_text_display()
    {
    	return appliedtext.isDisplayed();
    }
}
