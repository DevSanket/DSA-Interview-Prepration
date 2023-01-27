public class Advance_Patterns {
    public static void main(String[] args) {

        // * *
        // ** **
        // *** ***
        // ********
        // ********
        // *** ***
        // ** **
        // * *
        // int n = 4;
        // upper part
        // for (int i = 1; i <= n; i++) {
        // // fist part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // // space part
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }

        // // 2nd Part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // <-------------------------------------------------------------->

        // *****
        // *****
        // *****
        // *****
        // *****
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= (5 - i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

    }
}
