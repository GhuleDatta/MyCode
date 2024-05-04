class CarDriver
{
	public static void main(String[] args) 
	{
		car obj=new car("harier","pg","SUV",1200000,4,(new Engine(12.5,2.5,"CNG",24,6)));
		obj.displaycar();
		obj.engine.enginDrive() ;
	}
}