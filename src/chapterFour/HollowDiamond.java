package chapterFour;

import java.util.Scanner;

public class HollowDiamond {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an odd number between 1-19");
    int n = input.nextInt();

    int num = (n + 1) / 2;

        for (int i = 1; i <= num; i++) {
            int sides = i * 2 - 1;

        for (int j = 1; j <= num - i; j++) {

            System.out.print(" ");
        }
        for (int k = 1; k <= sides; k++) {
                if ( k == 1 || k == sides )
            System.out.print("*");
                else
                    System.out.print(" ");
        }
        System.out.println();
    }

        for (int i = num -1; i > 0; i--){
            int sides = i * 2 - 1;

        for(int j = 1; j <= num - i; j++){

            System.out.print(" ");
        }
        for( int k = 1; k <= sides; k++){
            if ( k == 1 || k == sides)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
}
}
