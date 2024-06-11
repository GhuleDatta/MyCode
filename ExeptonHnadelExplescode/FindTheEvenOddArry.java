import java.util.*;
class FindTheEvenOddArry
{
	public static void main(String[] args) 
	{
		int []arr={6,78,3,4,5,6,7,8,9,10};
		//find the Count of Odd Number

		int count=0;
		for(int i:arr)
		{
			if (i%2==1)
				count++;
		}

		int [] oddNumber =new int[count];
		//index var to store element in even nuber array
		int idex=0;
		for(int i:arr)
		{
			//check if element is odd and store it by incriment the indexing
			if (i%2==1) 
			{
				oddNumber[idex++]=i;	
			}
		}
		System.out.println(Arrays.toString(oddNumber));
	}
}