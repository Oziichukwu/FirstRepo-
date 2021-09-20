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

    public String toString(){
        return String.format("%-16s%-16.2f%-11d%-10.2f%n",productName, pricePerUnit, quantityOfProduct,
               calculateTotalPrice());
    }

    public BigDecimal calculateTotalPrice() {
        return pricePerUnit.multiply(BigDecimal.valueOf(quantityOfProduct));
    }
}
