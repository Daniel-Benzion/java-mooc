
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] arr = input.split(" ");
            System.out.println(arr[0]);
        }

    }
}
