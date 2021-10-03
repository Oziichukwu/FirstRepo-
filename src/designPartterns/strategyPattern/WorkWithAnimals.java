 package designPartterns.strategyPattern;

public class WorkWithAnimals {
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
    }

    public static void changeObjectName(Dog puppy){

        puppy.setName("Segun");
    }
 }
