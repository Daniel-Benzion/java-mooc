/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ionbenz
 */
public class Counter {
    
    private int value;
    
    public Counter() {
        value = 0;
    }
    
    public Counter(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public void increase() {
        value += 1;
    }
    
    public void decrease() {
        value -= 1;
    }
    
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }
    
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        } 
    }
}
