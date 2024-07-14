import java.util.*;
class Practise8
{
	public static void main(String[] args) 
	{
		int []a={1,2,3,4};
		int []clone=new int[a.length];
		for (int i=0;i<a.length ;i++ ) 
		{
				clone[i]=a[i];		
		}		
		System.out.println(Arrays.toString(clone));
	}
}
// 32.Create a clone of 1D array without using clone(). 
// Ip : a={4,5,6} 
// Op : copy={4,5,6}