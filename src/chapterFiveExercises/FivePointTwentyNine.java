package chapterFiveExercises;

import java.util.Scanner;

public class FivePointTwentyNine {
    private static int count =0;
    public static void main(String... args) {

        if (count > 2){

            System.out.println("The song allows an entry of 1 - 12 days");

        }
        int number;
        int counter = 1;
        String day = "";
        String lyrics = "";
        String song = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your start Day");
        number = input.nextInt();

        if ( number > 12 ){
            count++;
            main();
        }

        while ( counter <= number){

            switch (counter){

                case 1:
                    day = "First";
                    lyrics = "A partridge in a Pear Tree\n";
                        break;
                case 2:
                    day = "Second";
                    lyrics= "\nTwo Turtle Dove, \nAnd " + lyrics;
                    break;
                case 3:
                    day = "Third";
                    lyrics = "\nThree French Hen" + lyrics;
                    break;
                case 4:
                    day = "Fourth";
                    lyrics = "\nFour Collie Birds" + lyrics;
                    break;

                case 5:
                    day = "Fifth";
                    lyrics = "\nFive Golden Rings!!!!" + lyrics;
                    break;
                case 6:
                    day = "Sixth";
                    lyrics = "\nSix Geese are laying" + lyrics;
                    break;
                case 7:
                    day = "seventh";
                    lyrics = "\nSeven Swans are Swimming" + lyrics;
                    break;
                case 8:
                    day = "Eighth";
                    lyrics = "\nEight Maids are Milking" + lyrics;
                    break;
                case 9:
                    day = "Nineth";
                    lyrics = "\nNine Ladies Dancing" + lyrics;
                    break;
                case 10:
                    day = "Tenth";
                    lyrics = "\nTen Lords are Leaping" + lyrics;
                    break;
                case 11:
                    day = "Eleventh";
                    lyrics = "\nEleven Pipers Piping" + lyrics;
                    break;
                case 12:
                    day = "Twelveth";
                    lyrics = "\nTwelve drummers drumming" + lyrics;
                    break;

             //song = "\nOn the" + day + "day of Christmas\nMy true love sent to me:" + lyrics;
            }
            song = "\nOn the " + day + " day of Christmas\nMy true love sent to me:" + lyrics;

            counter++;
        }

        System.out.println(song);
        System.exit(counter);

    }
}
