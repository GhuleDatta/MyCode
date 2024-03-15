import java.util.Scanner;
class CheckDLEligiblity
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age:");
		int age=sc.nextInt();

		if(age<=17){
			System.out.println("your not eligibal Tray after:"+(18-age)+"yr");
		}
		else if(age>=85){
			System.out.println("your over ageded:");
		}
		else if(age>=18 &&age<=60){
			System.out.print("Enter your RTO test markes:");
			long marks=sc.nextLong();
				if(marks<=59){
					System.out.println("Your not eligibal Try after som time:"+marks);
				}else if(marks>=60){
					System.out.println("your eligibale for Driving lisence:");
				}
				else{
					System.out.println("**********you can live now***********************");
				}
		}
	}
}