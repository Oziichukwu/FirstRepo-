package storeCheckoutSystem;
import java.math.BigDecimal;
public class ItemsBought {

    private final int quantityOfProduct;
    private final BigDecimal pricePerUnit;
    private final String productName;

    public ItemsBought(int quantity , BigDecimal pricePerUnit, String productName){
        this.quantityOfProduct = quantity;
        this.pricePerUnit = pricePerUnit;
        this.productName = productName;
    }

    public BigDecimal getPricePerUnit(){
        return pricePerUnit;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }
    public String toString(){
        return String.format("%-15s%-15.2f%-10d%-10.2f%n",productName, pricePerUnit, quantityOfProduct,
                pricePerUnit.multiply(BigDecimal.valueOf(quantityOfProduct)));
    }

}
