class SrtringExample
{
	public static void main(String[] args) 
	{
		String str="abcdefg";
		String newStr="";


		for (int i=0;i<str.length() ;i++ ) 
		{
			char ch=str.charAt(i);
			if(i%2!=0)
			{
				System.out.print(newStr=str.substring(i,i+1).toUpperCase());
			}	
			else{
				System.out.print(newStr=str.substring(i,i+1).toLowerCase());
			}	
		}	
	}
}