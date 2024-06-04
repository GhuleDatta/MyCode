class FinallyException5
{
	public static void main(String[] args) {
		System.out.println("EXE start");

		int i=1;
		while(i<=10);// it create the runtime error cusser stuck on single point
		{
			System.out.println(i);
			i++;
		}
		try{
			System.out.println("try bye");
			System.out.println(10/0);//catch block not hair error will display
									// finally block exicuted any how condition
		}
		finally{
			System.out.println("Hello from finally");
		}
	}
}