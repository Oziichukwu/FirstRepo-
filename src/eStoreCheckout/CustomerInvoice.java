package eStoreCheckout;

public class CustomerInvoice {
    Cart cart;

    public CustomerInvoice(Cart cart) {
        this.cart = cart;
    }

     void displayCustomerInvoice(){
        int[] count = {1};
        System.out.println(displayHeaderOfCheckOutApplication());
        System.out.printf("%-4s%-15s%-15s%-10s%-10s%n", "S/N", "product", "pricePerUnit", "quantity", "Total");
         System.out.println("=".repeat(55));
        cart.getItemsInCart().forEach(items -> {
            System.out.printf("%-4d", count[0]);
            System.out.println(items.toString());
            count[0]++;
        });
         System.out.println();
         System.out.printf("Total Amount: %.2f%n", cart.calculateTotalOfItemsInCart());
         System.out.printf("The (7.5)VAT on %.2f is: %.2f",cart.calculateTotalOfItemsInCart(), cart.calculateVatOfTotalOfItems());


     }
    private static String displayHeaderOfCheckOutApplication(){
        return
                """
                              UNCLE CHIBOB SHOPPING PLAZA
                        address: 5, Ademola ilaro Street bush side 
                        email: uncle.chibob@chibob.com 
                        phoneNo: 09087657876
                        motto: In God we trust
                """;
    }
}
