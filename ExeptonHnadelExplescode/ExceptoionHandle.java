class ExceptoionHandle
{
	public static void main(String[] args) 
	{
		System.out.println("hi form main");
		try{
			System.out.println("Hi from try");
			System.out.println(10/0);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("error Handeld ae");
				try
				{
					System.out.println(10/0);
				}
				catch(NullPointerException npe)
				{
					System.out.println("npe Handdele");
				}
			}
			catch(RuntimeException re)
			{
				System.out.println("Error Handeld");
			}
	}
}