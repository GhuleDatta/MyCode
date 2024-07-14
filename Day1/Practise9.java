import java.util.*;
class Practise9
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3};
		int[] b={4,5,6,7,8};
		int length=(b.length)+(a.length);
		int[] c=new int[length];
		int count=0;
		int count1=0;
		System.out.println(c.length);
		for (int i=0;i<c.length ;i++ ) 
		{
			if (count<a.length && i%2==0) 
			{	
				if (i%2==0) 
				{
					c[i]=a[count];
				count++;			
				}
				
			}else if(count1<b.length){
				c[i]=b[count1];
				count1++;
			}	
		}
		System.out.println(Arrays.toString(c));
	}
}
// 35.Perform Zig Zag merging of arrays. 
// Ip : a={1,2,3} 
// b={4,5,6,7,8} 
// Op : c={1,4,2,5,3,6,7,8}