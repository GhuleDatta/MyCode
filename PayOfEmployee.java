import java.util.Scanner;
class PayOfEmployee
{
public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the target score:");
	int score=sc.nextInt();

	System.out.print("Enter the saylary:");
	double saylary=sc.nextInt();
	
	
	
	if (score>90 )
		{
		double total=(saylary*3/100)+(saylary);
		System.out.println("Increases the pay  of employee by 3%:"+total);
		}
		else
		{
		double total=(saylary*1/100)+(saylary);
		System.out.println("Increases the pay  of employee by 1%:"+total);
		}
	}
}