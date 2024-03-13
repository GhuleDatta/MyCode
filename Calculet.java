import java.util.Scanner;//importing the scanner class
class Calculet
	{
		public static void main(String[]args)
			{
			  Scanner sc=new Scanner(System.in);		//creating a o

			  System.out.print("inter your subtotsl bill=");
			  double subtotal=sc.nextDouble();

			  System.out.print("Enter the tip rate=");
			  double tipRate=sc.nextDouble();

			  double total=subtotal+tipRate*(subtotal/100);
			
			  System.out.println("Subtotal is="+subtotal+"  and the total is="+total);
			  System.out.println("thank You Visit Again");
			  

			
   			}
	}
				