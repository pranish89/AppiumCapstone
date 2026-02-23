package package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforegroups {

	
	@BeforeTest
	public void setup()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("AfterTest");
	}
	@BeforeGroups(groups = {"SMoke"})
	public void group()
	{
		System.out.println("Before group");
	}
	@BeforeClass
	public void login()
	{
		System.out.println("Login done");
	}
	@AfterClass
	public void logout()
	{
		System.out.println("logout");
	}
	@Test(groups = {"SMoke"})
	public void testmethod()
	{
		System.out.println("Test method successfull");
	}
	
	@Test
	public void testmethod2()
	{
		System.out.println("test method2");
	}
}
