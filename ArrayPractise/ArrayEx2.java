class ArrayEx2
{
	public static void main(String[] args) 
	{
		
		int [] arr={1,2,3,6,8,9};
		int num=0;
		while(num>=0)
		{
			System.out.println(arr[num]);
			if(num>arr.length)
				break;
			num++;
		}
	}
}