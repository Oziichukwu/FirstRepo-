package eStoreCheckout;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Cart {

    private final List<Items>collectionOfItems;

    public Cart() {
        collectionOfItems = new ArrayList<>();
    }

    public void addItemsToCart(Items items){
        collectionOfItems.add(items);
    }

    public BigDecimal calculateTotalOfItemsInCart(){
       BigDecimal itemsTotal = BigDecimal.ZERO;

       for (Items items : collectionOfItems){
           itemsTotal = itemsTotal.add(calculateTotalOfItemsInCart());
       }
        return itemsTotal;
    }

    public List<Items> getItemsInCart() {
        return Collections.unmodifiableList(collectionOfItems);
    }

    public BigDecimal calculateVatOfTotalOfItems(){
        BigDecimal  VAT = BigDecimal.valueOf(7.5);
        BigDecimal  percent = BigDecimal.valueOf(100.00);
        return  calculateTotalOfItemsInCart().multiply(VAT).divide(percent);
    }

}
