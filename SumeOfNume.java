
import java.util.*;
class SumeOfNume
{
    public static void main(String[] args) 
    {
        String input = "123";
        long sum = 0;

        for (int i = 0; i < input.length(); i++) 
        {
        	System.out.println(i);
            for (int j = 1; j <= input.length() - i; j++) 
            {
                String temp = input.substring(i, i + j);
                sum += Long.parseLong(temp);
            }
        }
        System.out.println(sum);
    }


}