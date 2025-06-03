package POM_Admin;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Candidate_Listing 
{
	@FindBy(xpath="//span[text()='Candidate List']")
	private WebElement candidatelist;
	
	@FindBy(xpath="//h3[text()='Candidate List']") private WebElement pagename;
	
	@FindBy(xpath="//thead[@class='MuiTableHead-root css-1wbz3t9']")
	private WebElement columnname;
	
	@FindBy(id="tags-outlined")
	private WebElement skill;
	
	@FindBy(xpath="//ul[@id='tags-outlined-listbox']/li")
	private List<WebElement> skilllist;
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	private WebElement minexp;
	
	@FindBy(xpath="(//input[@type='number'])[2]")
	private WebElement maxexp;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement search;
	
	@FindBy(xpath="//tbody[@class='MuiTableBody-root css-1xnox0e']//td[1]")
	private WebElement row1;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div/button")
	private WebElement viewresume;
	
	
	public boolean verify_pagename()
	{
		return pagename.isDisplayed();
	}
	public boolean verify_columnName_display()
	{
		return columnname.isDisplayed();
	}
	public void print_columnName()
	{
		System.out.println("Column name -"+columnname.getText());
	}
	public void clickrow1()
	{
		row1.click();
	}
	public void opencandidatelist()
	{
		candidatelist.click();
	}
	public void applyskillfilter()
	{
		skill.click();
		
		for(WebElement s:skilllist)
		{
		  String skillname=s.getText().trim();
		  if(skillname.equals("Advacnced Science"))
		  {
			  s.click();
			  break;
		  }
		}
	}
	public void enterminexp(String minimumexp)
	{
		minexp.click();
		minexp.sendKeys(minimumexp);
	}
	public void entermaxexp(String maximumexp)
	{
		maxexp.click();
		maxexp.sendKeys(maximumexp);
	}
	public void searchbyname(String candidatename) throws InterruptedException
	{
		search.sendKeys(candidatename);
		Thread.sleep(4000);
		search.sendKeys(Keys.CONTROL+"a");
		search.sendKeys(Keys.BACK_SPACE);
	}
	public  Candidate_Listing(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
