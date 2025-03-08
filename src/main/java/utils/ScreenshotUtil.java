package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ScreenshotUtil {
	
	 public static String captureScreenshot(WebDriver driver, String testName) {
	        // Generate a timestamp
	        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        // Screenshot file name
	        String screenshotName = testName + "_" + timestamp + ".png";
	        // Define path to save screenshots
	        String screenshotPath = "./screenshots/" + screenshotName;

	        // Take screenshot
	        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        try {
	            FileUtils.copyFile(srcFile, new File(screenshotPath));
	        } catch (IOException e) {
	            System.out.println("Failed to save screenshot: " + e.getMessage());
	        }
	        return screenshotPath;
	    }
	}

