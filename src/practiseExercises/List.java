package practiseExercises;

public interface List {
    boolean isEmpty();

    void add(int index);

    int get();

    int get(int i);


    void remove(int i);

    int getSize();

    int getIndexOf(int i);

    void replace(int value, int index);

    int getCapacity();
}
