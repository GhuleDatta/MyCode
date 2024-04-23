class Car
{
	String brand;
	String model;
	String engine;
	String type;
	byte mileage;
	byte seatingCapacity;
	double price;
	int noAirbags;

	public void DisplayCar() 
	{
		System.out.println("*** CAR DITAILS ***");
		System.out.println("Brand : "+brand);
		System.out.println("engine : "+engine);
		System.out.println("Type : "+type);
		System.out.println("Car mileage : "+mileage+"Km/l");
		System.out.println("Seting Capyasity : "+seatingCapacity);
		System.out.println("Car Price : "+price+"rs");	
		System.out.println("Number of Airbages : "+noAirbags);
	}
	
}

class CarDisplay
{
	public static void main(String[] args) 
	{
		Car obj=new Car();
		obj.brand="BMW";
		obj.model="s1";
		obj.engine="1.5cc";
		obj.type="SUV";
		obj.mileage=25;
		obj.seatingCapacity=6;
		obj.price=500000;
		obj.noAirbags=6;
		obj.DisplayCar();
	}
}