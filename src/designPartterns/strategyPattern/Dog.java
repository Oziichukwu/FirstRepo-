package designPartterns.strategyPattern;

public class Dog extends Animal{

    public void digHole() {
        System.out.println("Digs a Hole");
    }

    public Dog(){
        super();

        setSound("Bark");
    }

    public void changeVar(int randNum){

        randNum = 12;
        System.out.println("ranNum in method: " + randNum);

    }
}
