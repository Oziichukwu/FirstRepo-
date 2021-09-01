package duckDuck;

public class ModelDuck extends Duck{

    public ModelDuck(){

        flyableDuck = new FlyNoWay();
        quackableDuck = new Squeak();
    }

}
