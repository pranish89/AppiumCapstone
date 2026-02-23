package arrays;

public class RemoveIndexElement {
	public static void main(java.lang.String[] args) {

		int[] a = {1,2,3,4,5,6,7,8,9};
		//remove the 5th index element
		
		System.out.print("The initial array elements are {");
		
		for (int i:a)
		{
			System.out.print(i +" ");
		}
		System.out.print("}");
		
		for(int i=5;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		int[] b = new int[a.length-1];
		
		for (int j =0;j<b.length;j++)
		{
			b[j]=a[j];
		}
		
		System.out.println("The final array elements after removal {");
		
		for (int i:b)
		{
			System.out.print(i +" ");
		}
		System.out.print("}");
		
	}

}
