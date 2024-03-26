import java.util.*;
class CrushnaMurtiNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int num=sc.nextInt();
		int dup=num;
		int length=0;
		
		int sum=0;
		while(num>0)
		{	
		
			int rem=num%10;
			int fact=1;
			for (int i=rem;i>=1 ;i-- ) {

				fact=fact*i;
				}
				sum=fact+sum;
			    num/=10;
				System.out.println(num);
				System.out.println(sum);
		}
		if (sum==dup) {
			System.out.println("it is a CrushnaMurtiNumber");
			
		}else{
			System.out.println("It's not a CrushnaMurtiNumber");
		}
	
	}
}