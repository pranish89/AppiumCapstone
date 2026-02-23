package arrays;
import java.lang.String;

public class StringEqual {

	public static void main(String[] args) {

		String str1="Scaler";
		String str2 ="Scaler";
		String str3 = new String("Test");
		String str4 = new String("Test");
		
		
			System.out.println(str1 == str2);
	
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str3 == str4);
		
		System.out.println(str3.equalsIgnoreCase(str4));
	
		
	}

}
