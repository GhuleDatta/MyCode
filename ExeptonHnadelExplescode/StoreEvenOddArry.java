//WAJP to store even and odd element's in two difrent arrys
import java.util.Scanner;
class StoreEvenOddArry
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number :");
			int [] a={16,8,9,7,6,2,4,5,1,7};
			int evenCount=1;
			int oddCount=1;
			int []even=new int[evenCount];
			int []odd=new int[oddCount];

			for (int i=0;i<a.length ;i++ ) 
			{
				if (a[i]%2==0) 
				{
					even[evenCount]=a[i];
					evenCount++;
				}	
				else
					{
						odd[oddCount]=a[i];
						oddCount++;
					}

			}
			for (int i=0;i<even.length ;i++ ) 
			{
				System.out.println(even[i]);	
			}
	}
}