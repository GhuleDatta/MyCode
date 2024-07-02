//write a java program to feach all the facter from an array
class FindFactors
{
	public static void main(String[] args) 
	{
		int [] a={4,10};
		for (int i=0;i<a.length ;i++ ) 
		{	
			System.out.print("factors of "+a[i]+" is ");
			for (int j=1;j<=a[i] ;j++ ) 
			{
				if (a[i]%j==0) 
				{		
				System.out.print(j+" ");	
				}		
			
			}
			System.out.println();	
			
		}	
	}
}