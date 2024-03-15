import java.util.Scanner;
class LaderExampale
{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the persentage:");
	double per=sc.nextDouble();

	if (per<35){
		System.out.println("fail😖:");
	}else if (per>=35 && per<=60){
		System.out.println("second class:");
	}else if (per>=60 && per<=75){
		System.out.println("frist class:");
	}else if (per>=75 && per<=90){
		System.out.println("A class:");
	}else if (per>=90 && per<=100){
		System.out.println("O class:");
	}else{
				System.out.println("error");
		}
	}
}
		
		
		