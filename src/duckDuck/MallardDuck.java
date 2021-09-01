package duckDuck;

public class MallardDuck extends Duck{

    public MallardDuck(){

        flyableDuck = new FlyWithWings();
        quackableDuck = new Quack();
    }
}
