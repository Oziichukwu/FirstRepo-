package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        int[] point ={4,3,-7,7,8,-3,5,12,4,9};
        int ozii = 0;
        for (int i = 0; i < point.length; i++) {
            for (int j = i+1; j < point.length; j++) {
                if(point[j]<point[i]){
                    ozii=point[i];
                    point[i]=point[j];
                    point[j] = ozii;
                }
            }
        }
        System.out.println(Arrays.toString(point));
        Scanner input = new Scanner(System.in);
            int [][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(1+3*Math.random() * 100);
            }
        }
        }
    }


