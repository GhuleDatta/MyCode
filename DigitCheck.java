import java.util.Scanner;
class DigitCheck
{
 public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the charecture:");
	char ch=sc.next().charAt(0);
	
	System.out.println((ch >= '0' && ch <= '9')? "it's a digit" : "it's not Digit" );
	}

}