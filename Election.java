import java.util.Scanner;
class Election
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);	
  
	System.out.println("************welcome************");
	System.out.println("1.BJP");
	System.out.println("2.Congress");
	System.out.println("3.CPI");
	System.out.println("4.NCP");
	System.out.println("5.INC");
	System.out.println("6.CPM");
	

	System.out.print("Enter your age:");
	String age=sc.nextString();

	System.out.print("Enter your party number:");
	int num=sc.nextInt();
  
	if(age<18){
	System.out.println("your not abale to give voit:");
		System.out.println("try After:"+(18-age)+"year");
	}
	else if(num==1){
	System.out.println("BJP");
	System.out.println("Future is Brite");
	}
	else if(num==2){
	System.out.println("cogress");
	System.out.println("Future in barbadi");
	}
	else if(num==3){
	System.out.println("CPI");
	System.out.println("Future is undifind Brite");
	}
	else if(num==4){
	System.out.println("NCP");
	System.out.println("Future with NCP undifind Brite");
	}
	else if(num==5){
	System.out.println("INC");
	System.out.println("Future with INC undifind Brite");
	}
	else if(num==3){
	System.out.println("CPM");
	System.out.println("Future with CPM undifind Brite");
	}
	else
	{
	System.out.println("Input Is not curect");
	}

	System.out.println("Thanks for your Rispose");
	}
}
	
	















	