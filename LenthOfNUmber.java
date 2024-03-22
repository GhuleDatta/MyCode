import java.util.*;
class LenthOfNUmber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int lenth=0;


		for(int i=num;i>0;i/=10){
			lenth++;

		}
		System.out.println(lenth);
	}
	
}