import java.util.Scanner;
class FindEvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();

		int []arr=new int[size];

		System.out.println("Enter the arry Number :");
		for (int i=0;i<size ;i++ ) 
		{
			arr[i]=sc.nextInt();	
		}

		int evenNuber=0;
		int oddNumber=0;
		for (int i=0;i<arr.length ;i++ ) 
		{
				if(arr[i]%2==0)
					evenNuber++;
				else
					oddNumber++;
		}
		int itt1=0;
		int itt2=0;
		for (int j=0;j<size ;j++ ) 
		{
			evenNuber[itt1]=arr[j];	
		}

	}
}