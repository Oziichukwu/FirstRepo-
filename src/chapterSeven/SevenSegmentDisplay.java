package chapterSeven;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SevenSegmentDisplay {
    private static final int ROW = 5;
    private static final int COLUMN = 4;
    private static final int[][] screen = new int[ROW][COLUMN];
    private static int[] userArray;


    public static void setScreen() {

        userArray = new int[8];
        //Scanner input = new Scanner(System.in);
        boolean correctInput = false;
        for (int i = 0; i < userArray.length; i++) {

            try {
                if (userArray.length > 8){

                }
                char userInput = input.next().charAt(0);
                if (userInput == '1' || userInput == '0') {
                    userArray[i] = Integer.parseInt(String.valueOf(userInput));
                    correctInput = true;

                } else
                {
                    correctInput = false;
                    throw new InputMismatchException("input is not valid");
                }
            }
            catch (InvalidParameterException ex) {
                System.out.println(ex.getMessage());
            }
//                if (!correctInput){
//                    i -=1;
//                }

            for (int[] row : screen) {
                for (int column = 0; column < row.length; column++) {
                    if (userArray[7] == 1) {
                        fillSegments();
                    } else {
                        clearScreen();
                    }
                }
            }
        }
    }
    public static void fillSegmentOne() {
        screen[0][0] = 1;
        screen[0][1] = 1;
        screen[0][2] = 1;
        screen[0][3] = 1;
    }

    public static void fillSegmentTwo() {
        screen[0][3] = 1;
        screen[1][3] = 1;
        screen[2][3] = 1;
    }

    public static void fillSegmentThree() {
        screen[2][3] = 1;
        screen[3][3] = 1;
        screen[4][3] = 1;
    }

    public static void fillSegmentFour() {
        screen[4][3] = 1;
        screen[4][2] = 1;
        screen[4][1] = 1;
        screen[4][0] = 1;
    }

    public static void fillSegmentFive() {
        screen[4][0] = 1;
        screen[3][0] = 1;
        screen[2][0] = 1;
    }

    public static void fillSegmentSix() {
        screen[2][0] = 1;
        screen[1][0] = 1;
        screen[0][0] = 1;
    }

    public static void fillSegmentSeven() {
        screen[2][0] = 1;
        screen[2][1] = 1;
        screen[2][2] = 1;
        screen[2][3] = 1;
    }

    private static void fillSegments() {
        if (userArray[0] == 1) {
            fillSegmentOne();
        }
        if (userArray[1] == 1) {
            fillSegmentTwo();
        }
        if (userArray[2] == 1) {
            fillSegmentThree();
        }
        if (userArray[3] == 1) {
            fillSegmentFour();
        }
        if (userArray[4] == 1) {
            fillSegmentFive();
        }
        if (userArray[5] == 1) {
            fillSegmentSix();
        }
        if (userArray[6] == 1) {
            fillSegmentSeven();
        }
    }

    private static void clearScreen() {
        for (int[] number : screen) {
            Arrays.fill(number, 0);
        }
    }

    public static void display() {
        for (int[] row : screen) {
            for (int column : row) {
                    if (column == 1) {
                        System.out.print(column + " ");
                    } else if (column == 0) {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
