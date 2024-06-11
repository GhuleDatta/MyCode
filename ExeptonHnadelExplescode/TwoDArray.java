class TwoDArray
{
	public static void main(String[] args) 
	{
		int [][] a={{2,3,4,5,8},{7,5,12,78,6}};

		for (int i=0;i<a.length ;i++ ) 
		{
			for (int j=0;j<a[i].length ;j++ ) 
			{
				System.out.print(a[i][j]+",");		
			}	
			System.out.println();
		}

		System.out.println("**********************");

		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[i].length)
			{
				System.out.print(a[i][j]+",");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("***********************");

		i=0;
		do{
			int j=0;
			do{
			System.out.print(a[i][j]+",");
			j++;
			}while(j<a[i].length);
			System.out.println();
			i++;
		}while(i<a.length);
	}
}