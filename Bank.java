import java.util.*;
class Bank{
	static String name;
	static String add;
	static long mobileNum;
	static long addhar;
	static double moneny;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***********welcome***********");
		System.out.println("*******Money Double Bank**********");
		System.out.println("1.create Account 2.Login");
		System.out.print("Enter The NUmber:");
		int num=sc.nextInt();
		switch(num){
		case 1:
			{  Scanner sc1=new Scanner(System.in);
				System.out.print("1.name");
				System.out.println("2.address");
				System.out.println("3.mobileNum");
				System.out.println("4.Addhar number");
				System.out.println("5.add ");
				System.out.print("Enter your full name:");
				name=sc.nextLine();
				System.out.print("Enter your permenent Address:");
				add=sc.nextLine();
				System.out.print("mobileNum:");
				mobileNum=sc.nextLong();
				System.out.print("Addhar number:");
				addhar=sc.nextLong();
				System.out.print("Enter amount:");
				moneny=sc.nextDouble();
				break;
			}
		case 2:
			{
				System.out.print("hi from case 2");
				break;

			}
		}

		
	}
}