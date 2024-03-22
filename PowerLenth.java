import java.util.*;
class PowerLenth{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The NUmber:");
		int num=sc.nextInt();
		int dub=num;
		int lenth=0;
		int power=1;

		while(num!=0){
			lenth++;
			num/=10;
		}
		for (int i=1;i<=lenth ;i++ ) {
			power *=dub;
			System.out.println("power of "+num+" is"+power);
			
		}
	}
}