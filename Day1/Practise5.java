import java.util.*;
class Practise5
{
	public static void main(String[] args) 
	{
		int[]a={1,2,3};
		int[]b={4,5,6};
		int[]d={7,8,9};
		int cout=0;
		int count1=0;
		int[]c=new int[(a.length)+(b.length)+(d.length)];
		for (int i=0;i<c.length ;i++ ) 
		{
			if(i<a.length)
			c[i]=a[i];
			else if(cout<b.length )
			c[i]=b[cout++];
			else if(count1<d.length)
			c[i]=d[count1++];
		}
		System.out.println(Arrays.toString(c));
	}
}


// 29.Merge three 1D arrays. 
// Ip : a={1,2,3} 
// b={4,5,6} 
// c={7,8,9} 
// Op : c={1,2,3,4,5,6,7,8,9} 