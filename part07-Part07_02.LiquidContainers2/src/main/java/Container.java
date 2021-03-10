/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ionbenz
 */
public class Container {
    
    private final int maxCapacity;
    private int currentCapacity;

    public Container() {
        this.maxCapacity = 100;
        this.currentCapacity = 0;
    }

    public int contains() {
        return this.currentCapacity;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.currentCapacity += amount;
            if (this.currentCapacity > 100) {
                this.currentCapacity = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.currentCapacity -= amount;
            if (this.currentCapacity < 0) {
                this.currentCapacity = 0;
            }
        }
    }

    @Override
    public String toString() {
        return this.currentCapacity + "/" + this.maxCapacity;
    }

    
    
}
