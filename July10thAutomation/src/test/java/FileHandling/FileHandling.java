package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.ExcelLib;

public class FileHandling {

	static String url;
	static String username;
	static String password;

	static File filepath = new File("..\\July10thAutomation\\TestData\\TestData.xlsx");

	public static void getDataFromExcel() throws Exception {

		FileInputStream fis = new FileInputStream(filepath);

		// Open workbook in a readable more.
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// get the control of the sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		// get the control of the row
		XSSFRow row = sheet.getRow(1);

		// get the data from the cell of the row
		url = row.getCell(2).getStringCellValue();
		username = row.getCell(3).getStringCellValue();
		password = row.getCell(4).getStringCellValue();

		System.out.println("Url -> " + url);
		System.out.println("username -> " + username);
		System.out.println("password -> " + password);

	}

	public static void setExcelData() throws Exception {

		FileInputStream fis = new FileInputStream(filepath);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		XSSFRow row = sheet.getRow(1);

		XSSFCell cell = row.createCell(5);

		FileOutputStream fos = new FileOutputStream(filepath);

		cell.setCellValue("ORDR987234");

		workbook.write(fos);

		workbook.close();

	}

	public static void main(String[] args) throws Exception {
		// getDataFromExcel();
		// testCase();
		setExcelData();
	}

	
	@Test
	public static void testCase() throws Exception {
		// Step 1: Show the path of driver
		System.setProperty("webdriver.chrome.driver", "..\\July10thAutomation\\Driver\\chromedriver.exe");

		// Step 2: Invoke light browser
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Step 3: Open Facebook login page
		driver.get(ExcelLib.getDataFromExcel("Sheet1", 1, 2));

		// Java Wait statement -
		Thread.sleep(3000);
		// Step 4: maximize the window
		driver.manage().window().maximize();

		// Step 5: Capture email WebElement and enter valid email address
		WebElement email = driver
				.findElement(By.xpath("//input[contains(@placeholder, 'Email address or phone number')]"));

		email.clear();
		email.sendKeys(ExcelLib.getDataFromExcel("Sheet1", 1, 3) + "@gmail.com");

		// Step 6: Capture Password WebElement and enter invalid password
		WebElement password1 = driver.findElement(By.id("pass"));

		password1.clear();
		password1.sendKeys(ExcelLib.getDataFromExcel("Sheet1", 1, 4));

		// Step 7: Click on login button
		WebElement loginButton = driver.findElement(By.name("login"));

		loginButton.click();
	}

}
