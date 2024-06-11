class ArrayExample
{
	public static void main(String[] args)
	{
		int[]a={10,20,30,40};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		int i=0;
		while(i<a.length)
		{
			System.out.println(a[i]);
			i++;
		}	

		do{
			System.out.println(a[i]);
			i++;
			}while(i<a.length);
	}
}