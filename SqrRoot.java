import java.util.Scanner;
class SqrRoot{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Entere the number:");
		int num=sc.nextInt();
		boolean flag=false;
		int sqrrt=0;

		for (int i=1;i<=num/2 ;i++ ) {
				if (i*i==num) {

				flag=true;
				sqrrt=i;
				break;					
				}
			
		}
		if(flag){
			System.out.println(sqrrt+":perfect Squerroot");
		}else{
			System.out.println(num+"not a perfect Squerroot");
		}
		
	}
}