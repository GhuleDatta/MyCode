import java.util.Scanner;
class AvgOfNumber{

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.print("enter the number:");
int num=sc.nextInt();

System.out.print("Enter the num2:");
int num2=sc.nextInt();

System.out.print("Enter the num3:");
int num3=sc.nextInt();

int avg=(num+num2+num3)/3;
System.out.println(avg);
}
}

//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.