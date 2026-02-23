package Abstraction;

/*
 * What is Abstraction - 
 * 
 * Hiding the implementation and exposing the functionality or
 * signature of a method is known as abstraction.
 * 
 * If a method is ending with a semicolon(;) it is incomplete method and it is 
 * represented using "abstract" keyword.
 * 
 * If an abstract method is available in a class, the class becomes incomplete and 
 * it is represented using "abstract" keyword.
 * 
 * For Abstract class we can not create object since it is incomplete class
 * 
 * Abstract class can't exist alone, it should have a companion in the form of sub-class.
 * 
 * If a class is inheriting any abstract class it is mandatory that it should implement all
 * abstract method or declare the class as abstract class.
 * 
 * When an object is created for a sub class always it over-rides abstract class
 * methods(super class).
 * 
 * Every abstract method will get over-ridden by sub class.
 * 
 * Advantages of abstraction - 
 * 1. To achieve standardization abstraction is needed.
 * 2. to achieve specification use abstraction
 * 
 * By using abstract class we can achieve 0-100% abstraction
 * 0% = no abstract methods in class
 * 100% = fully abstract methods in class
 * 
 * example - there is an abstract class where all the methods are static in 
 * selenium webdriver for locators i.e - By class is an abstract class.
 * 
 */


public class  MainDemo extends RDemo{

	public static void main(String[] args) {

		MainDemo ref =  new MainDemo();
		//ref.r1();
		//ref.r2();
		ref.r3();
	}
	
	public void r3() {
		System.out.println("Running r3() of RDemo in MainDemo");
	}

	
}
