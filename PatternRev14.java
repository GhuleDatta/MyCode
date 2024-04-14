class PatternRev14
{
	public static void main(String[] args) {
		
		for (int i=1;i<=3 ;i++ ) 
		{
			for (int j=4;j>i ;j-- ) 
			{
				System.out.print("  ");
			}
			for (int k=1;k<=2*i-1 ;k++ ) 
			{
				if (i==3 && k==3) {
					System.out.print("  ");
					
				}
				else if ( k==1 || k%2==1) {
					System.out.print("* ");
						
					}	else 
					{
						System.out.print("  ");
					}	
			}
			System.out.println();	
		}
		for (int i=3;i>=1 ;i-- ) 
		{
			for (int j=4;j>i ;j-- ) 
			{
				System.out.print("  ");
			}
			for (int k=1;k<=2*i-1 ;k++ ) 
			{
				if (i==3 && k==3 || i==4 && k==5|| i==4 && k==2) {
					System.out.print("  ");
					
				}
				else if ( k==1 || k%2==1) {
					System.out.print("* ");
						
					}	else 
					{
						System.out.print("  ");
					}	
			}
			System.out.println();	
		}

	}
}