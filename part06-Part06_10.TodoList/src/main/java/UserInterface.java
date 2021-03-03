
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ionbenz
 */
public class UserInterface {
    
    private TodoList toDoList;
    private Scanner scanner;
    
    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("add")) {
                System.out.println("To add:");
                String adder = scanner.nextLine();
                toDoList.add(adder);
            } else if (input.equals("list")) {
                toDoList.print();
            } else if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                int remove = Integer.parseInt(scanner.nextLine());
                toDoList.remove(remove);
            } else if (input.equals("stop")) {
                break;
            }
        }
    }
}
