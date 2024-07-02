import java.util.Scanner;
class ReviganClass
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Entre the number : ");
		int num=sc.nextInt();
		if (num==1) {
			System.out.println("Natural Number Write +ve number :");			
		}else{
			PrimeNumber(num);
		}
		System.out.println("it's My anser");
		
	}
	public static void PrimeNumber(int num)
	{	
		int count=0;
		for (int i=1;i<=num ;i++ ) 
		{
			if (num%i==0) 
			{
				count++;			
			}		
		}
		if (count==2) 
		{
			System.out.println("Prime NUmber ");		
		}	
		else{
			System.out.println("Not Prime");
		}
	}
}