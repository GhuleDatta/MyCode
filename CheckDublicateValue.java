class CheckDublicateValue
{
	static boolean flag=true;			//use the boolean datatype to get the right anser
	public static void main(String[] args) //check the arry is dublicate or not
	{
		int[] num={1,2,7};

		for (int i=0;i<num.length ;i++ ) 
		{
			int count=0;

			for (int j=0;j<num.length ;j++ ) 
			{
				System.out.println(count);
				if (num[j]==num[i]) 
				{
					count++;
					if (count>1) 
					{
					flag=false;			
					}			
				}		
			}	
		}

		System.out.println(flag?"Not a Dublicate Arry":"Dublicate Arry");
	}
}