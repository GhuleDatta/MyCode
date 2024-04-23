class SmartWatch
{	
	String brand;
	String type;
	String sMNum;
	int price;
	int size;
	int batteryTime;

	public void SmartWatcDisplay() 
	{
		System.out.println("*** WATCH DETAILS ***");
		System.out.println(" Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("Smart Manufaturing Number : "+sMNum);
		System.out.println("Price : "+price+"Rs");
		System.out.println("size : "+size+"cm");
		System.out.println("battery Time : "+batteryTime+"hr");	
	}
}

class DisplaySW
{
	public static void main(String[] args) 
	{
		SmartWatch obj=new SmartWatch();
		obj.brand="Appale";
		obj.type="Watter pruff";
		obj.sMNum="A78a458";
		obj.price=78000;
		obj.size=10;
		obj.batteryTime=5;
		obj.SmartWatcDisplay() ;
	}
}


