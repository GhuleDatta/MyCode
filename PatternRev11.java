class PatternRev11
{
	public static void main(String[] args) {
		
		for (int i=1;i<=5 ;i++ ) 
		{
			for (int j=1;j<=i ;j++ ) 
			{
				if (j==1 || i==j ) {
					System.out.print("* ");
						
					}	else 
					{
						System.out.print("  ");
					}
			}
			System.out.println();	
		}
		System.out.print("");
		for (int i=1;i<=4 ;i++ ) 
		{
			for (int j=4 ;j>=i;j-- ) 
			{	
				System.out.print("  ");	
			}
			for (int k=1;k<=i ;k++ ) 
			{
				if (k==1 ||  i==k) 
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}						
			}	
			System.out.println();	
		}	

	}
}