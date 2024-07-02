class FindPrimeInArray
{
	public static void main(String[] args) 
	{
		int []a={2,8,9,7,5,6};
		boolean flag;
		for (int i=0;i<a.length ;i++ ) 
		{
			flag=true;
			for (int j=2;j<a[i] ;j++ ) 
			{		
				
				if(a[i]%j==0)
				{
					flag=false;
					break;
				}	
				else{
					
				}		
			}
			System.out.println(a[i]+": "+(flag?"Prime":"Not Prime"));	
		}	
	}
}
// 19.Find all prime elements present in an array. 
// Ip : a={2, 8, 5, 4, 7, 9} 
// Op : 2 5 7 