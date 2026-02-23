package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileAndFramehandlingTest {
	
	static String url;
	static String username;
	static String password;

	static File filepath = new File("..\\July10thAutomation\\TestData\\TestData.xlsx");

	@Test(groups = {"Smoke Test", "Regression Test"})
	public void frameHandlingTest() {
		
		//WebDriverManager.chromedriver().setup();
		//ThreadLocal<WebDriver> threaddriver = new ThreadLocal<>();
		
		// Step 1: Show the path of driver
		System.setProperty("webdriver.chrome.driver", "..\\July10thAutomation\\Driver\\chromedriver.exe");

		// Step 2: Invoke light browser
		WebDriver driver = new ChromeDriver();

		// Step 3: Open Facebook login page
		driver.get(
				"https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/interactions/Actions.html");

		// maximize
		driver.manage().window().maximize();

		// shift the focus to packageListFrame
		driver.switchTo().frame("packageListFrame");

		// click on org.openqa.selenium
		driver.findElement(By.xpath("//a[text() = 'org.openqa.selenium']")).click();

		// go back to parent HTML document
		driver.switchTo().defaultContent();

		WebElement packageFrame = driver.findElement(
				By.xpath("//iframe[@title='All classes and interfaces (except non-static nested types)']"));

		// pass the control to the package Frame
		driver.switchTo().frame(packageFrame);

		// click on WebElement option
		driver.findElement(By.xpath("//a[@href='WebElement.html']")).click();

		driver.quit();
	}

	@Test(groups = {"Smoke Test"})
	public void FileHandlingTest() throws Exception {
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
}
