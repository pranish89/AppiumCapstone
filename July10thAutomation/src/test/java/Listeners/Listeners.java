package Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {

	public void onTestSuccess(ITestResult tr) {
		System.out.println("Running onTestSuccess()");
		// Convert web driver object to TakeScreenshot
	}

	public void onTestFailure(ITestResult tr) {
		System.out.println("Running onTestFailure()");
	}

	public void onTestSkipped(ITestResult tr) {
		System.out.println("Running onTestFailure()");
	}

}
