
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int second = Integer.valueOf(scanner.nextLine());
        int total = 0;
        for (int i = first; i <= second; i++) {
            total += i;
        }
        System.out.println("The sum is " + total);
    }
}
