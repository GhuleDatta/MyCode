import java.util.*;
class GreetingExample
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Inter number : ");
		int num=sc.nextInt();

		if(num<25)
		{
			if(num>4 && num<12)
		System.out.println("Good Morning");
		else if(num>11 && num<17)
		System.out.print("Good After noon :");
		else if(num>16 && num<21)
		System.out.print("Good Evning");	
		else if(num<=4 && num>=0 ||num>20 && num<=24)
			System.out.print("Good Night");
		}
		else{
			System.out.println("Invalid Number");
		}
	}
}