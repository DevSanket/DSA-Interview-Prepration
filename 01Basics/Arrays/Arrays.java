import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // type[] arrayName = new type[size];
        // type arrayName[] = new type[size];

        // int[] marks = new int[3];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;

        // int marks[] = {97,98,95};

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }

        // use of foreach
        // for (int i : marks) {
        // System.out.println(i);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array - ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter value to put in array - ");
            numbers[i] = sc.nextInt();
        }

        for (int i : numbers) {
            System.out.println(i);
        }

        // find an number in array
        System.out.print("Which you wanna find? - ");
        int x = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("X found at index " + i);
                return;
            }
        }

        System.out.println("Element not found");

        sc.close();
    }
}
