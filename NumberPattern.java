public class NumberPattern {
    public static void main(String[] args) {
        int n = 5; // number of rows
        int num = 1;

        for (int i = 1; i <= n; i++) {
            int count = num + i - 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count--;
            }

            num = num + i;
            System.out.println();
        }
    }
}
