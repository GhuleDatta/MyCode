class Automorphic{
	public static void main(String[] args) {
		int num=76;
		int dub=num;
		int sqr=num*num;
		int div=1;


		while(num>0)
		{
			div*=10;
			num/=10;
		}
		int id=sqr%div;
		System.out.println((dub==id)?dup+"Automorphic number":dup+"not Automorphic number");
	}
}