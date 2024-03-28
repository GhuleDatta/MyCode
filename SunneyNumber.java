import java.util.*;
class SunneyNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.print("Enter The number:");;
	int num=sc.nextInt();
	boolean flag=false;
	int sqrrt=0;
	for (int i=1;i<=num/2 ;i++ ) {
		if(i*i==num+1){

			flag=true;
			sqrrt=i;
			break;
		}
		if (flag) {
			System.out.println(num+"it is a SunneyNumber");
			
		}else{
			System.out.println("not a SunnyNUmber");
		}
		
	}
	}
}