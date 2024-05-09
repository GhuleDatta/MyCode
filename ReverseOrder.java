class ReverseOrder
{
	public static void main(String[] args)
	{
		int [] a={52,20,60,87,8,4,5,4,645,78};

		for (int i=0;i<=9;i++) 
		{
			System.out.print("  "+a[i]);
			
		}
		System.out.println();
		for (int i=9;i>=0;i--) 
		{
			System.out.print("  "+a[i]);
			
		}
		
		
	}
}