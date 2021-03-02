
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
public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<Item>();
    }
    
    public void addItem(Item item) {
        int weight = 0;
        for (Item temp : items) {
            weight += temp.getWeight();
        }
        if (weight + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }
    
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        int weight = 0;
        for (Item item : items) {
            weight += item.getWeight();
        }
        if (items.size() == 1) {
            return "1 item (" + weight + " kg)";
        }
        return items.size() + " items (" + weight + " kg)";
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Item item : items) {
            weight += item.getWeight();
        }
        return weight;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heavy = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heavy.getWeight()) {
                heavy = item;
            } 
        }
        return heavy;
    }
}
