class ReverseTheString
{
	public static void main(String[] args) 
	{
		String str="Hello";
		String ch="";

		for (int i=str.length()-1;i>=0 ;i-- ) 
		{
			ch=ch+str.charAt(i);
					
		}	
		System.out.println(ch);
	}
}

