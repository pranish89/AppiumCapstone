package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Hash{


	public static void main(String[] args) {
		
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(12);
		h1.add(45);
		h1.add(78);
		h1.add(78);
		h1.add(null);
		h1.add(null);

		Iterator<Integer> i = h1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(h1);
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "aaa");
		hm.put(2, "jjjj");
		hm.put(3, "uyyu");
		hm.put(null, "8989");
		hm.put(null, "9898");
		hm.put(5, null);
		hm.put(6, null);
	/*	for(Map.Entry<Integer, String> entry : hm.entrySet()) 
		{
			System.out.println(entry.getKey() +" : " +entry.getValue());
		}*/
		
		System.out.println(hm);
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1, "nisha");
		ht.put(2, "thoori");
		ht.put(3, "subhi");
		//ht.put(4, null);
		//ht.put(null, "343");
		
		System.out.println(ht.hashCode());
		ht.hashCode();
		
			
		
		

	}

}
