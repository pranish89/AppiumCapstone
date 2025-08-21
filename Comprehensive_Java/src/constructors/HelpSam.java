package constructors;

public class HelpSam {
	int a;
	float b;
	
	public HelpSam(){
		
		System.out.println("This is dummy constructor or without any args");
		
	}

	public HelpSam(int x) {
		a=x;
		System.out.println("Integer arg constructor,value of a is " +a);
	}
	
	public HelpSam(float y) {
		b=y;
		System.out.println("Integer arg constructor,value of b is " +b);
	
		
	}
	public static void main(String[] args) {
		
		//creating object
		HelpSam obj1 = new HelpSam();
		HelpSam obj2=new HelpSam(2.3f);
		HelpSam obj3 = new HelpSam(10);
		
		
		

	}

}
