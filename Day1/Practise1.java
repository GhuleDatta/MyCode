import java.util.*;
class Practise1
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int c=0;
		int count=0;
		int[]array=new int[10];
		for (int i=0;i<3 ;i++ ) 
		{
			if (count<10) 
			{
			if (i==0)
			{array[count]=a; 
			count++;}		
			System.out.println(a+" ");
			a=b+c;
			array[count]=a;
			count++;
			System.out.println(a+" ");
			b=a+c;
			array[count]=b;
			count++;
			System.out.println(b+" ");
			c=a+b;
			array[count]=c;
			count++;
			System.out.println(c+" ");	
			}
		}	
		System.out.println(Arrays.toString(array));
	}
}
//25.Find first 10 Fibonacci numbers and store it in an array. 
// Op :a={0,1,1,2,3,5,8,13,21,34} 
		
				