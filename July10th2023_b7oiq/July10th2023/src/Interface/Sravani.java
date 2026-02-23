package Interface;

/*
 * Interface is nothing but an abstract class which guarantees 100% abstraction.
 * 
 * Interface starts with a keyword called interface followed by interface name.
 * 
 * All methods which are available in interface are abstract and public methods
 * 
 * We can not create an object for interface.
 * 
 * Between a class and interface to create a relationship(IS-A) 
 * always we use "implements" keyword.
 * 
 * The one which exists on left hand side of implements is always subclass
 * 
 * The one which exists on right hand side of implements is always an interface
 * 
 * Between interface --> Class = implements
 * Between Class --> Class = extends
 * Between abstract class --> class = extends
 * Between interface --> interface = extends
 */

public class Sravani implements Edureka{
	
	

	public static void main(String[] args) {

	}

	public void m1() {
		System.out.println("Running in m1()");
	}

	public void m2() {
		System.out.println("Running in m2()");

	}

	public void m3() {
		System.out.println("Running in m3()");

	}

}
