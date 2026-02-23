package utilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;


public class ExcelUtil {
	

		 static final String PATH =
		            "src/test/resources/testdata/TestData.xlsx";

		    public static String getSearchData(int rowNum) {

		        try (FileInputStream fis = new FileInputStream(PATH);
		             Workbook wb = WorkbookFactory.create(fis)) {

		            Sheet sheet = wb.getSheetAt(0);

		            // ⭐ assuming row 0 is header
		            return sheet.getRow(rowNum).getCell(0).getStringCellValue();

		        } catch (Exception e) {
		            throw new RuntimeException("Failed to read Excel data", e);
		        }
		    }   
	}


