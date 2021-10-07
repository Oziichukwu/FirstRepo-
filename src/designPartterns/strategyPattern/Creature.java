package designPartterns.strategyPattern;

abstract public class Creature {

     protected String name;
     protected int weight;
     protected String sound;


     public abstract void setWeight(double newWeight);
     public abstract double getWeight();

     public abstract void setName(String newName);
     public abstract String getName();
}
