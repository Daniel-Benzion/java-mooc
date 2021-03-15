
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ionbenz
 */
public class Statistics {
    
    
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    
    public Statistics() {
        points = new ArrayList<>();
        passingPoints = new ArrayList<>();
    }
    
    public void addPoints(int point) {
        if (point >= 0 && point <= 100) {
           points.add(point); 
        }
        if (point >= 50 && point <= 100) {
            passingPoints.add(point);
        }
    }
    
    public double getAverageAll() {
        if (points.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        return (1.0 * sum) / points.size();
    }
    
    public double getAveragePassing() {
        if (passingPoints.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int point : passingPoints) {
            sum += point;
        }
        return (sum * 1.0) / passingPoints.size();
    }
    
    public String averageAllMessage() {
        return "Point average (all): " + getAverageAll();
    }
    
    public String averagePassingMessage() {
        if (getAveragePassing() == 0) {
            return "Point average (passing): -";
        }
        return "Point average (passing): " + getAveragePassing();
    }
    
    public double passPercentage() {
        if (points.isEmpty() || passingPoints.isEmpty()) {
            return 0;
        }
        return 100.00 * passingPoints.size() / points.size();
    }
    
    public String passPercentageMessage() {
        return "Pass percentage: " + passPercentage();
    }
    
    public void printGradeDistribution() {
        
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        
        for (int point : points) {
            if (point < 50) {
                zero++;
            } else if (point < 60) {
                one++;
            } else if (point < 70) {
                two++;
            } else if (point < 80) {
                three++;
            } else if (point < 90) {
                four++;
            } else {
                five++;
            }
        }
        System.out.println("Grade distribution:");
        System.out.println("5: " + getStars(five));
        System.out.println("4: " + getStars(four));
        System.out.println("3: " + getStars(three));
        System.out.println("2: " + getStars(two));
        System.out.println("1: " + getStars(one));
        System.out.println("0: " + getStars(zero));
    }
    
    public String getStars(int number) {
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            sb.append("*");
            number--;
        }
        return sb.toString();
    }
}
