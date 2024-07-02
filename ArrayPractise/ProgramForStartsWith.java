import java.util.Scanner;
class ProgramForStartsWith
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the String : ");
		str=sc.nextLine();

		System.out.println("Enter the String to CHech :");
		String str1=sc.next();
		System.out.println("Enter a index :");
		int serchIndex=sc.nextInt();
		boolean op=userStartWith(str1,serchIndex);
		System.out.println(str+" : "+op);

	}
	public static boolean userStartWith(String str1)
	{
		boolean flag=true;
		for (int i=0;i<str1.length() ;i++ ) 
		{
			char ch=str1.charAt(i);
			if (ch!=str.charAt(i)) 
			{
				flag=false;
				break;		
			}	
		}
		return flag;
	}
	public static boolean userStartWith(String str1,int startIndex) 
	{
		if(startIndex<0 || startIndex>=str.length())
		{
			throw new StringIndexOutOfBoundsException("wrong Index"+startIndex);
		}	
		boolean flag=true;
		for (int i=startIndex;i<str1.length() ;i++ ) 
		{
			char ch=str1.charAt(i);
			if (ch!=str.charAt(i)) 
			{
				flag=false;
				break;		
			}	
		}
		return flag;
	}
}