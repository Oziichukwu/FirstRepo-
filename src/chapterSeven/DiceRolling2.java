package chapterSeven;

import java.security.SecureRandom;

public class DiceRolling2 {

    private int dice;
    private int dice2;
    private int count = 0;
    private String freqString;
    private int[] frequency = new int[12];


    public int throwdie(){
        SecureRandom myRandom = new SecureRandom();
        dice = 1 + myRandom.nextInt(6);
        dice2 = 1 + myRandom.nextInt(6);
        return dice + dice2;
    }

    public int [] countHowManyItOccur(){

        while (count < 3600000){

            int sum = throwdie();
            for (int index = 0; index < frequency.length; index++) {
                if (index == sum){
                    frequency[index] +=1;
                }
            }
            count++;
        }
        return frequency;
    }

    public void toStringOccur (){
        frequency = countHowManyItOccur();
        System.out.printf("%3s \t\t\t %10s\n", "Sum", "Frequency");
        for (int index = 0; index < frequency.length; index++) {
            if (index > 1){
                freqString = String.format("%3d \t\t\t %10d\n", index, frequency[index]);
                System.out.println(freqString);
            }
        }
    }

    public static void main(String[] args) {

        DiceRolling2 myDie = new DiceRolling2();
        myDie.throwdie();
        myDie.countHowManyItOccur();
        myDie.toStringOccur();
    }
}
