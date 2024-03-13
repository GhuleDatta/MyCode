import java.util.Scanner;
class CharUpperLower
{
 public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the charecter:");
	 char ch=sc.next().charAt(0);
	 
	 System.out.println(((ch>='A' &&ch<='Z')||(ch>='a' &&ch<='z'))?((ch>='A' && ch<='Z')?"Upper case Alphbate":"lowercase Alphabet"):"it's not an alphabate");
	}
}