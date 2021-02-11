
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int j = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input > 0) {
                i++;
                j += input;
            }        
        }
        if (i == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((j * 1.0 / i));
        }
    }
}
