
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int j = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            i++;
            j += input;
        }
        System.out.printf("Average of the numbers: %f", (j * 1.0 / i));
    }
}
