public class AnimatedILoveYouPrinter {
    public static void main(String[] args) throws InterruptedException {
        animatedPrintILoveYou();
    }

    public static void animatedPrintILoveYou() throws InterruptedException {
        String[] lines = {
            "   *****  *       ***   *   *   *****  *   *    ***   *   *  ",
            "     *    *      *   *  *   *   *       * *    *   *  *   * ",
            "     *    *      *   *  *   *   *****    *     *   *  *   *  ",
            "     *    *      *   *   * *    *        *     *   *  *   * ",
            "   *****  *****   ***     *     *****    *      ***    ***  "
        };
        
        String[] colors = {
            "\u001B[31m", // Red
            "\u001B[32m", // Green
            "\u001B[33m", // Yellow
            "\u001B[34m", // Blue
            "\u001B[35m", // Purple
            "\u001B[36m", // Cyan
            "\u001B[0m"   // Reset
        };

        for (int i = 0; i < lines[0].length(); i++) {
            StringBuilder animatedLine = new StringBuilder();
            for (int j = 0; j < lines.length; j++) {
                if (lines[j].charAt(i) != ' ') {
                    animatedLine.append(colors[j % colors.length]);
                    animatedLine.append(lines[j].charAt(i));
                } else {
                    animatedLine.append(" ");
                }
            }
            System.out.println(animatedLine.toString());
            Thread.sleep(100); // Adjust the speed of animation here
        }
    }
}
