package chapterSixteen;

public class Stack {

    private int numberOfElement;
    private int[] elements;

    public Stack(int capacity) {
        elements = new int[capacity];
    }

    public void add(int element) {
        //if (isFull()) throw new UnderFlowException("Stack is full");
        elements[numberOfElement++] = element ;
        //numberOfElement++;
    }

    public int size() {
        return numberOfElement;
    }

    public void pop() {
        if (isEmpty()) throw new UnderFlowException("Stack is empty");
        --numberOfElement;
    }

    public boolean isEmpty() {

        return numberOfElement == 0;
    }

    public int peek() {

        return elements[numberOfElement-1];
    }
//
//    public boolean isFull() {
//
//        return numberOfElement;
//    }

    public static class UnderFlowException extends  RuntimeException{
        public UnderFlowException(String message){
            super(message);
        }

    }

    public static class OverFlowException extends  RuntimeException{
        public OverFlowException(String message){
            super(message);
        }

    }

}
