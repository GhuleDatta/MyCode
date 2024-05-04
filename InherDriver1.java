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
	String str1="Hi From Chiled class";
	void m2()
	{
		System.out.println(str1);
		System.out.println(super.str1);
		System.out.println("Hello from chiled class m2()");
	}
	static void m4()
	{
		System.out.println("Hello From M4() static chiled");
	}
}
class InherDriver1
{
	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.m2();
		obj.m4();
	}
}