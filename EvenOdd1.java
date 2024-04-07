class EvenOdd1
{
	static int num=1;
	public static void main(String[] args) 
	{
		evenNumber();	
	}
	public static void evenNumber() 
	{
		if (num<200) {
			if(num%2==0){
			System.out.println("even number"+num);
		}
		}else
		return;
			num++;
			evenNumber();
		
	}
	
}