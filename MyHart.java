class MyHart {
    public static void main(String[] args) throws InterruptedException {
        int size = 6; // Adjust the size as needed

        // Print the heart symbol
        for (int i = size / 2; i <= size; i += 2) {
            for (int j = 1; j < size - i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size; i >= 1; i--) {
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Animate the cross
        for (int k = 0; k < 5; k++) {
            Thread.sleep(500);
            clearConsole();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size * 2 - 1; j++) {
                    if (j == size - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            Thread.sleep(500);
            clearConsole();
            // Print the arrow
            for (int i = 0; i < size / 2; i++) {
                for (int j = 0; j < size * 2 - 1; j++) {
                    if (j == size - 1 + i || j == size - 1 - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < size / 2; i++) {
                for (int j = 0; j < size * 2 - 1; j++) {
                    if (j == size - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            Thread.sleep(500);
            clearConsole();
        }
    }

    private static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            // Handle any exceptions
        }
    }
}









// // public class MyHart {
// //     public static void main(String[] args) {
// //         int size = 20; // Adjust the size as needed
// //         for (int i = size / 2; i <= size; i += 2) {
// //             for (int j = 1; j < size - i; j += 2) {
// //                 System.out.print(" ");
// //             }
// //             for (int j = 1; j <= i; j++) {
// //                 System.out.print("*");
// //             }
// //             for (int j = 1; j <= size - i; j++) {
// //                 System.out.print(" ");
// //             }
// //             for (int j = 1; j <= i; j++) {
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //         for (int i = size; i >= 1; i--) {
// //             for (int j = i; j < size; j++) {
// //                 System.out.print(" ");
// //             }
// //             for (int j = 1; j <= (i * 2) - 1; j++) {
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// class MyHart {
//     public static void main(String[] args) {
//         int size = 6; // Adjust the size as needed
        
//         // Print the heart symbol
//         for (int i = size / 2; i <= size; i += 2) {
//             for (int j = 1; j < size - i; j += 2) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             for (int j = 1; j <= size - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = size; i >= 1; i--) {
//             for (int j = i; j < size; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (i * 2) - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//         // Print the cross
//         for (int i = 0; i < size; i++) {
//             for (int j = 0; j < size * 2 - 1; j++) {
//                 if (j == size - 1) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
        
//         // Print the arrow
//         for (int i = 0; i < size / 2; i++) {
//             for (int j = 0; j < size * 2 - 1; j++) {
//                 if (j == size - 1 + i || j == size - 1 - i) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//         for (int i = 0; i < size / 2; i++) {
//             for (int j = 0; j < size * 2 - 1; j++) {
//                 if (j == size - 1) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


