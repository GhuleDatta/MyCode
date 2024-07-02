import java.util.Scanner;
class IfEx
{
	public static void main(String[] args) 
	{ 
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a=sc.nextInt();
		System.out.print("Enter the number2 :");
		int b=sc.nextInt();
		System.out.print("Enter the num3 :");
		int c=sc.nextInt();

		int num;

		if (a>0 && b>0 && c>0) {
			if (a<b && a<c)
			System.out.print(a);
		else if(b<c)
			System.out.print(b);
		else
			System.out.print(c);
		}
		else{
			System.out.println("invalid age");
		}

		// if(a==b || a==c)
		// 	num=a;
		// else if(b==c)
		// 	num=b



	}
}