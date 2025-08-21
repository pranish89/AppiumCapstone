package com.Edureka.facebook;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mages\\eclipse-workspace\\Drivers\\chromedriver.exe");
		
		//Launch empty browser
		WebDriver driver = new ChromeDriver();
		
		//After launching maximize the window
		driver.manage().window().maximize();
		
		//Launch the facebook
		driver.get("https://www.facebook.com");
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.name("pass"));
		WebElement login = driver.findElement(By.xpath("//button[@type ='submit']"));
		email.sendKeys("subhi john");
		pass.sendKeys("Su hi@123");
		login.click();
	}

}
