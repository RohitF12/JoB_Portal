package Admin_TestScripts;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import POM_Admin.Current_Application_Page;
import base.BaseTest;
import utils.ExcelUtilityReg;

public class TC_ID_19_Current_Applications extends BaseTest
{
	@Test
	public void TC_ID_19_01() throws IOException
	{
		openAdminbrowser();
		loginHR();
		//Click on Current Applications page and check page name displayed 
		Current_Application_Page c = new Current_Application_Page (admindriver);
		c.opencurrentapplications();
		Assert.assertTrue(c.display_pagename(), "Page name should be display");
	}
    @Test
    public void TC_ID_19_02()
    {
    	//To check the column name displayed.
    	Current_Application_Page c = new Current_Application_Page (admindriver);
    	Assert.assertTrue(c.display_columnname(), "Column name should be display");
    	c.print_columnname();
    }
    @Test
     public void TC_ID_19_03() throws IOException, InterruptedException
     {
    	//To check the search bar is working
    	 Current_Application_Page c = new Current_Application_Page (admindriver);
    	 c.searchbyvalue(data.getdata("jobtitle_and_candidateName"));
    	 Thread.sleep(4000);
    	 c.verify_ListDisplay_OnSearchCriteria();
    	 Thread.sleep(5000);
     }
    @Test
    public void TC_ID_19_04() throws InterruptedException
    {
    	 //To check the Applied on dropdown is working fine 
   	      Current_Application_Page c = new Current_Application_Page (admindriver);
   	      c.sort_On_Date();
    }
     @Test
     public void TC_ID_19_05() throws InterruptedException, IOException
     {
    	 //To check the job status is available
    	 Current_Application_Page c = new Current_Application_Page (admindriver);
    	 Assert.assertTrue(c.status_filter_display(),"Status filter should be display");
     }
     @Test
     public void TC_ID_19_06() throws InterruptedException, IOException
     {
    	 //To click on any one filter checkbox and check list displayed
    	 Current_Application_Page c = new Current_Application_Page (admindriver);
    	 c.applystatusfilter(data.getdata("StatusFilter"));
    	 Thread.sleep(4000);
    	 c.verify_ListDisplay_OnStatusApplied();
     }
     @Test
     public void TC_ID_19_07()throws InterruptedException, IOException
     {
    	 //Verify active candidate filter
    	 Current_Application_Page c = new Current_Application_Page (admindriver);
    	 c.applyfilter();
     }
     @Test
     public void TC_ID_19_08()
     {
    	 //Verify the details of current application
    	 Current_Application_Page c = new Current_Application_Page (admindriver);
    	 c.open_application();
     }
     @Test
     public void TC_ID_19_11() throws InterruptedException, IOException
     {
    	 //To check the view resume icon 
    	 Current_Application_Page c = new Current_Application_Page (admindriver);
    	 methods.switchingtabs(admindriver);
    	 c.ViewResume();
    	 Thread.sleep(4000);
    	 methods.moreopenTabAndmoreCloseTheTab(admindriver);
     }
     @Test
     public void TC_ID_19_12() 
     {
    	 //To check the view job  details hyperlink
    	 Current_Application_Page c = new Current_Application_Page (admindriver);
    	 c.ViewJobdetails();
     }
     @Test
     public void TC_ID_19_13() throws InterruptedException
     {
    	 //To check the mail candidate icon 
    	 Current_Application_Page c = new Current_Application_Page (admindriver);
    	 methods.opentabandclosethetab(admindriver);
    	 Assert.assertTrue(c.is_display_Mail_icon(), "Mail icon should be display");
     }
     @Test
     public void TC_ID_19_14() throws IOException
     {
    	 //Enter information and send Email to candidate
    	 Current_Application_Page c = new Current_Application_Page (admindriver);
    	 c.clickonmailbutton();
    	 
		 String filePath = data.getdata("filePath");   
		 String SheetName = data.getdata("sheetName_22");
    	 
   	     ExcelUtilityReg excel = new ExcelUtilityReg(filePath, SheetName);
   	 
   	     int rowCount = excel.getRowCount();
   	     for(int i=1; i<= rowCount; i++)
   	     {
    		String Subject = excel.getCellData(i, 0);
   		    String MailBody = excel.getCellData(i, 1);
   		    c.Sent_Mail(Subject, MailBody);
   		    break;
   		  }
   	    String actualvalidationmsg = c.getValidationmsg();
		String expectedvalidationmsg = "Mail sent successfully";
		System.out.println(actualvalidationmsg);
		Assert.assertEquals(actualvalidationmsg, expectedvalidationmsg, "Validation msg not display");
     }
}
