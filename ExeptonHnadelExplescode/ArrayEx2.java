class ArrayEx2
{
	int arr[];
	static Scanner sc=new Scanner(System.in);
	public void storeElement(int arr[])
	{
		this.arr=arr;
		for (int i=0;i<arr.length ;i++ ) 
		{
			arr[i]=sc.nextInt();
		}
	}
	public void displayElements()
	{
		for (int i=arr ) 
		{
			System.out.println(i);	
		}
	}

	public static void main(String[] args) 
	{
			System.out.println("Enter the size : ");
			int size = sc.nextInt();
			System.out.println("Enter the arry element :");
			int arr[]=new int [size];

			ArrayPrgm1 p1=new ArrayPrgm1();
			p1.storeElement();
			p1.displayElements();
	}
}