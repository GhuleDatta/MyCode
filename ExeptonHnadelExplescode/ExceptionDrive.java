import java.util.Scanner;

class MyArithemaaticException extends RuntimeException
{
	MyArithemaaticException(String desc)
	{
		super(desc);
	}
}
class ExceptionDrive
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int num1=sc.nextInt();
		System.out.print("Enter the num2 :");	
		int num2=sc.nextInt();

		if(num2==0)
		{
			try{
				throw new MyArithemaaticException("dividing a number by zero");
			}
			catch(MyArithemaaticException i)
			{
				System.out.println(i.getMessage());
			}
		}
		else{
			System.out.println(num1/num2);
		}
	}
}