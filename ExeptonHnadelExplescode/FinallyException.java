class FinallyException
{
	public static void main(String[] args) 
	{
		System.out.println("EXT start");	
		m1();
		System.out.println("EXE Ends");
	}
	static void m1()
	{
		System.out.println("m1() starts");
		try{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException handeld");
			return; //exit the block
		}
		finally{
			System.out.println("Hello finally");
		}
		System.out.println("m1() ends");
	}
}