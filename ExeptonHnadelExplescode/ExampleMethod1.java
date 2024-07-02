class ExampleMethod1
{
	public static void main(String[] args) 
	{
		String name="parmanu";
		char ch1='a';
		int count=0;

		for (int i=0;i<name.length() ;i++ ) 
		{
			char ch=name.charAt(i);

			System.out.print(ch);
			if (ch1==ch) 
			{
				count++;
			}
		}
		System.out.println();
		System.out.println(ch1+" is "+count);
	}
}