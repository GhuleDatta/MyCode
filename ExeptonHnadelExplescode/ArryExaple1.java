import java.util.*;
class ArryExaple1
{
	public static void main(String[] args) 
	{
		short[][] a=new short[3][];
		a[0]=new short[2];
		a[1]=new short[1];
		a[2]=new short[2];

//inter the values for arry
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[2][0]=40;
		a[2][1]=50;
		
		System.out.println(Arrays.deepToString(a));	
	}
}