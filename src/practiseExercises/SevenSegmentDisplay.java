package practiseExercises;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Scanner;

public class SevenSegmentDisplay {
    public static char[][] characters;
    private static int[] userInput;

//    public static void main(String[] args) {
//        collectUserInputs();
//        setCharacterArrayWithUserInput();
//       //display();
//    }

    public static char[][] display() {

        characters = new char[][]{{'#', '#', '#', '#'}, {'#', '#', '#', '#'}, {'#', '#', '#', '#'}, {'#', '#', '#', '#'}, {'#', '#', '#', '#'}};

        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < characters[i].length; j++) {
                System.out.print(" " + characters[i][j]);
            }
            System.out.println();
        }

        return characters;
    }

    public static void collectUserInputs() {

        Scanner input = new Scanner(System.in);
        userInput = new int[8];

        for (int i = 0; i < userInput.length; i++) {
            boolean correctInput = false;
            System.out.println("Enter digit " + (i + 1));
            try {
                char numbers = input.next().charAt(0);
                if (numbers == '1' || numbers == '0') {
                    userInput[i] = Integer.parseInt(String.valueOf(numbers));
                    correctInput = true;
                } else {
                    correctInput = false;
                    throw new InvalidParameterException("input is invalid");
                }
            }
            catch (InvalidParameterException ex){
                System.out.println(ex.getMessage());
            }
            if (!correctInput){
                i -=1;
            }
            }
        }

    public static void clearBoard(){
        char [] [] board = characters;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void setCharacterArrayWithUserInput() {

            characters = new char[][]{{'#', '#', '#', '#'}, {'#', ' ', ' ', '#'}, {'#', '#', '#', '#'}, {'#', ' ', ' ', '#'}, {'#', '#', '#', '#'}};

            if (userInput[0] == 1) {
                characters[0][0] = '#';
                characters[0][1] = '#';
                characters[0][2] = '#';
                characters[0][3] = '#';
            } else if (userInput[0] == 0) {
                characters[0][0] = ' ';
                characters[0][1] = ' ';
                characters[0][2] = ' ';
                //characters[0][3] = ' ';
            }

            if (userInput[1] == 1) {
                characters[0][3] = '#';
                characters[1][3] = '#';
                characters[2][3] = '#';
            } else if (userInput[1] == 0) {
                //characters[0][3] = ' ';
                characters[1][3] = ' ';
                //characters[2][3] = ' ';
            }
            if (userInput[2] == 1) {
                characters[2][3] = '#';
                characters[3][3] = '#';
                //characters[4][3] = '#';
            } else if (userInput[2] == 0) {
                //characters[2][3] = ' ';
                characters[3][3] = ' ';
                characters[4][3] = ' ';
            }
            if (userInput[3] == 1) {
                //characters[4][3] = '#';
                characters[4][2] = '#';
                characters[4][1] = '#';
                //characters[4][0] = '#';
            } else if (userInput[3] == 0) {
                characters[4][3] = ' ';
                characters[4][2] = ' ';
                characters[4][1] = ' ';
                characters[4][0] = ' ';
            }

            if (userInput[4] == 1) {
                characters[4][0] = '#';
                characters[3][0] = '#';
                characters[2][0] = '#';
            } else if (userInput[4] == 0) {
                //characters[4][0] = ' ';
                characters[3][0] = ' ';
                //characters[2][0] = ' ';
            }

            if (userInput[5] == 1) {
                //characters[2][0] = '#';
                characters[1][0] = '#';
                characters[0][0] = '#';
            } else if (userInput[5] == 0) {
                //characters[2][0] = ' ';
                characters[1][0] = ' ';
                //characters[0][0] = ' ';
            }

            if (userInput[6] == 1) {
                characters[2][0] = '#';
                characters[2][1] = '#';
                characters[2][2] = '#';
                characters[2][3] = '#';
            } else if (userInput[6] == 0) {
                characters[2][0] = ' ';
                characters[2][1] = ' ';
                characters[2][2] = ' ';
                //characters[2][3] = ' ';
            }


            if (userInput[7] == 0) {
                clearBoard();
            }
             if (userInput[7] ==1) {
                for (int k = 0; k < characters.length; k++) {
                    for (int j = 0; j < characters[k].length; j++) {
                        System.out.print(" " + characters[k][j]);
                    }
                    System.out.println();
                }
            }


        }
    }
