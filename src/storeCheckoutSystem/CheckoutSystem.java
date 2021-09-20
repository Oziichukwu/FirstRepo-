package storeCheckoutSystem;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckoutSystem {
        public static void main(String[] args) {
            CustomersCart cart = new CustomersCart();
            checkOutCustomersCart(cart).displayInvoice();
        }

        private static CheckoutInvoice checkOutCustomersCart(CustomersCart cart) {
            Scanner scanner = new Scanner(System.in);
            String userInput = "YES";
            String product = null;
            BigDecimal pricePerUnit = BigDecimal.ZERO;
            int quantity = 0;

            while (userInput.equals("YES")) {
                try {
                    System.out.print("Enter product: ");
                    product = scanner.nextLine();

                    System.out.print("Enter the quantity of products bought: ");
                    quantity = scanner.nextInt();

                    System.out.print("Enter price per unit: ");
                    pricePerUnit = scanner.nextBigDecimal();

                    //pricePerUnit = BigDecimal.valueOf(scanner.nextDouble());
                    ItemsBought item = new ItemsBought(quantity, pricePerUnit, product);
                    cart.add(item);
                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("Invalid Input!");
                }
                System.out.println();
                System.out.println("""
                       ************************************ 
                       * click "yes" to continue shopping *
                       * click "no" to stop shopping      *
                       ************************************
                        """);
                userInput = scanner.next().toUpperCase();
                scanner.nextLine();
            }
            return new CheckoutInvoice(cart);
        }
    }
