import java.util.*;
class Car
{
	String myCar;
}

class CarDrive
{
	static car c;
	public static void main(String[] args) 
	{
		System.out.println("main methos Start");
		Scanner sc=new Scanner(System.in);	
		c.mycar=sc.nextLine();
		try{

		}
		catch(Exception ec)
		{
			ec.printStackTrace();
		}
		System.out.println("my car name:"+c);
	}
}