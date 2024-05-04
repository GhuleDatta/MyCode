class Parent
{
	String str1="Hi from Parent Class";
	void m1()
	{
		System.out.println("Hello from Parent M1()");
	}
	static void m3()
	{
		System.out.println("Hello from m3() static parent");
	}
}

class Child
{
	String str2="Hi From Chiled class";
	void m2()
	{
		System.out.println("Hello from chiled class m2()");
	}
	static void m4()
	{
		System.out.println("Hello From M4() static chiled");
	}
}
class InherDriver1
{
	public static void main(String[] args) {
		child obj=new child();
		child.m2();
		child.m4();
	}
}