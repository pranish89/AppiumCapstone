package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(12);
		l1.add(78);
		l1.add(78); //allow duplicates
		l1.add(0, 67);
		System.out.println("Array List elements " +l1);
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.addAll(l1);
		System.out.println("Array List elements of L2 " +l2);
		l1.remove(0);
		l1.reversed();
		System.out.println("List L1 after reverse " +l1);
	
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		System.out.println("linked list " +ll);
	}

}
