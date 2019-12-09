/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingbasket.ShoppingBasket;

import java.util.ArrayList;

/**
 *
 * @author alexwoods
 */
public class Basket {
    
    private ArrayList<Item> items;
    
    
    public Basket(){
        this.items=new ArrayList<Item>();
       
    }

    /**
     * @return the basket
     */
    public ArrayList<Item> getBasket() {
        return items;
    }

    /**
     */
    public void setBasket(ArrayList<Item> items) {
        this.items = items;
    }
    
    public void addItemToBasket(Item item){
        this.items.add(item);     
    }
    
    public int getSizeOfBasket(){
        return this.items.size();
    
    }

    public int getValueOfItems() {
     int total = 0;
     for(Item item : this.items){
        total += item.getValue();
     }
           return total;
    }

  
    
    
    
}
