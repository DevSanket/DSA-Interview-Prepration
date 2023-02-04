import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        // type[][] arrayName = new type[rows][columns];

        Scanner sc = new Scanner(System.in);
        System.out.print("Put Row Number - ");
        int row = sc.nextInt();
        System.out.print("Put Columns Number - ");
        int column = sc.nextInt();

        int[][] numbers = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter the number of position " + i + " " + j + " - ");
                numbers[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            // System.out.println("The " + i + "th Row values are - ");
            for (int j = 0; j < column; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println("");
        }

        // find the number in multidimentional array

        System.out.println("Enter the element which you want to find? - ");
        int search = sc.nextInt();

        sc.close();

        for (int i = 0; i < row; i++) {
            // System.out.println("The " + i + "th Row values are - ");
            for (int j = 0; j < column; j++) {
                if (numbers[i][j] == search) {
                    System.out.println("found at " + i + " " + j);
                    return;
                }
            }
        }

        System.out.println("Not found");

    }
}
