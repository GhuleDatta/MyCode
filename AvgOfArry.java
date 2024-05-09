class AvgOfArry
{
	public static void main(String[] args) 
	{
		int[] num={10,20};
		int sum=0;
		double avg=0;
		for (int i=0;i<num.length ;i++ ) 
		{
			//sum of arry
			sum=sum+num[i];

		}	
		// avrege of number
		avg=sum/num.length;
		System.out.println("Avrage OF Arry : "+avg);//display avg

	}	
}