class Dextop
{
	String size;
	String resolution;
	String brand;
	boolean wirleess;
	double prise;
	int worenty;

	Dextop(String size,String resolution,String brand,boolean wirleess,double prise,int worenty)
	{
		this.size=size;
		this.resolution=resolution;
		this.brand=brand;
		this.wirleess=wirleess;
		this.prise=prise;
		this.worenty=worenty;
	}
	void dextDetail()
	{
		System.out.println("***Details Of Dextop***");
		System.out.println("size : "+this.size);
		System.out.println("resolution : "+this.resolution);
		System.out.println("brand : "+this.brand);
		System.out.println("wirleess : "+this.wirleess);
		System.out.println("prise : "+this.prise);
		System.out.println("worenty : "+this.worenty);

	}
	void instanceOfCPU()
	{

	}

}
class CPU
{
	int ram;
	int rom;
	String procesor;
	String gCard;
	Mouse mouse;

	CPU(int ram,int rom,String procesor,String gCard,Mouse mouse)
	{
		this.ram=ram;
		this.rom=rom;
		this.procesor=procesor;
		this.gCard=gCard;

	}
}
class ComputerDriver
{
	public static void main(String[] args) 
	{
			
	}
}