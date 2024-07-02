import java.util.Scanner;
class ToUppercaseEmpliment
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		str=sc.next();
		String op=userToUppercase();
	}

	public static void userToUppercase()
	{
		String str1="";
		for (int i=0;i<str.length() ;i++ ) 
		{
			char ch=str.charAt(i);
			if (ch>='a' && ch<='z') 
			{
				str1=str+(char)(ch-32);		
			}
			else{
				str1=str1+ch;
			}
		}
	}
}