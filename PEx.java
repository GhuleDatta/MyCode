import  java.util.*;
class MetalAndStone
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the name:");
		String name=sc.nextLine();
		System.out.println("Enter the char : ");
		String chare=sc.nextLine();

		int c=0;
		for (int i=0;i<chare.length() ;i++ ) 
		{
			for (int j=0;j<name.length() ;j++ ) 
			{
				if (name.charAt(j)==chare.charAt(i)) 
				{
					c++;	

				}		
			}			
		}
		System.out.println(c);		
	}	
}