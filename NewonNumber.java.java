import java.util.*;
class NewonNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the NUmber:");
		int num=sc.nextInt();
		int sqr=num*num;
		int sum=0;

		while(sqr>0)
			{
				int rem=sqr%10;
				sum+=rem;
				sqr/=10;
			}
			if (sum==num) {
				System.out.println("NewonNumber");
				
			}else{
				System.out.print("not NewonNumber");
			}
	}
} 