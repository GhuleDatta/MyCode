import java.util.*;
class Practise
{
	public static void main(String[] args) 
	{
		int cut;
		boolean flag=true;
		int[]array=new int[10];
		int count=0;
		for(int j=2;;j++)
		{
			cut=0;
			for (int i=1;i<=j ;i++ ) 
		{	
			flag=true;
			if (j%i==0) 
			{
				cut++;	
			}
		}
			if (count<10) 
			{
					if (cut==2) 
				{
					array[count]=j;
					count++;	
				}	
			}
			if(count==10)
			{
				System.out.println(Arrays.toString(array));
				return;
			}
		}
		

		// int count=0;
		// int num=0;
		// int []prime=new int[10];
		// for (int i=1; ;i++ ) 
		// {	
		// 	num=i;
		// 	boolean flag=true;
		// 	for (int j=2;j<i ;j++ ) 
		// 	{	
		// 		if(i%j==0)
		// 		{
		// 			flag=false;
		// 			break;
		// 		}
		// 		if (flag) 
		// 		{
		// 			prime[count++]=num;
		// 		}		
		// 	}	
		// 	if(count==9)
		// 		{System.out.println(Arrays.toString(prime));
		// 		return;}
		// }
		
		
	}
}
//3.Find first 10 prime numbers and store it in an array. 
// Op :a={2,3,5,7,11,13,17,19,23,29} 