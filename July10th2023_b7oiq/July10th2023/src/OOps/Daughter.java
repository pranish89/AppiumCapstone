package OOps;

public class Daughter extends Father{

	//String job = "IT Job";

	public static void main(String[] args) {
		
		Daughter d = new Daughter();
		d.graduation();
		d.phd();
	}
	
	public void phd() {
		System.out.println("phd");
	}

}
