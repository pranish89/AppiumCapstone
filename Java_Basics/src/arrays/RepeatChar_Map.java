package arrays;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class RepeatChar_Map {

	public static void main(String[] args) {

		String str = "communication";
		char[] ch = str.toCharArray();
		Map<Character,Integer> set = new HashMap<Character,Integer>();	
		for (char c: ch)
		{
			if(set.containsKey(c))
			{
				set.put(c,set.get(c)+1);
			}
			else
			{
				set.put(c, 1);
			}
		}
		System.out.println(set);
		for(Map.Entry<Character, Integer> entry: set.entrySet()) {
			if(entry.getValue()>1)
			System.out.println("The character "+entry.getKey() +" Occurence is " +entry.getValue());
			
		}

}
}
