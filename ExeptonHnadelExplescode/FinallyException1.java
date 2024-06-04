class FinallyException1
{
	public static void main(String[] args) 
	{
		System.out.println("EXE Start");
		m1();
		System.out.println("EXE Ends..");	
	}
	static void m1()
	{
		System.out.println("m1() start");
		try{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{

			System.out.println("ArithmeticException handeld");
			return;//end exiqution
		}
		finally{
			System.out.println("Hello finally");
		}
		System.out.println("m1() ends");
	}
}