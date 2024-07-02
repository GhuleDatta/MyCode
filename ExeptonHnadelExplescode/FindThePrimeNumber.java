class FindThePrimeNumber
{
	public static void main(String[] args) 
	{
		int [] a={4,5,6,8,9,5,4,8,5,4,7};
		boolean flag;
		int num;
		for (int i=0;i<a.length ;i++ ) 
		{	
			flag=true;
			num=a[i];
			for (int j=2;j<a[i] ;j++ ) 
			{
				if (num%j==0) 
				{
					flag=false;
						
				}		
			}	
			System.out.println(a[i]);
			System.out.println(flag?"is Prime":"Not Prime");
		}

	}
}