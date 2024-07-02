class AssismentEx2
{
	public static void main(String[] args) 
	{
		int [] arr={100,1};
		int[]su1=new int[1];
		int max=arr[0];
		int se=0;
		int sum=0;
		for (int i=0;i<arr.length ;i++ ) 
		{
			if(arr[i]>=max)
			{
				max=arr[i];
			}
			else if(){
				se=se+arr[i];
			}
			sum=sum+arr[i];		
		}	

		System.out.println(sum+se);
	}
}