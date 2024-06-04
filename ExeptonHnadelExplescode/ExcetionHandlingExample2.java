class ExcetionHandlingExample2
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Hi form Try");
			System.out.println(10/0);
			//we can not write multiple statement in try block  
			//if we write after the error statment all statement was skiped
			try{
				System.out.println("Inner Try");
				System.out.println(10/0);
			}
			catch(NullPointerException npe)
			{
				System.out.println("Inner npe Handeld");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Hi from catch");
		}
	}
}