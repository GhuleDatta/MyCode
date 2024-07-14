class FindLargest
{
	public static void main(String[] args) 
	{
		int[] a={7,84,21,45,35,1};
		int max=a[0];
		int min=a[0];

		for (int i=0;i<a.length;i++ ) 
		{
				if (a[i]>max) 
				{
					max=a[i];			
				}	

				if (a[i]<min) 
				{
					min=a[i];		
				}		
					
		}	

		System.out.println("max of Array "+max);
		System.out.println("mini mum array "+min);
		
	}
}

// 46. Write a java program to find largest element from an array 
// without using sorting method. 
// Array :[7, 84, 21,45,35] 
// Output: 84 
// Array :[2,2,2] 
// Output: 2