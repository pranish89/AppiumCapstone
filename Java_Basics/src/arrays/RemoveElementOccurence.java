package arrays;

public class RemoveElementOccurence {

	public static void main(java.lang.String[] args) {
		
		int[] x = {10,20,30,10,10,50,10,10};
		int occurance=0;
		//remove the occurrence of 10 from the array x
		
		System.out.println("The initial array elements are ");
		for(int i:x)
		{
			System.out.print(i +" ");
		}
		
		System.out.println();
		
		for (int i=0;i<x.length-occurance;i++)
		{
			if(x[i] == 10)
			{
				for(int j=i;j<x.length-1;j++)
				{
					x[j]=x[j+1];
				}
				occurance++;
				i--;
			}
		}
		
		System.out.println("The final array elements are ");
		for(int k=0;k<x.length-occurance;k++)
		{
			System.out.print(x[k] +" ");
		}
		
		System.out.println();
	
	}

}
