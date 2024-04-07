class PatternExample2
{
	public static void main(String[] args)
	{
		for (int i=1;i<=5 ;i++ ) 
		{ int num=1;
			System.out.print(" ");
			for (int j=5;j>=i ;j-- )
		   {  
		   		
				System.out.print("  ");
			}
				
			for (int k=1;k<=i;k++ ) {
				System.out.print(" "+num--);
				num+=num;
				
			}
			System.out.println();
			
		}
		
	}

}