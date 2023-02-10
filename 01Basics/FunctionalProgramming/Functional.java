import java.util.List;

/**
 * Functional
 */
public class Functional {

    public static void main(String[] args) {
        // printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        // printSquaresOfEvenNumbers(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        printCubeofOddNumber(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    // private static void print(int number) {
    // System.out.println(number);
    // }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printSquaresOfEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static void printCubeofOddNumber(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // for (int number : numbers) {
        // print(number);
        // }

        // numbers.stream().forEach(Functional::print);
        // numbers.stream().forEach(System.out::println);

        // check the number is even
        // for (int number : numbers) {
        // if (number % 2 == 0) {
        // System.out.println(number);
        // }
        // }

        // numbers.stream().filter(Functional::isEven).forEach(System.out::println);

        // use of lambda expression
        // numbers.stream()
        // .filter(number -> number % 2 == 0)
        // .forEach(System.out::println);

        // print odd number
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);

    }

}