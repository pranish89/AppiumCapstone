package com.Edureka.Appium_testing;

import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Assertion {

	public static void main(String[] args) {
		
		String country = "india ";
		String state ="tamilnadu";
		String concat = country.concat(state);
		String empty ="12";
		System.out.println("Concanted String is " +concat);
		
		//Hard assert
		//Assert.assertEquals(concat,"india tamilnadu" ,"Sstring is not equal"); 
		//(failure msg, expected,actual)
		Assert.assertEquals("String is not equal","india tamilnadu",concat);
		
		//Soft Assert
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(concat, "india tamilnadu", "not equal");
		
		//AssertNull
		
		//Assert.assertNull("object is null", empty);
		
		
		
	}

}
