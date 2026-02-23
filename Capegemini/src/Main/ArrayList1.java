package Main;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
		
	}

}
