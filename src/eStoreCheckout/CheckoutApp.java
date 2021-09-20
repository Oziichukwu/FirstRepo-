package eStoreCheckout;

import storeCheckoutSystem.CheckoutInvoice;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class CheckoutApp {

    public static void main(String[] args) {
        System.out.println(headerLine());
        Cart cart = new Cart();
        customersCart(cart).displayCustomerInvoice();

    }

    private static String headerLine(){

        return
                """
                          WELCOME TO UNCLE CHIBOB SHOPPING COMPLEX
                    WE ARE HERE TO GIVE YOU A WONDERFUL SHOPPING EXPERIENCE
                """;
    }

    public static CustomerInvoice customersCart(Cart cart){
        Scanner input = new Scanner(System.in);
        String userInput = "yes";
        while (userInput.equals("yes")) {
            System.out.println("Enter product name");
            String product = input.nextLine();
            System.out.println("Enter price for each item");
            BigDecimal pricePerUnit = input.nextBigDecimal();
            System.out.println("Enter the quantity");
            int quantity = input.nextInt();

            Items items = new Items(product, pricePerUnit, quantity);
            cart.addItemsToCart(items);

            System.out.println();
            System.out.println(
                    """
                            *************************************************
                            * click "yes" to continue shopping              *
                            * click "no" to stop shopping and print invoice *       
                            *************************************************
                            """);
            userInput = input.next().toLowerCase();
            input.nextLine();
        }
        return new CustomerInvoice(cart);
    }
}
