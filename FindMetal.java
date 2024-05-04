import java.util.Scanner;
public class FindMetal 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Read stone and metal strings from the user
        String stone = scanner.nextLine();
        String metal = scanner.nextLine();

        // Initialize count
        int c = 0;

        // Iterate through metal characters
        for (int i = 0; i < metal.length(); i++) 
        {
            // Iterate through stone characters
            for (int j = 0; j < stone.length(); j++) 
            {
                // Compare characters from stone and metal
                if (stone.charAt(j) == metal.charAt(i)) 
                {
                    c++;
                }
            }
        }
        System.out.println(c);

      
    }
}
