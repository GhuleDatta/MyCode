import java.util.Scanner;
class CalculateTheEnergy
{
public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the amout of water in Kg:");
	double waterKg=sc.nextDouble();

	System.out.print("Enter the Inital tempreture:");
	double inTemp=sc.nextDouble();

	System.out.print("Enter the final Tempreture:");
	double finalTemp=sc.nextDouble();

	double calculate=waterKg*(finalTemp-inTemp)*4184;
	System.out.println("Energy Needed is:"+calculate);
	}
}