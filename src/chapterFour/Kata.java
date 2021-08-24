package chapterFour;

public class Kata {

     int result = 1;

     int counter = 1;

     int price;

    public int calculatefactorial(int factorial) {

        while ( counter <= factorial){

                result = counter * result;

            counter++;
        }

        return result;
    }

    public int calculatePrice1(int copies) {

        if ( copies >=200)
            price =  copies * 800;
        if ( copies >=100 && copies <= 199)
            price =  copies * 900;
        if ( copies >=50 && copies <= 99)
            price =  copies * 1000;
        if ( copies >=30 && copies <= 49)
            price =  copies * 1100;
        if ( copies >=10 && copies <= 29)
            price =  copies * 1200;
        if ( copies >=5 && copies <= 9)
            price =  copies * 1400;
        if ( copies >=1 && copies <= 4)
       price =  copies * 1500;

        while ( copies <= 4) {

            price = copies * 1500;
            break;
        }
            copies++;

        return price;
    }


    String song;

    String lyrics = "";

    String daysOfXmas = "";

    public String twelveDaysOfChrismasSong(int days) {

       int count = 1;

        while ( count <= days) {
            switch (count) {

                case 12 -> daysOfXmas = "Twelfth";
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
                case 1 -> daysOfXmas = "First";

            }
                switch (count) {

                    case 1:
                        lyrics = "A partridge in a Pear Tree\n";
                        break;
                    case 2:
                        lyrics = "\nTwo Turtle Dove, \nAnd "  + lyrics;
                        break;
                    case 3:
                        lyrics = "\nThree French Hen"  + lyrics;
                        break;
                    case 4:
                        lyrics = "\nFour Collie Birds"  + lyrics;
                        break;
                    case 5:
                        lyrics = "\nFive Golden Rings"  + lyrics;
                        break;
                    case 6:
                        lyrics = "\nSix Geese are laying"  + lyrics;
                        break;
                    case 7:
                        lyrics = "\nSeven Swans are Swimming"  + lyrics;
                        break;
                    case 8:
                        lyrics = "\nEight Maids are Milking" + lyrics;
                        break;
                    case 9:
                        lyrics = "\nNine Ladies Dancing"  + lyrics;
                        break;
                    case 10:
                        lyrics = "\nTen Lords are Leaping"  + lyrics;
                        break;
                    case 11:
                        lyrics = "\nEleven Pipers Piping" + lyrics;
                        break;
                    case 12:
                        lyrics = "\nTwelve drummers drumming" + lyrics;
                        break;
                }

            song = "\nOn the " + daysOfXmas + " day of Christmas\nMy true love sent to me:" + lyrics;

            count++;
        }
        return song;

    }

}
