package practiseExercises;

public class LinearSearch{

    public static void main(String[] args) {

        int [] list = {4,5,3,2,7,5,1};

        for (int i = 0; i < list.length; i++) {
            if (list[i] == 5){
                System.out.println("number found at index: "+(i));
            }
            else
                System.out.println("not found");
        }
    }
}
