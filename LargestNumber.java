class LargestNumber
{
	public static void main(String[] args) 
	{
		int[] num={5,2,7,9,78,1};
		int n=num[0];

		for (int i=0;i<num.length ;i++ ) 
		{
			if (n<num[i]) //if the num[i] is greter than 'n' then if block get exiquted and store value cheges every time
			{
				n=num[i];	//value store in store
			}

			
		}
		System.out.println("Large number in arry: "+n);//display output
		
	}
	
}