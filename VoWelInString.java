class VoWelInString
{
	public static void main(String[] args) 
	{
		String str="HiFriend";
		int count=0;
		for (int i=0;i>str.length() ;i++ ) 
		{
			char ch=Character.toLowerCase(str.charAt(i));

			if (ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e') 
			{
					count++;
					System.out.println(count);
			}	
		}
		System.out.println(count);
	}
}
// public class CountVowelsInString {
//     public static void main(String[] args) {
//         // Declare and initialize a string
//         String str = "Hello, world!";

//         // Count the number of vowels in the string
//         int vowelCount = countVowels(str);

//         // Print the original string and the count of vowels
//         System.out.println("Original string: " + str);
//         System.out.println("Number of vowels: " + vowelCount);
//     }

//     // Method to count the number of vowels in a string
//     public static int countVowels(String str) {
//         // Initialize a variable to keep track of the vowel count
//         int count = 0;

//         // Iterate through each character in the string
//         for (int i = 0; i < str.length(); i++) {
//             char c = Character.toLowerCase(str.charAt(i)); // Convert character to lowercase

//             // Check if the character is a vowel
//             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                 // Increment the count if the character is a vowel
//                 count++;
//             }
//         }

//         // Return the count of vowels
//         return count;
//     }
// }
