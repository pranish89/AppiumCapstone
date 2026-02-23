package package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateNewCustomerTest {

	@Test(groups = {"Regression Test"})
	public void Create() {
		System.out.println("Create Customer and verify the customer is created");
	}

	@Test(groups = {"Smoke Test"})
	public static void modify() {
		System.out.println("Create Customer then modify and verify the modified customer");
	}
	@Test(dependsOnMethods= {"modify"})
	public void login() {
		System.out.println("login to application");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout of application");
	}
	
	@BeforeClass
	public void establishDbConnection() {
		System.out.println("== Connect to DB and launch the Browser ==");
	}

	@AfterClass
	public void CloseBroser() {
		System.out.println("== Disconnect DB and Close the Browser ==");
	}
	
	@BeforeGroups(groups = {"Regression Test"})
	public void groups()
	{
		System.out.println("Before groups");
	}

}