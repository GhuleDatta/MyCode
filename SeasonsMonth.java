import java.util.Scanner;
class SeasonsMonth
{
	public static void main(String[]args) {
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter the month name:");
		String month=sc1.nextLine().toUpperCase();


	
		switch(month){
		case "OCT":
		case "NOW":
		case "DEC":
		case "JAN":System.out.println("it is a Winter");break;
		case "FEB":
		case "MAR":
		case "APR":
		case "MAY":System.out.println("it is a Sumer");break;
		case "JUN":
		case "JUL":
		case "AGS":
		case "SAP":System.out.println("it is a Rainey");break;
		default:System.out.println("Envalid Input");

		}

		System.out.println("month name is:"+month);


	}
}