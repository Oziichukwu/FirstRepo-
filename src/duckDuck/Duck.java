package duckDuck;

import java.util.ArrayList;

public abstract class Duck {
FlyableDuck flyableDuck;
QuackableDuck quackableDuck;
public Duck () { }
public void performQuack(){
    quackableDuck.quack();
}

public void performFly(){
    flyableDuck.fly();
}
public void swim(){

}
public void setFlyableDuck(FlyableDuck fd){

    flyableDuck = fd;
}
public void setQuackableDuck(QuackableDuck qd){
    quackableDuck = qd;
}
}
