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
        cart.getItemsInCart().forEach(items -> {
            System.out.printf("%-4d", count[0]);
            System.out.println(cart.toString());
            count[0]++;
        });
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
