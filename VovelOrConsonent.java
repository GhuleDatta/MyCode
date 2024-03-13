import java.util.Scanner;
class VovelOrConsonent
{
 public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the charecture:");
	char ch=sc.next().charAt(0);
	
	System.out.println((ch ='a')? "it is a vovel" : "it is consonent" );
	}

}