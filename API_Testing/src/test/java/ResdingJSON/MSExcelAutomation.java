package ResdingJSON;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MSExcelAutomation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getExcelData();
		setExcelData("sheet1",1,7,"not found");
	}
	
	public static void getExcelData(String sheet,int rownum,int cellnum) throws IOException
	{
		File filepath =new File("..\\API_Testing\\TestData\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(filepath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = workbook.addSheet("sheet1");
		
		XSSFRow row=sheet1.getRow(rownum);
		
		/*String orderid = row.getCell(2).getStringCellValue();
		String petid = row.getCell(3).getStringCellValue();
		String quantity = row.getCell(4).getStringCellValue();
		String status = row.getCell(5).getStringCellValue();
		boolean complete =row.getCell(6).getBooleanCellValue();
		*/
		
		//add ` in the excel sheet
		
		String orderid = row.getCell(2).getStringCellValue();
		String petid = row.getCell(3).getStringCellValue();
		String quantity = row.getCell(4).getStringCellValue();
		String status = row.getCell(5).getStringCellValue();
		boolean complete =row.getCell(6).getBooleanCellValue();
		
		
		
		System.out.println(orderid.substring(1));
		System.out.println(petid.substring(1));
		System.out.println(quantity.substring(1));
		System.out.println(status);
		System.out.println(complete);
		
		workbook.close();
	}

		public static void setExcelData(String sheet,int rownum,int  cellnum,String data) throws IOException
		{
			File filepath = new File("C:\\Users\\mages\\eclipse-workspace\\API_Testing\\TestData\\TestData.xlsx");
			
			FileInputStream fis = new FileInputStream(filepath);
			
			XSSFWorkbook workbook =new XSSFWorkbook(fis);
			
			//XSSFSheet sheet = workbook.getSheet("Sheet1");--->Parameterization
			XSSFSheet sheet = workbook.getSheet(sheet);

			
			//XSSFRow row=sheet.getRow(1);
			XSSFRow row=sheet.getRow(rownum);

			//XSSFCell cell =row.createCell(7);
			XSSFCell cell =row.createCell(cellnum);

			 
			//cell.setCellValue("Data not found");
			cell.setCellValue(data);

			
			FileOutputStream fos = new FileOutputStream(filepath);
			
			workbook.write(fos);
			
			workbook.close();e
			
			
			
		}
		
		
	}


