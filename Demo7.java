class Demo7
{
	String str1="hi i am from demo7 class";
	public static void main(String[] args) {
		System.out.println("Hello From main");
		Demo8 obj=new Demo8();
		obj.m1();

	}
}

class Demo8
{
	static Demo7 obj=new Demo7();
	void m(){
	System.out.println("Hi From M1");
	System.out.println(obj.str1);
	m2();
	}

	void m2(){
		System.out.println("Hi from m2()");
		System.out.println(obj.str1);
		m3();
	}
}

static void m3()

{
	System.out.println("Hi from M3() static");
	System.out.println(obj.str1);
}