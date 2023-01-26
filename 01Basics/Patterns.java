/**
 * Patterns
 */
public class Patterns {

    public static void main(String[] args) {

        // first pattern
        // *****
        // *****
        // *****
        // *****

        // Solution -
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }
        // <------------------------------------------>
        // *****
        // * *
        // * *
        // *****

        // Solution -

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (i == 1 || j == 1 || i == 4 || j == 5) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println("");
        // }

        // <------------------------------------------>

        // *
        // **
        // ***
        // ****

        // Solution -

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // <------------------------------------------>

        // ****
        // ***
        // **
        // *

        // Solution -

        // for (int i = 4; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // <------------------------------------------>

        // *
        // **
        // ***
        // ****

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4; j++) {
        // if (j <= (4 - i)) {
        // System.out.print(" ");
        // } else {
        // System.out.print("*");
        // }
        // }
        // System.out.println("");
        // }

        // <------------------------------------------>

        // 1
        // 12
        // 123
        // 1234
        // 12345

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println("");
        // }

        // <------------------------------------------>

        // 12345
        // 1234
        // 123
        // 12
        // 1

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }
}