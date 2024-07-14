import java.util.*;
class PractiseString2
{
	public static void main(String[] args) 
	{
		int []arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
		int startI=2;
		int endI=5;
		int indx=0;
		int[] subArray=new int[endI-startI];
		for (int i=startI;i<endI ;i++ ) 
		{
			subArray[indx++]=arr[i];	
		}
		System.out.println(Arrays.toString(subArray));
	}
}
// 41. Write a java program to create a subarray from an array. 
// Input: arr: [1, 2, 3, 4, 5, 6, 7, 8, 9]Start Index: 2,End Index: 5 
// Output: [3, 4, 5]