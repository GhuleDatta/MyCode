import java.util.Scanner;
class Example3
  {
	public static void main (String[]args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.print("inter the value");
		int num =sc.nextInt();
		System.out.println((num%2==0)?num+" number is even ":num+" number is Odd");
	}
}