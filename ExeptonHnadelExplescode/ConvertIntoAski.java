//WAJP to get the aski values of all the charecter dinamicaly4
import java.util.*;
class ConvertIntoAski
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the name : ");
		String name=sc.next();

		for (int i=0;i<name.length() ;i++ ) 
		{
			char singleCharacter=name.charAt(i);
			System.out.print((int)singleCharacter+" ");	
		}
	}
}