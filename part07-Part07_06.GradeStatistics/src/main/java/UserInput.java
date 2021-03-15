
import java.util.ArrayList;
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
public class UserInput {
    
    private Scanner scanner;
    private Statistics stats;
    
    public UserInput() {
        scanner = new Scanner(System.in);
        stats = new Statistics();
    }
    
    public int getInt() {
        return Integer.parseInt(scanner.nextLine());
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = getInt();
            if (input == -1) {
                break;
            }
            stats.addPoints(input);
        }
        System.out.println(stats.averageAllMessage());
        System.out.println(stats.averagePassingMessage());
        System.out.println(stats.passPercentageMessage());
        stats.printGradeDistribution();        
    }
    
}
