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
public class PercentageOff implements Idiscount {
    
    Basket basket;
    PercentageOff percentageOff;
    
    public PercentageOff(){}
    
    public double discount(Basket basket){
        double total = basket.getValueOfItems();
        if(total >= 20){
         return total * 0.9;
        }
        return total;    
    }
    
}
