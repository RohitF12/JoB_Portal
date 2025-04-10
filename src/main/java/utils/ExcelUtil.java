package utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtil {

    public static List<String[]> getTestData(String filePath, String sheetName) {
        List<String[]> data = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet == null) {
                throw new RuntimeException("Sheet with name '" + sheetName + "' does not exist in the file " + filePath);
            }

            // Assuming the first row is the header row, we start from the second row
            for (Row row : sheet) 
            {
                if (row.getRowNum() == 0) continue; // Skip header row
                
                String[] rowData = new String[row.getLastCellNum()]; // Adjust to include all columns
                
                for (int i = 0; i < row.getLastCellNum(); i++) 
                {
                    // Check if cell is null; if it is, set it to an empty string
                    rowData[i] = (row.getCell(i) == null) ? "" : row.getCell(i).toString();
                }
                data.add(rowData);
            }

        } catch (IOException e) {
            System.out.println("Error reading the Excel file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred while processing the Excel file.");
            e.printStackTrace();
        }

        return data;
    }
}
