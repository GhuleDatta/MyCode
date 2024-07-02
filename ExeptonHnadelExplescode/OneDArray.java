class OneDArray
{
public static void main(String[] args) 
	{
		int [] a = {10,20,30,50,80};

		for (int i=0;i<a.length ;i++ ) 
		{
			System.out.print(a[i]+",");	
		}
		System.out.println();
			int i=0;
		while(i<a.length)
		{
			System.out.print(a[i]+",");
			i++;
		}

		// System.out.println();

		//  int j = 0;
        // do {
        //     System.out.print(a[j] + ",");
        //     j++;
        // } while (j < a.length);

		int j=0;
		do{
			System.out.print(a[i]+",");
			j++;
		}while(j<a.length);
	}
}