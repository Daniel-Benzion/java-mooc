
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        long input = Long.parseLong(scanner.nextLine());
        if (input == 0 || input == 1) {
            System.out.println("Factorial: " + 1);
        } else {
            for (long i = input - 1; i >= 1; i--) {
                input *= i;
            }
        }
        System.out.println("Factorial: " + input);
    }
}
