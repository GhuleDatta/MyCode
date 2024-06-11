import java.util.*;
class ArryExaple3
{
	public static void main(String[] args) 
	{	
		byte[][][] a=new byte[2][2][];
			a[0][0]=new byte[1];
			a[0][1]=new byte[2];
			a[1][0]=new byte[1];
			a[1][1]=new byte[3];
			//Enitializetion of values
			a[0][0][0]=10;
			a[0][1][0]=20;
			a[0][1][1]=30;
			a[0][0][0]=40;
			a[1][0][0]=50;
			a[1][1][0]=60;
			a[1][1][1]=70;
			a[1][1][2]=80;
		System.out.println(Arrays.deepToString(a));
	}
}