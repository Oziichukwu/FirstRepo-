package chapterSeven;

import java.util.Arrays;

public class Algorithm {

    public static void main(String[] args) {

        int [] sort = {3,-9,-8,4,5,8,1,9,7};

        int temp = 0;

        for (int i = 0; i < sort.length; i++) {
            for (int j = i+1it ; j < sort.length; j++) {

                if(sort[j] < sort[i]){
                    temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sort));
    }
}
