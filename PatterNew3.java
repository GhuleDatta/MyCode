public class PatterNew3
{
	public static void main(String[] args) 
	
	{


	 for (int i=1;i<=5 ;i++ ) 
	 	{
	 	 int num=i;

	 	 for (int j=1;j<=i ;j++ ) 
	 	    {
	 	    	
	 	    	if (i<=3) 
	 	    	{
	 	    	  System.out.print(num+++" ");
	 	    	  num+=1;
	 	    	}
	 	    	else if(i<=4){
	 	    		System.out.print((num+num-2)+" ");
	 	    		num++;
	 	    	}else if(i<=5){
	 	    		System.out.print((num+num-1)+" ");
	 	    		num++;

	 	    	}
	 	 		

	 	 	}	
	 	 	System.out.println();
	 	}	
	}
}

class demo
{
	public static void m1() {
		
	
	for (int i=1;i<=5 ;i++ ) {
		for (int j=1;j<=i ;j++ ) {
			System.out.print("*");
			
		}
		System.out.println();
	}
		
 }
}