class PatternRev17
{
	public static void main(String[] args) {
		for (int i=1;i<=5 ;i++ ) 
		{
			for (int j=5;j>i ;j-- ) 
			{
			 System.out.print("  ");		
			}
			for (int k=1;k<=i ;k++ ) 
			{
			if (k==i || i==5 ||  k==1) 
			{
			
				System.out.print(" *  ");			
			}
			else{
				System.out.print("    ");
			}

				}
			System.out.println();	
		}
		
	}
}