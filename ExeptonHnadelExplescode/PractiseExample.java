import java.util.*;
class PractiseExample
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		if (num==1) 
			System.out.println("Natural Number");	
		else if(num<1)
			System.out.println("write a number which is >1");
		else
		primeNum(num);	
	}
	public static void primeNum(int num)
	{

		boolean flag=true;
		for (int i=2;i<num ;i++ ) 
		{	
			
			
		}
		System.out.println(flag?"prime":"not Prime");	
	}
}