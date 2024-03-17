import java.util.Scanner;
class VowelSwitch
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the Character:");
		char ch=sc.next().toLowerCase().charAt(0);

		switch(ch){
		case 'a':
			case 'i':
				case 'o':
					case 'u':
					case 'e':System.out.println(ch+":it is a vowel");break;
					default:System.out.println("it is a consonent");break;
						
		}
	}
}