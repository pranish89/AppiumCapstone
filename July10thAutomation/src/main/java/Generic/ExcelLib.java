package Generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {

	public static String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception {

		FileInputStream fis = new FileInputStream(Constants.filepath);

		// Open workbook in a readable more.
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// get the control of the sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		// get the control of the row
		XSSFRow row = sheet.getRow(rowNum);

		// get the data from the cell of the row
		String data = row.getCell(cellNum).getStringCellValue();

		System.out.println("Data -> " + data);
		
		return data;
	}

	public static void setExcelData(String sheetName, int rowNum, int cellNum, String data) throws Exception {

		FileInputStream fis = new FileInputStream(Constants.filepath);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		XSSFRow row = sheet.getRow(1);

		XSSFCell cell = row.createCell(5);

		FileOutputStream fos = new FileOutputStream(Constants.filepath);

		cell.setCellValue(data);

		workbook.write(fos);

		workbook.close();

	}
}
