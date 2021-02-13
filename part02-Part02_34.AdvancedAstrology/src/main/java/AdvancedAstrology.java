
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        while (number > 0) {
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }
    
    public static void printSpaces(int number) {
        // part 1 of the exercise
        while (number > 0) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = size - 1; i >= 0; i--) {
            printSpaces(i);
            printStars(size - i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // 1, 3, 5...
        //printspaces(height - 1)
        //printstars(1 -> += 2)
        int i = 1;
        while (height > 0) {
            printSpaces(height - 1);
            printStars(i);
            i += 2;
            height--;
        }
        i -= 2;
        i /= 2;
        i--;
        printSpaces(i);
        printStars(3);
        printSpaces(i);
        printStars(3);  
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
