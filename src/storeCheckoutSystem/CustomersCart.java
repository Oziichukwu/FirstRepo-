package storeCheckoutSystem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomersCart {

    private final List<ItemsBought> collectionOfItemsBought;

    public CustomersCart(){
        collectionOfItemsBought = new ArrayList<>();
    }
    public void addItemsToCart(ItemsBought item) {
        collectionOfItemsBought.add(item);
    }

    public List<ItemsBought> getItemsInCart(){
        return Collections.unmodifiableList(collectionOfItemsBought);
    }

    public BigDecimal calculateTotalOfItems() {
        BigDecimal totalOfItems = BigDecimal.ZERO;
        for (ItemsBought item: collectionOfItemsBought) {
            totalOfItems = totalOfItems.add(item.calculateTotalPrice());
        }
        return totalOfItems;
    }

    public BigDecimal calculateVatOfTotalOfItems(){
       BigDecimal  VAT = BigDecimal.valueOf(7.5);
       BigDecimal  percent = BigDecimal.valueOf(100.00);
        return  calculateTotalOfItems().multiply(VAT).divide(percent);
    }

}
