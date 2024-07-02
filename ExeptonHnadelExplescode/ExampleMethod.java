//write java program to convert frist letar in capital and rest in lowercase
import java.util.*;
class ExampleMethod
{
	public static void main(String[] args) 
	{

		String name="dattatray";
		// int length=name.length;
		// char singleCharacter=name.charAt(1);

		String conv=name.substring(0,1).toUpperCase();
		String sub=name.substring(2,name.length());

		String concat=conv.concat(sub);	
		System.out.println(concat);
	}
}
