package chapterSix;

import java.util.Scanner;

public class TemperatureConvertor {
   private static final Scanner scanner = new Scanner(System.in);

    public static int userInput;

    public static void main(String[] args) {
        System.out.println(displayConversionToExecute());
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operation you want to execute");
        userInput = input.nextInt();
        calculateTemperatureConversion();

    }
    private static double convertsFahrenheitToCelsius(double fahrenheit){

        return (5.0 / 9.0) * (fahrenheit - 32);
    }
    private static double convertCelsiusToFahrenheit(double Celsius){

        return (9.0 / 5.0) * Celsius + 32;
    }

    private static String displayConversionToExecute(){

        return
                """
                    1. Enter one to execute fahrenheit conversion to celcius
                    
                    2. Enter two to execute celcius conversion to fahrenheit
               
                """;

    }

    private static void calculateTemperatureConversion(){
        switch (userInput) {
            case 1 -> {
                System.out.println("Enter the celcius value to convert to fahrenheit");
                double celsius = scanner.nextDouble();
                System.out.printf("%.2f",convertCelsiusToFahrenheit(celsius));
            }
            case 2 -> {
                System.out.println("Enter the fahrenheit value to convert to celcius");
                double fahrenheit = scanner.nextDouble();
                System.out.printf("%.2f",convertsFahrenheitToCelsius(fahrenheit));
            }
        }
        }
}
