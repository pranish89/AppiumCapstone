package arrays;
//42. Do right rotate by one for elements of given array?


public class RightRotate {

	public static void main(java.lang.String[] args) {
		
		int[] x= {57,34,22,55,22,46,87};
		int temp = x[x.length-1];
		
		System.out.println("initial array element ");
		for(int i=0; i < x.length; i++)
		{
			System.out.print(x[i] +",");
		}

		for (int j=x.length-1;j>0;j--)
		{
			x[j]=x[j-1];
		}
		x[0]=temp;
		System.out.println("final array element ");
		for(int i=0; i < x.length; i++)
		{
			System.out.print(x[i] +",");
		}	
		}

}
