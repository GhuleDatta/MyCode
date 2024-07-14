import java.util.*;
class practise7
{
	public static void main(String[] args) 
	{
		int count1=0;
		int count=0;
		int num=12;
		
		for (int i=1;i<=num ;i++ ) 
		{
			if(num%i==0)
			{
				count++;
			}	
		}
		int []a=new int[count];
		for (int i=1;i<=num ;i++ ) 
		{
			if(num%i==0)
			{
				a[count1]=i;
				count1++;
			}	
		}
			
			System.out.println(Arrays.toString(a));	
	}	
}
// 31.Find factors of a number and store them in an array. 
// Ip : num : 12 
// Op : a={1,2,3,4,6,12} 