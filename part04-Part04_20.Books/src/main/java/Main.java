import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            
            String pages = scanner.nextLine();
            
            String pubYear = scanner.nextLine();
            
            books.add(new Book(title, pages, pubYear));
        }
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();
        if (input.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        } else if (input.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
        
    }
}
