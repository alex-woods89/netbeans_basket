/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discounts;

import com.mycompany.shoppingbasket.ShoppingBasket.Basket;

/**
 *
 * @author alexwoods
 */
public interface Idiscount {
    
    double discount(Basket basket);
    
}
