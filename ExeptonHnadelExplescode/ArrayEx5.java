class ArrayEx5
{
	public static void main(String[] args) 
	{
		int []arr={1,2,3,4,5,6};
		int count=0;
		// int i=0;
		// while(i>0)
		// {
		// 	if(arr[i]==null)
		// 		break;
		// 	else
		// 		i++;
		// 		count++;
		// }
		for(int i:arr)
		{
			count++;
		}	
		System.out.println(count);
	}
}
/*13.Find number of elements without using length variable.
Ip : a={1, 2, 3, 4, 5, 6}
Op : 6 */