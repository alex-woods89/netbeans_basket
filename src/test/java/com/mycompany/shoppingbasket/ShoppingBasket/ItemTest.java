/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingbasket.ShoppingBasket;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexwoods
 */
public class ItemTest {
    
    public ItemTest() {
    }

    /**
     * Test of getName method, of class Item.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Item item = new Item("Banana", 10);
        String expResult = "Banana";
        String result = item.getName();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setName method, of class Item.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Grapes";
        Item item = new Item("Coffee", 10);
        item.setName(name);

    }
    
}
