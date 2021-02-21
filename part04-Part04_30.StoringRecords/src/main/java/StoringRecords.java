
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try (Scanner getFile =  new Scanner(Paths.get(file))) {
            while (getFile.hasNextLine()) {
                String line = getFile.nextLine();
                String[] parts = line.split(",");
                String name =  parts[0];
                String age = parts[1];
                persons.add(new Person(name, Integer.parseInt(age)));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        // Write here the code for reading from file
        // and printing the read records
        return persons;

    }
}
