class PatternExample1
{
	public static void main(String[] args) 
	{

	for (int i=1;i<=5 ;i++ )
		{
			System.out.print(" ");
		int num=0+i;
		for (int j=1;j<=i;j++ )
		 {
		 	num=num+1;
			System.out.print(" "+num++);
			num++;
			
		}
		num+=i;
		System.out.println();

		}		
	}
}