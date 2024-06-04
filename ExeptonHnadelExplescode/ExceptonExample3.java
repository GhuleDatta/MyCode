class ExceptonExample3
{
public static void main(String[] args) 
	{
		System.out.println("Hello Start");
		try{
			Thread.sleep(2000);
		}
		catch(RuntimeException re)
		{
			System.out.println("RuntimeException Handeld");
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException Handeld");
		}
		System.out.println("Hello End");
	}
}