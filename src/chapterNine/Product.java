package chapterNine;

public class Product extends Items{

    private int productId;
    private String productName;
    private int price;
    private String productDescription;
    private String productCategory;


    public Product(int productId, String productName,
                 int price, String productDescription, String productCategory) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }

    public enum productCategory { ELECTRONICS, GROCERIES, UTENSILS, CLOTHING }
}
