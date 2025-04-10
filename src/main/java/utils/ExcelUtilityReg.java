package utils;

import java.util.Date;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;


public class ExcelUtilityReg 
{
	    public static String r_email;
	    public static String r_password;
        private Workbook workbook;
	    private Sheet sheet;

	  /*  public ExcelUtilityReg(String filePath, String sheetName) throws IOException 
	    {
	        FileInputStream fis = new FileInputStream(filePath);
	        workbook = new XSSFWorkbook(fis);
 
	        // Debugging: Print all available sheet names
	        System.out.println("Available sheets in the workbook:");
	        for (int i = 0; i < workbook.getNumberOfSheets(); i++) 
	        {
	            System.out.println(workbook.getSheetName(i));
	        }

	        // Load the specified sheet
	        sheet = workbook.getSheet(sheetName);
	        if (sheet == null) 
	        {
	            throw new RuntimeException("Sheet with name '" + sheetName + "' does not exist in the file " + filePath);
	        }
	    }

	    public String getCellData(int rowNumber, int columnNumber) 
	    {
	        Row row = sheet.getRow(rowNumber);
	        if (row == null) 
	        {
	            return ""; // Handle null rows
	        }

	        Cell cell = row.getCell(columnNumber);
	        if (cell == null) 
	        {
	            return ""; // Handle null cells
	        }

	        return cell.toString();
	    }

	    public int getRowCount() 
	    {
	        return sheet.getLastRowNum();
	    }

	    public void close() throws IOException 
	    {
	        workbook.close();
	    }*/
	   
	/*    public ExcelUtilityReg(String filePath, String sheetName) throws IOException {
	        FileInputStream fis = new FileInputStream(filePath);
	        workbook = new XSSFWorkbook(fis);

	        // Debugging: Print all available sheet names
	      //  System.out.println("Available sheets in the workbook:");
	        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
	            //System.out.println(workbook.getSheetName(i));
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

	        // Convert the cell value properly
	        return getStringCellValue(cell);
	    }

	    private String getStringCellValue(Cell cell) {
	        switch (cell.getCellType()) {
	            case STRING:
	                return cell.getStringCellValue().trim();

	            case NUMERIC:
	                if (DateUtil.isCellDateFormatted(cell)) {
	                    return cell.getDateCellValue().toString(); // Handle date cells
	                } else {
	                    return String.valueOf((long) cell.getNumericCellValue()); // Convert to long to remove decimals
	                }

	            case FORMULA:
	                return cell.getCellFormula();

	            case BOOLEAN:
	                return Boolean.toString(cell.getBooleanCellValue());

	            default:
	                return "";
	        }
	    }

	    public int getRowCount() {
	        return sheet.getLastRowNum();
	    }

	    public void close() throws IOException {
	        workbook.close();
	    }
	}*/
	    
	    public ExcelUtilityReg(String filePath, String sheetName) throws IOException {
	        FileInputStream fis = new FileInputStream(filePath);
	        workbook = new XSSFWorkbook(fis);

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

	        // Convert the cell value properly
	        return getStringCellValue(cell);
	    }

	    private String getStringCellValue(Cell cell) {
	        switch (cell.getCellType()) {
	            case STRING:
	                return cell.getStringCellValue().trim();

	            case NUMERIC:
	                if (DateUtil.isCellDateFormatted(cell)) {
	                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Format date properly
	                    Date date = cell.getDateCellValue();
	                    return dateFormat.format(date);
	                } else {
	                	 DecimalFormat decimalFormat = new DecimalFormat("#.####"); // Adjust precision as needed
	                     return decimalFormat.format(cell.getNumericCellValue());
	                }

	            case FORMULA:
	                return cell.getCellFormula();

	            case BOOLEAN:
	                return Boolean.toString(cell.getBooleanCellValue());

	            default:
	                return "";
	        }
	    }

	    public int getRowCount() {
	        return sheet.getLastRowNum();
	    }

	    public void close() throws IOException {
	        workbook.close();
	    }
	}



