import java.util.Scanner;
class SmallNumber1
{
 public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("inter the number:");
	 int num1=sc.nextInt();

	 System.out.print("inter the number:");
	 int num2=sc.nextInt();

	 System.out.println((num1<num2)?num1+" is small number":num2+" Is small number");

	}

}