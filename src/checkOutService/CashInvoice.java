package checkOutService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CashInvoice {
    private char No;
    public ArrayList<String>items = new <String>ArrayList();

    public  void collateCustumersPurchaseItems(){

        Scanner input = new Scanner(System.in);

        System.out.println("Kindly enter the item purchased");
            char collect = input.next().charAt(0);
        while (input.next().charAt(0) != No) {
//            ArrayList.add(collect);
            System.out.println(items);

        }

    }
















    private static void displayCustomersGroceriesDetails() {

        System.out.println(
                """
                                NAME:                          GOODNEWS GROCERIES STORE
                                ADDRESS:               45 allen avenue maryland southampton New Jersey    
                                PHONENO:                              08100841165
                                EMAIL:                            goodboyz24@gmail.com
                        """);
    }
}
