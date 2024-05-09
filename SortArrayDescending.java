public class SortArrayDescending {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {25, 10, 42, 56, 37, 13};

        // Print the original array
        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Sort the array in descending order using bubble sort
        bubbleSortDescending(numbers);

        // Print the sorted array in descending order
        System.out.println("\nSorted array in descending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Bubble sort function to sort the array in descending order
    public static void bubbleSortDescending(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                // Compare adjacent elements and swap if necessary
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped in the inner loop, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}
