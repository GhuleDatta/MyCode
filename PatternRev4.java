class PatternRev4
{
	public static void main(String[] args) 
	{
		for (int i=5;i>=1 ;i-- ) 
		{
			for (int j=5 ;j>=i ;j-- ) {
				
				if (i==5 || j==5 || i+j==6) {
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}					
				}	
				System.out.println();
		}
		
	}
}