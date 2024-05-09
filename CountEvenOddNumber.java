class CountEvenOddNumber
{
	public static void main(String[] args) 
	{
		int[] num={1,2,3,4,5,7};
		int evenCout=0;
		int oddCount=0;

		for (int i=0;i<num.length ;i++ ) 
		{
			if (num[i]%2==0) 
			{
				evenCout++;
					
			}else if(num[i]%2==1)
			{
				oddCount++;

			}
		}

		System.out.println("count of Even number : "+evenCout);
		System.out.println("Count of Odd Number : "+oddCount);
		
	}
}