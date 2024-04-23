import java.util.*;
class FactoNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int dub=num;
		int sum=0;
		while(num>0)
		{
			int count=num%10;
			int fact=1;
			

			for (int i=1;i<=count ;i++ ) 
			{
				fact*=i;
			}
			sum+=fact;			
			num/=10;
			
		}
		System.out.print(dub==sum?"Auto morfic Number : "+dub:"not Auto morfic");
		
	}
}