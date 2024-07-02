import java.util.*;
class ArrayExample3
{
	public static void main(String[] args) 
	{
		int []arr={16,17,4,3,5,2};
		for (int i=0;i<arr.length;i++) 
		{
			for (int j=1;j<=1 ;j++ ) 
			{
				if(arr[j]>arr[i])
				{
					System.out.print(arr[j]+" ");
				}	
			}
		}	
	}
}