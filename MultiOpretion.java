import java.util.Scanner;
class MultiOpretion
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Num1:");
		int num1=sc.nextInt();
		System.out.print("Enter the num2:");
		int num2=sc.nextInt();
		int oper=num1+num2;
		int oper1=num1-num2;
		int oper2=num1*num2;
		int oper3=num1/num2;
		int oper4=num1%num2;
		System.out.println(num1+"+"+num2+"="+oper);
		System.out.println(num1+"-"+num2+"="+oper1);
		System.out.println(num1+"*"+num2+"="+oper2);
		System.out.println(num1+"/"+num2+"="+oper3);
		System.out.println(num1+"%"+num2+"="+oper4);
		



		
	}
}
// 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5