package chapterSeven;

import java.security.SecureRandom;
import java.util.Arrays;

public class DiceRolling {

    public static void main(String[] args) {
       // int[] diceGame = new int[12];
        int[] tally = new int[12];
        int index;
        int face1;
        int face2;
        int sum;
        SecureRandom numRand = new SecureRandom();

        for (int roll = 0; roll < 36000; roll++) {
            face1 = 1 + numRand.nextInt(6);
            face2 = 1 + numRand.nextInt(6);
            sum = face1 + face2;

         //   diceGame[index] = sum;
           // index++;

            switch(face2){
                case 1:
                    if(sum==2){
                        tally[0]++;
                       // break;
                    }
                case 2:
                    if(sum==3){
                        tally[1]++;
                        //break;
                    }
                case 3:
                    if(sum==4){
                        tally[2]++;
                        //break;
                    }
                case 4:
                    if(sum==5){
                        tally[3]++;
                        //break;
                    }
                case 5:
                    if(sum==6){
                        tally[4]++;
                        //break;
                    }
                case 6:
                    if(sum==7){
                        tally[5]++;
                        //break;
                    }
                case 7:
                    if(sum==8){
                        tally[6]++;
                        //break;
                    }
                case 8:
                    if(sum==9){
                        tally[7]++;
                        //break;
                    }
                case 9:
                    if(sum==10){
                        tally[8]++;
                        //break;
                    }
                case 10:
                    if(sum==11){
                        tally[9]++;
                        //break;
                    }
                case 11:
                    if(sum==12){
                        tally[10]++;
                        //break;
                    }
            }
        }

       //System.out.println(Arrays.toString(diceGame));
        System.out.printf("%s: %d%n%s: %d%n%s: %d%n%s: %d%n%s: %d%n%s: %d%n%s: %d%n%s: "+
                "%d%n%s: %d%n%s: %d%n%s: %d", "counts for 2s",tally[0],"counts for 3s",tally[1],"counts for 4s",tally[2],"counts for 5s",tally[3],"counts for 6s",tally[4],"counts for 7s",tally[5],"counts for 8s",tally[6],"counts for 9s",tally[7],"counts for 10s",tally[8],"counts for 11s",tally[9],"counts for 12s",tally[10]);

    }
}
