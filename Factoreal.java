class Factoreal
{	
	static int fact=5;
	static int num=fact-1;

	public static void main(String[] args) 
	{    
		System.out.println(fact);
		numFactoreal();
	}

	public static void numFactoreal()
	{
	  fact=fact*num;
	   num--;
	   System.out.println(fact);
	  if (num==0) 
	  	return;	
	  numFactoreal();

	  		
	}
}