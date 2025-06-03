package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import base.BaseTest;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        Object testInstance = result.getInstance();

        if (testInstance instanceof BaseTest) {
            WebDriver driver = ((BaseTest) testInstance).getDriver();

            if (driver != null) {
                try {
                    System.out.println("Current URL: " + driver.getCurrentUrl());

                    String testName = result.getName();
                    String screenshotPath = ScreenshotUtil.captureScreenshot(driver, testName);
                    System.out.println("Screenshot saved at: " + screenshotPath);

                } catch (Exception e) {
                    System.out.println("Error while taking screenshot: " + e.getMessage());
                }
            } else {
                System.out.println("Driver is null. Cannot capture screenshot or get current URL.");
            }
        } else {
            System.out.println("Test instance is not of type BaseTest.");
        }
    }
}
