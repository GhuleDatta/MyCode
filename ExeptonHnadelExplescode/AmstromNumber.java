class AmstromNumber
{
	public static void main(String[] args) 
	{
		int num=153;
		int dub=num;
		int rem=0;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num/=10;
		}	
		System.out.println(sum);
		if (dub==sum) 
		{
			try{
				throw new AmstromException("AmstromException handeled");
			}
			catch(AmstromException ae)
			{
				System.out.println(ae.getMessage());
			}
		}
		else
		{
			System.out.println("not a Amstrom Number");
		}
	}
}