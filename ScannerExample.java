import java.util.Scanner;//importing the scanner class
class ScannerExample
	{
		public static void main(String[]args)
			{
			  Scanner sc=new Scanner(System.in);		//creating a object on scanner class
			  System.out.println("inter your name");
			  String name=sc.next().toLowerCase(); //util the method of sacnner
			  char ch = name.charAt(0);
			  System.out.println("Hi my name is"+name+"my frist charecter in ");
			  

			if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' ||ch == 'u')
				{
				 System.out.println("charcter "+ch+" is a vovel");
				}
				else{
					System.out.println("charecter "+ch+" is a consonent");
				    }
   			}
	}
				