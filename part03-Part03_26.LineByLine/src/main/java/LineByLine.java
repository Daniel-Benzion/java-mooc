
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] arr = input.split(" ");
            for (String str : arr) {
                System.out.println(str);
            }
        }

    }
}
