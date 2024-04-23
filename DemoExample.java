class DemoExample
{
	public static void main(String[] args) 
	{
		m1();	
	}
	public static void m1() 
	{
		DemoE1 obj=new DemoE1();

		System.out.println("HI From M1()");
		obj.m2();
	}
}

class DemoE1
{
	public void m2() 
	{
		System.out.println("Hi form m2");
		m3();	
	}
	public void m3() {
		System.out.println("Hi from m3()");
	}
}
