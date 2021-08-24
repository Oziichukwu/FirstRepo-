package chapterFour;

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {

        int Total = 0;
        int Trip = 1;
        double milesPerGallon = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the miles driven and gallons used or -1 to exit");

        for (Trip = 1; Trip != -1; Trip++) {
            //if (miles !=-1){
            System.out.println("Enter the number of miles for Trip" + Trip);
            int miles = input.nextInt();
            System.out.println("Enter the quantity of gallons used for Trip" + Trip);
            int gallons = input.nextInt();
            milesPerGallon = miles / gallons;
            Total += milesPerGallon;
        }
            System.out.printf("%s%30s", "Trips", "miles Per gallon");

            for (int Trips = 1; Trips <= Trip; Trips++) {

                System.out.printf("%d%20.2f%n", Trips, milesPerGallon);
            }
            System.out.printf("The Total miles per Gallon for all trips is %.2f:", Total);
        }
    }
