import java.util.*;
class Spy{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int num=sc.nextInt();
		int sum=0;
		int pro=1;

		while(num>0){
			int rem=num%10;
			sum+=rem;
			pro*=rem;

			num/=10;

		}
		if (sum==pro) {
			System.out.println("spy number");
			
		}else{
			System.out.println("not Spy number");
		}
	}
}