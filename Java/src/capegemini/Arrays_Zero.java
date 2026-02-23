package capegemini;

public class Arrays_Zero {

	
	public static void array_move(int a[])
	{
		int index=0;
		int[] b= new int[a.length];

		for (int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[index++] = a[i];
				}

		}
		while(index<a.length)
		{
			a[index++]=0;
		}
		
		for(int j=0;j<a.length;j++)
		{
		System.out.println(a[j]);
		//System.out.println(index);
		}
		
	}
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,0,8,9,3,0,2,0,1,0};
		System.out.println("I am in");

				
		array_move(a);
		
	}

}
