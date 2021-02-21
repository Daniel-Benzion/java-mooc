
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int counter = 0;
        ArrayList<String> list = new ArrayList<>();
        try (Scanner getFile = new Scanner(Paths.get(file))) {
            while (getFile.hasNextLine()) {
                list.add(getFile.nextLine());
            }
        } catch (Exception e) {
                System.out.println("Error: " + e);
        }
        for (String num : list) {
            if (Integer.valueOf(num) <= upperBound && Integer.valueOf(num) >= lowerBound) {
                    counter++;
                }
        }
        System.out.println("Numbers: " + counter);
    }

}
