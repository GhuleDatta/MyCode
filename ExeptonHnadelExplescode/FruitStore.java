import java.util.Scanner;
import java.util.*;

class FruitStore
{
	String fruite[];
	static Scanner sc=new Scanner(System.in);

	public static void storeFruite(String fruite[])
	{
		this.fruite=fruite;
		for (int i=0;i<fruite.length ;i++ ) 
		{
			fruite[i]=sc.next();	
		}
	}

	public static void displayFrute()
	{
		System.out.println(Arrays.toString(fruite));
	}

	public static void ChangeFruit()
	{
		System.out.println("Enter the fruite :");
		String inputFruit=sc.next();

		for(int i=0; i<fruite.length;i++)
		{
			if (inputFruit.equals(fruite[i])) 
			{
				System.out.println("Maches");

				System.out.println("Enter new frouit to update :");
				String newFruit=sc.next();
				fruite[i]=new Fruite[];
				break;	
			}
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter the size : ");
		int size=sc.nextInt();

		System.out.println("Enter the fruite :");
		String fruite[]=new String[size];

		FruitStore f=new FruitStore();
		f.storeFruite(fruite);
		f.displayFrute();
		f.ChangeFruit();
	}
}