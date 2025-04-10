package company.tests;

import org.testng.annotations.Test;
import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import pom.LoginPage;
import utils.ExcelUtil;
import pom.HomePage;
import java.time.Duration;
import java.util.List;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void setupTest() {
        setup(); // Initializes the WebDriver and opens the application
    }

    @Test
    public void testLogin() throws InterruptedException {
        
    	// Load credentials from the Excel file
    	
        List<String[]> credentials = ExcelUtil.getTestData("C:\\Users\\RohitFulzele\\Desktop\\RCS\\Automation_Testing\\Testing\\Admin_Portal_JP1\\src\\test\\resources\\testData\\TestData.xlsx", "Sheet1");

        for (String[] credential : credentials) {
            String username = credential[0];
            String password = credential[1];

            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterUsername(username);
            loginPage.enterPassword(password);
            loginPage.clickLogin();

            // Assuming the login is successful, it should navigate to HomePage
            HomePage homePage = new HomePage(driver);

            System.out.println("Login successful for user: " + username);
            
            // Set the implicit wait time (e.g., 10 seconds)
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Logout or reset to LoginPage if needed
            driver.navigate().refresh(); // Or add logout functionality if available
            
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }

  /*  @AfterMethod
    public void tearDownTest() {
        teardown(); // Closes the browser after each test
    }
    */
}
