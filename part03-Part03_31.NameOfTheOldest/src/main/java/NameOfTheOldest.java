
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String nameOldest = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] arr = input.split(",");
            int num = Integer.parseInt(arr[1]);
            String name = arr[0];
            if (num > max) {
                max = num;
                nameOldest = name;
            }
        }
        System.out.println("Name of the oldest: " + nameOldest);

    }
}
