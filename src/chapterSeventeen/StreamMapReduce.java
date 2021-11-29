package chapterSeventeen;

import java.util.stream.IntStream;

public class StreamMapReduce {

    public static void main(String[] args) {

        System.out.printf("Sum of even numbers from 2 through 20: %d%n",
                IntStream.rangeClosed(1,10)
                        .map((int x)->{return x * 2;})
                        .sum());
    }
}
