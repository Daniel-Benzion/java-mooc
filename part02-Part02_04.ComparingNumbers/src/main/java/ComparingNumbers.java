
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        
        if (num1 > num2) {
            System.out.printf("%d is greater than %d", num1, num2);
        } else if (num2 > num1) {
            System.out.printf("%d is smaller than %d", num1, num2);
        } else {
            System.out.printf("%d is equal to %d", num1, num2);
        }
    }
}
