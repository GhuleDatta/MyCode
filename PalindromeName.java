import java.util.Scanner;
class PalindromeName{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name:");
		String name=sc.next();
		String rever="";
		for (int i=name.length()-1;i>=0 ;i-- ) {
			rever+=name.charAt(i);
			
		}
		System.out.println((rever.equals(name))?name+" Palindrome Nmae":name+" not Palindrome Name");

	}
}