
import java.util.*;
class NPAmstrom
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the NUmber : ");
		int num=sc.nextInt();
		int dub=num;
		int sum=0;

		while(num>0)
		{
			int rem=num%10;
			sum=(rem*rem*rem)+sum;
			num/=10;
			System.out.println(num);
		}
		System.out.println(dub==sum?"Amstrom number"+sum:"not Amstrom Num"+dub);
	}
}