package Candidate_TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Candidate.Candidate_LoginPage;
import POM_Candidate.Candidate_Profile;
import base.BaseTest;
import utils.ExcelUtilityReg;

//TC_ID_06_15
public class TC_ID_06_Logout extends BaseTest
{
	 @Test
	   public void TC_ID_06_15() throws IOException 
	   {
		 openCandidatebrowser();
			logincandidate();
	       //Log out option should be clickable and should navigate to login page
	     Candidate_Profile p= new Candidate_Profile(candidatedriver);
	     p.openelipsisimenu(); 
	     p.clickonlogout();
	   String actualURL= candidatedriver.getCurrentUrl();
	   System.out.println(actualURL);
	   String ExpectedURL=data.getdata("candidateloginurl");
	   Assert.assertEquals(actualURL, ExpectedURL,"Login page does not display");
	   }

}
