import java.util.Scanner;
class Month
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the month Number:");
		int MonthNum=sc.nextInt();
		String month=null;

		switch(MonthNum){
		case 1:month="Jan";break;
		case 2:month="feb";break;
		case 3:month="Mar";break;
		case 4:month="APR";break;
		case 5:month="MAY";break;
		case 6:month="JUN";break;
		case 7:month="JULY";break;
		case 8:month="AUG";break;
		case 9:month="SEP";break;
		case 10:month="OCT";break;
		case 11:month="NOV";break;
		case 12:month="DEC";break;
        default:System.out.println("envalid in put");
		}
		System.out.println((month!=null)?(MonthNum+"-"+month):"");
	}
}