 package designPartterns.strategyPattern;

public class WorkWithAnimals {
    int justANumber = 10;
    public static void main(String[] args) {

        Dog puppy = new Dog();

        puppy.setName("My name is Leonardo");
        System.out.println(puppy.getName());

        puppy.digHole();
        puppy.setWeight(-1);

        int randNum = 10;


        puppy.changeVar(randNum);
        System.out.println("ranNum after method call is : " + randNum);

        changeObjectName(puppy);
        System.out.println("dog name after method call " + puppy.getName());

        Animal doggy = new Dog();
        Animal kitty = new Cat();
        System.out.println("Doggy says: " + doggy.getSound());
        System.out.println("kitty says: " + kitty.getSound());

        Animal [] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        System.out.println("Doggy says: " + animals[0].getSound());
        System.out.println("kitty says: " + animals[1].getSound());

        speakAnimal(doggy);
        ((Dog)doggy).digHole();

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Linguinni");
        System.out.println(giraffe.getName());

    }

    public static void changeObjectName(Dog puppy){

        puppy.setName("Segun");
    }
    public static void speakAnimal(Animal ranAnimal){
        System.out.println("Animals says: " + ranAnimal.getSound() );
    }


 }
