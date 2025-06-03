package POM_Admin;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseTest;

public class CurrentApplication_ChangeStatus extends BaseTest
{
	@FindBy(xpath="(//div[@role='combobox'])[1]") private WebElement changeStatus;
	
	@FindBy(xpath="//ul[@role='listbox']//li") private List<WebElement> statustypes;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//tr[7]") 
	private List<WebElement> jobtitles;
	
	@FindBy(xpath="//button[text()='Continue']") private WebElement continuebtn;
	
	@FindBy(xpath="//div[@class='MuiStack-root css-1821gv5']")private WebElement text;
	
	public CurrentApplication_ChangeStatus(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void changeStatus() throws IOException, InterruptedException
	{
		changeStatus.click();
		for(WebElement changestatus:statustypes)
		{
			String Status=changestatus.getText().trim();
			String statuschange=data.getdata("ChangeStatus");
			if(Status.equals(statuschange)) 
			{ 
				changestatus.click();
				Thread.sleep(3000);
				continuebtn.click();
				break;
			}
		}
	}
	public void open_application()
	{
		for(WebElement application:jobtitles)
		{
			application.click();
			break;
		}
	}
	public void verify_status_changed() throws IOException
	{
		String Text=text.getText().trim();
		String expected = data.getdata("ChangeStatus");
		Assert.assertEquals(Text, expected,"Status not verified");
	}
 
}
