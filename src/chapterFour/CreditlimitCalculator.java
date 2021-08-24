package chapterFour;

import java.util.Scanner;

public class CreditlimitCalculator {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String display = """
                    Hello Customer, you are welcome.
                    Kindly provide the following information:
                    """;
            System.out.println(display);
            System.out.print("Your Account number: ");
            int accountNumber = input.nextInt();
            System.out.print("Your Account Balance at the beginning of the Month: ");
            int initialBalance = input.nextInt();
            System.out.print("The total items charged: ");
            int itemsCharged = input.nextInt();
            System.out.print("The Total Credit:");
            int totalCredit = input.nextInt();
            System.out.print("The Allowed Credit Limit: ");
            int creditLimit = input.nextInt();

            int newBalance = initialBalance + (itemsCharged - totalCredit);
            System.out.println();
            System.out.println("Your new balance is " + newBalance);

            if (newBalance > creditLimit) {
                    System.out.println();
                System.out.println("Credit Limit Exceeded");
            }
        }
}