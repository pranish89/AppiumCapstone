package IBM;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CountWords {
	
	public static int count(String s) {
		if (s==null || s.trim() == null)
			return 0;
		return s.trim().split("\\s+").length;
	}

	public static void main(String[] args) {
		
		int n=CountWords.count("I am doing sample programme");
		int l =CountWords.count("this");
		System.out.println("COunt of the words " +n +" " +l);
		
		Set<Integer> s= new HashSet<>();
		s.add(2);
		s.add(2);
		s.add(4);
		s.add(9);
		s.add(1);
		System.out.println(s);

		Map<Character,Integer> map = new HashMap<>();
		map.put('a',2);
		map.put('b', 1);
		map.put(null, null);
		map.put('c', null);
		map.put(null, 5);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.get('a'));
		System.out.println(map);
		
		//Map.Entry<Character, Integer> entry = map.entrySet()
		
	}

}
