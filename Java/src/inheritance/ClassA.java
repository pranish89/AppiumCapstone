package inheritance;

public class ClassA {
	
	int a=80;
	int b;
	
	public ClassA()
	{
		System.out.println("parent constructor");
	}
	
	public ClassA(int x)
	{
		System.out.println("Paremetrized construtor");
	}
	public void display() {
		System.out.println("display parent");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ClassA obj = new ClassA();
      obj.display();
      
	}

}
