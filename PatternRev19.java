class PatternRev19
{
	public static void main(String[] args) {
		for (int i=1;i<=5 ;i++ ) 
		{
			
			for (int k=1;k<=i ;k++ ) 
			{
			if (k==i ||  k==1) 
			{
			
				System.out.print("  *");			
			}
			else{
				System.out.print("  ");
			}

				}
			System.out.println();	
		}
		for (int i=4;i>=1 ;i-- ) 
		{
			
			for (int k=1;k<=i ;k++ ) 
			{
			if (k==i ||  k==1) 
			{
			
				System.out.print("  *");			
			}
			else{
				System.out.print("  ");
			}

				}
			System.out.println();	
		}
	}
}