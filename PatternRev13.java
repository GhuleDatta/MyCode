class PatternRev13
{
	public static void main(String[] args) {
		for (int i=4;i>=1 ;i-- ) 
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
				else if (i==4 || k==1 || k%2==1) {
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