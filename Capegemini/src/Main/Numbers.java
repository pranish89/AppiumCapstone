package Main;

public class Numbers {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		int x= a.length-1;
		int[] b = new int[5];

		
		for (int i=0;i<=x;i++)
		{
			b[i]=a[x-i];
			System.out.println(b[i]);

		}
		//System.out.println(b);
	}

}
