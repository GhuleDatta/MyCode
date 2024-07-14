import java.util.*;
class PractisString3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int[] array=new int[length];
		for (int i=0;i<array.length ;i++ ) 
		{
			array[i]=sc.nextInt();	
		}
		System.out.println(Arrays.toString(array));
	}
	
}
// 42. Write a java program to store user elements in an array and tak 
// length from user. 