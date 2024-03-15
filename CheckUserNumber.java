import java.util.Scanner;
class CheckUserNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		doble num=sc.nextDouble();
		if(num>0){
				System.out.println("number is +ve");
		}else if(num<0){
			System.out.println("Number is -ve");
		}else if(num==0){
			System.out.println("number is Natural");
		}
		else{
			System.out.println("chutiye sahi nabar dal:");
		}
	}
}