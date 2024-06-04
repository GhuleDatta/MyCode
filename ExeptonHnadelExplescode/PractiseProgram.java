import java.util.Scanner;
class PractiseProgram
{
	public static void main(String[] args) 
	{
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the number : ");
		  int num=sc.nextInt();
		  if (num==1) 
		  {
		  	System.out.println("natural number");
		  	return;
		  }
		  else
			isPrime(num);	
		 

	}
	public static void isPrime(int num)
	{
		 boolean flag=true;
		  for (int i=2;i<num ;i++ ) 
		  {
		  	if (num%i==0) 
		  	{
		  		flag=false;
		  			
		  	}	
		 
		  }
		  System.out.println(flag?"prime number":"not Prime");
	}
}