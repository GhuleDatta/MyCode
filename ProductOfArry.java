class ProductOfArry
{
	//Program to find the Product of all arry
	public static void main(String[] args)
	{
		int[] num={1,2,3,4,5,6,7};
		int product=1;

		for(int i=0;i<num.length;i++)
		{
			product=product*num[i];
			System.out.print(product+" ");

		}
		System.out.println();
		System.out.println(product);
	}
}