/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingbasket.ShoppingBasket;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexwoods
 */
public class BasketTest {
    
    public BasketTest() {
    }

    /**
     * Test of getBasket method, of class Basket.
     */
    @Test
    public void testGetBasket() {
        System.out.println("getBasket");
        Basket instance = new Basket();
        ArrayList<Item> expResult = new ArrayList<>();
        ArrayList<Item> result = instance.getBasket();
        assertEquals(expResult, result);

    }

    /**
     * Test of setBasket method, of class Basket.
     */
    @Test
    public void testSetBasket() {
        System.out.println("setBasket");
        ArrayList<Item> items = null;
        Basket instance = new Basket();
        instance.setBasket(items);

    }

    /**
     * Test of addItemToBasket method, of class Basket.
     */
    @Test
    public void testAddItemToBasket() {
        System.out.println("addItemToBasket");
        Item item = new Item("Grapes", 10);
        Basket instance = new Basket();
        instance.addItemToBasket(item);

    }

    /**
     * Test of getSizeOfBasket method, of class Basket.
     */
    @Test
    public void testGetSizeOfBasket() {
        System.out.println("getSizeOfBasket");
        Basket instance = new Basket();
        int expResult = 0;
        int result = instance.getSizeOfBasket();
        assertEquals(expResult, result);

    }
    
    @Test
    public void testCanGetValueOfItems(){
    System.out.println("get value of items");
    Item item = new Item("Banana", 5);
    Basket basket = new Basket();
    basket.addItemToBasket(item);
    int expResult = 5;
    int result = basket.getValueOfItems();
    assertEquals(expResult, result);
    }
    
    
}
