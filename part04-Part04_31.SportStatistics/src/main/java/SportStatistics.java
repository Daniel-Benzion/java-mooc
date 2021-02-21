
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        try (Scanner getFile = new Scanner(Paths.get(file))) {
            while (getFile.hasNextLine()) {
                String line = getFile.nextLine();
                String[] parts = line.split(",");
                String home = parts[0];
                String away = parts[1];
                String homeScore = parts[2];
                String awayScore = parts[3];
                if (team.equals(home)) {
                    games++;
                    if (Integer.parseInt(homeScore) > Integer.parseInt(awayScore)) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (team.equals(away)) {
                    games++;
                    if (Integer.parseInt(homeScore) < Integer.parseInt(awayScore)) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
