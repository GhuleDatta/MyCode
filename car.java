class car
{
	String brand;
	String model;
	String type;
	double price;
	int setingCapyacity;
	Engine engine=new Engine(12.5,2.5,"CNG",24,6);

	car(String brand,String model,String type,double price,int setingCapyacity,Engine engine)
	{
		this.brand=brand;
		this.model=model;
		this.type=type;
		this.price=price;
		this.setingCapyacity=setingCapyacity;
	}
	public void displaycar()
	{

		System.out.println("brand :"+brand);
		System.out.println("model : "+model);
		System.out.println("type : "+type);
		System.out.println("price : "+price);
		System.out.println("setingCapyacity :"+setingCapyacity);
		System.out.println("engine :"+engine);
	}

}