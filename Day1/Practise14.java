class Practise14
{
	public static void main(String[] args) 
	{
		String[]str={"madam", "racecar", "apple", "civic", "level", "hello"} ;
		
		for (int j=0;j<str.length ;j++ ) 
		{
			String rstr="";
			char ch='0';
				for (int i=str[j].length()-1;i>=0 ;i-- ) 
			{
					ch=str[j].charAt(i);
					rstr=rstr+ch;	
			}	
		System.out.print((rstr.equals(str[j])?rstr+",":""));		
		}	
	}	
}
// 39. Write a java program to find Palindrome strings from an array. 
// Array: ["madam", "racecar", "apple", "civic", "level", "hello"] 
// Output: madam,racecar, civic, level 