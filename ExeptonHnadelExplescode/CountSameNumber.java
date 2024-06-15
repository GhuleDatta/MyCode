// find the count of number which is similar
import java.util.*;
class CountSameNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number : ");
		int base =sc.nextInt();

		System.out.println("Enter the array : ");
		int [] a=new int[base];

		for (int i=0;i<base ;i++ ) 
		{
			a[i]=sc.nextInt();		
		}	
		System.out.println(Arrays.toString(a));
		System.out.println(" entre the number :");
		int num=sc.nextInt();
		int count=0;

		for (int i=0;i<base ;i++ ) 
		{
			if (num==a[i]) 
			{
					count++;

			}	
		}
		System.out.println("dublicate Number : "+count);
	}
}