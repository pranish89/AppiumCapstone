package com.Edureka.Appium_testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Calculator {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		UiAutomator2Options option = new UiAutomator2Options()
				.setDeviceName("HA23P8P0")
				.setPlatformName("Android")
				.setPlatformVersion("15.0")
				.setAutomationName("UiAutomator2")
				.setAppPackage("com.google.android.calculator")
				.setAppActivity("com.android.calculator2.Calculator");
				
				//point at the running server
				URL server = new URL("http://127.0.0.1:4723/wd/hub");
				
				//driver creation
				AndroidDriver driver = new AndroidDriver(server,option);
				//digit9
				driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
				//digit +
				driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
				//digit 8
				driver.findElement(By.
						id("com.google.android.calculator:id/digit_8")).click();
				//digit =
			//	driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

				WebElement answer =driver.findElement(By.id("com.google.android.calculator:id/result_preview"));
				
				System.out.println(answer.getText());
				driver.quit();

	}

}
