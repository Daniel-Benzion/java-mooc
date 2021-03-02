/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ionbenz
 */
public class Gift {
    
    private String name;
    private int weight;
    
    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public String toString() {
        return name + " (" + weight + "kg)";
    }
}
