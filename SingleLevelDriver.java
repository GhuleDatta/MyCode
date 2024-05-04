import java.util.*;
class ProgramingLanuage
{
	String type;
	String level;
	int inventedYr;
	String faounderName;
	double latestVersion;

	ProgramingLanuage(String type,String level,int inventedYr,String faounderName,double latestVersion)
	{
		this.type=type;
		this.level=level;
		this.inventedYr=inventedYr;
		this.faounderName=faounderName;
		this.latestVersion=latestVersion;
	}
	public void displayProgramingLanguage()
	{
		System.out.println("****Programing Language Details****");
		System.out.println("type :"+this.type);
		System.out.println("level :"+this.level);
		System.out.println("faounder Name : "+this.faounderName);
		System.out.println("latest Version :" +this.latestVersion);
	}

}

class Java extends ProgramingLanuage
{
	String[] features;
	boolean palformIndependant;

	Java(String[] features,boolean palformIndependant)
	{
		super();
		this.features=features;
		this.palformIndependant=palformIndependant;

	}
	public void displayJava()
	{
		System.out.println("**** JAVA *****");
		System.out.println("It is platform INdependant :"+this.palformIndependant);
		System.out.println("Feture Of Java : "+Arrays.toString(this.features));
	}
}

class SingleLevelDriver
{
	public static void main(String[] args) {
		String[] features={"1.Multithreding","2.Secure and Robust","3.Portable","4.Dynamic(Strong Memary Manegment)"};
		Java obj=new Java(features,true,"object Oriented","High level",1991,"James Gosling");
		obj.displayProgramingLanguage();
		obj.displayJava();
	}
}