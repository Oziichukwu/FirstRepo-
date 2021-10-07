package designPartterns.strategyPattern;

public class AnimalPlay {
    public static void main(String[] args) {

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());

        sparky.setFlyingAbility(new Itflys());
        System.out.println("Dog: " + sparky.tryToFly());

    }
}
