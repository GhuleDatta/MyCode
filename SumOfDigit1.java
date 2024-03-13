import java.util.Scanner;

public class SumOfDigit1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += getSumOfDigits(i);
        }

        System.out.println("Sum of digits from 1 to " + number + " is: " + sum);
    }

    public static int getSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
