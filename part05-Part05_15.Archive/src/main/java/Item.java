/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ionbenz
 */
public class Item {
    
    private String identifier;
    private String name;
    
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier() {
        return identifier;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean equals(Object compared) {
        
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Item)) {
            return false;
        }
        
        Item compItem = (Item) compared;
        
        if (this.identifier.equals(compItem.identifier)) {
            return true;
        }
        return false;
    }
    
}
