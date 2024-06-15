 class ArryFindWorld
 {
 	public static void main(String[] args) 
 	{
		int [][] a={{2,3,4}};
 		int sum=0;
 		long pro=1;

 		for (int i=0;i<a.length ;i++ ) 
 		{
 			for (int j=0;j<a[i].length ;j++ ) 
 			{
 				sum=a[i][j]+sum;
 				pro=pro*a[i][j];
 				System.out.print(a[i][j]+" ");			
 			}		
 		}	
 		System.out.println(sum);
 		System.out.println(pro);
 	}
 }