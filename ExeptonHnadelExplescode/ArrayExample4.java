class ArrayExample4
{
	public static void main(String[] args) 
	{
		int [][]arr={{1,2,3},{4,5,3}};
		for (int i=0;i<arr.length ;i++ ) {
				for (int j=0;j<3 ;j++ ) 
				{
					System.out.println(arr[i][j]+" ");	
				}
			}

		System.out.println("*******************************");
			int i=0;
		
		while(i<arr.length)
		{
			int j=0;
			while(j<arr[i].length)
			{
				System.out.println(arr[i][j]+" ");
				j++;
			}
			i++;
		}	
		System.out.println("**************************");
		int p=0;
		do{

			int j=0;
			do{
				System.out.println(arr[p][j]+" ");
				j++;
			}while(j<arr[p].length);
			p++;
		}while(p<arr.length);

	}
}
/*
5.Write a java program to Print elementsfrom 2D array using dowhile loop.
Ip : a={{1,2,3},{4,5,6}};
Op: 1 2 3
4 5 6
*/

/*. Write a java program to Print elements from2D array using forloop.
Ip : a={{1,2,3},{4,5,6}};
Op: 1 2 3
4 5 6*/
/*
.Write a java program to Print elements from 2D array using whileloop.
Ip : a={{1,2,3},{4,5,6}};
Op: 1 2 3
4 5 6*/