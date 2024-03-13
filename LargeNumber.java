import java.util.Scanner;
class SmallNumber
{
public static void main(String[]arg)
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.print("inter the number:");
	 int num1=sc.nextInt();
	
	 System.out.print("inter the number:");
	 int num2=sc.nextInt();

	 
	System.out.println((num1>num2)?num1+" is larg number; ":num2+" Is larg number:");
	}
}