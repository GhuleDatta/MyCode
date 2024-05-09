class SmallestNumber
{
	public static void main(String[]args)
	{
		int[] num={2,1,3,10};
		int n=num[0];
		for (int i=0;i<num.length ;i++ ) 
		{
			if (n>num[i]) 
			{
				n=num[i];	//find the smallest number in arry
			}			
		}
		System.out.println(n);//display the output
	}

}