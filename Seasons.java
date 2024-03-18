import java.util.Scanner;
class Seasons
{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month number:");
		int num=sc.nextInt();


		String month=null;
	
		switch(num){
		case 10:month="OCT";System.out.println("it is a Winter");break;
		case 11:month="NOW";System.out.println("it is a Winter");break;
		case 12:month="DEC";System.out.println("it is a Winter");break;
		case 1:month="JAN";System.out.println("it is a Winter");break;
		case 2:month="FEB";System.out.println("it is a Sumer");break;
		case 3:month="MAR";System.out.println("it is a Sumer");break;
		case 4:month="APR";System.out.println("it is a Sumer");break;
		case 5:month="MAY";System.out.println("it is a Sumer");break;
		case 6:month="JUN";System.out.println("it is a Rainey");break;
		case 7:month="JUL";System.out.println("it is a Rainey");break;
		case 8:month="AGS";System.out.println("it is a Rainey");break;
		case 9:month="SAP";System.out.println("it is a Rainey");break;
		default:System.out.println("Envalid Input");

		}

		System.out.println((month!=null)?(num+"-"+month):"");
	}
}