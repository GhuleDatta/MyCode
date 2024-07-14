import java.util.*;
import java.lang.*;
class Practise6
{
	public static void main(String[] args) 
	{
		int [][] a={{4,5,6},{3,2,1}};
		int count=0;
		
		for (int i=0;i<a.length ;i++ ) 
		{
			for (int j=0;j<a[i].length ;j++ ) 
			{
				count++;		
			}	
		}
		int[]arry=new int[count];
		for (int i=0;i<a.length ;i++ ) 
		{
			for (int j=0;j<a[i].length ;j++ ) 
			{
				arry[count]=a[i][j];
				count++;
				// System.out.println(a[i][j]+" ");
			}	
		}
		// for (int[] i:a) 
		// {
		// 	for (int j:i ) {
		// 		if(count<a.length)
		// 			arry[count++]=j;
		// 		}	
		// }
		// System.out.println(Arrays.toString(arry));
	}
}
// 30. Merge elements of a 2D array. 
// Ip : a={{4,5,6},{3,2,1}}; 
// Op: 4 5 6 3 2 1