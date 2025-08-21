package oopsConcepts.Jonah;

public class Environement {

	public static void main(String[] args) {
		Shark s= new Shark();//invoking shark class constructor will invoke also its super class constructors
		System.out.println(s.kind  +" is an " +s.Famil +" which lives in " +s.habitat +", Hence it is " +s.type);
	}

}
