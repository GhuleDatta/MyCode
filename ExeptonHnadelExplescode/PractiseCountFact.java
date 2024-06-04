
import java.util.Scanner;
class PractiseCountFact
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		multipleNum(num);
		factorial(num);
	}
	public static void multipleNum(int num)
		{
			int mul=0;
		for (int i=1;i<=10 ;i++ ) 
		{
			mul=num*i;
			System.out.println(num+"*"+i+"="+mul);
		}
	}
	public static void factorial(int num)
	{
		int fact=1;
		for (int i=1;i<=num ;i++ ) 
		{
			fact=fact*i;
			// sum=i*sum;
			System.out.println("factorial of "+num+" is "+fact);
		}
	}
}