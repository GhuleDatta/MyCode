import java.util.Scanner;
class PractiseNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");	
		int num=sc.nextInt();
		revNum(num);
	}
	public static void revNum(int num)
	{
		int dub=num;
		int rev=0;
		while(num>0)
		{
			int rem=0;
			rem=num%10;
			rev=rev*10+rem;
			System.out.println(rev);

			num/=10;
		}
		System.out.println(rev);
		palindrom(dub,rev);
	}
	public static void palindrom(int num,int rev)
	{
		System.out.println(num==rev?"palindrom number":"not palindrom");
	}
}