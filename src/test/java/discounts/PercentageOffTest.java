/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discounts;

import com.mycompany.shoppingbasket.ShoppingBasket.Basket;
import com.mycompany.shoppingbasket.ShoppingBasket.Item;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexwoods
 */
public class PercentageOffTest {
    
    public PercentageOffTest() {
    }

    /**
     * Test of discount method, of class PercentageOff.
     */
    @Test
    public void testDiscount() {
        Item item = new Item("Carrot", 5);
        Basket basket = new Basket();
        basket.addItemToBasket(item);
        PercentageOff percentageOff = new PercentageOff();
        double result = percentageOff.discount(basket);
        double expResult = 5.0;
        assertEquals(expResult, result, 0.0);
         
      }

    }
    

