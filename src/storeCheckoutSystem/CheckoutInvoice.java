package storeCheckoutSystem;

public class CheckoutInvoice {
    CustomersCart cart;
    public CheckoutInvoice(CustomersCart cart){
        this.cart = cart;
    }
    void displayInvoice() {
        final int[] count = {1};
        System.out.println(displayHeaderOfCheckOutApplication());
        System.out.printf("%-5s%-16s%-16s%-11s%-11s%n", "S/N", "Product", "Unit Price", "Quantity", "Total");
        System.out.println("=".repeat(55));
        cart.getItemsInCart().forEach(item -> {
            System.out.printf("%-4d", count[0]);
            System.out.println(item.toString());
            count[0]++;
        } );
        System.out.printf("Total Amount: %.2f%n", cart.calculateTotalOfItems());
    }
        private static String displayHeaderOfCheckOutApplication(){
            return
                    """
                                  UNCLE CHIBOB SHOPPING PLAZA
                            address: 5, Ademola illaro Street bush side 
                            email: uncle.chibob@chibob.com 
                            phoneNo: 09087657876
                            motto: In God we trust
                    """;
        }

    }

