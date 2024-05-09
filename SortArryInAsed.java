import java.util.Arrays;

class SortArryInAsed 
{
    public static void main(String[] args) 
    {
     
        int[] numbers = {25, 10, 42, 56, 37, 13};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(numbers));


        Arrays.sort(numbers);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(numbers));
    }
}

