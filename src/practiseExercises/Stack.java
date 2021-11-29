package practiseExercises;

public class Stack {

    private int maximumSize;
    private int[] stackArray;
    private int topOfStack ;

    public Stack(int size) {
        this.maximumSize = size;
        topOfStack = -1;
        stackArray = new int[size];
    }

    public int maximumSize() {

        return maximumSize;
    }

    public void push(int itemToAdd) throws Exception{

        if(!isFull()){
            stackArray[topOfStack + 1] = itemToAdd;
            topOfStack++;
        }else{
            throw new Exception("stack is currently full and cannot push more items");
        }

    }

    public boolean isFull() {

        int maximumIndex = maximumSize -1;
        if (topOfStack == maximumIndex){
            return true;
        }
        return false;
    }

    public int size() {
        return topOfStack + 1;
    }

    public int pop() throws Exception{
        if (!isEmpty()){
            int itemToAdd = stackArray[topOfStack];
            stackArray[topOfStack] = 0;
            topOfStack--;
            return itemToAdd;
        }else {
            throw new Exception("stack is currently and cannot pop more item");
        }
    }

    public boolean isEmpty() {

        if (topOfStack == -1){
            return true;
        }
        return false;
    }

    public int peek() {

        return stackArray[topOfStack];
    }
}
