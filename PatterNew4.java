class PatterNew4
{
	public static void main(String[] args) 
	{
		int num=9;
		char ch='f';
	 for (int i=5;i>=1 ;i-- ) 
	 	{
	 		
	 		for (int k=5;k>=i ;k-- ) {
	 			System.out.print("  ");
	 		}
	 		for (int j=1;j<=i;j++) {

	 			
	 				if (i%2==1) 
	 					{
	 						 System.out.print(num--+" ");	
	 					}
	 					else if (i%2==0) {
	 						System.out.print(ch--+" ");
	 					}	
	 				 			
	 		}
	 		System.out.println();
	 	}	
	}
}