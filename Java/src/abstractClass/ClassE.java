package abstractClass;

public class ClassE extends ClassD {

	public static void main(String[] args) {
     
		ClassE obj = new ClassE();
		obj.sum(); // this is overidden method in subclass
		obj.display();//overidden abstract method from classD
		obj.display1();//FInal method from class D
	}

	@Override
	public void display() {
		System.out.println("parent classD abstract method overided.");
	}
	
	//public void display1()//when a method is declared as Final in parent class, it canoot be overidden by subclass
	
	public void sum()
	{
		int c=a+b+7;
		System.out.println("added from subclass " +c);
	}

}
