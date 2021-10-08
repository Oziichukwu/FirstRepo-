package designPartterns.strategyPattern;

public interface Flys {

    String fly();
}

class Itflys implements Flys {

    public String fly() {
        return "flying sooo high";
    }
}
    class CantFly implements Flys{

        public String fly() {
            return "i cant fly";
        }
    }


