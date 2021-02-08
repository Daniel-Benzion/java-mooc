
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year: ");
        int input = Integer.valueOf(scan.nextLine());
        boolean cond1 = input % 100 == 0 && input % 400 == 0;
        boolean cond2 = input % 100 == 0 && input % 400 != 0;
        if (cond1) {
            System.out.println("The year is a leap year.");
        } else if (cond2) {
            System.out.println("The year is not a leap year.");
        } else if (input % 4 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
