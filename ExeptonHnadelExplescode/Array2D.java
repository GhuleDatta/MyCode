import java.util.*;
class Array2D
{
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row Number : ");
		int row=sc.nextInt();
		System.out.println("Enter the colume");
		int col=sc.nextInt();

		int [][] arr=new int[row][col];

		for (int i=0;i<row ;i++ ) 
		{
			for (int j=0;j<col ;j++ ) 
			{
				arr[i][j]=sc.nextInt();		
			}	
		}
		System.out.println(Arrays.deepToString(arr));

		// for (int i=0;i<arr.length ;i++ ) 
		// {
		// 	for (int j=0;j< ; ) {
					
		// 		}	
		// }
	}
}