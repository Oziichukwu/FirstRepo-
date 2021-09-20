package eStoreCheckout;

import java.math.BigDecimal;

public class Items {
    private String product;
    private BigDecimal pricePerUnit;
    private int quantity;


    public Items(String product, BigDecimal pricePerUnit, int quantity){
        this.product = product;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public BigDecimal calculateTotalForItems(){

        return pricePerUnit.multiply(BigDecimal.valueOf(quantity));
    }

    public String toString(){
     return  String.format("%-15s%-15.2f%-10d%-10.2f", product, pricePerUnit, quantity,
             calculateTotalForItems());
    }
}
