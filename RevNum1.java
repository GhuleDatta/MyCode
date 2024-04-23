

import java.util.Scanner;

public class RevNum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a name
        System.out.println("Enter a name to check if it is a palindrome:");
        String name = scanner.nextLine();
        
        // Convert the name to lowercase and remove spaces for consistent comparison
        String processedName = name.toLowerCase().replaceAll("\\s+", "");
        
        // Check if the name is a palindrome
        boolean isPalindrome = isPalindrome(processedName);
        
        // Display the result
        if (isPalindrome) {
            System.out.println("The name '" + name + "' is a palindrome.");
        } else {
            System.out.println("The name '" + name + "' is not a palindrome.");
        }
        
        scanner.close();
    }
    
    // Function to check if a string is a palindrome using a for loop
    public static boolean isPalindrome(String str) {
        int length = str.length();
        
        // Iterate through the string and compare characters from the beginning and end
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false; // Not a palindrome
            }
        }
        
        return true; // It's a palindrome
    }
}
// class RevNum1
// {
// 	public static void main(String[] args) 
// 	{
// 		String name="ram";
// 		char ch=name.charAt(0);

// 		for (int i=0;i< ; ) {
			
// 		}
// 		// int num=145;
// 		// int rev=0;
// 		// while(num>0)
// 		// {
// 		// 	int rem=num%10;
// 		// 	rev=rev*10+rem;
// 		// 	num/=10;
// 		// }
// 		// System.out.println(rev);
		
// 	}
// }