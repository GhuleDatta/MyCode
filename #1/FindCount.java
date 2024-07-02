class FindCount
{
	public static void main(String[] args) 
	{
		int [] a={1,5,-8,9,-2,-1};
		int poCont=0;
		int negCont=0;
		for (int i=0;i<a.length ;i++) 
		{
			if(a[i]<0)
				negCont++;
			else	
				poCont++;	
		}	
		System.out.println("poCont : "+poCont);
		System.out.println("negetive : "+negCont);
	}
}