import java.util.*;
class ArrayEqualOrFalse
{
	public static void main(String[] args) 
	{
		int []a={1,2,3,4,5};
		int []b={1,2,3,4};

		int lenA=a.length;
		int lenB=b.length;

		for (int i=0;i<a.length ;i++ ) 
		{
			if (lenA==lenB) 
			{
				if (a[i]==b[i]) 
				{
					if (i==a.length-1) 
					{
						System.out.println("equal");					
					}				
				}else{
					System.out.println("not equal");
					break;
				}			
			}
			else{
				System.out.println("not equal");
				break;
			}		
		}	
	}
}
// 45. Write a java program to check if 2 arrays are equal or not. 
// Array 1: [1, 2, 3, 4, 5], Array 2: [1, 2, 3, 4, 5] 
// Output: true 
// Array 1: [7, 14, 21,45,35], Array 2: [7, 14, 21, 36] 
// Output: false 