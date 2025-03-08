package utils;

import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;


public class ExcelUtilityReg {


	    private Workbook workbook;
	    private Sheet sheet;

	    public ExcelUtilityReg(String filePath, String sheetName) throws IOException {
	        FileInputStream fis = new FileInputStream(filePath);
	        workbook = new XSSFWorkbook(fis);
 
	        // Debugging: Print all available sheet names
	        System.out.println("Available sheets in the workbook:");
	        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
	            System.out.println(workbook.getSheetName(i));
	        }

	        // Load the specified sheet
	        sheet = workbook.getSheet(sheetName);
	        if (sheet == null) {
	            throw new RuntimeException("Sheet with name '" + sheetName + "' does not exist in the file " + filePath);
	        }
	    }

	    public String getCellData(int rowNumber, int columnNumber) {
	        Row row = sheet.getRow(rowNumber);
	        if (row == null) {
	            return ""; // Handle null rows
	        }

	        Cell cell = row.getCell(columnNumber);
	        if (cell == null) {
	            return ""; // Handle null cells
	        }

	        return cell.toString();
	    }

	    public int getRowCount() {
	        return sheet.getLastRowNum();
	    }

	    public void close() throws IOException {
	        workbook.close();
	    }
	}



