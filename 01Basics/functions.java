import java.util.Scanner;

public class functions {
    // functions
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static int CalculateSum(int a, int b) {
        return a + b;
    }

    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static int fact(int num) {
        if (num <= 1) {
            return 1;
        }

        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your name - ");
        // String name = sc.next();
        // functions.printMyName(name);
        System.out.println("Enter value of a - ");
        int a = sc.nextInt();
        // System.out.println("Enter value of b - ");
        // int b = sc.nextInt();
        // System.out.println("Answer is " + CalculateSum(a, b));
        // System.out.println("Product is " + calculateProduct(a, b));
        System.out.println("factorial of " + a + " is " + fact(a));
        sc.close();
    }
}
