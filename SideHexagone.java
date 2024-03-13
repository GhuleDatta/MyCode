import java.util.Scanner;
class SideHexagone
{
public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Sides:");
	double s=sc.nextDouble();


	double area=3*(1.414/2)*(s*s);
	System.out.println("the area is:"+area);
	}
}