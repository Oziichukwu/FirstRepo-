package storeCheckoutSystem;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckoutSystem {
        public static void main(String[] args) {
            System.out.println(mainHeading());
            CustomersCart cart = new CustomersCart();
            checkOutCustomersCart(cart).displayInvoice();
        }
        private static String mainHeading(){
                    return """
                                 WELCOME TO UNCLE CHIBOB SHOPPING PLAZA
                            WE PROVIDE YOU WITH THE BEST SHOPPING EXPERIRNCE
                            """;
        }
        private static CheckoutInvoice checkOutCustomersCart(CustomersCart cart) {
            Scanner scanner = new Scanner(System.in);
            String userInput = "YES";
            BigDecimal pricePerUnit = BigDecimal.ZERO;
            int quantity = 0;

            while (userInput.equals("YES")) {

                    System.out.print("Enter product: ");
                   String product = scanner.nextLine();

                    System.out.print("Enter the quantity of products bought: ");
                    quantity = scanner.nextInt();

                    System.out.print("Enter price per unit: ");
                    pricePerUnit = scanner.nextBigDecimal();

                    ItemsBought item = new ItemsBought(quantity, pricePerUnit, product);
                    cart.addItemsToCart(item);

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
