package eStoreCheckout;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Cart {

    private final ArrayList<Items>collectionOfItems;

    public Cart() {
        collectionOfItems = new ArrayList<>();
    }

    public void addItemsToCart(Items items){
        collectionOfItems.add(items);
    }

    public BigDecimal calculateTotalOfItemsInCart(){
       BigDecimal itemsTotal = BigDecimal.ZERO;

       for (Items items : collectionOfItems){
           itemsTotal = itemsTotal.add(items.calculateTotalForItems());
       }
        return itemsTotal;
    }

    public List<Items> getItemsInCart() {
        return Collections.unmodifiableList(collectionOfItems);
    }

    public BigDecimal calculateVatOfTotalOfItems(){
        BigDecimal  valueAddedTax = BigDecimal.valueOf(7.5);
        BigDecimal  percent = BigDecimal.valueOf(100.00);
        return  calculateTotalOfItemsInCart().multiply(valueAddedTax).divide(percent);
    }

}
