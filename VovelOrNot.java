
import java.util.Scanner;

public class VovelOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a 
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the character is a vowel
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is not a vowel.");
        }
    }

    public static boolean isVowel(char ch) {
        // Convert the character to lowercase for easier comparison
        ch = Character.toLowerCase(ch);
        
        // Check if the character is 'a', 'e', 'i', 'o', or 'u'
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
