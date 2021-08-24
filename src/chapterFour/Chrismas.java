package chapterFour;

import java.util.Scanner;

public class Chrismas {
    private static int count = 0;
    public static void main(String... args) {

        if (count > 2){

            System.out.println("The song allows an entry of 1 - 12 days");
        }
        String song = "";

        String lyrics = "";

        String daysOfXmas = "";

        int number = 12;

        int counter = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your start Day");
        number = input.nextInt();

        if ( number > 12 ){
            count++;
            main();
        }

            while (counter <= number) {
                switch (counter) {

                    case 12 -> daysOfXmas = "Twelveth";
                    case 11 -> daysOfXmas = "Elevnth";
                    case 10 -> daysOfXmas = "Tenth";
                    case 9 -> daysOfXmas = "Nineth";
                    case 8 -> daysOfXmas = "Eight";
                    case 7 -> daysOfXmas = "Seventh";
                    case 6 -> daysOfXmas = "Sixth";
                    case 5 -> daysOfXmas = "Fifth";
                    case 4 -> daysOfXmas = "fourth";
                    case 3 -> daysOfXmas = "Third";
                    case 2 -> daysOfXmas = "Second";
                    case 1 -> daysOfXmas= "First";

                }

                switch (counter) {
                    case 1:
                        lyrics = "A partridge in a Pear Tree\n";
                        break;
                    case 2:
                        lyrics = "\nTwo Turtle Dove, \nAnd " + lyrics;
                        break;
                    case 3:
                        lyrics = "\nThree French Hen" + lyrics;
                        break;
                    case 4:
                        lyrics = "\nFour Collie Birds" + lyrics;
                        break;
                    case 5:
                        lyrics = "\nFive Golden Rings" + lyrics;
                        break;
                    case 6:
                        lyrics = "\nSix Geese are laying" + lyrics;
                        break;
                    case 7:
                        lyrics = "\nSeven Swans are Swimming" + lyrics;
                        break;
                    case 8:
                        lyrics = "\nEight Maids are Milking" + lyrics;
                        break;
                    case 9:
                        lyrics = "\nNine Ladies Dancing" + lyrics;
                        break;
                    case 10:
                        lyrics = "\nTen Lords are Leaping" + lyrics;
                        break;
                    case 11:
                        lyrics = "\nEleven Pipers Piping" + lyrics;
                        break;
                    case 12:
                        lyrics = "\nTwelve drummers drumming" + lyrics;
                        break;
                }
                song = "\nOn the " + daysOfXmas + " day of Christmas\nMy true love sent to me:" + lyrics;

                counter++;
            }
        System.out.println(song);
        System.exit(counter);

    }
    }
