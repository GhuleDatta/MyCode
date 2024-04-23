import java.util.*;
class NumberPro
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int dub=num;
		int rev=0;
		while(num>0){
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
	System.out.println(dub==rev?"it's Pelindrom Number : "+rev:"Not Pelindrom Number : "+rev);
	}
}