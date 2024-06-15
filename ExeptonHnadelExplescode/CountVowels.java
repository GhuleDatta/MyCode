// Find count of vovele
import java.util.*;
class CountVowels
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base of array :");
		int base=sc.nextInt();

		System.out.println("Enter the Vovel's :");
		char [] vovel=new char[base];
		for (int i=0;i<base ;i++ ) 
		{
			vovel[i]=sc.next().charAt(0);	
		}

		int count=0;
		int consonentCount=0;
		for (int i=0;i<vovel.length ;i++ ) 
		{
			if (vovel[i]=='a' || vovel[i]=='i' || vovel[i]=='o' || vovel[i]=='u' ||vovel[i]=='e') {
					count++;
				}
				else{
					consonentCount ++;
				}	
		}
		System.out.println("vowels : "+count);
		System.out.println("consonent : "+consonentCount);

	}
	
}