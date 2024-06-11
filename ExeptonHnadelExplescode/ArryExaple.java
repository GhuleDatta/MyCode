import java.util.*;
class ArryExaple
{
	public static void main(String[] args) 
	{
		short[][] a=new short[2][];
		a[0]=new short[3];
		a[1]=new short[3];
		//inter the values for arry
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;


		System.out.println(Arrays.deepToString(a));	
	}
}
