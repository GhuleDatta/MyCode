import java.util.Scanner;
class InterNumber
{
	public static void main(String[]args)
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.print("inter the numbere:");
	 int number=sc.nextInt();

	 
	 boolean num1=true;
	 boolean num2=false;
	 System.out.println((number>0)?num1:num2);
	}
}