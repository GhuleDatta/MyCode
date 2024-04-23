import java.util.*;
class PlindromeName
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name=sc.next().reverse(name);
		String revName="";
		System.out.println(name);
		// String name="ram";
		// String revName = reverse(name);
		// String revName = name.reverse();
		// int count=0;
		for (int i=name.length(); i>=0; i-- ) 
		{	
				// char ch=name.charAt(i);
				revName = revName+ name.charAt(i);
				// System.out.print(ch);
		}
		System.out.println("Name : "+name);	
		System.out.println("Rev-Name : "+revName);	

	}
}