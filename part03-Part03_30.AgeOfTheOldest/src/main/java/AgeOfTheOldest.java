
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] arr = input.split(",");
            int num = Integer.parseInt(arr[1]);
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Age of the oldest: " + max);
    }
}
