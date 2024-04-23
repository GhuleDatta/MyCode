class PrimeEX8
{
	static int num=45;
	static boolean flag=true;
	public static void main(String[] args) 
	{
		m1();
		System.out.print(flag?"is Prime":"not Prime");
	}
	public static void m1() 
	{
		int i=2;
		i++;
		if (num%i==0) 
		{
			flag=false;
			return;
		}
		if (num>=i) 
			return ;
		m1();
	}
}