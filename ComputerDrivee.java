class Computer
{
	String brand;
	String type;
	String model;
	String colour;
	int warranty;
	Cpu cpu;

	Computer(String brand, String type, String model, String colour, int warranty)
	{
		this.brand =brand;
		this.type =type;
		this.model =model;
		this.colour =colour;
		this.warranty =warranty;
	}
	public void displayComputer()
	{
		System.out.println();
		System.out.println("**** Display Computer *****");
		System.out.println("brand : " + this.brand);
		System.out.println("type : " + this.type);
		System.out.println("model : " + this.model);
		System.out.println("warranty : " + this.warranty );
	}
	public void createInstanceOfCpu(int ram, int rom, String processor, String gCard)
	{
		cpu = new Cpu(ram, rom, processor, gCard);

	}

}
class Cpu
{
	int ram;
	int rom;
	String processor;
	String gCard;
	KeyBoard keyboard;
	Mouse mouse;
	Printer printer;
	Speaker speaker;
	Camera camera;
	Monitor monitor;

	 Cpu(int ram, int rom, String processor, String gCard)
	 {
	 	this.ram= ram;
	 	this.rom =rom;
	 	this.processor = processor;
	 	this.gCard = gCard;
	 }
	 public void displayCpu()
	 {
	 	System.out.println();
	 	System.out.println("**** Display CPU *****");
		System.out.println("ram : " + this.ram);
		System.out.println("rom : " + this.rom);
		System.out.println("processor : " + this.processor);
		System.out.println("gCard : " + this.gCard );
	 }
	 public void createInstanceOfMonitor(String displayType, int size, String resolution, double thiskness, double price)
	{
		monitor = new Monitor(displayType, size, resolution, thiskness,price);
	}
	 public void createInstanceOfKeyBoard(String brand, int noOfkeys, boolean backLight, String type, double size)
	{
		keyboard = new KeyBoard(brand, noOfkeys, backLight,type, size);
	}
	public void createInstanceOfMouse(boolean wireLess, int noOfBottons, boolean scroll, String brand)
	{
		mouse = new Mouse(wireLess, noOfBottons, scroll, brand);
	}
	public void createInstanceOfPrinter(String printingSpeed,String type, double printerCap, double warranty)
	{
		printer = new Printer(printingSpeed, type, printerCap, warranty);
	}
	public void createInstanceOfSpeaker( String type, int noOf, double warranty, boolean wireLess)
	{
		speaker = new Speaker(type, noOf, warranty, wireLess);
	}
	public void createInstanceOfCamera(String type, int noOfCamera, String quality, String resolution)
	{
		camera = new Camera(type, noOfCamera, quality, resolution);
	}

}
class Monitor
{
	String displayType;
	int size;
	String resolution;
	double thiskness;
	double price;
	 Monitor(String displayType, int size, String resolution, double thiskness, double price)
	 {
	 	this.displayType= displayType;
	 	this.size =size;
	 	this.resolution = resolution;
	 	this.thiskness = thiskness;
	 	this.price = price;

	 }
	 public void displayMonitor()
	 {
	 	System.out.println();
	 	System.out.println("**** Display Monitor *****");
		System.out.println("displayType : " + this.displayType);
		System.out.println("size : " + this.size);
		System.out.println("resolution : " + this.resolution);
		System.out.println("thiskness : " + this.thiskness );
		System.out.println("price : " + this.price );

	 }
}

class KeyBoard
{
	String brand;
	int noOfkeys;
	boolean backLight;
	String type;
	double size;
	 KeyBoard(String brand, int noOfkeys, boolean backLight, String type, double size)
	 {
	 	this.brand= brand;
	 	this.noOfkeys =noOfkeys;
	 	this.backLight = backLight;
	 	this.type = type;
	 	this.size = size;

	 }
	 public void displayKeyBoard()
	 {
	 	System.out.println();
	 	System.out.println("**** Display KeyBoard *****");
		System.out.println("brand : " + this.brand);
		System.out.println("noOfkeys : " + this.noOfkeys);
		System.out.println("backLight : " + this.backLight);
		System.out.println("type : " + this.type );
		System.out.println("size : " + this.size );

	 }
}



class Mouse
{
	boolean wireLess;
	int noOfBottons;
	boolean scroll;
	String brand;
	Mouse(boolean wireLess, int noOfBottons, boolean scroll, String brand)
	{
		this.wireLess= wireLess;
	 	this.noOfBottons =noOfBottons;
	 	this.scroll = scroll;
	 	this.brand = brand;
	}
	public void displayMouse()
	 {
	 	System.out.println();
	 	System.out.println("**** Display Mouse *****");
		System.out.println("wireLess : " + this.wireLess);
		System.out.println("noOfBottons : " + this.noOfBottons);
		System.out.println("scroll : " + this.scroll);
		System.out.println("brand : " + this.brand);
	}	
}
class Printer
{
	String printingSpeed;//ppm
	String type;
	double printerCap;
	double warranty;

	Printer(String printingSpeed,String type, double printerCap, double warranty)
{
	 	this.printingSpeed = printingSpeed;
	 	this.type = type;
	 	this.printerCap = printerCap;
	 	this.warranty = warranty;
	
}
public void displayPrinter()
	 {
	 	System.out.println();
	 	System.out.println("**** Display Printer *****");
		System.out.println("printingSpeed : " + this.printingSpeed);
		System.out.println("type : " + this.type);
		System.out.println("printerCap : " + this.printerCap);
		System.out.println("warranty : " + this.warranty);
	}	
}

class Speaker
{
	String barnd;
	String type;//Bass Speakers
	int noOf;
	double warranty;
	boolean wireLess;

	Speaker( String type, int noOf, double warranty, boolean wireLess)
{
	 	this.type = type;
	 	this.noOf = noOf;
	 	this.warranty = warranty;
	 	this.wireLess=wireLess;
	
}
public void displaySpeaker()
	 {
	 	System.out.println();
	 	System.out.println("**** Display Speaker *****");
		System.out.println("type : " + this.type);
		System.out.println("noOf : " + this.noOf);
		System.out.println("warranty : " + this.warranty);
		System.out.println("wireLess : " + this.wireLess);
	}	
}

class Camera
{
	
	String type;
	int noOfCamera;
	String quality;
	String resolution;

	Camera(String type, int noOfCamera, String quality, String resolution)
{
	 	
	 	this.type = type;
	 	this.noOfCamera = noOfCamera;
	 	this.quality = quality;
	 	this.resolution=resolution;
	
}
public void displayCamera()
	 {
	 	System.out.println();
	 	System.out.println("**** Display Camera *****");
		System.out.println("type : " + this.type);
		System.out.println("noOfCamera : " + this.noOfCamera);
		System.out.println("quality : " + this.quality);
		System.out.println("resolution : " + this.resolution);
	}	
}




class ComputerDrivee
{
	public static void main(String[] args) 
	{
		Computer obj = new Computer("VivoBook_ASUS","Laptop Computers", "X513UA_KM513UA", "Black", 3);
		obj.displayComputer();
		obj.createInstanceOfCpu(16, 8, "i7" ," UHD Graphics");
		obj.cpu.displayCpu();
		obj.cpu.createInstanceOfMonitor(" LED Monitors",12 , "1024x768", 2.5, 65000);
		obj.cpu.monitor.displayMonitor();
		obj.cpu.createInstanceOfKeyBoard("Dell",84 ,true , "Flexible Keyboard", 1800);
		obj.cpu.keyboard.displayKeyBoard();
		obj.cpu.createInstanceOfMouse(true, 3 ,true , "Dell");
		obj.cpu.mouse.displayMouse();
		obj.cpu.createInstanceOfPrinter("10 ppm", "Laser" ,  500 ,3);
		obj.cpu.printer.displayPrinter();
		obj.cpu.createInstanceOfSpeaker("Bass Speakers", 2 ,1.5 , true);
		obj.cpu.speaker.displaySpeaker();
		obj.cpu.createInstanceOfCamera("WebCam",1 ,"Overall 119", "1024x768");
	    obj.cpu.camera.displayCamera();
	}
}