class ExceptonExample5
{
	public static void main(String[] args) {
		System.out.println("Exiqutin start");
		try
		{
			System.out.println("Hi from try");
			try{
				System.out.println("Inner try");
				System.out.println(10/0);
			}catch(NullPointerException npe)
			{
				System.out.println("Inner npe hadeled");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Hi from Catch Block");
		}
	}
}