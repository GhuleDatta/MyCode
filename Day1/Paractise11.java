class Paractise11
{
	public static void main(String[] args) 
	{
		int [] a={6,5,4,6,5,8,6};
		int count=0;
		int max=0;

		for (int i=0;i<a.length ;i++ ) 
		{
			count=1;
			for (int j=i+1;j<a.length ;j++ ) 
			{
				if (a[i]==a[j]) 
				{
					count++;			
				}
				// System.out.println(a[i]+" count is : "+count);		
			}	
			System.out.println(a[i]+" count is : "+count);
		}
	}
}
// 36.Find duplicate elements in an array. 
// Ip : a={6,5,4,6,5,8,6} 
// Op : 6 , 5