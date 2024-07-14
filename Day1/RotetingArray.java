import java.util.*;
class RotetingArrayi
{
	public static void main(String[] args) 
	{
		int []a={1,2,3,4,5};
		int k=2;
		int rep=0;
		for (int i=0;i<k ;i++ ) 
		{
			for (int j=0;j<a.length ;j++ ) 
			{
				rep=a[i];
				a[i]=a[a.length-i];
				a[i]=rep;	
			}	
		}	
		System.out.println(Arrays.toString(a));
	}
}
// 43. Write a java program to Rotate an array ‘k’ times forward.(left- 
// rotate) 
// arr[] = {1,2,3,4,5}; k=2 
// output: 3,4,5,1,2 