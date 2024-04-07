class AutomorphicNumber
{
	public static void main(String[] args)
	{
		int num=145;
		int dup=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			int fact=1;
		for (int i=rem;i>=1 ;i-- )
		{
			fact*=i;
		}
		sum=fact+sum;
		num/=10;
	}
	if (sum==dup) {
		System.out.println(num+"automor phic number : "+sum);
		
	}else{
	 System.out.println(num+"not automorphic number : "+sum);
	}

		
	}
}


		// int num=5;
		// int sum=0;
		// int fact=1;
		// for (int i=num;i>=1 ;i-- ) 
		// {
		// 	fact=fact*i;


		// 	System.out.println("  :  "+fact);
			
		// }