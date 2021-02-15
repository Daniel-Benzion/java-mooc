
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int num : array) {
            int counter = 1;
            StringBuilder build = new StringBuilder();
            while (counter <= num) {
                build.append("*");
                counter++;
            }
            String starString = build.toString();
            System.out.println(starString);
        }
    }

}
