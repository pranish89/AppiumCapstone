package package1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassTest {
	
	@BeforeClass
	public void Launchbrowser() {
		System.out.println("launching browser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Login to the application");
	}

	@Test
	public void createCustomerTest() {
		System.out.println("Create customer and verify it");
	}

	@Test
	public void modifiedCustomerTest() {
		System.out.println("Create Customer, Modify and verify it is created");
	}

	@AfterMethod
	public void tearDownProcess() {
		System.out.println("Tear down process initiated");
	}
	
	@AfterClass
	public void CloseBrosserAndDB() {
		System.out.println("Dicsonnecting Databases and performing cleaup activities");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
