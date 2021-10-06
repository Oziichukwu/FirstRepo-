package designPartterns.strategicPattern;

public interface Flys {
    String fly();
}

class ItFlys implements Flys{

    public String fly() {
        return "It flys soooo High";
    }
}
class CantFly implements Flys{

    public String fly() {
        return "Absolutely cannot fly";
    }
}
