class NumberProgram
{
	public static void main(String[] args) 
	{
		
		int num=423;
		int dub=num;
		while(num>0)
		{
			int rem=num%10;
			while(rem>0){
				rem=rem*rem*rem;
				System.out.print(rem);
			}


			num/=10;
		}
	}
}