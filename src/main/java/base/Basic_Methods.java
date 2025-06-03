package base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
public class Basic_Methods 
{
	private Workbook workbook;
    private Sheet sheet;
	public static void scrollbar(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",ele);
		js.executeScript("arguments[0].click();",ele);
	}
	public void DoubleClick(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void switchingtabs(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
	}
	public void scrollupdown(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,5000)");
	}
	public void draganddrop(WebElement ele,WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.dragAndDropBy(ele, -20, 0).perform();
	}
	public void uploadfile(WebDriver driver, String path) throws AWTException, IOException
	{
		Robot rb1 = new Robot();
		rb1.delay(3000);
		 StringSelection ss1 = new StringSelection(path);
        //StringSelection ss1 = new StringSelection("C:\\Users\\MadhaviBamabawale\\Downloads\\OIP (4).jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);	
        
        //paste action
        rb1.keyPress(KeyEvent.VK_CONTROL);
        rb1.keyPress(KeyEvent.VK_V);
        
        rb1.keyRelease(KeyEvent.VK_CONTROL);
        rb1.keyRelease(KeyEvent.VK_V);
        
        rb1.keyPress(KeyEvent.VK_ENTER);
        rb1.keyRelease(KeyEvent.VK_ENTER);
	}
	public void opentabandclosethetab(WebDriver driver)
	{
	
	Set<String> handles01 = driver.getWindowHandles();
    Iterator<String> it01 = handles01.iterator();
     
    String Parent_id01 = it01.next();
    String Child_Id01 = null;
     
    // Identify the child window handle
    while (it01.hasNext()) 
    {
        Child_Id01 = it01.next();
    }
     
    // Switch to child window and close it
    if (Child_Id01 != null) 
    {
        driver.switchTo().window(Child_Id01).close();
    }
     
    // Switch back to the parent window
    driver.switchTo().window(Parent_id01);
     
    // Navigate back in the parent window
	}
	public void moreopenTabAndmoreCloseTheTab(WebDriver driver) {
	    
	    // Get all window handles
	    Set<String> handles = driver.getWindowHandles();
	    List<String> windowList = new ArrayList<>(handles); // Convert set to list

	    // Check if at least 3 tabs are open
	    if (windowList.size() >= 3) {
	        String thirdTab = windowList.get(2); // 3rd tab (last one opened)
	        String secondTab = windowList.get(1); // 2nd tab (the one you want to switch to)

	        // Switch to 3rd tab and close it
	        driver.switchTo().window(thirdTab).close();

	        // Switch control to 2nd tab
	        driver.switchTo().window(secondTab);
	    }
	}
	// Verify entered data is correct
	public String getCellData(String filePath, int rowNum, int colNum) throws IOException 
	{
        FileInputStream fis = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(5);
        Row row = sheet.getRow(rowNum);
        Cell cell = row.getCell(colNum);
        String cellValue = cell.toString().trim();
        workbook.close();
        return cellValue;
    }
	

}
