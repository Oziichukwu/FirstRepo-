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
         System.out.printf("Total Amount: %.2f%n", cart.calculateTotalOfItemsInCart());
         System.out.printf("The (7.5)VAT on %.2f is: %.2f%n", cart.calculateTotalOfItemsInCart(), cart.calculateVatOfTotalOfItems());
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
        double amount = input.nextDouble();
        if(amount > cart.calculateTotalOfItemsInCart().doubleValue()){
         BigDecimal payment = BigDecimal.valueOf(amount).subtract(cart.calculateTotalOfItemsInCart());
            System.out.printf("Balance : %.2f%n", payment);
            System.out.println("Shay u want still collect change niiii");
        }
        if (amount < cart.calculateTotalOfItemsInCart().doubleValue()){
            BigDecimal payment = cart.calculateTotalOfItemsInCart().subtract(BigDecimal.valueOf(amount));
            System.out.printf("Outstanding debt: %.2f%n", payment);
            System.out.println("Kindly pay up you gbesee");
        }
        else if ( amount == (cart.calculateTotalOfItemsInCart().doubleValue())){
            System.out.println("Balance: 0.00");
            System.out.println("Thanks for your patronage");
        }
      }
}

