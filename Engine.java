class Engine
{
	double horsePower;
	double capyacityLiter;
	String engineType;
	int milege;
	int noOfPistons;

	Engine(double horsePower,double capyacityLiter,String engineType,int milege,int noOfPistons)
	{
		this.horsePower=horsePower;
		this.capyacityLiter=capyacityLiter;
		this.engineType=engineType;
		this.milege=milege;
		this.noOfPistons=noOfPistons;
	}
	public void enginDrive() 
	{
		
		System.out.println("horsePower : "+horsePower);
		System.out.println("capyacityLiter : "+capyacityLiter);
		System.out.println("engineType :"+engineType);
		System.out.println("milege :"+milege);
		System.out.println("noOfPistons :"+noOfPistons);
	}
}