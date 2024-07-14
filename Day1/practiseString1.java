import java.util.*;
class practiseString1
{
	public static void main(String[] args) 
	{
		String str="java";
		char[]ch=new char[str.length()];
		for (int i=0;i<str.length() ;i++ ) 
		{
				ch[i]=str.charAt(i);	
		}	
		System.out.println(Arrays.toString(ch));
	}
}
// 40. Write a java program to convert a string into char array. 
// Input: String str=”java” 
// Output: ['j', 'a', 'v', 'a']