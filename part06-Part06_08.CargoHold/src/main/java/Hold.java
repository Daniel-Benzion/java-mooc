
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
public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int weight = 0;
        for (Suitcase temp : suitcases) {
            weight += temp.totalWeight();
        }
        if (weight + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        if (suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        int weight = 0;
        for (Suitcase suitcase : suitcases) {
            weight += suitcase.totalWeight();
        }
        if (suitcases.size() == 1) {
            return "1 suitcase (" + weight + " kg)";
        }
        return suitcases.size() + " suitcases (" + weight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
    
}
