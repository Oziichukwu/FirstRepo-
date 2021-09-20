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
//
//    public BigDecimal calculateVatOfTotalOfItems(){
//       BigDecimal  VAT = BigDecimal.valueOf(7.5);
//       BigDecimal  percent = BigDecimal.valueOf(100.00);
//        return  calculateTotalOfItems().multiply(VAT).divide(percent);
//    }

// System.out.printf("The VAT on %.2f is: %.2f",cart.calculateTotalOfItems(), cart.calculateVatOfTotalOfItems());
