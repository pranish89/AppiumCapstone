package arrays;
/*
25. Read only even indexed elements from an 
	array in the reverse order?*/

public class ReadEvenIndex {

	public static void main(String[] args) {

		int[] x= {1,2,3,4,5,6,7};
		int end = x.length % 2 == 0 ? (x.length - 2) : (x.length - 1);//end index we have to find, if the length is even say 4,end index will be 3,hence length-2
		System.out.println(end);
		for(int i = end; i >= 0; i -= 2)
		{
			System.out.print(x[i] + ", ");
	}

}
}