import java.util.Scanner;
class EligibaleForMaraage
{
	public static void main(String[]args)
	 {
		Scanner sc=new Scanner(System.in);
	        System.out.print("enter the age:");
		int age=sc.nextInt();
		
		System.out.print("enter the property amount:");
		double amount=sc.nextDouble();
		
		System.out.print("enter the surname:");
		String surname=sc.next().toUpperCase();

		if((age>21) && (amount >=10000000)|| (surname.equals("AMBANI")))
		 {
			System.out.println("Eligible for marege");
		}
		 else{
			System.out.println("not Eligible for marege");
			}
			
	}
}