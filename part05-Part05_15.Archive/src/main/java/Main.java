
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> archive = new ArrayList<Item>();
        
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item newItem = new Item(id, name);
            if (!(archive.contains(newItem))) {
                archive.add(newItem);
            }
        }
        
        System.out.println("==Items==");
        for (Item item : archive) {
            System.out.println(item.getIdentifier() + ": " + item.getName());
        }
    }
}
