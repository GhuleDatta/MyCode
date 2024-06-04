class ExceptonExample4
{
	public static void main(String[] args) 
	{
		System.out.println("main Start");
		try{
			System.out.println("HiFrom Try");
			Thread.sleep(1000);
		}	
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException ie");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled"); 
		}
		catch(RuntimeException re)
		{
			System.out.println("RuntimeException Handled");// create the compile time excetion
		}
	}													// becose of miss sequence aregmentchild come frist 
}