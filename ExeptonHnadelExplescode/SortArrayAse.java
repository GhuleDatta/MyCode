// WAJP to sort a arry in asending order
import java.util.*;
class SortArrayAse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();

		int [] a=new int [base]	;
		for (int i=0;i<base ;i++ ) 
		{
			a[i]=sc.nextInt();		
		}	
		System.out.println(Arrays.toString(a));
		int img=0;

		for (int i=0;i<a.length ;i++ ) 
		{
			for (int j=i+1;j<a.length ;j++ )
			{
				
				if (a[i]>a[j]) 
				{
					img=a[i];
					a[i]=a[j];
					a[j]=img;
				}	
				
			}	
		}
		
		for (int i=0;i<a.length ;i++ )
		 {
		 	System.out.print(a[i] +" ");
			
		}
	}
}