package POM_Admin;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseTest;

public class Delete_Restore_Candidate extends BaseTest
{
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td[7]") private WebElement Deleteicon;
	
	@FindBy(xpath="//button[text()='Delete']") private WebElement DeleteButton ;
	
	@FindBy(xpath="//span[text()='Trash']") private WebElement Trash ;
	
	@FindBy(xpath="//button[text()='Deleted Candidates']") private WebElement DeletecandidateTab;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td")private List<WebElement> Candidatenames;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr/td[5]")private WebElement restorecandidate;
	
    public Delete_Restore_Candidate(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void DeleteCandidate() throws InterruptedException
    {
    	Deleteicon.click();
    	Thread.sleep(2000);
    	DeleteButton.click();
    }
    public void open_Trash()
    {
    	methods.scrollbar(admindriver, Trash);
    	DeletecandidateTab.click();
    }
    public void verify_candidate_DeletedSuccessfully() throws IOException
    {
    	if(!Candidatenames.isEmpty())
    	{
    		String expected_candidatename = data.getdata("candidateName");
    		String CandidateName=Candidatenames.get(0).getText();
    		System.out.println(CandidateName);
    		Assert.assertEquals(CandidateName, expected_candidatename, "Candidate is not deleted");
    		System.out.println("Candidate is verified " +CandidateName);
    	}
    	else
    	{
    		System.out.println("Candidate is not listed. Verification failed");
    	}
    }
    public void restore_Candidate()
    {
    	restorecandidate.click();
    }
    public void verify_candidate_restoredSuccessfully() throws IOException
    {
    	if(!Candidatenames.isEmpty())
    	{
    		String expected_candidatename = data.getdata("candidateName");
    		String CandidateName=Candidatenames.get(0).getText();
    		Assert.assertEquals(CandidateName, expected_candidatename, "Candidate is not restored");
    		System.out.println("Candidate is verified " +CandidateName);
    	}
    	else
    	{
    		System.out.println("Candidate is not listed. Verification failed");
    	}
    }
}
