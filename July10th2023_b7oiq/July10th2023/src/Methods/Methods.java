package Methods;

public class Methods {
	
	static Methods ref = new Methods();


	public static void main(String[] args) {
		
		//Object Creation
		ref = new Methods();
		ref.m1();
		ref.m2();
		ref.m3();
		ref.m4();
		ref.m5();
		
		String str = new String();
		String str2 = new String("Rakesh");
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

	public void m4() {
		System.out.println("Running in m4()");
	}

	public void m5() {
		System.out.println("Running in m5()");
	}

}
