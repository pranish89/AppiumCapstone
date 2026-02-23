package IBM;
/*5
 * PASS
 * FAIL
 * PASS
 * ERROR
 * FAIL
 * OUTPUT: TOTAL:5;PASS=2;FAIL=2; ERROR=1
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputParsing {

	public static void main(String[] args) {
		System.out.println("Enter the logs");
		Scanner sc = new Scanner(System.in);
		int total = Integer.parseInt(sc.nextLine());
		Map<String,Integer> map = new HashMap<>();
		map.put("PASS", 0);
		map.put("FAIL",0);
		map.put("ERROR", 0);
		for (int i=0;i<total;i++)
		{
			String str = sc.nextLine().trim();
			map.put(str, map.get(str)+1);
		}
		
		int pass = map.get("PASS");
		int fail=map.get("FAIL");
		int error = map.get("ERROR");
		
		System.out.println("Total: " +total);
		System.out.println("Pass: " +pass);
		System.out.println("Fail: " +fail);
		System.out.println("Error: " +error);
		
	}

}
