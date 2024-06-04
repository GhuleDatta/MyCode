class ExcetionHandlingExample3
{
	public static void main(String[] args) 
	{
		try{

			System.out.println("Hello from Try");
			String str=null;
			System.out.println(str.isEmpty());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithemetic Exception Hnaddeld");
		}
		catch(RuntimeException re)
		{
			System.out.println("Rentime Exception  Handdeld");
		}
		catch(Exception npe)
		{
			System.out.println("NullPointerException Hnaddeld");
		}
	//error occer becouse we miss the sequence and 
	//to avide the error we follow the sequance
		// catch(NullPointerException npe)
		// {
		// 	System.out.println("NullPointerException Hnaddeld");
		// }
	}
}