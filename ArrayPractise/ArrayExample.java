/*
14.Find sum of all elements present in an array. 
Ip : a={2, 2, 4, 4, 6, 6} 
Op : 24
*/
class ArrayExample
{
	public static void main(String[] args) 
	{
		int [] a={2, 2, 4, 4, 6, 6} ;
		int sume=0;
		for (int i=0;i<a.length ;i++ ) 
		{
			sume=sume+a[i];	
		}
		System.out.println(sume);
	}
}