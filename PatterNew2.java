class PatterNew2
{
	public static void main(String[] args) 
	{
		int num = 5;
		for (int i=1;i<=num ;i++ ) 
		{

			for (int j=num;j>i ;j-- ) 
			{
				System.out.print("  ");
				
			}
			for (int k=1;k<=(i*2-1) ;k++ ) 
			{
				if(k==1 || k==(i*2-1) || i==num)
					System.out.print("* ");
				else
					System.out.print("  ");				
			}
			System.out.println();
			
		}
	}
}