import java.util.*;
class MethodTrimeProgram
{
	static String str;
	static String str1;

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();

		str1=userTrim();
		System.out.println(str +" : "+str.length());	
		System.out.println(str1 +" : "+str1.length());

	}
	public static String useTrime()
	{	
		String op="";
		int indx = 0;
		for (int i=0;i<str.length() ;i++ ) 
		{
			if (str.charAt(i)!=' ') 
			{
				indx =i;
				break;		
			}	

		}
		op = str.substring(indx);
			for (int i=str.length()-1;i>=0 ;i++ ) 
			{
				if (str.charAt(i)!=' ') 
				{
					indx=i;
					break;		
				}	
			}
			op=op.substring(0,indx-1);
			System.out.println(op+" : "+(op.length()));
			return op;

		// int count=0;
		// char[] ch=new char[count];
		// for (int i=0;i<str.length() ;i++ ) 
		// {
		// 	char ch1=str.charAt(i);
		// 	if (ch1==" ") 
		// 	{
		// 		continue;
		// 	}else{
		// 		ch[i]=ch1;
		// 		count++;
		// 	}	
		// }
		// return str.trim();
	}
}