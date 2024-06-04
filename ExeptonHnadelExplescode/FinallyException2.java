class FinallyException2
{
	public static void main(String[] args) 
	{
		System.out.println("EXE starts");
		m1();
		System.out.println("EXE Ends");		
	}	
	static void m1()
	{
		System.out.println("m1() ");
		try{
			System.out.println("try ");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException handel");
		}
		finally
		{
			System.out.println("Hello from Finally Block");
		}
		System.out.println("m1()");
	}
}