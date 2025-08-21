package dynamic_data_storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PeterProblem {

	public static void main(String[] args) {
		
		Map<String,Object> obj = new HashMap<>();	
		obj.put("name", "Java");
		obj.put("class", "Rest Assured");
		obj.put("time", "");//hashMap allows null value
		obj.put("", "1234");//hashMap allows 1 null key
		System.out.println("Printing the HashMap values using entry method");
		for(Map.Entry<String, Object> entry : obj.entrySet())
		{
			System.out.println(entry.getKey() +" : " +entry.getValue());
		}
	}

}
