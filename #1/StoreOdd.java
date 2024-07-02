import java.util.*;
class StoreOdd
{
	public static void main(String[] args) 
	{
		int []a={1,2,3,4,5,6};
		int j=1;
		int []odd=new int[j];
		for (int i=0;i<a.length ;i++ ) 
		{
			if (a[i]%2==1) 
			{	
				odd[j-1]=a[i];
				j++;
				System.out.println(a[i]);			
			}	
		}
		System.out.println(Arrays.toString(odd));
	}
}
// 21.Find odd elements and store it in a new array. 
// Ip : a={1, 2, 3, 4, 5, 6} 
// Op :b={1,3,5} 