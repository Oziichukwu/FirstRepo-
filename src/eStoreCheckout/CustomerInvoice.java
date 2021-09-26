package eStoreCheckout;

import java.math.BigDecimal;
import java.util.Scanner;

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
         System.out.println("=".repeat(60));
         System.out.printf("Total Amount: %.2f%n", cart.calculateTotalOfItemsInCart());
         System.out.printf("The (7.5)VAT on %.2f is: %.2f%n", cart.calculateTotalOfItemsInCart(), cart.calculateVatOfTotalOfItems());
         System.out.println("=".repeat(60));
         System.out.println();

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
    public void collectPaymentFromCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.println("KINDLY MAKE YOUR PAYMENT");
        System.out.print("ENTER AMOUNT: ");
        double amountToPay = input.nextDouble();
        if(amountToPay > cart.calculateTotalOfItemsInCart().doubleValue()){
         BigDecimal paymentMadeByCustomer = BigDecimal.valueOf(amountToPay).subtract(cart.calculateTotalOfItemsInCart());
            System.out.printf("Balance : %.2f%n", paymentMadeByCustomer);
            System.out.println("Shay u want still collect change niiii");
        }
        if (amountToPay < cart.calculateTotalOfItemsInCart().doubleValue()){
            BigDecimal payment = cart.calculateTotalOfItemsInCart().subtract(BigDecimal.valueOf(amountToPay));
            System.out.printf("Outstanding debt: %.2f%n", payment);
            System.out.println("Kindly pay up your gbesee");
        } else if (amountToPay == (cart.calculateTotalOfItemsInCart().doubleValue())) {
            System.out.println("=".repeat(60));
            System.out.println("Balance: 0.00");
            System.out.println("Thanks for your patronage");
            System.out.println("=".repeat(60));
        }
      }
}

