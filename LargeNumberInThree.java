import java.util.Scanner;
class LargeNumberInThree
{
public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("enter the number:");
	 int num1=sc.nextInt();

	 System.out.print("enter the number:");
	 int num2=sc.nextInt();
		
	 System.out.print("enter the number:");
	 int num3=sc.nextInt();

	 System.out.println((num1<num2)?((num1<num3)?num1:num3):((num2<num3)?num2:num3));
	}
}
