//WAJP to merge 2 arrys into 1 single arry

import java.util.*;
class MargeTwoArry
{
	public static void main(String[] args) 
	{
		 short [] arr1={1,2,3};
		 short[] arr2={4,5,6,7}	;

		 int size=(arr1.length)+(arr2.length);
		 int []merge=new int[size];

		 for (int i=0;i<arr1.length ;i++ ) 
		 {
		 	merge[i]=arr1[i];	
		 }
		 for (int i=0;i<arr2.length ;i++ ) 
		 {
		 	merge[arr1.length+i]=arr2[i];	
		 }

		 System.out.println(Arrays.toString(merge));
	}
}