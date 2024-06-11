import java.util.*;
class ArryExaple2
{
	public static void main(String[] args) 
	{
		int[][][] a=new int[2][2][2];
		//inter the values for arry

		a[0][0][0]=10;
		a[0][0][1]=20;
		a[0][1][0]=30;
		a[0][1][1]=40;
		a[1][0][0]=50;
		a[1][0][1]=60;
		a[1][1][0]=70;
		a[1][1][1]=80;

		System.out.println(Arrays.deepToString(a));	
	}
}