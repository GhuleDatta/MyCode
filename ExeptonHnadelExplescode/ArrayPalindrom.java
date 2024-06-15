import java.util.*;
class ArrayPalindrom
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number : ");
			int base=sc.nextInt();
			int size=base;
			System.out.println("Enter the Array : ");
			char [] a=new char[base];                                                        
			for (int i=0;i<base ;i++ ) 
			{
				a[i]=sc.next().charAt(0);	
			}
			
			char [] rev=new char[size];

			for (int i=0;i<size ;i++ ) 
			{
				rev[size-1-i]=a[i]	;
				
			}

			System.out.println(Arrays.toString(rev));

			if (Arrays.equals(a,rev)) 
			{
				System.out.println("pelindrom Number");	
			}
			else{
				System.out.println("NOt  pelindrom");
			}



	}
}