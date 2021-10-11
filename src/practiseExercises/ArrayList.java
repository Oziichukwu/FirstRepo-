package practiseExercises;

import java.util.Arrays;

public class ArrayList implements List {

    boolean isEmpty= true;
    private int[] elements;
    private int size;
    private int arrayCapacity=3;

    public ArrayList(){
        elements = new int[3];
    }
    public boolean isEmpty(){
        return isEmpty = true;
    }

    public void add(int index){
        setArrayCapacity(arrayCapacity);
        isEmpty = false;
        elements[size] = index;
        System.out.println(Arrays.toString(elements));
        size++;
    }

    public void setArrayCapacity(int arrayCapacity) {
        if (size == arrayCapacity) {
            int[] newArray = new int[arrayCapacity*2];
            for (int index = 0; index < elements.length; index++) {
                newArray[index] = elements[index+1];
            }
            elements = newArray;
            this.arrayCapacity = elements.length;
        }
    }

    public int getCapacity(){

        return arrayCapacity;
    }

    public int get(){
        return elements[size];
    }

    public int get(int value){
        return elements[value];
    }

    public int getIndexOf(int input){
        int index = 0;
        for (index = 0; index< elements.length; index++){
            if (elements[index] ==input){
                return index;
            }
        }
        return index;
    }

    public void replace(int value, int indexValue) {
        elements[indexValue] = value;
    }


    public void remove(int input){
        if ( isEmpty())throw new IllegalArgumentException("Invalid operation");
        for (int index = 0 ; index< elements.length; index++){
            if ( elements[index] == input){
                elements[index] -= input;
                size --;
                break;
            }
        }
    }

    public int getSize(){
        return size;
    }

}
