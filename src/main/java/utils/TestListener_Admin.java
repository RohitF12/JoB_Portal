package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseTest;
import base.BaseTest_Admin;


public class TestListener_Admin implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        // Get WebDriver instance from the test class
        Object testClass = result.getInstance();
        WebDriver driver = ((BaseTest_Admin) testClass).getDriver();
        // Capture screenshot
        String testName = result.getName();
        String screenshotPath = ScreenshotUtil.captureScreenshot(driver, testName);
        System.out.println("Screenshot saved at: " + screenshotPath);
    }
}