import java.util.Scanner;
class PinCode
{
	public static void main(String[] args) throws InterruptedException
	{

		int savePin=1234;
		int count=3;
		outerloop:
		for (; ; ) {

		do{
			Scanner sc=new Scanner(System.in);
		System.out.print("Enter the pincode:");
		int pincode=sc.nextInt();

			if (pincode==savePin) 
			{
				System.out.println("*****welcome*******");
				break;
				
			}else
			{
				System.out.print("wrong pin interd ");
				System.out.println(" only "+(count-1)+" attempt left");
			
			}if (count==1)
			 {
			 	Thread.sleep(5000);
			 	System.out.println("try affter 5 secund");
				
			}
			count--;

		}while(count>=1);
		break outerloop;
				
		}
		
	}
}