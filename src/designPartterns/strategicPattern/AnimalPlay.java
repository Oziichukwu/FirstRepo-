package designPartterns.strategicPattern;

public class AnimalPlay {
    public static void main(String[] args) {

        Animal  doggy = new Dog();
        Animal tweety = new Bird();

        System.out.println("dog: " + doggy.tryToFly());
        System.out.println("bird: " + tweety.tryToFly());

        doggy.setFlyingAbility(new ItFlys() );
        System.out.println("dog: " + doggy.tryToFly());

    }
}
