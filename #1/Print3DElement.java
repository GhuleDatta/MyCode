// 9.Write a java program to Print elements from3D array using for- 
// loop. 
// Ip : a={{{1,2},{2,3}},{{4,5},{5,6}}};
class Print3DElement
{
	public static void main(String[] args) 
	{
		int [][][]a={{{1,2},{2,3}},{{4,5},{6,7}}};

		for (int i:a ) 
		{
			for (int []j:i) 
			{
				for (int [][]k:j ) 
				{
					System.out.println(k[][]);				
				}			
			}		
		}	
	}
}
