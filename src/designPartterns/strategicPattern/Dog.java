package designPartterns.strategicPattern;

public class Dog extends Animal{
    public void digHole() {
        System.out.println("Digs a Hole");
    }

    public Dog() {
        super();

        setSound("Bark");

        flyingType = new CantFly();
    }
}
