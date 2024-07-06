import java.util.*;
class Practise3
{
	public static void main(String[] args) 
	{
		int[]a={1,2,3};
		int[]b={4,5,6};
		int cout=0;
		int[]c=new int[(a.length)+(b.length)];
		for (int i=0;i<c.length ;i++ ) 
		{
			if(i<a.length)
			c[i]=a[i];
			else if(cout<b.length )
			c[i]=b[cout++];
		}
		System.out.println(Arrays.toString(c));
	}
}
// 28.Merge two 1D arrays. 
// Ip : a={1,2,3} 
// b={4,5,6} 
// Op : c={1,2,3,4,5,6}