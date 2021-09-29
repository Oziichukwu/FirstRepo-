package practiseExercises;

public class BinarySearch {

    public static void main(String[] args) {

        int [] list = {2,3,4,5,7,8,9,10,11,12,13,14,15,16,17};

        System.out.println("number found at index " + binarySearch(list,18));
        System.out.println("number not found " + binarySearch(list,18));
    }

    public static int binarySearch(int [] list, int target){

        int firstNumber = 0;
        int lastNumber = list.length-1;

        while (firstNumber <= lastNumber){

            int midPoint = (lastNumber + firstNumber) / 2;

            if (target == list[midPoint])
                return  midPoint;
           else if (list[midPoint] < target)
                firstNumber = midPoint + 1;

            else
                lastNumber = midPoint - 1;
        }
        return  firstNumber - 1;
    }

}
