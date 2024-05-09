class SumMinMax {
    public static void main(String[] args) {
        int[] A = {3, 5, 2, 8, 1, 7};
        int N = A.length;

        // Initialize min and max with the first element of the array
        int min_element = A[0];
        int max_element = A[0];

        // Iterate through the array to find min and max
        for (int i = 1; i < N; i++) {
            if (A[i] < min_element) {
                min_element = A[i];
            }
            if (A[i] > max_element) {
                max_element = A[i];
            }
        }

        // Calculate the sum of min and max elements
        int sum = min_element + max_element;

        // Print the sum
        System.out.println("Sum of minimum and maximum elements in the array: " + sum);
    }
}
