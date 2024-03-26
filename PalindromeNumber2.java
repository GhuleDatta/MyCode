import java.util.Scanner;
class PalindromeNumber2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int dub=num;
		int rev=0;

		for( ;num>0;num/=10 )
		{
			int rem=num%10;
			rev=rev*10+rem;
		
		}
		System.out.println((dub==rev)?"it's a Palindrome Number:"+rev:"It's not a Palindrome Number:"+rev);

		Scanner sc1=new Scanner(System.in);
		System.out.print("enter the number if you know:");
		int num1=sc.nextInt();
		int dub1=num1;
		int rev1=0;
			 while(num1>0){
			 	int sem=num1%10;
			 	rev1=rev1*10+sem;
			 	num1/=10;
			 }
			 	System.out.println((dub1==rev1)?"it's a Palindrome Number:"+rev1:"It's not a Palindrome Number:"+rev1);
		
	}
}