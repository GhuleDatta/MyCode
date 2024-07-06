class Practise4
{
	public static void main(String[] args) 
	{
		int[]a={6,5,4,3,7,8,0} ;
		int sum=0;
		for (int i=0;i<a.length ;i++ ) 
		{
			if(i%2==1){
				sum+=a[i];
			}	
		}
		System.out.println(sum);
	}
}
// 27.Find sum of all elements at odd indices in an array. 
// Ip : a={6,5,4,3,7,8,0} 
// Op : 17