import java.util.*;
class SortingArry
{
	public static void main(String[] args) 
	{
		int [] arr={1,2,6,4,6,5,6,5,1};

		for (int i=0;i<arr.length ;i++ ) 
		{
			for (int j=i+1;j<arr.length ;j++ ) 
			{
				int img;
				if (arr[i]>arr[j]) 
				{
					img=arr[i];
					arr[i]=arr[j];
					arr[j]=img;				
				}			

			}		
		}	
		System.out.println(Arrays.toString(arr));
	}
}