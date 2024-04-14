import java.util.Scanner;
class StaticInitializer

{
	static int op;
	static{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		op=addition(num1,num2);
		System.out.println("Adiition : "+op);
		System.exit(0);
	}
	public static int addition(int num1,int num2) 
	{
		op=num1+num2;
		return op;
	}
}