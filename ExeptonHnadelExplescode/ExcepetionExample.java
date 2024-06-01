class ExcepetionExample
{
	public static void main(String[] args) {
		System.out.println("Hello");
		try{

			System.out.println(10/0);
		}
		catch(Exception E)
		{
			System.out.println("Excepton handel");
		}
		System.out.println("Hello from end");
	}
}