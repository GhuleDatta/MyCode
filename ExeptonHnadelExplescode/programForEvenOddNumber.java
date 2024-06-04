
import java.util.Scanner;
class programForEvenOddNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number :");
		int a=sc.nextInt();
		System.out.println(a%2==0?"even number":"odd number");
		System.out.print("1.Check for even\n2.Check for Odd\n3.Exit\nEnter the number :");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
			{
				evenNumber();
				break;
			}
		case 2:
			{
				oddNumber();
				break;
			}
		case 3:
			{
				System.exit(0);
			}
		default:
			{
				System.out.println("invalid Number");
			}
		}	
	}
		public static void evenNumber()
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Check Number Even or not :");
			int num=sc.nextInt();
			if (num%2==0) 
				System.out.println("Even Number");
			else
				System.out.println("not even");
		}
		public static void oddNumber()
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Check Number Odd or Not :");
			int num=sc.nextInt();
			if (num%2!=0) 
				System.out.println("Odd Number");
			else
				System.out.println("not Odd");
		}
	
}